//28
fun main(){
    while(true){
        try{
            println("введите а")
            val a= readln()!!.toDouble()
            println("введите b")
            val b= readln()!!.toDouble()
            println("введите c")
            val c= readln()!!.toDouble()
            println("введите d")
            val d= readln()!!.toDouble()
            println("введите e")
            val e= readln()!!.toDouble()
            println("введите f")
            val f= readln()!!.toDouble()
            val x:Double=(f*b+e*c)/(d*b+a*e)
            println("x= $x")
            println("y= ${((c-a*x)/b)}")
            break
        }
        catch(e: Exception){
            println("числа введены неправильно")
        }
    }
}