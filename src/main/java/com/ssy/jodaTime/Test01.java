package com.ssy.jodaTime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/27 14:40
 * 1.格林威治标准时间 比如北京在东八区 就比格林威治标准时间快8个小时 UTC+8
 * 2.UTC时间(世界统一时间) 2010-12-1T11:22:33.547Z
 * 3.ISO8601日历标准
 * simpledataformat 有线程安全相关问题
 **/
public class Test01 {
    public static void main(String[] args) {
        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);
        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));
        System.out.println("------------");

        DateTime dateTime = today.withDayOfMonth(1);
        System.out.println(dateTime.toString("yyyy-MM-dd"));
        System.out.println("------------");

        LocalDateTime localDateTime = new LocalDateTime();
        System.out.println(localDateTime);
        LocalDate localDate = new LocalDate();
        System.out.println(localDate);
        System.out.println("-------------");

        LocalDate localDate1 = localDate.plusMonths(3).dayOfMonth().withMinimumValue();
        LocalDate localDate2 = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println("-------------");

        DateTime dateTime1 = today.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMinimumValue();
        System.out.println(dateTime1);
    }
}
