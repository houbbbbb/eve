package com.hou.eve.search.corej.core;

import com.hou.eve.search.corej.entity.SearchDTO2;
import org.elasticsearch.client.RestClient;

/**
 * @author hbw
 * @date 2020-06-09 21:13
 */
public interface Core {
    /**
     * 核心请求
     * @param client
     * @param searchDTO2
     * @return
     */
    String exc(RestClient client, SearchDTO2 searchDTO2);
}
