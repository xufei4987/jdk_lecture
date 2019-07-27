package com.ssy.jodaTime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/27 15:09
 **/
public class Test02 {
    public static void main(String[] args) {
        System.out.println(Test02.convertUTC2Date("2014-11-04T09:22:54.879Z"));
        System.out.println(Test02.convertDate2UTC(new Date()));
        System.out.println(Test02.convertDate2LocalByDateFormat(new Date()));
    }
    //标准UTC时间(Z代表不需要时区) 2014-11-04T09:22:54.879Z 2014-11-04T09:22:54.879+8:00(东八区)
    //将UTC标准时间字符串转换为当地时区的java的Date类实例。
    public static Date convertUTC2Date(String utcTime){
        DateTime dateTime = DateTime.parse(utcTime);
//        DateTime dateTime = DateTime.parse(utcTime, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        return dateTime.toDate();
    }

    //将当前时区的时间转换为UTC标准时间
    public static String convertDate2UTC(Date javaDate){
        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }

    public static String convertDate2LocalByDateFormat(Date javaDate){
        DateTime dateTime = new DateTime(javaDate);
        return dateTime.toString("yyyy-MM-dd HH:mm:ss");
    }


}
