package org.example.collections

fun main() {
    val salarios = doubleArrayOf(1500.0, 5000.0, 500.0)

    for(salario in salarios) {
        println(salario)
    }

    println("---------")

    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média salarial: ${salarios.average()}")

    println("---------")

    val  salariosFilterMaior2500 = salarios.filter { it > 2500.0 }

    salariosFilterMaior2500.forEach {
        println(it)
    }
}