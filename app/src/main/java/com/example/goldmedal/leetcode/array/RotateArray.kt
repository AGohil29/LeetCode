package com.example.goldmedal.leetcode.array

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println("Original Array: ${nums.contentToString()}")

    val newNums = RotateArray().rotate(nums, 3)
    println("Original Array: ${newNums}")
}

/*
* Given an integer array nums, rotate the array to the right by k steps,
* where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
* */

class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val rotation = k % n

        reverseArray(nums, 0, n-1)
        reverseArray(nums, 0, rotation-1)
        reverseArray(nums, rotation, n-1)
    }

    private fun reverseArray(nums: IntArray, start: Int, end: Int) {
        var i = start
        var j = end
        while (i < j) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
            j--
        }
    }
}