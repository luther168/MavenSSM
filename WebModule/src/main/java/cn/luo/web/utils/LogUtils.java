package cn.luo.web.utils;

public class LogUtils {

    private static final String DEFAULT_TAG = LogUtils.class.getSimpleName();

    public static void d(Object o) {
        String log = o == null ? "null" : o.toString();
        System.out.println(DEFAULT_TAG + " " + log);
    }

}
