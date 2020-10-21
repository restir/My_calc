package com.company;
import java.util.Scanner;

public class ReadClass {

        public int readNextInt () {

            Scanner sc = new Scanner(System.in);
            int i = 0;
            System.out.println("Input number: ");
            if (sc.hasNextInt()) {
            i = sc.nextInt();
            }
            else {
            System.out.println("Error");
              }
            return i;
        }
}
