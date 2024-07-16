package com.fastcampus;

import com.fastcampus.logic.BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();


        System.out.println(sort.sort(Arrays.asList(args)));
    }
}