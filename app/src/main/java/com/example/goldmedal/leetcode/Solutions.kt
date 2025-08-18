package com.example.goldmedal.leetcode

fun main() {
    //print(maximumWealth(arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))))
    //print(fizzBuzz(5))
    //print(numberOfSteps(14))
    println(canConstruct("aa", "ab"))

}

//1672. Richest Customer Wealth
/* Example
* Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
**/
fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    for (account in accounts) {
        var sumOfMoney = 0
        for (money in account) {
            sumOfMoney += money
        }
        println("Sum: $sumOfMoney")
        if (sumOfMoney > max) {
            max = sumOfMoney
        }
    }
    return max
}

//412: FizzBuzz
/*Example
* Given an integer n, return a string array answer (1-indexed) where:
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
* Example 1:
Input: n = 3
Output: ["1","2","Fizz"]
Example 2:
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
* */
fun fizzBuzz(n: Int): List<String> {
    val output: ArrayList<String> = arrayListOf()
    for (number in 1..n) {
        if (number % 3 == 0 && number % 5 == 0) {
            output.add("FizzBuzz")
        } else if (number % 3 == 0) {
            output.add("Fizz")
        } else if (number % 5 == 0) {
            output.add("Buzz")
        } else {
            output.add(number.toString())
        }
    }
    return output
}

//1342. Number of Steps to Reduce a Number to Zero
/*Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise,
you have to subtract 1 from it.

Example 1:
Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.
*/
fun numberOfSteps(num: Int): Int {
    if (num == 0) return 0

    var steps = 0
    var newNumber = num
    do {
        if (newNumber % 2 == 0) {
            newNumber /= 2
        } else {
            newNumber -= 1
        }
        steps++
    } while (newNumber > 0)

    return steps
}

// 383. Ransom Note
/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the
 * letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 *
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 * */
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    /*var newMagazine = magazine
    for (char in ransomNote) {
        if (newMagazine.contains(char)) {
            newMagazine = newMagazine.replaceFirst(char.toString(), "")
            //println(newMagazine)
        } else {
            return false
        }
    }
    return true*/

    // hashmap approach
    val magazineLetter = HashMap<Char, Int>()
    for (char in magazine) {
        val currentCount = magazineLetter.getOrDefault(char, 0)
        magazineLetter[char] = currentCount + 1
    }

    for (char in ransomNote) {
        val currentCount = magazineLetter.getOrDefault(char, 0)
        if (currentCount == 0) return false
        magazineLetter[char] = currentCount - 1
    }
    return true
}