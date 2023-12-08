package com.example.myapplication2.Algorithm_Kata

fun main() {
    //자릿수 더하기
    class Solution1 {
        fun solution1(n: Int): Int {
            var answer = 0
            var numbers = n

            while (numbers != 0) {
                answer += numbers % 10
                numbers /= 10
            }

            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            println("${answer}")

            return answer
        }
    }

    // 약수의 합
    class Solution2 {
        fun solution2(n: Int): Int {
            var answer = 0

            for (i in 1..n) {
                if (n % i == 0) {
                    answer += i
                }
            }

            println("${answer}")
            return answer
        }
    }
}