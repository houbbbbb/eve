package com.hou.eve.search.corej.util;

import com.hou.eve.search.corej.filter.StringFilter;
import com.hou.eve.search.corej.option.result.count.Count;
import com.hou.eve.search.corej.option.result.search.Optional;

/**
 * @author hbw
 * @date 2020-07-08 21:30
 */
public final class Converter {
    private Converter () {}

    public static Optional convert2Optional (String str) {
        return str2SearchObj(str, Optional.class);
    }

    public static Count convert2Count (String str) {
        return str2SearchObj(str, Count.class);
    }

    public static <T> T str2SearchObj (String str, Class<T> clazz) {
        str = StringFilter.filter(str);
        return GsonBuilder.getInstance(str, clazz);
    }

    public static String convert2Body (Object o) {
        return GsonBuilder.getStr(o);
    }
}
