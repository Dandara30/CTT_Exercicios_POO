package exercicio2

import java.util.*

fun menuAgenda(minhaAgenda: Agenda) {

    println("#####################################################################")
    println("                  Minha Agenda de Contatos                           ")
    println("#####################################################################")

    println("\n\n")
    println("Menu de Opcoes:\n\n")
    println("[1] Salvar contato\n")
    println("[2] Remover contato\n")
    println("[3] Buscar contato\n")
    println("[0] Mostrar toda minha agenda")

    println("\n\n")

    println("Escolha uma das opcoes acima:\n")
    val scanner = Scanner(System.`in`)
    val opcao = scanner.nextInt()


    when(opcao) {
        0 -> listarAgendaContato(minhaAgenda)
        1 -> salvarContato(minhaAgenda)
        2 -> excluirContato(minhaAgenda)
        3 -> buscarContato(minhaAgenda)
        else -> {
            println("Opcao invalida! Tente novamente")
            menuAgenda(minhaAgenda)
        }
    }
}

fun listarAgendaContato(minhaAgenda: Agenda) {
    minhaAgenda.exibirAgenda()
    menuAgenda(minhaAgenda)
}


fun salvarContato(minhaAgenda: Agenda) {

    println("Digite o Nome do contato :\n")
    val scanner = Scanner(System.`in`)
    val nome = scanner.nextLine()

    println("Digite o Telefone do contato :\n")
    val telefone = scanner.nextLine()

    //Criar o objeto Contato com os dados solicitados
    val contato = Contato(nome, telefone)


    minhaAgenda.salvarContato(contato)

    menuAgenda(minhaAgenda)


}

fun excluirContato(minhaAgenda: Agenda) {

    println("Digite a posicao do contato a ser excluído :\n")
    val scanner = Scanner(System.`in`)
    val posicao = scanner.nextInt()

    minhaAgenda.excluirContato(posicao)

    menuAgenda(minhaAgenda)

}

fun buscarContato(minhaAgenda: Agenda) {

    println("Digite o nome do contato a ser encontrado :\n")
    val scanner = Scanner(System.`in`)
    val nomeContato = scanner.nextLine()

    minhaAgenda.buscarContato(nomeContato)

    menuAgenda(minhaAgenda)

}


fun main (){

    val minhaAgenda = Agenda()
    menuAgenda(minhaAgenda)
 }