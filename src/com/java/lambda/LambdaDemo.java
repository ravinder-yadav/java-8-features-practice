package com.java.lambda;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaDemo {
    public static void main(String[] args) {

        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.add(10,20);

        LambdaDemo.addStatic(10,20);


        BiConsumer<Integer, Integer> biConsumer = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                System.out.println("anonymous class sum ="+ (integer  + integer2));
            }
        };

        biConsumer.accept(10,20);

        BiConsumer<Integer,Integer> biConsumer1 =
                (integer, integer2) ->
                        System.out.println("anonymous function sum ="+ (integer  + integer2));
        biConsumer1.accept(10,20);

       Comparator<String> comparator = (a, b) -> a.compareTo(b);
        System.out.println("Comparator = " + comparator.compare("Ravi","Yadav"));

    }

    public void add(Integer integer, Integer integer2) {
        System.out.println("instance method sum ="+ (integer  + integer2));
    }

    public static void addStatic(Integer integer, Integer integer2) {
        System.out.println("static method sum ="+ (integer  + integer2));
    }
}
