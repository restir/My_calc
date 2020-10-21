package com.company;
import java.util.Scanner;

public class Action {

    private int a;
    private int b;

    public Action () {
         this.a = 0;
         this.a = 0;
    }

    public Action(int a, int b){
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

}

