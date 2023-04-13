// Sets sao estrutura de dados usadas em kotlin para definir valores de um array onde
// serao definidos como imutaveis e mutaveis, os sets imutaveis nao tem o uso do add e do remove
// como se tem nos sets mutaveis, os sets se caracterizam por armazenarem diversos valores ou
// valores de um unico tipo, porem, se algum desses valores forem repetidos o set so vai levar em consideracao
// um desses valores EX: temos uma variavel que recebe como valor um setOf(2,5,5,6,6)
// ao interar dentro desse set com um forEach ou um for os valores percorridos e printados na tela sao
// 2, 5, 6, pois o Set nao conta valores repetidos
fun main() {
    multSet()
}

fun imutSet() {
    // definindo set imutavel de um unico tipo
    //val imutSet = setOf<Int>(4,5,6,6)
    // definindo um set generico
    val imutSet = setOf(5, 6, 5, 7, 8, 6, "Olaaaaa")
    // percorrendo set com forEach
    // note que os valores retornados serao unicos pois o set percorre e compara valores
    // se forem iguais aos valores passados ele nao retorna se for diferente ele retorna
    imutSet.forEach{
        println(it)
    }
    /*for (item in imutSet) {
        println(item)
    }*/
    // nao podemos definir metodos para adcionar ou remover valores do nosso set
    // pois o mesmo e imutavel
    //imutSet.add
}

fun multSet() {
    // definindo set mutavel de um unico tipo
    /*val multSet = mutableSetOf<String>("Olaaaaa", "katchau", "katchau", "casaaa")
    for (mult in multSet) {
        println(mult)
    }*/
    // definindo set mutavel generico
    val multSet = mutableSetOf(5, 7, 9, "dhjshjf", 0)
    // o add abaixo nao adciona o valor pois o 9 ja existe no set
    // multSet.add(9)
    // valor adcionado com sucesso
    multSet.add(12)
    // valor removido
    multSet.remove("dhjshjf")
    multSet.forEach{
        println(it)
    }
}