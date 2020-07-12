package com.hou.eve.search.corej.option.execute;

import com.hou.eve.search.corej.entity.SearchDTO;
import com.hou.eve.search.corej.factory.StaticFactory;
import com.hou.eve.search.corej.option.Option;
import com.hou.eve.search.corej.option.result.count.Count;
import com.hou.eve.search.corej.constants.SearchLagConstants;
import com.hou.eve.search.corej.constants.BodyType;
import com.hou.eve.search.corej.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hbw
 * @date 2020-07-01 21:06
 */
@Component
public class Counts implements com.hou.eve.search.corej.option.Count {
    private Option option;

    @Autowired
    public Counts(Option option) {
        this.option = option;
    }

    public Count countAll () {
        SearchDTO searchDTO = SearchDTO.create().setEndpoint(SearchLagConstants.COUNT_LAG)
                .setBody(StaticFactory.getBody(BodyType.QUERY_ALL));
        String re = option.doGet(searchDTO);
        return Converter.convert2Count(re);
    }
}
