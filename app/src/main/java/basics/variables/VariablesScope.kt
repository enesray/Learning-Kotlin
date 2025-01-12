package basics.variables
//Değişken Kapsamı (Global ve Local Değişken)

class VariablesScope {

    var x = 10  //Global Değişken
    var y = 20  //Global Değişken

    fun topla() {
        var x = 40 //Local değişken her zaman globale karşı baskındır.
        var z = x + y

        println("Variables Scope - Toplam: $z ")
    }
}