package basics.operators
//Karşılaştırma Operatörleri

fun main() {

    /*
    Belirlenen şartlara göre karar alan yapılardır.
    Kararlar, şartın true veya false olmasına göre alınır.

    Eşittir ==
    Eşit Değil !=
    Büyüktür >
    Küçüktür <
    Büyük Eşittir >=
    Küçük Eşittir <=
     */
    var s1 = 60
    var s2 = 50

    var y1 = 70
    var y2 = 80

    println(s1 == s2)//false
    println(s1 != s2)//true
    println(s1 > s2)//true
    println(s1 < s2)//false
    println(s1 >= s2)//true
    println(s1 <= s2)//false

    //Mantıksal Operatörleri || or -  && ve - ! Var olan durumun tersine dönüştürür
    println(s1 > s2 || y1 > y2) //true or false : true
    println(s1 > s2 && y1 > y2) //true or false : true
}