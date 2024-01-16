package codekata

fun main() {
    // 이상한 문자 만들기
    class Solution {
        fun solution(s: String): String =
            s.split(" ").joinToString(" ") {
                it.mapIndexed { i, t ->
                    when (i % 2) {
                        0 -> t.toUpperCase()
                        else -> t.toLowerCase()
                    }
                }.joinToString("")
            }
    }
}
