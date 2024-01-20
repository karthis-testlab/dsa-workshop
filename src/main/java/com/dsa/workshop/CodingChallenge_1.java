package com.dsa.workshop;

import java.util.HashSet;

public class CodingChallenge_1 {

    public static boolean toSum(int[] numbers, int targetSum) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == targetSum) {
                    return true; // early return
                }
            }
        }
        return false; // default return
    }

    public static boolean toSum_approach2(int[] numbers, int targetSum) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int number : numbers) {
            set.add(number);
        }
        if(numbers[0] < targetSum) {
            return set.contains(targetSum - numbers[0]);
        }
        for (int number : numbers) {
            if (set.contains(targetSum - number)) return true;
        }
        return false; // default return
    }

    public static void main(String[] args) {
        System.out.println(toSum(new int[]{1,2,3,1,2,7,1,2,1,1}, 6));
        System.out.println(toSum_approach2(new int[]{1,2,3,1,2,7,1,2,1,1}, 6));
        System.out.println(toSum_approach2(new int[]{7,2,3,1,2,7,1,2,1,1,5}, 6));
    }


}