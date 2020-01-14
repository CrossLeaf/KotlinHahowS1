package com.eton.kotlinhahows1

class Test(t1: Int) {

    var t1 = t1
        get() {
            println("filed $field")
            return field + 1
        }
    set(value) {
//        print(1)
//        field = value += 3
    }

    fun 列印() {
        t1 += 2
        println(t1)
    }
}