fun main(){
    finDuplicates("cepat kerjakan!!!")
}

fun finDuplicates(s: String) {
    var duplicate = mutableMapOf<Char,Int>()

    for (i in s.indices){
        var total = 0
        var char: Char = ' '
        if (!s[i].isWhitespace()){
            for (x in s.indices){
                if (s[i]==s[x]){
                    char = s[x]
                    total+=1
                }
            }
            if (total > 1){
                duplicate[char] = total
            }
        }

    }

    if (duplicate.isNotEmpty()){
        for (i in duplicate.keys)
        println("$i: ${duplicate[i]}")
    }else{
        println("Tidak ada karakter yang berulang!")
    }


}
