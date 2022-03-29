package com.example.myapplication;

public class MyClass {
    private static MyClass var;
    private int counter;

    public static MyClass getInstance() {
        if (var == null) {
            var = new MyClass();
        }
        return var;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
