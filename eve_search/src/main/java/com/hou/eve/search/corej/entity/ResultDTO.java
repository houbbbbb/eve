package com.hou.eve.search.corej.entity;

import lombok.Getter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-06-17 21:38
 */
@Getter
@ToString
public class ResultDTO {
    private boolean found;

    public ResultDTO setFound(boolean found) {
        this.found = found;
        return this;
    }

    private ResultDTO(){}
    public static ResultDTO create(){return new ResultDTO();}
}
