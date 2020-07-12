package com.hou.eve;

import com.hou.eve.search.corej.constants.SearchLagConstants;
import com.hou.eve.search.corej.entity.SearchDTO;
import com.hou.eve.search.corej.filter.StringFilter;
import com.hou.eve.search.corej.option.Option;
import com.hou.eve.search.corej.option.execute.Counts;
import com.hou.eve.search.corej.option.execute.Searches;
import com.hou.eve.search.corej.option.result.search.Optional;
import com.hou.eve.search.corej.option.result.count.Count;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EveSearchApplicationTests {

    @Autowired
    Counts counts;

    @Autowired
    Searches searches;


    @Test
    public void countAllTest () {
        Count count = counts.countAll();
        System.out.println("count : " + count.getCount());
        System.out.println("total : " + count.getShards().getTotal());
        System.out.println("failed : " + count.getShards().getFailed());
        System.out.println("skipped : " + count.getShards().getSkipped());
        System.out.println("successful : " + count.getShards().getSuccessful());
    }

    @Test
    public void searchAllTest () {
        Optional optional = searches.searchAll();
        System.out.println("timedOut : " + optional.getTimedOut());
        System.out.println("took : " + optional.getTook());
        System.out.println("shards : " + optional.getShards());
        System.out.println("hits : " + optional.getHits());
    }

    @Autowired
    private Option option;

    @Test
    public void strTest () {
        SearchDTO searchDTO = SearchDTO.create().setEndpoint(SearchLagConstants.SEARCH_LAG);
        String re = option.doGet(searchDTO);
        System.out.println(re);

        re = StringFilter.filter(re);

        System.out.println(re);
    }

}
