package com.hou.eve.search.corej.option.execute;

import com.hou.eve.search.corej.entity.SearchDTO;
import com.hou.eve.search.corej.option.Option;
import com.hou.eve.search.corej.option.Search;
import com.hou.eve.search.corej.option.result.search.Optional;
import com.hou.eve.search.corej.constants.SearchLagConstants;
import com.hou.eve.search.corej.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hbw
 * @date 2020-07-01 21:42
 */
@Component
public class Searches implements Search {
    private Option option;

    @Autowired
    public Searches(Option option) {
        this.option = option;
    }

    public Optional searchAll () {
        SearchDTO searchDTO = SearchDTO.create().setEndpoint(SearchLagConstants.SEARCH_LAG);
        String re = option.doGet(searchDTO);
        return Converter.convert2Optional(re);
    }
}
