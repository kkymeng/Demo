package com.kk.algorithm.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * LocalDate 使用
 * 与LocalDateTime
 */
public class DateTest {
    public static void main(String[] args) {
        // 打印当前日期
        LocalDate now = LocalDate.now();
        System.out.println("当前日期"+now);
        // 将日期格式转为为LocalDate对象
        String str = "2020-02-02";
        LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDate);
        //获取指定日期所在月的第一个周一
        LocalDate monday = now.with(DayOfWeek.MONDAY);
        System.out.println("monday"+monday);
        // 不跨月
        LocalDate monday1 = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("monday1:"+monday1);
        // 计算两个LocalDate之间有多少天
        long days = monday1.toEpochDay() - monday.toEpochDay();
        System.out.println("days"+days);
        // 转换成Date
        Date date = Date.from(now.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(date);
        // 时间转化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyMMddHHmmssSSS");
        String dateTime = LocalDateTime.now(ZoneOffset.of("+8")).format(formatter);
        System.out.println(dateTime);
        String dateTime2 = "2020-01-31 22:08:26";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime1 = LocalDateTime.parse(dateTime2,df);
        System.out.println("dateTime1"+dateTime1);
        // 两个日期间的距离
        LocalDate start = LocalDate.parse("2018-12-01");
        LocalDate end = LocalDate.now();
        long year = start.until(end, ChronoUnit.YEARS);
        long month = start.until(end,ChronoUnit.MONTHS);
        System.out.println(year+"month:"+month);

    }
}
