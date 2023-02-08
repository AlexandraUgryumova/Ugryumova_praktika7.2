//18
fun main(){
     while(true){
         try{
             println("введите высоту отверстия")
             val a: Double = readln()!!.toDouble()
             println("введите ширину отверстия")
             val b: Double = readln()!!.toDouble()
             println("введите высоту кирпича")
             val x: Double = readln()!!.toDouble()
             println("введите ширину кирпича")
             val y: Double = readln()!!.toDouble()
             println("введите длину кирпича")
             val z: Double = readln()!!.toDouble()
             if(a>=x && b>=y || a>=y && b>=x || a>=z && b>=y || a>=y && b>=z || a>=x && b>=z || a>=z && b>=x){
                 println("кирпич пролезет")
             }
             else{
                 println("кирпич не пролезет")
             }
             break
         }
         catch(e: Exception){
             println("числа были введены неправильно")
         }
     }
}