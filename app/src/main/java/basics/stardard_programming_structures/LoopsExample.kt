package basics.stardard_programming_structures

import java.util.Scanner

//Döngüler
fun main() {

    /**
     * Döngüler belirli kodları tekrarlı çalıştırma amaçlı yapılardır.
     * Örneğin; veri tabanından gelen verileri işlemek gibi.
     * Döngü türleri ;
     * for in
     * while
     */

    // for döngüleri

    for (i in 3..5) {
        println(i)
    }

    //  10 ile 20 arasında 5 er
    var baslangic = 5
    var bitis = 200
    var artisMiktari = 5

    for (a in baslangic..bitis step artisMiktari) {
        println("Sayi: $a")
    }


    // 20 ile 10 arasında 2 şer azalarak
    for (b in 20 downTo 10 step 2) {
        println("Azalan : $b")
    }


    // until kullanımı 1 eksik şekilde sayıyor
    for (c in 1 until 5) {
        println("C : $c")
    }

    println("-------------------------------")

    // while döngüsü
    var sayac = 1

    while (sayac < 4) {
        println("sayac :$sayac")
        sayac += 1 //sayac = sayac+1
    }

    println("-------------------------------")


    //Dongüler Sınır Degeri

    //3 ile 6
    for (i in 3..6) {
        println("Loops 1 : $1")
    }
    println("-------------------------------")

    var sayac1 = 3
    while (sayac1 <= 6) {
        println("Loops 2 : $sayac1")
        sayac1 += 1
    }

    println("-------------------------------")

    // 0 ile 8 2 şer
    for (i in 0..8 step 2) {
        println("Loops 3 : $i")
    }

    println("-------------------------------")

    var sayac2 = 0
    while (sayac2 <= 8) {
        println("Loops 4: $sayac2")
        sayac2 += 2
    }

    println("-------------------------------")

    // 8 den 0'a 2 şer azalsın
    for (number in 8 downTo 0 step 2) {
        println("Loops 5 : $number")
    }

    println("-------------------------------")

    var sayac3 = 8
    while (sayac3 >= 0) {
        println("Loops 6 : $sayac3")
        sayac3 -= 2
    }

    println("-------------------------------")


    // Ornek konsoldan girilen isimi tekrarlama

    val girdi = Scanner(System.`in`)
    println("isim Giriniz")
    val isim = girdi.next()

    println("Tekrar sayisi giriniz")
    val tekrar = girdi.nextInt()

    for (i in 1..tekrar) {
        println("${i}.$isim")
    }


    println("-------------------------------")

    println("islenecek veri miktari giriniz")
    var veri = girdi.nextInt()
    while (veri > 0) {
        println("$veri. veri")
        veri -= 1
    }

    println("-------------------------------")


    //Break and Continue  - Break : İşlemi	bitirir  - Continue : İşlemi pas geçer.

    //Break
    for (i in 1..5) {
        if (i == 3) {
            break //3 olunca donguyu bitirecek
        }
        println("LoopsBreak : $i")
    }

    //Continue
    for (i in 1..5) {
        if (i == 3) {
            continue  //3 haric olani yazdıracak
        }
        println("LoopsContinue : $i")
    }

    println("-------------------------------")


    //Sonsuz dongu ile surekli soru sorma


    while (true) {

        println("Sayi giriniz")
        val sayiGirdi = girdi.nextInt()
        val sonuc = sayiGirdi % 2
        if (sonuc == 0) {
            println("Cift sayidir")
        }

        if (sonuc == 1) {
            println("Cikis yapildi")
        }

        println("Cikmak icin (1) - Devam etmek icin diger sayilar ")
        val cikis = girdi.nextInt()

        if (cikis == 1) {
            println("Cikis yapildi")
            break
        }

    }
}