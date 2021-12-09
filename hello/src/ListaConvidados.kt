fun main(){

    println("Informar nome")
    val nome = readLine()

    if(nome.isNullOrEmpty() || nome.isBlank()){
        println("Nome inválido")
    }

    println("Informar idade")
    val idade = readLine()?.toIntOrNull() //so vou rodar a função da direta se não for nulo (por conta do ?)

    if (idade == null || idade <= 0){
        println("Idade informada não válida")
        return
    }



    var estaConvidado = when(nome){ //switch
        "Kaique" -> {
            true
        }
        "Marcos" ->{
            true
        }
        else -> false //default
    }

    if(estaConvidado && idade >= 18){
        println("Bem vindo")
    }else if(!estaConvidado){
        println("fora da lista")
    }else{
        println("idade não atingida")
    }

}