package exercicio2

data class Contato(var nome : String, var telefone : String) {

    fun exibirDados(index: Int) {
        println("[$index] Nome: $nome \nTelefone: $telefone \n")
    }

}
