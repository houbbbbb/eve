package com.hou.eve.search.corej.entity;

import lombok.Getter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-06-09 22:06
 */
@Getter
@ToString
public class SearchDTO2 {
    private String endpoint;
    private String body;
    private String method;

    public SearchDTO2 setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public SearchDTO2 setBody(String body) {
        this.body = body;
        return this;
    }

    public SearchDTO2 setMethod(String method){
        this.method = method;
        return this;
    }

    private SearchDTO2(){}

    public static SearchDTO2 create(){
        return new SearchDTO2();
    }
}
