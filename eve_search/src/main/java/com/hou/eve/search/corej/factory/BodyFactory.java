package com.hou.eve.search.corej.factory;

import com.hou.eve.search.corej.constants.BodyType;
import com.hou.eve.search.corej.option.body.search.MatchAll;
import com.hou.eve.search.corej.option.body.search.Query;
import com.hou.eve.search.corej.option.body.search.SearchAll;
import com.hou.eve.search.corej.util.Converter;

/**
 * @author hbw
 * @date 2020-07-01 21:10
 */
public class BodyFactory {
    public String getBody (BodyType type) {
        String re = null;
        switch (type) {
            case QUERY_ALL: re = searchAll(); break;
            default: break;
        }
        return re;
    }

    private String searchAll () {
        SearchAll searchAll = SearchAll.create().setQuery(Query.create().setMatch_all(MatchAll.create()));
        return Converter.convert2Body(searchAll);
    }
}
