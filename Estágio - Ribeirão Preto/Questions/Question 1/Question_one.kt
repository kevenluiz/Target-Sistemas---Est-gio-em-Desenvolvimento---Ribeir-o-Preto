fun main() {
    // Número a ser verificado, pode ser alterado conforme necessário
    val numero = 21

    // Verifica se o número pertence à sequência de Fibonacci
    val pertence = verificaSePertenceAFibonacci(numero)

    // Exibe a mensagem informando se o número pertence ou não à sequência
    if (pertence) {
        println("O número $numero pertence à sequência de Fibonacci.")
    } else {
        println("O número $numero NÃO pertence à sequência de Fibonacci.")
    }
}

// Função que verifica se um número pertence à sequência de Fibonacci
fun verificaSePertenceAFibonacci(numero: Int): Boolean {
    // Gerando a sequência de Fibonacci até ultrapassar ou igualar o número informado
    var anterior = 0
    var atual = 1

    // Loop para gerar a sequência até que o valor atual seja igual ou superior ao número informado
    while (atual < numero) {
        val proximo = anterior + atual
        anterior = atual
        atual = proximo
    }

    // Verifica se o número informado é igual ao valor atual, indicando que pertence à sequência
    return atual == numero || numero == 0
}