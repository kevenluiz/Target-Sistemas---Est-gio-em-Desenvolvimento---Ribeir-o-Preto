fun main() {
    // String a ser verificada, pode ser alterada conforme necessário
    val texto = "Exemplo de string para contagem de letras a."

    // Verifica a existência e quantidade de letras 'a' na string
    val (existeLetraA, quantidade) = verificaLetraA(texto)

    // Exibe o resultado da verificação
    if (existeLetraA) {
        println("A letra 'a'  ocorre $quantidade vezes na string informada.")
    } else {
        println("A letra 'a'  não foi encontrada na string informada.")
    }
}

// Função que verifica a existência e conta a quantidade de letras 'a' em uma string
fun verificaLetraA(texto: String): Pair<Boolean, Int> {
    // Conta a quantidade de letras 'a' (maiúsculas e minúsculas) na string
    val quantidade = texto.count { it.equals('a', ignoreCase = true) }

    // Verifica se a quantidade é maior que 0, indicando que a letra 'a' foi encontrada
    val existeLetraA = quantidade > 0

    // Retorna um par (Pair) com o resultado da verificação e a quantidade encontrada
    return Pair(existeLetraA, quantidade)
}