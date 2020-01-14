package com.eton.kotlinhahows1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
    var name = scanner.next()
    print("Please enter student;s english:")
    var english = scanner.nextInt()
    print("Please enter student;s math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()

    var list = listOf("1", "2")

}

enum class Color { BLUE }
