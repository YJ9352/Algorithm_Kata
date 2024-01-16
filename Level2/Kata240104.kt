package codekata

// 직사각형 별찍기
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    print(("*".repeat(a) + "\n").repeat(b))
}
