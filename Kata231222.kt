package codekata

fun main() {
    // 나누어 떨어지는 숫자 배열
    class Solution {
        fun solution(arr: IntArray, divisor: Int): IntArray {
            var answer = intArrayOf()

            arr.forEach {
                if (it % divisor == 0) {
                    answer += it
                }
            }
            answer.sort()

            if (answer.isEmpty()) {
                answer += -1
            }

            return answer
        }
    }
}