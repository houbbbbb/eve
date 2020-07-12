package com.hou.eve.search.corej.option.result.search;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-06-30 21:46
 */
@Getter
@Setter
@ToString
public class Optional {
    private Integer took;
    private Boolean timedOut;
    private Shards shards;
    private TotalHits hits;
}
