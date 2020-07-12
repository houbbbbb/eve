package com.hou.eve.search.corej.core;

import com.hou.eve.search.corej.util.GsonBuilder;
import com.hou.eve.search.corej.entity.ResultDTO;
import com.hou.eve.search.corej.entity.SearchDTO2;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.springframework.stereotype.Component;

/**
 * @author hbw
 * @date 2020-06-16 22:13
 */
@Component
public class SearchCore implements Core {
    private static final String UTF_8 = "UTF-8";
    private static final String PRETTY = "pretty";
    private static final String TRUE = "true";
    public static final int SUCCESS = 200;

    @Override
    public String exc(RestClient client, SearchDTO2 searchDTO2){
        try{
            Request request = new Request(searchDTO2.getMethod(), searchDTO2.getEndpoint());
            request.addParameter(PRETTY, TRUE);
            if(null != searchDTO2.getBody()) {
                request.setJsonEntity(searchDTO2.getBody());
            }
            System.out.println("request:"+request);
            Response response = client.performRequest(request);
            if (SUCCESS == response.getStatusLine().getStatusCode()) {
                HttpEntity entity = response.getEntity();
                if(null != entity) { return EntityUtils.toString(entity, UTF_8); }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
