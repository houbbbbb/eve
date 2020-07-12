package com.hou.eve.search.corej.option.result.search;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-06-30 21:53
 */
@Getter
@Setter
@ToString
public class Hits {
    private String index;
    private String type;
    private String id;
    private Double score;
    private Object source;
}
