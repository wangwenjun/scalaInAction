package com.wangwenjun.chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

/***************************************
 * @author:Alex Wang
 * @Date:2016/11/23 QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public class ScalaListFunctionByJava {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7);

        long count = list.stream().filter(i -> i > 4).unordered().count();
        Optional.of(count).ifPresent(System.out::println);


        Optional.ofNullable(list.stream().map(i -> i * 10).collect(toList()))
                .ifPresent(System.out::println);
    }
}
