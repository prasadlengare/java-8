package com.learn.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /*
        Runnable before java 8
        */
        Runnable runnable = () -> System.out.println("Runnable ");
        new Thread(runnable).start();

        /*
        Runnable after java 8
        */
        //Method 1
        Runnable runnable1 = ()-> System.out.println("Runnable 1");
        new Thread(runnable1).start();

        //Method 2
        Runnable runnable2 = ()->System.out.println("Runnable 2");
        new Thread(runnable2).start();

        //Method 3
        new Thread(()->System.out.println("Runnable 3")).start();
    }
}
