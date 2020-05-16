fun main(){
    hollowTriangle(6)
}

fun hollowTriangle(a:Int){
    val inner = "x "
    val outer = "o "
    for (i in a downTo 1) {
        for (space in 1..a - i) {
            print("  ")
        }

       when(i){
           6 -> {
               for (x in 0 until i + i-1){
                   print(outer)
               }
           }
           1 ->{
               for (x in 0 until i + i-1){
                   print(outer)
               }
           }
           else ->{
               for (x in 1 until i + i){
                   when (x) {
                       1 -> {
                           print(outer)
                       }
                       i+i-1 -> {
                           print(outer)
                       }
                       else -> {
                           print(inner)
                       }
                   }
               }
           }
       }

        println()

    }
}