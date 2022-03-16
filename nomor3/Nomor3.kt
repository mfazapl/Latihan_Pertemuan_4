package nomor3

class Barang(nama: String=" ", jumlah: Int= 50, harga: Int=50000, diskon: Int=99) {
    var nNama = nama
    var nJumlah = jumlah
    var nHarga = harga
    var nDiskon = diskon

    fun tampil() {
        println(" Nama Barang: $nNama")
        println(" Jumlah Barang: $nJumlah")
        println(" Harga Barang: $nHarga")
        println(" Diskon Barang: $nDiskon")
    }

    fun total() {
        val hasil = nJumlah * nHarga * nDiskon
        println(" Total: $hasil")

    }
}

    fun main(args: Array<String>) {
        val obj = Barang()
        obj.nNama = " Tahu"
        obj.nJumlah = 30
        obj.nHarga = 30000
        obj.nDiskon = 20
        obj.tampil()
        obj.total()
    }
