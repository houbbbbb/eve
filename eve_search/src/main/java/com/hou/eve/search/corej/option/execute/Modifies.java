package com.hou.eve.search.corej.option.execute;

import com.hou.eve.search.corej.entity.SearchDTO;
import com.hou.eve.search.corej.option.Modify;
import com.hou.eve.search.corej.option.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hbw
 * @date 2020-07-08 21:25
 */
@Component
public class Modifies implements Modify {
    private Option option;

    @Autowired
    public Modifies(Option option) {this.option = option;}

    public void modifyOne (String index, String id, String body) {
        StringBuilder sb = new StringBuilder();
        sb.append("/").append(index).append("/_doc/").append(id);
        SearchDTO searchDTO = SearchDTO.create().setEndpoint(sb.toString());
        String re = option.doPut(searchDTO);
        System.out.println("re " + re);
    }
}
