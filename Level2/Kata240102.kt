package codekata

fun main() {
    // 문자열 내림차순으로 배치하기
    class Solution1 {
        fun solution1(s: String): String = s.toCharArray().sortedDescending().joinToString("")
    }

    // 부족한 금액 계산하기
    class Solution2 {
        fun solution2(price: Int, money: Int, count: Int): Long {
            var answer: Long = 0
            var num: Long = 0

            for (i in 0 .. count) {
                num += i * price
                answer = num - money
            }
            return if(num > money) answer else 0
        }
    }
}
