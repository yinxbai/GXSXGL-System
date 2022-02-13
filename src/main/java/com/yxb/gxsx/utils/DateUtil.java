package com.yxb.gxsx.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author YinXuBai
 * @date 2022/1/29
 */
public class DateUtil {

    /**
     * 获取系统当前时间（12小时制）
     * 区别：12小时制使用小写的hh，24小时制使用大写的HH
     * @return  系统当前时间(年月日 时分秒)
     */
    public static String getCurrent12DateTotal() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        return simpleDateFormat.format(new Date());
    }

    /**
     * 获取系统当前时间（24小时制）
     * 区别：12小时制使用小写的hh，24小时制使用大写的HH
     * @return  系统当前时间(年月日 时分秒)
     */
    public static String getCurrent24DateTotal() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }

    /**
     * 获取系统当前时间
     * @return  系统当前时间(年月日)
     */
    public static String getCurrentDateHalf() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }

    /**
     *
     * @param time 时间参数
     * @return date日期格式 yyyyMMdd hh:mm:ss
     */
    public static Date stringToDate(String time)  {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        try {
            date =  dateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 时间转换函数
     * @param time 时间参数
     * @return date日期格式 yyyyMMdd
     */
    public static Date timeToDate(String time)  {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date =  dateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
