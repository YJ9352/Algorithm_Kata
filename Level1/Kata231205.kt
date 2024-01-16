package com.example.myapplication

fun main() {

    // 두 수의 곱
    class Solution1 {
        fun solution1(num1: Int, num2: Int): Int {
            var answer: Int = 0

            if (0 <= num1 && num2 <= 100) {

            }
            return num1 * num2
        }
    }
    
    // 몫 구하기
    class Solution2 {
        fun solution2(num1: Int, num2: Int): Int {
            var answer: Int = 0
            if (0 <= num1 && num2 <= 100) {

            }
            return num1 / num2
        }
    }
    
    // 나이 출력
    class Solution3 {
        fun solution3(age: Int): Int {
            var answer: Int = 0

            if (0 < age && age <= 120) {

            }
            return 2022 - (age - 1)
        }
    }

    // 숫자 비교하기
    class Solution4 {
        fun solution4(num1: Int, num2: Int): Int {
            var answer: Int = 0

            if(0 <= num1 && num2 <= 10000){
                when (num1) {
                    num2 -> return 1
                    else -> return -1
                }
            }
            return answer
        }
    }

    // 두 수의 합
    class Solution5 {
        fun solution5(num1: Int, num2: Int): Int {
            var answer: Int = -1

            if (-50000 <= num1 && num2 <= 50000) {
            }
            return num1 + num2
        }
    }
}

