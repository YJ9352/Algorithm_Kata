package codekata

fun main() {
    // 예제로 만든 것
    val solution = Solution()

    // 입력 값
    val input = 13

    // 함수 호출 및 결과 출력
    val result = solution.solution(input)
    println(result)
}

// 하샤드 수
class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = 0

        x.toString().map {
            sum += (it.toInt() - '0'.toInt())
        }
        return x % sum == 0
    }
}