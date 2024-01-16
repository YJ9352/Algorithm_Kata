package codekata

fun main() {
    // 내적
    class Solution1 {
        fun solution1(a: IntArray, b: IntArray): Int = a.mapIndexed { index, it -> it * b[index] }.sum()
    }

    // 약수의 개수와 덧셈
    class Solution2 {
        fun solution2(left: Int, right: Int): Int {
            var answer: Int = 0

            for (i in left .. right) {
                var cnt = 0

                for (n in 1 .. i) {
                    if (i % n == 0) {
                        cnt ++
                    }
                }

                if (cnt % 2 == 0) {
                    answer += i
                } else {
                    answer -= i
                }
            }

            return answer
        }
    }
}
