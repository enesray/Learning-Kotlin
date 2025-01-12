package basics.stardard_programming_structures

//if kullanımı
fun main() {

    var yas = 19
    var isim = "mehmet"

    println("-------------------------------")

    //Ornek 1
    if (yas >= 18) {
        println("Resitsiniz")
    }

    //Ornek 2  - Else kullanımı
    if (yas >= 18) {
        println("Resitsiniz")
    } else {
        println("Resit Degilsiniz!")
    }

    println("-------------------------------")

    //Ornek 3
    if (isim == "ahmet") {
        println("Merhaba ahmet")
    } else {
        println("Taninmayan kisi")
    }

    println("-------------------------------")

    //Ornek 4
    if (isim == "ahmet") {
        println("Merhaba ahmet")
    } else if (isim == "mehmet") {
        println("Merhaba mehmet")
    } else {
        println("Taninmayan kisi")
    }

    println("-------------------------------")

    //Ornek 5 çoklu şart and (her iki koşulda true olmalı)

    var kullaniciAdi = "admin"
    var sifre = 12345
    if (sifre == 12345 && kullaniciAdi == "admin") {  //true and true : true
        println("Hosgeldiniz")
    } else {
        println("Hatali giris")
    }

    println("-------------------------------")

    //Ornek 6 çoklu şart or (her iki koşuldan en az bir tanesi true olmalı)
    var sinif = 9
    if (sinif == 9 || sinif == 10 || sinif == 11 || sinif == 12) {
        println("AYT sinavina hazirlanabilirsiniz")
    }

    println("-------------------------------")

    //Ornek 7 kısaltma
    var a = 10
    var b = 10

    if (a == b) println("Esit") else println("Esit Degil")

    println("-------------------------------")


}