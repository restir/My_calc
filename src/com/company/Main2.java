package com.company;

public class Main2 {

    public static void main(String[] args) {

        Action2 a = new Action2(1,4);
        a.add();

//        a.sum(2,3);
        System.out.println(Action2.sum(2,3));

//        a.sum(2,3);
        System.out.println(Action2.sum(2,3, 4));
    }
}
