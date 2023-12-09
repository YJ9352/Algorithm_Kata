package codekata

// 나머지가 1이 되는 수 찾기
fun main() {
    class Solution {
        fun solution(n: Int): Int {
            var answer: Int = 0

            for (x in 2 until n-1) {
                if (n % x == 1) return x
            }

            return n - 1
        }
    }
}
