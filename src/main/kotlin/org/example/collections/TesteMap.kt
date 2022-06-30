package org.example.collections

fun main() {
    val pair : Pair<String, Double> = Pair("João",1000.0)

    val  map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Talita" to 2500.0,
        "Lucas" to 3000.0) //recurso infix

    map2.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }

}