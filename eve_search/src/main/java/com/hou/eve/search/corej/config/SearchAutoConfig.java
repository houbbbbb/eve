package com.hou.eve.search.corej.config;

import com.hou.eve.search.corej.option.Option;
import com.hou.eve.search.corej.option.execute.SearchOption;
import org.apache.http.client.config.RequestConfig;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hbw
 * @date 2020-06-09 20:41
 */
@Configuration
@EnableConfigurationProperties(SearchConfig.class)
public class SearchAutoConfig {
    private static final int CONN_TIMEOUT = 5000;
    private static final int SOCK_TIMEOUT = 60000;

    @Bean
    public Option getOption (SearchConfig searchConfig) {
        RestClientBuilder rcb = getClientBuilder(searchConfig);
        return new SearchOption(rcb);
    }

    private RestClientBuilder getClientBuilder(SearchConfig searchConfig){
        RestClientBuilder builder = RestClient.builder(searchConfig.getHttpHosts());
        builder.setRequestConfigCallback((RequestConfig.Builder reqBuilder) ->
                reqBuilder.setConnectTimeout(CONN_TIMEOUT).setSocketTimeout(SOCK_TIMEOUT)
        );
        return builder;
    }
}
