package org.example.collections

fun main() {
    val values = intArrayOf(1,5,6,8,10,3)

    for (value in values) {
        println(value)
    }

    println("---------")

    values.forEach {
        println(it)
    }

    println("---------")

    values.forEach {valor ->
        println(valor)
    }

    println("---------")

    for (index in values.indices) {
        println(values[index])
    }

    println("---------")

    values.sort()
    for (value in values) {
        println(value)
    }
}