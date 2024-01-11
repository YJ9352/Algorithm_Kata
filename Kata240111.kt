package codekata

fun main() {
    //크기가 작은 부분문자열
    class Solution {
        fun solution(t: String, p: String): Int {
            var answer: Int = 0

            for (i in 0 .. t.length - p.length) {
                val sub = t.substring(i, i + p.length)

                if (sub.toLong() <= p.toLong()) {
                    answer++
                }
            }

            return answer
        }
    }

    // 다른 분 풀이
    class Solution2 {
        fun solution2(t: String, p: String): Int {
            return (0..t.length - p.length)
                .map{ t.substring(it until it + p.length) }
                .count { it <= p }
        }
    }
}