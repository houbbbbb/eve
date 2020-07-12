package com.hou.eve.search.corej.template;

import com.hou.eve.search.corej.entity.SearchDTO2;
import org.elasticsearch.client.RestClientBuilder;

/**
 * @author hbw
 * @date 2020-07-07 20:59
 */
public interface Template {
    /**
     * 搜索执行程序
     * @param searchDTO2
     * @return
     */
    String exc(SearchDTO2 searchDTO2, RestClientBuilder rcb);
}
