//8
fun main(){
    while(true){
        try{
            println("введите первое вещественное число")
            var a: Double = readln()!!.toDouble()
            println("введите второе вещественное число")
            val b: Double = readln()!!.toDouble()
            if(a<=b){
                a = 0.0
            }
            println("a: $a , b: $b")
            break
        }
        catch(e: Exception){
            println("числа были введены непраильно")
        }
    }
}