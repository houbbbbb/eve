package com.hou.eve.search.corej.option.body.search;

import com.hou.eve.search.corej.util.Converter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hbw
 * @date 2020-07-12 07:25
 */
@Getter
@ToString
public class SearchAll {
    private Query query;

    public SearchAll setQuery(Query query) {
        this.query = query;
        return this;
    }

    public static SearchAll create () {
        return new SearchAll();
    }

    private SearchAll () {}
}
