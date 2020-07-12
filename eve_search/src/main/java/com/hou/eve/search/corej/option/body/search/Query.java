package com.hou.eve.search.corej.option.body.search;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-07-12 07:26
 */
@Getter
@ToString
public class Query {
    private MatchAll match_all;

    public Query setMatch_all(MatchAll match_all) {
        this.match_all = match_all;
        return this;
    }

    public static Query create () {
        return new Query();
    }

    private Query () {}
}
