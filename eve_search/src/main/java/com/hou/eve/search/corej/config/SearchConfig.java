package com.hou.eve.search.corej.config;

import lombok.Getter;
import lombok.Setter;
import org.apache.http.HttpHost;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author hbw
 * @date 2020-06-09 20:58
 */
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "search")
public class SearchConfig {
    private String[] hosts = {"http://127.0.0.1:9200"};

    public HttpHost[] getHttpHosts(){
        return Arrays.asList(hosts).stream().map(HttpHost::create).toArray(HttpHost[]::new);
    }
}
