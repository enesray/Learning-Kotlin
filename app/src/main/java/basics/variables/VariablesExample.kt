package basics.variables
//Değişken oluşturma örnekleri

fun main() {
    var ogrenciAd = "Enes"
    var ogrenciYas = 22
    var ogrenciBoy = 1.80
    var ogrenciBasHarf = 'E'

    println(ogrenciAd)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)

    println("-------------------------------")

    //Tür Belirterek Değişken oluşturma
    var urunId: Int = 3416
    var urunAdi: String = "Kol Saati"
    var urunAdet: Int = 100
    var urunFiyat: Double = 149.99
    var urunTedarikci: String = "Rolex"

    println("Urun ID $urunId")
    println("Urun ADI $urunAdi")
    println("Urun ADET $urunAdet")
    println("Urun FIYAT $urunFiyat")
    println("Urun TEDARIKCI $urunTedarikci")

    println("-------------------------------")

    //$ Dolar işareti ile string ifadenin içerisinde değişken kullanılabiliyor.
    println("$urunTedarikci marka $urunAdi an itibariyle stoklarda $urunAdet adet bulunmaktadir. Şu anda yalnizca $urunFiyat TL")


    println("-------------------------------")

    //String ifade içine ${} ifadesi kullanılarak işlem	yapılabilir.
    var sayi1=10
    var sayi2=30
    println("$sayi1 ve $sayi2 toplam : ${sayi1+sayi2}")


    println("-------------------------------")

    //Değişken Kapsamı kodları - VariablesScope
    var variablesScope = VariablesScope()
    variablesScope.topla()
}