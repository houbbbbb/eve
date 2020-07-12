package com.hou.eve.search.corej.entity;

import lombok.Getter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-06-16 22:44
 */
@Getter
@ToString
public class SearchDTO {
    private String endpoint;
    private String body;

    public SearchDTO setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public SearchDTO setBody(String body) {
        this.body = body;
        return this;
    }

    public static SearchDTO create(){
        return new SearchDTO();
    }
    private SearchDTO(){}
}
