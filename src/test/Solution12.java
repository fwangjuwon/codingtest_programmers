package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/1845
public class Solution12 {

    public int solution12(int[] nums) {
        int answer = nums.length / 2;

        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }
        return hs.size() > answer ? answer : hs.size();
    }

    public static void main(String[] args) {
        Solution12 sl12 = new Solution12();
        int[] nums = new int[] { 1, 3, 2, 4, 5, 6 };
        Arrays.sort(nums);
    }
}
