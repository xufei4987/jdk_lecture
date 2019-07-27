package com.ssy.java8time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/7/27 15:32
 **/
public class Test01 {
    public static void main(String[] args) {
        //localDate关注年月日
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear() + " " + localDate.getMonthValue() + " " + localDate.getDayOfMonth());
        System.out.println("--------------");

        LocalDate localDate1 = LocalDate.of(2018, 3, 5);
        System.out.println(localDate1);
        System.out.println("--------------");

        LocalDate localDate2 = LocalDate.of(2018, 11, 2);
        MonthDay monthDay = MonthDay.of(localDate2.getMonth(), localDate2.getDayOfMonth());
        MonthDay monthDay1 = MonthDay.from(LocalDate.of(2019, 11, 2));
        System.out.println(monthDay.equals(monthDay1));
        System.out.println("--------------");

        LocalDate localDate3 = localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate3);
        LocalDate localDate4 = localDate.minus(2, ChronoUnit.WEEKS);
        System.out.println(localDate4);
        System.out.println("--------------");

        LocalDate localDate5 = LocalDate.of(2019, 7, 27);
        System.out.println(localDate5.isAfter(localDate));
        System.out.println(localDate5.isBefore(localDate));
        System.out.println(localDate.equals(localDate5));
        System.out.println("--------------");

        //localTime关注时分秒
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1 = localTime.plusHours(3).plusMinutes(20);
        System.out.println(localTime1);
        System.out.println("--------------");

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(availableZoneIds);
        treeSet.forEach(System.out::println);
        System.out.println("--------------");

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);
        System.out.println("--------------");

        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        System.out.println(yearMonth.lengthOfMonth());
        System.out.println(yearMonth.isLeapYear());
        System.out.println("--------------");

        YearMonth yearMonth1 = YearMonth.of(2016, 2);
        System.out.println(yearMonth1);
        System.out.println(yearMonth1.lengthOfMonth());
        System.out.println(yearMonth1.lengthOfYear());
        System.out.println(yearMonth1.isLeapYear());
        System.out.println("--------------");

        LocalDate localDate6 = LocalDate.of(2018, 7, 28);
        Period between = Period.between(localDate6, localDate);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
        System.out.println("--------------");

        //UTC时间
        System.out.println(Instant.now());
        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Shanghai")));

        Instant instant = Instant.parse("2019-07-27T10:30:14.713Z");
        System.out.println(instant);

        System.out.println(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
