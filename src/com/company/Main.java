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

            System.out.println("Choose action ");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Exit");

            int chooseAction = readClass.readNextInt();

            switch (chooseAction) {
                case 1:
                    System.out.println(Action.sum(one,two));
                    //Main Main = new Main();
                  //  break;
                case 2:
                    System.out.println(Action.subs(one,two));
                //    break;
                case 3:
                    System.out.println(Action.multi(one,two));
               //     break;
                case 4:
                    System.out.println(Action.div(one,two));
                //    break;
                case 5:
                //    break;
                default:
                    System.out.println("You do not choose correct point");
            }

      //  }while (y != 1) ;
    }
}

