package com.hou.eve.search.corej.option.result.search;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author hbw
 * @date 2020-06-30 21:50
 */
@Getter
@Setter
@ToString
public class TotalHits {
    private Total total;
    private Double maxScore;
    private List<Hits> hits;
}
