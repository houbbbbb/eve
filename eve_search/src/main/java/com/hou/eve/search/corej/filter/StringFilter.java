package com.hou.eve.search.corej.filter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hbw
 * @date 2020-07-01 21:29
 */
public class StringFilter {
    private static final Pattern PATTERN;
    public static final String UNDERLINE = "_";

    static {
        PATTERN = Pattern.compile("(?<key>[^\"]*)[\"] [:$]");
    }
    private static final String KEY = "key";

    public static String filter (String re) {
        Matcher matcher = PATTERN.matcher(re);
        while (matcher.find()) {
            String s = matcher.group(KEY);
            re = filter(re, s);
        }
        return re;
    }

    private static String filter(String re, String s) {
        if (s.startsWith(UNDERLINE)) {
            re = re.replaceAll(s, s.substring(1));
            s = s.substring(1);
        }
        if (s.contains(UNDERLINE)) {
            String[] ss = s.split(UNDERLINE);
            if (ss.length > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(ss[0]);
                for (int i = 1; i < ss.length; i++) {
                    String str = firsUppercase(ss[i]);
                    sb.append(null != str ? str : "");
                }
                re = re.replaceAll(s, sb.toString());
            }
        }
        return re;
    }

    private static String firsUppercase (String s) {
        if (null != s && s.length() > 0) {
            return s.substring(0, 1).toUpperCase() + s.substring(1);
        }
        return null;
    }
}
