package com.example.goldmedal.leetcode.array

fun main() {
    val intArr = intArrayOf(1, 2, 0, 4, 3, 0, 5, 0)
    moveZeroesThree(intArr)
    println("New Array: ${intArr.contentToString()}")
}

/*
* Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.
* */

fun moveZeroes(arr: IntArray) {
    if (!arr.contains(0)) return
    val filterArr = arr.filter { it != 0 }
    if (filterArr.isEmpty()) return

    val n = arr.size

    val tempArr = IntArray(n)
    var updatedIdx = 0

    for (i in 0 until n) {
        if (arr[i] != 0)
            tempArr[updatedIdx++] = arr[i]
    }

    for (i in 0 until n) {
        arr[i] = tempArr[i]
    }
    println("Temp Array: ${tempArr.contentToString()}")
    println("Original Array: ${arr.contentToString()}")
}

// solution 2: Two traversal
/*
* First Traversal: Shift non-zero elements and maintain count
* Second Traversal: Fill all remaining elements with 0
*  */
fun moveZeroesTwo(arr: IntArray) {
    val n = arr.size
    var count = 0

    for (i in 0 until n) {
        if (arr[i] != 0) {
            arr[count++] = arr[i]
        }
    }

    for (i in count until n) {
        arr[i] = 0
    }
}

// solution 3: One traversal
/* Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
* Similar to two traversal except swaping arr[count] with the non-zero element
*  */
fun moveZeroesThree(arr: IntArray) {
    var count = 0

    for (i in 0 until arr.size) {
        if (arr[i] != 0) {
            val temp = arr[count]
            arr[count++] = arr[i]
            arr[i] = temp
        }
    }
}