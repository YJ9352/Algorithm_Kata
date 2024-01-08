package codekata

fun main() {
    // 3진법 뒤집기
    class Solution {
        fun solution(n: Int): Int {
            var answer: Int = 0
            return n.toString(3).reversed().toInt(3)
        }
    }
}