package basics.variables
//Değişken Oluşturma Çeşitleri

fun main() {

    //Ornek 1

    var sayi = 10

    //Ornek 2
    var fiyat = 12.99

    fiyat = 10.99

    println(fiyat)

    //Ornek 3
    var s1 = 80
    var s2 = 70
    var toplam = s1 + s2
    println(toplam)

    //Ornek 4 - Type Safety – Tür Güvenliği
    //Oluşturduğunuz değişkene farklı türde değişken atayamazsınız.
    var sonuc = 100
    sonuc = 50

    /*
    Bu durumlar hatalıdır
    Değişken INT biz double veya string atayamayız.
    sonuc = 50.0
    sonuc = "Enes"
    */
}
