package com.hou.eve.search.corej.option.result.count;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-07-01 20:48
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
