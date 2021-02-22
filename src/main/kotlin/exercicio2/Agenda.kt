package exercicio2

class Agenda {

    val agendaContatos: MutableList<Contato> = mutableListOf()

    fun salvarContato(contato: Contato) {

        return if (agendaContatos.size <= 10) {
            agendaContatos.add(contato)
            println("Contato salvo com sucesso!")
        } else {
            println("Erro ao salvar contato!\n Verifique se a agenda esta cheia!")
        }

    }

    fun exibirAgenda() {
        println("Minha Agenda de Contato ------------------------------------\n")

        for ((index,itemAgenda) in agendaContatos.withIndex()) {
            val dadosContato: Contato = itemAgenda
            dadosContato.exibirDados(index)
        }

        println("\nTotal de contatos: ${agendaContatos.size}\n")
        println("---------------------------------------------------------------")

    }

    fun excluirContato(index: Int) {

        val contato = agendaContatos.get(index)

        println("Excluindo o contato:\n")
        contato.exibirDados(index)
        println("\n----------------------------------\n")

        return if (agendaContatos.remove(contato)) {
            println("Contato excluído com sucesso!")
        } else {
            println("Erro ao excluir o contato!")
        }
    }

    fun buscarContato(nomePesquisado: String) {

        println("Contatos encontrados:\n")

        //Verifica na agenda de contatos se possui um contato com o nome pesquisado
        for ((index, itemAgenda) in agendaContatos.withIndex()) {
            val contato: Contato = itemAgenda

            if (contato.nome == nomePesquisado) {
                contato.exibirDados(index)
            }
        }

        println("-----------------------------------------------------")

    }

}