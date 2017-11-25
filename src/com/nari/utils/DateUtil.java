package com.nari.utils;

import java.text.SimpleDateFormat;

public class DateUtil {

    private static String pattern = "yyyy-MM-dd";
    private static SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    private static String defaultDatePattern = null;
    private static String timePattern = "HH:mm";
    public static final String TYPE_DATE = "D"; // 日期
    public static final String TYPE_TIME = "T"; // 时间
    public static final String TYPE_DATETIME = "DT"; // 日期时间
    public static final String STYLE_XML = "X"; // XML日期时间格式
    public static final String STYLE_AD = "AD"; // 日期时间格式：CCYYMMDDhhmmss
    public static final String STYLE_ROC = "R"; // 日期时间格式：YYYMMDDhhmmss
    public static final String STYLE_FORMAT = "F"; // 日期时间格式：CCYY-MM-DD
    public static final String STYLE_FORMAT_FOR_USER = "FU"; // 日期时间格式:CCYY/MM/DD
    public static final SimpleDateFormat DATE_FORMAT_FULL = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat DATE_FORMAT_MEDIUM = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm");
    public static final SimpleDateFormat DATE_FORMAT_SHORT = new SimpleDateFormat(
            "yyyy-MM-dd");
    public static final SimpleDateFormat DATE_FORMAT_MEDIUM_BBS = new SimpleDateFormat(
            "MM-dd HH:mm");
    public static final SimpleDateFormat DATE_FORMAT_SHORT_BBS = new SimpleDateFormat(
            "MM-dd");
    public static final SimpleDateFormat DATE_FORMAT_SHORT_BBSFEN = new SimpleDateFormat(
            "HH:mm");
    public static final SimpleDateFormat DATE_FORMAT_FULL_ZH = new SimpleDateFormat(
            "yyyy年MM月dd日 HH时mm分ss秒");
    public static final SimpleDateFormat DATE_FORMAT_MEDIUM_ZH = new SimpleDateFormat(
            "yyyy年MM月dd日 HH时mm分");
    public static final SimpleDateFormat DATE_FORMAT_SHORT_ZH = new SimpleDateFormat(
            "yyyy年MM月dd日");

    public static String getDatePattern() {
        try {
            defaultDatePattern = "yyyy-MM-dd";
        } catch (Exception mse) {
            defaultDatePattern = "MM/dd/yyyy";
        }
        return defaultDatePattern;
    }
}
