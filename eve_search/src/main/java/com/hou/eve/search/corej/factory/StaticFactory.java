package com.hou.eve.search.corej.factory;

import com.hou.eve.search.corej.constants.BodyType;
import com.hou.eve.search.corej.constants.ItemType;
import com.hou.eve.search.corej.core.Core;
import com.hou.eve.search.corej.template.Template;

/**
 * @author hbw
 * @date 2020-07-07 21:52
 */
public class StaticFactory {
    private static SearchFactory searchFactory;
    static {
        searchFactory = new SearchFactory();
    }

    public static Core getCore (ItemType itemType) {
        return searchFactory.getCore(itemType);
    }

    public static Template getTemplate (ItemType itemType) {
        return searchFactory.getTemplate(itemType);
    }

    public static String getBody (BodyType bodyType) {return searchFactory.getBody(bodyType);}
}
