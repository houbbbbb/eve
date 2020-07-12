package com.hou.eve.search.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringWriter;

/**
 * @author hbw
 * @date 2020-02-03 21:18
 */
public class Freemarker {
    private static final String UTF_8 = "UTF-8";
    private static final Configuration configuration;
    private static final String BASE_DIR = "/freemarker";
    /**
     * 缓存，默认5秒
     */
    private static final Long CACHE_TIME = 60000L;
    static{
        configuration = new Configuration(Configuration.getVersion());
        configuration.setTemplateUpdateDelayMilliseconds(CACHE_TIME);
        configuration.setClassForTemplateLoading(Freemarker.class, BASE_DIR);
        configuration.setDefaultEncoding(UTF_8);
    }

    public static String freemarker(Object model, String fileName){
        StringWriter out = new StringWriter();
        try {
            Template template = configuration.getTemplate(fileName);
            template.process(model, out);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{out.close();} catch (Exception e){}
        }
        return out.toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(freemarker(null, "a.ftl"));
    }
}
