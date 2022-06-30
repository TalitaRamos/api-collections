package org.example.collections

fun main() {
    val  joao = Funcionario("João", 2000.0, "CLT")
    val  talita = Funcionario("talita", 1500.0, "CLT")
    val  lucas = Funcionario("lucas", 4000.0, "PJ")

    val funcionarios = listOf(joao, talita, lucas)

    funcionarios.forEach {
        println(it)
    }

    println("-------")

    println(funcionarios.find { it.nome == "talita" })

    println("-------")

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("-------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
            ----------------
        """.trimIndent()
}