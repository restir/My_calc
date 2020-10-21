package com.company;

public class Main {

    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        int one;
        int two;

        System.out.println("print 1 number ");
        one = readClass.readNextInt();
        System.out.println("print 2 number ");
        two = readClass.readNextInt();

        Action action = new Action(one, two);

        System.out.println("Change action ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. Exit");

        int ChooseAction = readClass.readNextInt();

        switch (ChooseAction){
            case 1: System.out.println(action.add()); break;
            case 2: System.out.println(action.subs()); break;
            case 3: System.out.println(action.multi()); break;
            case 4: System.out.println(action.div()); break;
            case 5: break;
            default:
                System.out.println("You do not choose correct point");
        }

    }

}
