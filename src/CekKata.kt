import java.util.*

fun main() {
    cekKata("ini adalah sebuah kata")
}


fun cekKata(a: String) {
    var digit = 0

    val word = a.split(" ".toRegex()).toTypedArray()
    for (i in 0..word.size){
        if (a[i].isDigit()){
            digit+=1
        }
    }

    println("${word.size-digit}/${word.size}")
}