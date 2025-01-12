package basics.stardard_programming_structures

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

}