package codekata

fun main() {
    // 음양 더하기
    class Solution1 {
        fun solution1(absolutes: IntArray, signs: BooleanArray): Int {
            var num1:Int = 0
            var num2:Int = 0

            for(i in 0 until absolutes.size){
                if(signs[i] == true){
                    num1 += absolutes[i]
                } else if (signs[i] == false) {
                    num2 += absolutes[i]
                } else {
                    return num1
                }
            }


            return num1 - num2
        }
    }

    // 핸드폰 번호 가리기
    class Solution2 {
        fun solution2(phone_number: String): String {
            var answer = ""
            var num = phone_number.substring(0, phone_number.length - 4)

            for (i in num.indices) {
                answer += "*"
            }

            return answer + phone_number.substring(phone_number.length - 4)
        }
    }
}
