package com.example.myapplication.kata

fun main() {

    // 두 수의 나눗셈
    class Solution1 {
        fun solution1(num1: Int, num2: Int): Int {
            var answer: Int = 0

            if (0 < num1 && num2 <= 100) {
                answer = ((num1.toDouble() / num2.toDouble()) * 1000).toInt()
            }

            return answer
        }
    }

    // 각도기
    class Solution2 {
        fun solution3(angle: Int): Int {
            var answer: Int = 0

            if (0 < angle && angle < 90) {
                return 1
            } else if (angle == 90) {
                return 2
            } else if (90 < angle && angle < 180) {
                return 3
            } else {
                return 4
            }

        }
    }
}
