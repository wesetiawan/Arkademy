import java.lang.NumberFormatException

fun main(){
    print("Masukan Size Triangle: ")
    val a = readLine()?.toInt()
    triangle(a)
}

fun triangle(a: Int?){
    if (a != null){
        try {
            if (a <= 0){
                println("Paramemeter harus angka dan positif!")
            }else{
                for (x in a.downTo(1)){
                    print("#")
                    for (y in x until a){
                        print("#")
                    }
                    println()
                }
            }
        }catch (e: NumberFormatException){
            println("Paramemeter harus angka dan positif!")
        }
    }else{
        println("Paramemeter harus angka dan positif!")
    }



}