package codekata

import kotlin.math.*

fun main() {
    // 문자열을 정수로 바꾸기
    class Solution1 {
        fun solution(s: String): Int {
            var answer = 0

            return s.toInt()
        }
    }

    // 정수 제곱근 판별
    class Solution2 {
        fun solution(n: Long): Long {
            var answer: Long = 0
            var a = sqrt(n.toDouble())

            if (a % 1.0 == 0.0) {
                var b = a.toLong() + 1
                println(b)
                var answer = b * b

                println("답 ${answer}")
                return answer
            } else {
                return - 1
            }
        }
    }
}