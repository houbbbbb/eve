package com.hou.eve.search.corej.factory;

import com.hou.eve.search.corej.constants.BodyType;
import com.hou.eve.search.corej.constants.ItemType;
import com.hou.eve.search.corej.core.Core;
import com.hou.eve.search.corej.template.Template;

/**
 * @author hbw
 * @date 2020-07-07 21:43
 */
public class SearchFactory implements Factory {
    private CoreFactory coreFactory;
    private TemplateFactory templateFactory;
    private BodyFactory bodyFactory;
    public SearchFactory () {
        coreFactory = new CoreFactory();
        templateFactory = new TemplateFactory();
        bodyFactory = new BodyFactory();
    }

    @Override
    public Core getCore (ItemType itemType) {
        return coreFactory.getCore(itemType);
    }

    @Override
    public Template getTemplate (ItemType itemType) {
        return templateFactory.getTemplate(itemType);
    }

    @Override
    public String getBody (BodyType bodyType) {return bodyFactory.getBody(bodyType);}
}
