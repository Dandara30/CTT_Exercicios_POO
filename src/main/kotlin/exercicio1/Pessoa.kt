package exercicio1

import java.util.Calendar

data class Pessoa(
    private var nome: String,
    private var diaNascimento: Int,
    private var mesNascimento: Int,
    private var anoNascimento: Int,
    private var altura: Double
) {

    fun exibirDados(): String {
        val idade = calcularIdade()
        val dados =
            "$nome nasceu em $diaNascimento de ${getMesNascimento()}, tem $idade anos e possui ${altura}m de altura"
        return dados

    }

    fun calcularIdade(): Int {
        val calendar = Calendar.getInstance()
        return (calendar.get(Calendar.YEAR)) - this.anoNascimento
    }

    fun getMesNascimento(): String {

        when (this.mesNascimento) {
            1 -> return "Janeiro"
            2 -> return "Fevereiro"
            3 -> return "Março"
            4 -> return "Abril"
            5 -> return "Maio"
            6 -> return "Junho"
            7 -> return "Julho"
            8 -> return "Agosto"
            9 -> return "Setembro"
            10 -> return "Outubro"
            11 -> return "Novembro"
            12 -> return "Dezembro"
            else -> return "Mês inválido"
        }

    }
}