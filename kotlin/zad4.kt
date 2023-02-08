//38
fun main(){
    while(true){
        try{
            var b: Double = 0.0
            var d: Double = 0.0
            println("a:")
            val a: Double = readln()!!.toDouble()
            while(true){
                println("b:")
                b = readln()!!.toDouble()
                if(b>a) break
                else
                    println("a<b")
            }
            println("c:")
            val c: Double = readln()!!.toDouble()
            while(true){
                println("d:")
                d = readln()!!.toDouble()
                if(d>c) break
                else
                    println("c<d")
            }
            println("x:")
            val x: Double = readln()!!.toDouble()
            if(b>c){
                if(x<a || x>d)
                    println("х не пренадлежит ни одной из отрезков")
                else{
                    if(x>a &&x<c)
                        println("х пренадлежит аб")
                    else{
                        if(x>b && x<d)
                            println("х прендалежит сд")
                        else
                            println("х пренадлежит обоим отрезкам")
                    }
                }
            }
            else{
                if(x>a && x<b)
                    println("х пренадлежит аб")
                else{
                    if(x>c &&x<d)
                        println("х пренадлежит сд")
                    else
                        println("х не пренадлежит ни одной из отрезков")
                }
            }
            break
        }
        catch(e: Exception){
            println("числа введены неправилно")
        }
    }
}