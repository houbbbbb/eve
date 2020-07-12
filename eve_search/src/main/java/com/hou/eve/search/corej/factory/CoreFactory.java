package com.hou.eve.search.corej.factory;

import com.hou.eve.search.corej.constants.ItemType;
import com.hou.eve.search.corej.core.Core;
import com.hou.eve.search.corej.core.SearchCore;

/**
 * @author hbw
 * @date 2020-07-07 21:38
 */
public class CoreFactory {
    public Core getCore (ItemType itemType) {
        Core core = null;
        switch (itemType) {
            case SEARCH_CORE: core = new SearchCore(); break;
            default: break;
        }
        return core;
    }
}
