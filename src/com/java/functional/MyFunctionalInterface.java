package com.java.functional;

//@FunctionalInterface
public interface MyFunctionalInterface {

    void abstractMethod1();

    //void abstractMethod2();

    @Override
    public String toString() ;

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    default void printMethod1(){
        System.out.println("MyFunctionalInterface.printMethod1");
    }

    default void printMethod2() {
        System.out.println("MyFunctionalInterface.printMethod2");
    }

    static void printStaticMethod1() {
        System.out.println("MyFunctionalInterface.printStaticMethod1");
    }

    static void printStaticMethod2() {
        System.out.println("MyFunctionalInterface.printStaticMethod2");
    }
}
