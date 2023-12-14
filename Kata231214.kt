package codekata

fun main() {
    // 정수 내림차순으로 배치하기
    class Solution {
        fun solution(n: Long): Long = String(n.toString().toCharArray().sortedArrayDescending()).toLong()
    }
}