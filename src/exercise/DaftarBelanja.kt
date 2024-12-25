package exercise

fun main() {
    val shoppingList = mutableListOf<String>()
    while (true){
        println("================================")
        println("   DAFTAR BELANJA ANDA ")
        println("================================")
        println("1. Tambahkan Item")
        println("2. Lihat daftar Belanja")
        println("3. Edit item")
        println("4. Hapus item")
        println("5. Keluar")
        println("================================")
        print("Pilih Opsi (1 - 5): ")
        when (readLine()?.toIntOrNull()){
            1 -> {
                print("Masukkan item yang ingin di tambahkan : ")
                val item = readLine() ?: ""
                if (item.isNotBlank()){
                    shoppingList.add(item)
                    println("Item '$item' berhasil di tambahkan")
                } else {
                    println("Item tidak boleh kosong")
                }
            }
            2 -> {
                if (shoppingList.isEmpty()){
                    println("Daftar Belanja Kosong")
                } else {
                    println("Daftar Belanja Anda :")
                    shoppingList.forEachIndexed{index, item ->
                        println("{$index +1}. $item" )
                    }
                }
            }
            3 -> {
                if (shoppingList.isEmpty()){
                    println("Daftar belanja kosong, tidak ada item yang dapat diedit!")
                } else {
                    println("Daftar belanja anda :")
                    shoppingList.forEachIndexed {  index, item ->
                        println("${index + 1}. $item")
                    }
                    print("Masukkan nomor item yang ingin diedit: ")
                    val index = readLine()?.toIntOrNull()?.minus(1)
                    if (index != null && index in shoppingList.indices){
                        print("Masukkan item baru")
                        val newItem = readLine() ?: ""
                        if (newItem.isNotBlank()){
                            shoppingList[index] = newItem
                            println("Item berhasil diperbarui menjadi '$newItem'")
                        } else {
                            println("Item baru tidak boleh kosong!")
                        }
                    } else {
                        println("Nomor item tidak valid")
                    }
                }
            }
            4 -> {
                if (shoppingList.isEmpty()) {
                    println("Daftar belanja kosong, tidak ada item yang dapat dihapus!")
                } else {
                    println("Daftar belanja anda:")
                    shoppingList.forEachIndexed{ index, item ->
                        println("${index + 1}. $item")
                    }
                    print("Masukkan nomor item yang ingin di hapus :")
                    val index = readLine()?.toIntOrNull()?.minus(1)
                    if (index != null && index in shoppingList.indices) {
                        val removedItem = shoppingList.removeAt(index)
                        println("Item '$removedItem' berhasil dihapus!")
                    } else {
                        println("Nomor item tidak valid!")
                    }
                }
            }
            5 -> {
                println("Terimakasih telah menggunakan program Daftar Belanja, Selamat Berbelanja")
                break
            } else -> println("Opsi tidak valid. Silahkan pilih antara 1 - 5")
        }
        println()
    }
}
