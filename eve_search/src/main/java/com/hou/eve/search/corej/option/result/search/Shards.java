package com.hou.eve.search.corej.option.result.search;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-06-30 21:49
 */
@Getter
@Setter
@ToString
public class Shards {
    private Integer total;
    private Integer successful;
    private Integer skipped;
    private Integer failed;
}
