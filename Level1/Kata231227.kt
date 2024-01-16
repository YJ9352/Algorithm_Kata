package codekata

fun main() {
    // 없는 숫자 더하기
    class Solution1 {
        fun solution1(numbers: IntArray): Int = 45 - numbers.sum()
    }

    // 제일 작은 수 제거하기
    class Solution2 {
        fun solution2(arr: IntArray): IntArray {
            var answer = intArrayOf()

            if (arr.size == 1) {
                answer = intArrayOf(-1)
            } else {
                answer = arr.filter { it != arr.minOrNull() }.toIntArray()
            }
            return answer
        }
    }

    // 가운데 글자 가져오기
    class Solution3 {
        fun solution3(s: String): String = s.slice((s.length - 1) / 2 .. s.length / 2)
    }
}
