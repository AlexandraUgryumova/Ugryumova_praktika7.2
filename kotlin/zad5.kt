//42
fun main(){
    while(true){
        try{
            var x: Double
            var x2: Double
            println("a*x^4 + b*x^2 + c = 0")
            println("a:")
            val a: Double = readln()!!.toDouble()
            println("b:")
            val b: Double = readln()!!.toDouble()
            println("c:")
            val c: Double = readln()!!.toDouble()
            val D: Double = Math.pow(b, 2.0)- 4*a*c
            if(D>0){
                x = (-b + Math.sqrt(D))/(a*2)
                x2 = (-b - Math.sqrt(D))/(a*2)
                if(x>0 && x2>0){
                    x = Math.sqrt(x)
                    println("x1 = $x")
                    x2 = Math.sqrt(x2)
                    println("x2 = $x2")
                }
                else{
                    if(x2>0){
                        x2 = Math.sqrt(x2)
                        println("x = $x2")
                    }
                    if(x>0) {
                            x = Math.sqrt(x)
                            println("x = $x")
                    }
                }
            }
            else{
                println("Корней нет")
            }
            break
        }
        catch(e:Exception){
            println("числа написаны неправильно")
        }
    }
}