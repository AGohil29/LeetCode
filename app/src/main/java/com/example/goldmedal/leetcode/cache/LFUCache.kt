package com.example.goldmedal.leetcode.cache

fun main() {
    val cache = LFUCache(10)
    cache.put(10, 13)
    cache.put(3, 17)
    cache.put(6, 11)
    cache.put(10, 5)
    cache.put(9, 10)
    println("*******************************************")
    println("GET value for the key = 13 : ${cache.get(13)}")
    println("*******************************************")
    cache.put(2, 19)
    println("*******************************************")
    println("GET value for the key = 2 : ${cache.get(2)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 3 : ${cache.get(3)}")
    println("*******************************************")
    cache.put(5, 25)
    println("*******************************************")
    println("GET value for the key = 8 : ${cache.get(8)}")
    println("*******************************************")
    cache.put(9, 22)
    cache.put(5, 5)
    cache.put(1, 30)
    println("*******************************************")
    println("GET value for the key = 11 : ${cache.get(11)}")
    println("*******************************************")
    cache.put(9, 12)
    println("*******************************************")
    println("GET value for the key = 7 : ${cache.get(7)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 5 : ${cache.get(5)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 8 : ${cache.get(8)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 9 : ${cache.get(9)}")
    println("*******************************************")
    cache.put(4, 30)
    cache.put(9, 3)
    println("*******************************************")
    println("GET value for the key = 9 : ${cache.get(9)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 10 : ${cache.get(10)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 10 : ${cache.get(10)}")
    println("*******************************************")
    cache.put(6, 14)
    cache.put(3, 1)
    println("*******************************************")
    println("GET value for the key = 3 : ${cache.get(3)}")
    println("*******************************************")
    cache.put(10, 11)
    println("*******************************************")
    println("GET value for the key = 8 : ${cache.get(8)}")
    println("*******************************************")
    cache.put(2, 14)
    println("*******************************************")
    println("GET value for the key = 1 : ${cache.get(1)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 5 : ${cache.get(5)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 4 : ${cache.get(4)}")
    println("*******************************************")
    cache.put(11, 4)
    cache.put(12, 24)
    cache.put(5, 18)
    println("*******************************************")
    println("GET value for the key = 13 : ${cache.get(13)}")
    println("*******************************************")
    cache.put(7, 23)
    println("*******************************************")
    println("GET value for the key = 8 : ${cache.get(8)}")
    println("*******************************************")
    println("GET value for the key = 12 : ${cache.get(12)}")
    println("*******************************************")
    cache.put(3, 27)
    cache.put(2, 12)
    println("*******************************************")
    println("GET value for the key = 5 : ${cache.get(5)}")
    println("*******************************************")
    cache.put(2, 9)
    cache.put(13, 4)
    cache.put(8, 18)
    cache.put(1, 7)
    println("*******************************************")
    println("GET value for the key = 6 : ${cache.get(6)}")
    println("*******************************************")
    cache.put(9, 29)
    cache.put(8, 21)
    println("*******************************************")
    println("GET value for the key = 5 : ${cache.get(5)}")
    println("*******************************************")
    cache.put(6, 30)
    cache.put(1, 12)
    println("*******************************************")
    println("GET value for the key = 10 : ${cache.get(10)}")
    println("*******************************************")
    cache.put(4, 15)
    cache.put(7, 22)
    cache.put(11, 26)
    cache.put(8, 17)
    cache.put(9, 29)
    println("*******************************************")
    println("GET value for the key = 5 : ${cache.get(5)}")
    println("*******************************************")
    cache.put(3, 4)
    cache.put(11, 30)
    println("*******************************************")
    println("GET value for the key = 12 : ${cache.get(12)}")
    println("*******************************************")
    cache.put(4, 29)
    println("*******************************************")
    println("GET value for the key = 3 : ${cache.get(3)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 9 : ${cache.get(9)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 6 : ${cache.get(6)}")
    println("*******************************************")
    cache.put(3, 4)
    println("*******************************************")
    println("GET value for the key = 1 : ${cache.get(1)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 10 : ${cache.get(10)}")
    println("*******************************************")
    cache.put(3, 29)
    cache.put(10, 28)
    cache.put(1, 20)
    cache.put(11, 13)
    println("*******************************************")
    println("GET value for the key = 3 : ${cache.get(3)}")
    println("*******************************************")
    cache.put(3, 12)
    cache.put(3, 8)
    cache.put(10, 9)
    cache.put(3, 26)
    println("*******************************************")
    println("GET value for the key = 8 : ${cache.get(8)}")
    println("*******************************************")
    println("GET value for the key = 7 : ${cache.get(7)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 5 : ${cache.get(5)}")
    println("*******************************************")
    cache.put(13, 17)
    cache.put(2, 27)
    cache.put(11, 15)
    println("*******************************************")
    println("GET value for the key = 12 : ${cache.get(12)}")
    println("*******************************************")
    cache.put(9, 19)
    cache.put(2, 15)
    cache.put(3, 16)
    println("*******************************************")
    println("GET value for the key = 1 : ${cache.get(1)}")
    println("*******************************************")
    cache.put(12, 17)
    cache.put(9, 1)
    cache.put(6, 19)
    println("*******************************************")
    println("GET value for the key = 4 : ${cache.get(4)}")
    println("*******************************************")
    println("GET value for the key = 5 : ${cache.get(5)}")
    println("*******************************************")
    println("*******************************************")
    println("GET value for the key = 5 : ${cache.get(5)}")
    println("*******************************************")
    cache.put(8, 1)
    cache.put(11,7)
    cache.put(5, 2)
    cache.put(9, 28)
    println("*******************************************")
    println("GET value for the key = 1 : ${cache.get(1)}")
    println("*******************************************")
    cache.put(2, 2)
    cache.put(7, 4)
    cache.put(4, 22)
    cache.put(7, 24)
    cache.put(9, 26)
    cache.put(13, 28)
    cache.put(11, 26)

    /* Test Case
    [[10],[10,13],[3,17],[6,11],[10,5],[9,10],[13],[2,19],[2],[3],[5,25],[8],[9,22],[5,5],[1,30],[11],
        [9,12],[7],[5],[8],[9],[4,30],[9,3],[9],[10],[10],[6,14],[3,1],[3],[10,11],[8],[2,14],[1],[5],
        [4],[11,4],[12,24],[5,18],[13],[7,23],[8],[12],[3,27],[2,12],[5],[2,9],[13,4],[8,18],[1,7],
        [6],[9,29],[8,21],[5],[6,30],[1,12],[10],[4,15],[7,22],[11,26],[8,17],[9,29],[5],[3,4],[11,30],
        [12],[4,29],[3],[9],[6],[3,4],[1],[10],[3,29],[10,28],[1,20],[11,13],[3],[3,12],[3,8],[10,9],
        [3,26],[8],[7],[5],[13,17],[2,27],[11,15],[12],[9,19],[2,15],[3,16],[1],[12,17],[9,1],[6,19],
        [4],[5],[5],[8,1],[11,7],[5,2],[9,28],[1],[2,2],[7,4],[4,22],[7,24],[9,26],[13,28],[11,26]]

        Output: Capacity

        N1 -> N2 -> N3 -> N4 -> N5
        N1 -> N2 -> N4 -> N5 -> N3
        N2 -> N4 -> N5 -> N3 -> N6
        */
}

