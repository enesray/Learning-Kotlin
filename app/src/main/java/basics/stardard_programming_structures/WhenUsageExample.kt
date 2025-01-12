package basics.stardard_programming_structures

import java.util.Scanner

//when kullanımı
fun main() {

    /**
     * Switch	yapısının	adı	değişmiş	halidir.
     * else	if yapısının	daha	pratik	kullanımıdır.
     * Case	denilen	durumlar	sağlanırsa	kod	çalışır.
     */

    val gun = 3

    when (gun) {
        1 -> println("Pazartesi")
        2 -> println("Sali")
        3 -> println("Carsamba")
        4 -> println("Persembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Boyle bir gun yok")
    }

    println("-------------------------------")

    //When ile hesap makinesi

    println("Toplama (1)")
    println("Cikarma (2)")
    println("Carpma  (3)")
    println("Bolme   (4)")

    val scanner = Scanner(System.`in`)
    val secim = scanner.nextInt()

    println("birinci sayiyi giriniz")
    var sayi1 = scanner.nextInt()
    println("ikinci sayiyi giriniz")
    var sayi2 = scanner.nextInt()

    when (secim) {
        1 -> println(sayi1 + sayi2)
        2 -> println(sayi1 - sayi2)
        3 -> println(sayi1 * sayi2)
        4 -> println(sayi1 / sayi2)
        else -> println("Boyle bir islem yok")
    }

    println("-------------------------------")

}