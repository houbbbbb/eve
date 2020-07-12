package com.hou.eve.search.corej.option.execute;

import com.hou.eve.search.corej.entity.SearchDTO;
import com.hou.eve.search.corej.entity.SearchDTO2;
import com.hou.eve.search.corej.constants.ItemType;
import com.hou.eve.search.corej.factory.StaticFactory;
import com.hou.eve.search.corej.option.Option;
import com.hou.eve.search.corej.template.Template;
import org.elasticsearch.client.RestClientBuilder;

/**
 * @author hbw
 * @date 2020-07-07 21:21
 */
public class SearchOption implements Option {
    private static final String GET = "GET";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String DELETE = "DELETE";
    private static final String HEAD = "HEAD";

    private RestClientBuilder rcb;
    private Template template;
    public SearchOption(RestClientBuilder rcb) {
        this.rcb = rcb;
        template = StaticFactory.getTemplate(ItemType.SEARCH_TEMPLATE);
    }

    @Override
    public String doGet(SearchDTO searchDTO){
        return template.exc(convert22(GET, searchDTO), rcb);
    }

    @Override
    public String doPost(SearchDTO searchDTO){
        return template.exc(convert22(POST, searchDTO), rcb);
    }

    @Override
    public String doPut(SearchDTO searchDTO){
        return template.exc(convert22(PUT, searchDTO), rcb);
    }

    @Override
    public String doDelete(SearchDTO searchDTO){
        return template.exc(convert22(DELETE, searchDTO), rcb);
    }

    @Override
    public String doHead(SearchDTO searchDTO){
        return template.exc(convert22(HEAD, searchDTO), rcb);
    }

    private SearchDTO2 convert22(String method, SearchDTO searchDTO){
        return SearchDTO2.create().setMethod(method).setEndpoint(searchDTO.getEndpoint())
                .setBody(searchDTO.getBody());
    }
}
