package com.hou.eve.search.corej.template;

import com.hou.eve.search.corej.core.Core;
import com.hou.eve.search.corej.entity.SearchDTO2;
import com.hou.eve.search.corej.constants.ItemType;
import com.hou.eve.search.corej.factory.StaticFactory;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;

/**
 * @author hbw
 * @date 2020-07-07 21:00
 */
public class SearchTemplate implements Template{
    private Core sc;

    public SearchTemplate () {
        this.sc = StaticFactory.getCore(ItemType.SEARCH_CORE);
    }

    @Override
    public String exc(SearchDTO2 searchDTO2, RestClientBuilder rcb){
        RestClient client = null;
        try {
            client = rcb.build();
            return sc.exc(client, searchDTO2);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(null != client) {
                try {
                    client.close();
                } catch (Exception e1) {}
            }
        }
        return null;
    }
}
