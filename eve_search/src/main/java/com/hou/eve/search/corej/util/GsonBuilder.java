package com.hou.eve.search.corej.util;

import com.google.gson.Gson;

/**
 * @author hbw
 * @date 2020-06-17 21:42
 */
public final class GsonBuilder {
    private GsonBuilder(){}
    private static Gson gson;
    static {
        gson = new Gson();
    }
    public static <T> T getInstance (String str, Class<T> clazz) {
        return gson.fromJson(str, clazz);
    }

    public static String getStr (Object o) {
        return gson.toJson(o);
    }
}
