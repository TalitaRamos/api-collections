package org.example.collections

fun main() {
    val  joao = Funcionario("João", 2000.0, "CLT")
    val  talita = Funcionario("talita", 1500.0, "CLT")
    val  lucas = Funcionario("lucas", 4000.0, "PJ")

    //Conjuntos
    val funcionario1 = setOf(joao, talita)
    val funcionario2 = setOf(lucas)

    val result = funcionario1.union(funcionario2)

    result.forEach {
        println(it)
    }

    println("-------")

    val funcionario3 = setOf(joao, talita, lucas)

    val resultSubtracao = funcionario3.subtract(funcionario2)
    resultSubtracao.forEach {
        println(it)
    }

    println("-------")

    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach {
        println(it)
    }
}