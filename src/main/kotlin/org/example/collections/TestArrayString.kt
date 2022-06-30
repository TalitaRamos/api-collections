package org.example.collections

fun main() {
    //Primeira forma de declarar array de string - forma verbosa
    val nomes = Array(3) {""}

    nomes[0] = "Maria"
    nomes[1] = "Talita"
    nomes[2] = "Lucas"

    for (nome in nomes) {
        println(nome)
    }

    println("---------")

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("---------")

    //segunda forma de declarar array de string - menos verbosa

    val nome2 = arrayOf("Maria", "Talita", "Lucas")
    nome2.sort()
    nome2.forEach {
        println(it)
    }

    println("---------")
}