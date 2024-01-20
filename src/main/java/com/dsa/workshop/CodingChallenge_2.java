package com.dsa.workshop;

public class CodingChallenge_2 {

    public static boolean isPalindrome_approach2(String string) {
        int left = 0 , right = string.length() - 1;
        char[] charArray = string.toCharArray();
        while (left < right) {
            char temp = string.charAt(right);
            charArray[right] = string.charAt(left);
            charArray[left] =  temp;
            left ++;
            right --;
        }
        System.out.println("--> "+new String(charArray).equals(string));
        return new String(charArray).equals(string);
    }

    public static void main(String[] args) {

        String str = "madam";
        boolean rBoolean = true;
        int j = str.length () - 1;
        for (int i = 0; i < str.length (); i++) {
            if (str.charAt(i) != str.charAt(j--)) {
                rBoolean = false;
            }
        }

        System.out.println("--> "+rBoolean);
        System.out.println("--> "+isPalindrome_approach3(str));

    }

    /*
      Time complexity : O(n) -> Solution based on time
      Space complexity : O(1) -> Space occupied for your solution
     */

    public static boolean isPalindrome_approach3(String string) {
        int left = 0, right = string.length() - 1;
        while (left <= right) {
            if(string.charAt(left++) != string.charAt(right--))
                return false;
        }
        return true;
    }


}
