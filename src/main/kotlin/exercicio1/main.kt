package exercicio1

fun main () {

    val pessoa = Pessoa("Dandara", 20,3,1990,1.56)
    println("Exibindo dados da primeira pessoa: ")
    println(pessoa.exibirDados())
    println("\n")

    val pessoa2 = Pessoa("João", 9,4,1986,1.75)
    println("Exibindo dados da segunda pessoa: ")
    println(pessoa2.exibirDados())

}