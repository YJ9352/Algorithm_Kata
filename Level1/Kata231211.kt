package codekata

// x만큼 간격이 있는 n개의 숫자
fun main() {
    // 사이트 내 답안
    class Solution {
        fun solution(x: Int, n: Int) = LongArray(n){ x.toLong() * (it + 1) }
    }

    // 예제로 만든 것
    fun solution(x: Int, n: Int) = LongArray(n) { x.toLong() * (it + 1) }

    val result = solution(2, 5)
    println(result.contentToString())
}



