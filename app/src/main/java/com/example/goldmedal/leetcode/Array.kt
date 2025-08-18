package com.example.goldmedal.leetcode

fun main() {
    print(removeDuplicates(intArrayOf(1,1,2)))
}

// Remove Duplicates from Sorted Array
/**
 * Example
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 **/
fun removeDuplicates(nums: IntArray): Int {

    /**
    * Runtime: 40 ms
    * Memory Usage: 41.1 MB
     * */
    val newNums = arrayOfNulls<Int>(nums.distinct().size)
    var positionToAdd = 0
    for (num in nums) {
        if (newNums.contains(num)) {
            continue
        } else {
            newNums[positionToAdd] = num
            nums[positionToAdd] = num
            positionToAdd++
        }
    }
    return newNums.size
}
