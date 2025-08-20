package com.example.goldmedal.leetcode.array

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6)
    println("Original Array: ${nums.contentToString()}")

    RotateArray().rotateArrFourth(nums, 2)
    println("New Array: ${nums.contentToString()}")
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

    // Solution 2: rotate array 1 at a time d times
    fun rotateArr(nums: IntArray, d: Int) {
        val n = nums.size

        // repeat the rotation d times
        for (i in 0 until d) {
            val last = nums[n-1]

            for (j in n-1 downTo 1) {
                nums[j] = nums[j-1]
            }
            nums[0] = last
        }
    }

    // Solution 3: Using temporary array
    /*
    * 1. Create a temp array
    * 2. First copy last d elements to start d elements of temp array
    * 3. Copy first n-d elements to last n-d element of temp array
    * 4. Finally copy all elements for temp array to original array
    * Input: nums = [1,2,3,4,5,6,7], k = 3
    * Output: [5,6,7,1,2,3,4]
    * */
    fun rotateArrThird(nums: IntArray, k: Int) {
        val n = nums.size

        val d = k % n
        // step 1
        val tempNums = IntArray(n)

        // step 2
        for (i in 0 until d) {
            tempNums[i] = nums[n-d+i]
        }
        println("1. Temp array: ${tempNums.contentToString()}")

        // step 3
        for (i in d until n)
            tempNums[i] = nums[i-d]

        println("2. Temp array: ${tempNums.contentToString()}")

        // step 4
        for (i in 0 until n)
            nums[i] = tempNums[i]
        println("3. Temp array: ${tempNums.contentToString()}")
    }

    // Solution 4: Juggling Algorithm
    /*
    *  Use concept of cycles
    * Input: nums = [1,2,3,4,5,6,7], k = 3
    * Output: [5,6,7,1,2,3,4]
    * */
    fun rotateArrFourth(nums: IntArray, k: Int) {
        val n = nums.size
        val d = k % n

        val cycles = gcd(n, d)

        for (i in 0 until cycles) {
            var currIdx = i
            var currEle = nums[currIdx]

            do {
                val nextIdx = (currIdx + d) % n
                val nextEle = nums[nextIdx]

                nums[nextIdx] = currEle

                currEle = nextEle
                currIdx = nextIdx
            } while (currIdx != i)
        }
    }

    private fun gcd(a: Int, b: Int): Int {
        var x = a
        var y = b

        while (y != 0) {
            val temp = y
            y = x % y
            x = temp
        }
        return x
    }
}