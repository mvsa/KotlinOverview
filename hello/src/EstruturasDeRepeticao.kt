
fun main(args:Array<String>){

    //for subindo
    //  for(indice in 0..args.size-1){
   // for(indice in 0 until args.size-1){
    for(indice in args.indices){
        println("Argumentos posic: ${indice}, valor: ${args[indice]}")
    }

    //for descendo
    for (indiceDec in args.size-1 downTo 0){
        println("Argumentos dec posição: $indiceDec")
    }

    //foreach
    for(arg in args){
        println("foreach valor: $arg")
    }

    //while
    var contadorArgs = 0
    while(contadorArgs < args.size){
        println("percorrendo argumentos com while ${++contadorArgs} valor lido ${args[contadorArgs-1]}")
    }

    //dowhile
    var contadorLoopsEfetuados = 0
    do {
        println("percorrendo argumentos $contadorLoopsEfetuados")
        contadorLoopsEfetuados++
    }while(contadorLoopsEfetuados < args.size)


}
