package codekata

fun main() {
    // 두 정수 사이의 합
    class Solution {
        fun solution(a: Int, b: Int): Long {
            var answer: Long = 0

            if (a < b) {
                for (i in a .. b) {
                    answer += i.toLong()
                }
                return answer
            } else if (a > b) {
                for (i in b .. a) {
                    answer += i.toLong()
                }
                return answer
            } else {
                return a.toLong()
            }
        }
    }
}