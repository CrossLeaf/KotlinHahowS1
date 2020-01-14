package com.eton.kotlinhahows1

class Student(var name: String?, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t" + (english + math) / 2 + "\t")
    }
}
