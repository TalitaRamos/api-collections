package org.example.collections

fun main() {
    val  joao = Funcionario("João", 2000.0, "CLT")
    val  talita = Funcionario("talita", 1500.0, "CLT")
    val  lucas = Funcionario("lucas", 4000.0, "PJ")

    val repositorio  = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(talita.nome, talita)
    repositorio.create(lucas.nome, lucas)

    println(repositorio.findById(joao.nome))

    println("------------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach{ println(it) }
}