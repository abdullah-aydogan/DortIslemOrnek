import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`) // Scanner sınıfından nesne

    var sayi1 = 0 // Sayı 1 tanımlama
    var sayi2 = 0 // Sayı 2 tanımlama

    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma (3)")
    println("Bölme (4)")

    val secim = girdi.nextInt()

    if (secim == 1) {

        println("Birinci sayıyı giriniz.")
        sayi1 = girdi.nextInt()

        println("İkinci sayıyı giriniz.")
        sayi2 = girdi.nextInt()

        println("Toplama : ${sayi1 + sayi2}")
    }

    else if (secim == 2) {

        println("Birinci sayıyı giriniz.")
        sayi1 = girdi.nextInt()

        println("İkinci sayıyı giriniz.")
        sayi2 = girdi.nextInt()

        println("Çıkarma : ${sayi1 - sayi2}")
    }

    else if (secim == 3) {

        println("Birinci sayıyı giriniz.")
        sayi1 = girdi.nextInt()

        println("İkinci sayıyı giriniz.")
        sayi2 = girdi.nextInt()

        println("Çarpma : ${sayi1 * sayi2}")
    }

    else if (secim == 4) {

        
    }

    else {

        println("Böyle bir işlem bulunmamaktadır.")
    }
}