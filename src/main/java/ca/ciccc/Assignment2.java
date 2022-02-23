package ca.ciccc;

import java.util.Arrays;

/**
 * This is the starter file for the Assignment 2
 *
 * @author Derrick Park
 * @version 1.0
 */
public class Assignment2 {
    /**
     * Write nested for-loops to produce the following output from the given input n.
     * @param n number to create a pattern.
     * @return pattern
     *
     * Sample Input / Output
     * numberLoops(3);
     *
     * Sample Output
     * ..1
     * .22
     * 333
     *
     */
    public String numberLoops(int n) {
        String result = ".";
        for (int i = 1; i <= n; i++){
            for (int k =1; k <= i; k++){
                result = Integer.toString(k);
//                System.out.println(result);
                System.out.print(k);
            }
        }
//        return result;
        return null;
    }

//    public static void main(String[] args) {
//        int n = 3;
//        String result = ".";
//
//        for (int i = 1; i <= n; i++){
//            for (int k = 1; k <= n; k++){
//                if (k > i){
//                    result = Integer.toString(i);
//
//                } else {
//                    result = ".";
//
//                }
//                System.out.print(result);
//            }
//            System.out.println();
//        }
//
//    }

    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int count1 = 0;
        int count7 = 0;
        boolean result = false;

        for (int i = 0; i <= nums.length-1; i++){
            if (nums[i] == 1){
                count1++;
            }
            if (nums[i] == 7){
                count7++;
            }
        }
        if (count1 > count7){
            result = true;
        }
        return result;
    }

    /**
     * Return the sum of numbers in the array, returning 0 for an empty array. Except the number 13
     * is very unlucky, so it does not count the number that comes immediately after a 13, also 13 itself
     * does not count.
     * @param nums array of numbers
     * @return the sum except for 13
     *
     * Sample Input / Output
     * sumExcept13({1, 2, 2, 1}) -> 6
     * sumExcept13({1, 2, 2, 1, 13} -> 6
     * sumExcept13({1, 2, 13, 2, 1, 13} -> 4
     */
    public int sumExcept13(int[] nums) {
        int sum = 0;
        int i = 0;

        while (i < nums.length){
            if (nums[i] == 13) {
                i += 2;
            } else {
                sum += nums[i];
                i += 1;
            }
        }
        return sum;
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} return {2, 5, 3, 6}.
     * You may modify and return the given array, or return a new array.
     * @param nums array of ints
     * @return shifted array
     *
     * Sample Input / Output
     * shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6}
     * shiftArray({2, 3}) -> {3, 2}
     * shiftArray({7}) -> {7}
     */
    public int[] shiftArray(int[] nums) {
        int[] temp = {nums[0]};

        int newNums[] = new int[nums.length - 1];
        for (int j = 1; j < nums.length; j++) {
            newNums[j-1] = nums[j];
        }

        int[] result = new int[newNums.length + temp.length];
        System.arraycopy(newNums, 0, result, 0, newNums.length);
        System.arraycopy(temp, 0, result, newNums.length, temp.length);
        System.out.println(Arrays.toString(result));

        return result;
    }


    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        int count = 0;
        while(count < nums.length){
            if (nums[count] % 3 == 0){
                return true;
            }
            count++;
        }
        return false;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        int count = 0;
        int odd = 0;
        int even = 0;

        while(count < nums.length){
            if (nums[count] % 2 == 0){
                even ++;
            }
            if (nums[count] % 2 == 1){
                odd ++;
            }
            count++;
        }
        if (odd == even){
            return true;
        }

        return false;
    }
}

