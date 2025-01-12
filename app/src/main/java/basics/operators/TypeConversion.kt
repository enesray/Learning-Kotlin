package basics.operators
//Tür Dönüşümü

fun main() {
    /*
    1. Sayısaldan sayısala dönüşüm
    2. Sayısaldan metine dönüşüm
    3. Metinden sayısala dönüşüm
    • toDouble() , toFloat() , toLong() , toInt() , toShort() , toByte() ,
    toChar() , toString()
    */

    var i: Int = 42
    var d: Double = 42.45
    var f: Float = 42.89f

    //sayılar değerleri türlerini değiştirmek için
    var sonuc1: Int = d.toInt()
    var sonuc2: Double = i.toDouble()

    var sonuc3: Int = f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)

    //sayısal değeri stringe dönüştürmek için
    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()
    println(str1)
    println(str2)
    println(str3)


    //Yöntem 1  - string değeri sayısala dönüştürme

    var yazi1 = "3T4"
    //var yazi1 = "34"
    try {
        var x = yazi1.toInt()
        println(x)
    } catch (e: Exception) {
        println("Type Conversion Error")

    }

    //Yöntem 2  - string değeri sayısala dönüştürme
    var yazi2 = "48.56T"
    //var yazi2 = "48.56"
    var y = yazi2.toDoubleOrNull()

    if (y != null) {
        println("Y: $y")
    } else {
        println("Type Conversion Error")
    }


    //Yöntem 3  - string değeri sayısala dönüştürme

    var yazi3 = "67"
   //var yazi3 = "67T"
    var z = yazi3.toIntOrNull()

    z?.let {
        println("z: $z")
    }

}