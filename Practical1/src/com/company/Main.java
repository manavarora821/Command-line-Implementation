package com.company;


import javax.lang.model.element.NestingKind;
import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       Line[] lineStore=new Line[50];
        String str2="STOP";
int number=1;
       for(int i=0;i<=lineStore.length-1;i++) {
           System.out.println(number + ": Enter a line");
           String msg=in.nextLine();
           if (msg.equals(str2)) {

               break;

           }
           else {
               lineStore[i] = new Line(msg, number);
               number++;
           }

           }
        for(int j=number-2;j>=0;j--)
        {

                System.out.println(lineStore[j].getSeqNum()+": " + lineStore[j].getText());
        }


//        int number=1;
//        System.out.println(number+" : Enter a line");
//        Line msg1 = new Line(in.nextLine(),number);
//        number++;
//        System.out.println(number+" : Enter another line");
//        Line msg2 = new Line(in.nextLine(),number);
//        number++;
//        System.out.println(number+" : Enter the last line");
//        Line msg3 = new Line(in.nextLine(),number);
//        System.out.println(msg3.getSeqNum()+" : " + msg3.getText() + "," + msg2.getSeqNum()+" : " + msg2.getText() + "," + msg1.getSeqNum()+" : "+msg1.getText()) ;


    }
}
