package com.example.myapplication.algorithm_kata

fun main() {

    // 짝수의 합
    class Solution1 {
        fun solution1(n: Int): Int {
            var answer: Int = 0

            for (e:Int in 1 .. n) {
                if (e % 2 == 0) {
                    answer += e
                }
            }
            return answer
        }
    }

    // 배열의 평균값
    class Solution2 {
        fun solution2(numbers: IntArray) = numbers.average()
    }

    // 짝수와 홀수
    class Solution3 {
        fun solution3(num: Int) = if (num % 2 == 0) "Even" else "Odd"
    }

    // 평균 구하기
    class Solution4 {
        fun solution4(arr: IntArray) = arr.average()
    }

}