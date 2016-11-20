package com.wangwenjun.chapter1;

import java.util.Arrays;

public class Print
{
	public static void main(String[] args)
	{
		Arrays.stream(args).forEach(System.out::println);
	}
}