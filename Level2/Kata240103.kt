package codekata

fun main() {
    // 문자열 다루기 기본
    class Solution1 {
        fun solution1(s: String): Boolean = (s.length == 4 || s.length == 6) && s.all{ it.isDigit() }
    }

    // 행렬의 덧셈
    class Solution2 {
        fun solution2(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
            var answer = Array<IntArray>(arr1.size){
                    i -> IntArray(arr1[0].size){j -> arr1[i][j] + arr2[i][j]}
            }
            return answer
        }
    }
}
