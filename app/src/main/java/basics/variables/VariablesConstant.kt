package basics.variables
//Constant - Sabitler

/*
    Sabitler içerisine bir kere veri atıldığında bir daha değiştiremeyeceğiniz
    yapılardır.
    • val ismi ile kullanılırlar.
    • val kullanmak memory yönetimini rahatlatır.
    • Çünkü hafızada sabit için yer ayrılır ve değişim olmayacağı için açılan yer yeni
    bir değer almak için beklemez.
    • Sadece kullanılma amaçlı değişkenler için kullanılması için uygundur.
    • Özellikle nesne tabanlı programlamada kullanılır
*/

fun main() {
    var sayi = 10
    sayi = 20//var değeri değiştirilebilir.
    sayi = 40
    println(sayi)

    val sayi2 = 20
    //sayi2 = 50  //val sabit sonradan değer aktarılamaz hata verecektir.


    val pi = 3.14
    val klorOrani: Double = 4.5
    val isim = "Enes"

}