package com.example.goldmedal.leetcode

fun main() {

}

/*876. Middle of the Linked List
* Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
* Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.*/
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

fun middleNode(head: ListNode?): ListNode? {
    var middle = head
    var end = head
    while (end?.next != null) {
        middle = middle?.next
        end = end.next?.next
    }
    return middle
}