package test;

import java.util.HashSet;

public class Solution13 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 5, 4, 39, 1, 2 };

        HashSet<Integer> hs = new HashSet<>();

        for (int num = 0; num < nums.length; num++) {
            hs.add(nums[num]);
        }

        System.out.println(hs);

        int answer = hs.size();

        if (answer > nums.length / 2) {
            answer = nums.length / 2;
        }

        System.out.println(answer);
    }

}
