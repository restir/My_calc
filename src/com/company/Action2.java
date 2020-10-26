package com.company;

public class Action2 {

    private int a;
    private int b;

    public Action2() {
         this.a = 0;
         this.a = 0;
    }

    public Action2(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add () {
        return a + b;
    }

    public int subs () {
        return a - b;
    }
    public int multi (){
        return a * b;
    }
    public int div (){
        return a / b;
    }

    public static int sum (int c, int d){

        return c + d;
    }

    public static int sum (int c, int f, int d){
        return c + f + d;
    }

}

