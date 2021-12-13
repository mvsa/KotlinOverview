

fun main(args:Array<String>){

    if(args.isEmpty()){
        println("Sem argumentos")
        return
    }

    val availableItens = arrayOf("Pão", "Bolacha", "Queijo", "Arroz", "Feijão", "Ovo")

    val requiredAvailabeItens = args.filter { requiredProduct -> availableItens.contains(requiredProduct) }

    for(produto in requiredAvailabeItens){
        println("Temos: ${produto}")
    }

    val requiredNotAvailabeIntens = args.filter { requiredproduct -> !availableItens.contains(requiredproduct) }

    requiredNotAvailabeIntens.forEach{produto -> println("Não temos $produto")}

    val ordered = availableItens.sortedBy { produto -> produto }
    ordered.forEach { produto -> println("Confira este produto $produto") }

}