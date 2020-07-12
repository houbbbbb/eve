package com.hou.eve.search.corej.factory;

import com.hou.eve.search.corej.constants.ItemType;
import com.hou.eve.search.corej.template.SearchTemplate;
import com.hou.eve.search.corej.template.Template;

/**
 * @author hbw
 * @date 2020-07-07 21:40
 */
public class TemplateFactory {
    public Template getTemplate (ItemType itemType) {
        Template template = null;
        switch (itemType) {
            case SEARCH_TEMPLATE: template = new SearchTemplate(); break;
            default: break;
        }
        return template;
    }
}
