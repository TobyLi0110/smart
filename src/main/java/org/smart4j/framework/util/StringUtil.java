package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2017/11/15.
 */
public final class StringUtil {
    /*
    * 判断字符串是否为空
    * */
    public static boolean isEmpty(String str) {
        if (str != null)
            str = str.trim();
        return StringUtils.isEmpty(str);
    }

    /*
    * 判断字符串是否非空
    * */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
