package com.hou.eve.search.corej.factory;

import com.hou.eve.search.corej.constants.BodyType;
import com.hou.eve.search.corej.constants.ItemType;
import com.hou.eve.search.corej.core.Core;
import com.hou.eve.search.corej.template.Template;

/**
 * @author hbw
 * @date 2020-07-07 21:37
 */
public interface Factory {
    /**
     * 获取操作核心
     * @param itemType
     * @return
     */
    Core getCore (ItemType itemType);

    /**
     * 获取操作模板
     * @param itemType
     * @return
     */
    Template getTemplate (ItemType itemType);

    /**
     * 获取body
     * @param bodyType
     * @return
     */
    String getBody (BodyType bodyType);
}
