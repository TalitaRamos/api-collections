package org.example.collections

fun main() {
    val  joao = Funcionario("João", 2000.0, "CLT")
    val  talita = Funcionario("talita", 1500.0, "CLT")
    val  lucas = Funcionario("lucas", 4000.0, "PJ")

    println("-------LIST-------")
    val funcionarios = mutableListOf(joao, talita)

    funcionarios.forEach{
        println(it)
    }

    println("-------")

    funcionarios.add(lucas)

    funcionarios.forEach{
        println(it)
    }

    println("-------")

    funcionarios.remove(joao)

    funcionarios.forEach{
        println(it)
    }

    println("-------")

    println("-------SET-------")

    val funcionariosSet = mutableSetOf(joao)

    funcionariosSet.forEach{
        println(it)
    }
    println("-------")

    funcionariosSet.add(talita)
    funcionariosSet.add(lucas)

    funcionariosSet.forEach{
        println(it)
    }
    println("-------")

    funcionariosSet.remove(lucas)

    funcionariosSet.forEach{
        println(it)
    }
    println("-------")
}