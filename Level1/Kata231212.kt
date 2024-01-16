package codekata

// 자연수 뒤집어 배열로 만들기
fun main() {
    // 사이트 내 답안
    class Solution {
        fun solution(n: Long): IntArray =
            n.toString().reversed().map { it.toString().toInt() }.toIntArray()
    }

    // 예제로 만든 것
    val solution = Solution()
    val result = solution.solution(12345L)
    println(result.contentToString()) // 답은 [5, 4, 3, 2, 1]
}