private class Node1(
    val key: Int,
    var value: Int,
    var freq: Int = 1
)

class LFUCache(private val capacity: Int) {
    private val nodeMap = mutableMapOf<Int, Node1>()
    private val freqMap = mutableMapOf<Int, LinkedHashSet<Node1>>()
    private var minFreq = 0

    fun get(key: Int): Int {
        val node = nodeMap[key] ?: return -1
        updateFrequency(node)
        printHashMap(key, node.value)
        return node.value
    }

    fun put(key: Int, value: Int) {
        if (capacity == 0) return
        if (key in nodeMap) {
            nodeMap[key]?.let {
                it.value = value
                updateFrequency(it)
            }
            printHashMap(key, value)
            return
        }
        if (nodeMap.size >= capacity) {
            freqMap[minFreq]?.let { nodes ->
                val toEvict = nodes.first()
                nodes.remove(toEvict)
                nodeMap.remove(toEvict.key)
                if (nodes.isEmpty()) {
                    freqMap.remove(minFreq)
                }
            }
        }
        val newNode = Node1(key, value)
        nodeMap[key] = newNode
        freqMap.getOrPut(1) { LinkedHashSet() }.add(newNode)
        minFreq = 1
        printHashMap(key, value)
    }

    private fun updateFrequency(node: Node1) {
        val freq = node.freq
        freqMap[freq]?.remove(node)
        if (freqMap[freq]?.isEmpty() == true) {
            freqMap.remove(freq)
            if (freq == minFreq) minFreq++
        }
        node.freq++
        freqMap.getOrPut(node.freq) { LinkedHashSet() }.add(node)
    }

    private fun printHashMap(key: Int, value: Int) {
        println("-------------------------------------------")
        println("After adding key = $key and value = $value")
        println("Current Status of hashMap")
        nodeMap.forEach {
            println("key = ${it.key}, value = ${it.value.value} and frequency = ${it.value.freq}")
        }
        println("-------------------------------------------")
    }
}