package basics.stardard_programming_structures

import java.util.Scanner

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


    val girdi = Scanner(System.`in`)

    println("Seciminizi yapin:")
    println("1 - Dikdortgen Alani Hesapla")
    println("2 - Cember Alani Hesapla")
    val number = girdi.nextInt()
    println("Seciminiz: $number")

    var sayi1: Int
    var sayi2: Int
    val piSayisi = 3.14

    if (number == 1) {
        println("Kisa kenari giriniz:")
        sayi1 = girdi.nextInt()
        println("Uzun kenari giriniz:")
        sayi2 = girdi.nextInt()

        val alanHesapla = sayi1 * sayi2

        println("Dikdortgen Alani:")
        println("Sonuc: $alanHesapla")
    } else if (number == 2) {
        println("Yari cap giriniz:")
        sayi1 = girdi.nextInt()

        val yariCap = piSayisi * sayi1 * sayi1
        println("cember Alani:")
        println("Sonuc: $yariCap")
    } else {
        println("Gecersiz giriş yaptiniz!")
    }

    println("-------------------------------")

}
