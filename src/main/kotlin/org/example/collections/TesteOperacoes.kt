package org.example.collections

fun main() {
    val salarios = doubleArrayOf(2500.0, 5000.0, 500.0)

    for(salario in salarios) {
        println(salario)
    }

    println("---------")

    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("---------")

    val  salariosFilterMaior2500 = salarios.filter { it > 2500.0 }

    salariosFilterMaior2500.forEach {
        println(it)
    }

    println("---------")

    //Conta quantos valores estão nesse intervalo
    println(salarios.count { it in 2000.0 .. 5000.0 })

    println("---------")

    //Procura um item que tenha valor que seja igual ao passado
    println(salarios.find { it == 2500.0 })
    println(salarios.find { it == 2000.0 })

    println("---------")

    //Procura um item que a expressão seja válida

    println(salarios.any { it == 2500.0 })


}