package org.example.collections

fun main() {
    val  joao = Funcionario("João", 1000.0)
    val  talita = Funcionario("talita", 3000.0)
    val  lucas = Funcionario("lucas", 5000.0)

    val funcionarios = listOf(joao, talita, lucas)

    funcionarios.forEach {
        println(it)
    }

    println("-------")

    println(funcionarios.find { it.nome == "talita" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
            ----------------
        """.trimIndent()
}