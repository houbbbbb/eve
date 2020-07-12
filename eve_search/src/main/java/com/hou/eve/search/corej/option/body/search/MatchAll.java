package com.hou.eve.search.corej.option.body.search;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-07-12 07:28
 */
@Getter
@Setter
@ToString
public class MatchAll {
    private MatchAll matchAll;
    public static MatchAll create () {
        return new MatchAll();
    }
}
