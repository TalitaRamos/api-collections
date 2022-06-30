package org.example.collections

fun main() {
    val values = IntArray(5)

    values[0] = 3
    values[1] = 2
    values[2] = 7
    values[3] = 6
    values[4] = 8

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