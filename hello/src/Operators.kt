import java.math.BigDecimal

fun calcular(number1:BigDecimal, opera:String, number2:BigDecimal):BigDecimal{
    when(opera){
        "+" -> return number1 + number2
        "-" -> return number1 - number2
        "/" -> return number1 / number2
        "*" -> return number1 * number2
        "%" -> return number1 % number2
        else -> return BigDecimal.ZERO
    }
}

fun main(){
    println("Numero")
    val number1 = readLine()?.toBigDecimalOrNull()

    if(number1 == null){
        println("numero 1 invalido")
        return
    }

    println("operador")
    val opera = readLine()
    val opers = arrayOf("+","-","*","/","%")

    if(opera.isNullOrEmpty() || opera.isBlank() || !opers.contains(opera)){
        println("Operador invalido")
        return
    }

    println("Numero2")
    val number2 = readLine()?.toBigDecimalOrNull()

    if(number2 == null){
        println("numero 2 invalido")
        return
    }



    println("O resultado: ${calcular(number1, opera, number2)}")
}