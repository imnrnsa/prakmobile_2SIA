package com.example.seaapps.pertemuan2

fun main(){
    println("Hai rerkan-rekan...")
    println("Selamat datang dibahasa pemroigraman Kotlin")

    println("===============")

    var angka = 12
    println("Hasil dari 15 + 10 = ${angka + 10}")

    val nilaiInt = 10000
    val nilaiDouble = 100.003
    val nilaiFloat = 1000.0f

    println("Nilai Integer = $nilaiInt")
    println("Nilai Double = $nilaiDouble")
    println("Nilai Float = $nilaiFloat")

    println("======== String ========")
    val huruf = 'a'
    println("Ini penggunaan karakter '$huruf'")

    val nilaiString = "Mawar"
    println("Halo $nilaiString!\nApa Kabar?")

    println("=========== Kondisi ===========")

    val nilai = 10
    if(nilai<0)
        println("Bilangan Negatif")
    else {
        if(nilai%2 == 0)
            println("Bilangan Genap")
        else
            println("Bilangan Ganjil")
    }

    println("========= Perulangan =========")
    val kampusku: Array<String>  = arrayOf("Kampus", "Politeknik", "Caltrex", "Riau")
    for (kampus: String in kampusku ){
        println(kampus)
    }
}