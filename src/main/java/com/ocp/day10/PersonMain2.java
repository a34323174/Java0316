package com.ocp.day10;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain2 {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Joe", 19, 155, 42.5),
            new Person("Helan", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),};
        
        //將 BMI 的計算邏輯, 使用Function<T, R>
        //參考 api https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
        //T 代表 傳入參數型別, 在這邊指的就是 Person 物件 也就是 p
        //R 代表 回傳參數型別, 在這邊指的就是 Double 物件 也就是 bmi 的計算結果
    }
}
