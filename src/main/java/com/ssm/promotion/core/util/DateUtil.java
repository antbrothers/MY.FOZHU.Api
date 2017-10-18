package com.ssm.promotion.core.util;

import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/20.
 */
public class DateUtil {
    public static String formatDate(Date date, String fomat) {
        String result = "";
        SimpleDateFormat sdf = new SimpleDateFormat(fomat);
        if (date != null) {
            result = sdf.format(date);
        }
        return result;
    }
    public static Date formtString(String str, String format) throws Exception{
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(str);
    }
    public static String getCurrentDateStr() throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
