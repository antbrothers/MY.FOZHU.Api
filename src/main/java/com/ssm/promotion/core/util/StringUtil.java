package com.ssm.promotion.core.util;

/**
 * Created by Administrator on 2017/9/20.
 */
public class StringUtil {
    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        } else {
            return  false;
        }
    }
    public static boolean isNotEmpty(String str) {
        if (str != null || !"".equals(str.trim())) {
            return true;
        } else {
            return  false;
        }
    }
    public static String formatLike(String str) {
        if (isNotEmpty(str)) {
            return "%" + str + "%";
        } else {
            return null;
        }
    }
}