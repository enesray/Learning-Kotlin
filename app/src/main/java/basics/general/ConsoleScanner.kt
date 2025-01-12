package basics.general

import java.util.Scanner

//Console girdisi

fun main() {

    println("ad giriniz")
    val girdi = Scanner(System.`in`)

    val ad = girdi.next()

    println("Ad : $ad")

    /*
    Tüm türlerde girdi olabilir. 
    Bunu sağlamak için girdiye uygun tür metodu seçilmelidir.
    Örn : int -> nextInt() , double -> nextDouble() vb.
    */
}