package com.example.goldmedal.leetcode;

import java.util.Arrays;

public class ArrayLeet {

    public int removeDuplicates(int[] nums) {
        nums = Arrays.stream(nums).distinct().toArray();
        return nums.length;
    }

}
