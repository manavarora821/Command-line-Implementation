package com.company;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordList {
    private ArrayList<String> theWordList = new ArrayList<String>();
    public void addWord(String s) {

        theWordList.add(s);
    }
    /* Check point 5: complete the method below */
    public String getFirst() {
        if(theWordList.size()==0)
        {
            return "-";
        }
        else {
            return theWordList.get(0);
        }
        /* Replace the return statement below with a statement
         * that returns
         * the first word of theWordList (the word at index 0).
         * Hint: use the ArrayList method "get".
         * If there is no first word (theWordList has no words in it), * "-" should be returned.
         */

    }
    /* Check point 6: complete the method below */
    public String getLast() {
        if(theWordList.size()==0)
        {
            return "-";
        }
        else
        {
            return theWordList.get(theWordList.size()-1);
        }
        /* Replace the string "junk" with the
         * last word of theWordList (the word
         * at index size()-1). Hint: use the ArrayList method "get". * If there is no last word (theWordList has no words in it), * "-" should be returned.
         */

    }
    public String toString() {
        return theWordList.toString();
    }
    public void sortAlpha()
    {

        Collections.sort(theWordList);
    }
    public double getAvgLength()
    {
        double count=0;
        for(int i=0;i<theWordList.size();i++)
        {
        String str;
        str=theWordList.get(i);
        count+=str.length();
        }

        double lengthsize=theWordList.size();
//        System.out.println(lengthsize);
        double avg=count/lengthsize;
//        System.out.println(avg);
        return avg;
    }

    public ArrayList<String> sortByLength() {
        Collections.sort(theWordList, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(),str2.length());
            }
        });
        return theWordList;
    }Collections.sort(theWordList);
}

//            for(int i=1;i<theWordList.size();i++)
//            {
//
//            System.out.println(theWordList);
//            int smallestsize=smallest.length();
//            if(smallestsize<theWordList.get(i).length())
//            {
//               smallest=theWordList.sort(theWordList);
////                smallestsize=theWordList.indexOf(i);
////                System.out.println(smallestsize);



