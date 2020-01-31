package com.kk.algorithm.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

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



    }
}
