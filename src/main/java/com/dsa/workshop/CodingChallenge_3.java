package com.dsa.workshop;

import java.util.ArrayList;
import java.util.List;

public class CodingChallenge_3 {

    /*

      Java Program to Check if two strings are anagram

      1) Take 2 strings S1, S2.
      2) Find length if same then proceed.Length should be greater than or equal to 2.
      3) Take each distinct letter in S1 count the occurence of the letter.
      For the same letter Count no : mof occurence inS2.
       We can set of s1
       Loop for all the letters in S1 .
       Hash/ Map of s2 with count.
     */

    public static void main(String[] args) {
        String string1 = "Cat";
        String string2 = "Rat";

        boolean rBoolean = true;

        char[] charArray1 = string1.toLowerCase().toCharArray();
        char[] charArray2 = string2.toLowerCase().toCharArray();

        List<Character> list = new ArrayList<Character>();

        for (char charArray :charArray1) {
            list.add(charArray);
        }

        for (char c : charArray2) {
            if (!list.contains(c)) {
                rBoolean = false;
                break;
            }
        }

        System.out.println("--> "+rBoolean);

    }

}
