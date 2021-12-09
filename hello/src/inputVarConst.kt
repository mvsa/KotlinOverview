fun main(args: Array<String>){

    if(args.isEmpty()){
        println("Argumentos não providos")
        return
    }

    val number = args[0].toIntOrNull()

    if(number == null){
        println("Valor informado não válido")
        return
    }

    println("numero: $number")

    var soma = 0
    soma = number + number

    println("soma = $soma")
}