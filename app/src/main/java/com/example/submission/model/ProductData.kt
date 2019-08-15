package com.example.submission.model

object ProductData {
    private val data = arrayOf(
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg",
            "Vivo Z1Pro",
            "The vivo Z1Pro is yet another entrant in the absolute jam-packed budget mid-range smartphone segment. Currently dominated by the Xiaomi Redmi Note 7 Pro, the Z1Pro tried to beat Xiaomi at its own game by offering even more value at a similar price point.",
            "New, Vivo, Z1Pro",
            "9",
            "0",
            "6.53-inch",
            "32MP",
            "4GB",
            "5000mAh",
            "",
            "",
            "IPS LCD",
            "6.53-inch",
            "2340x1080 resolution",
            "Android 9",
            "Qualcomm Snapdragon",
            "Adreno 616 GPU",
            "2x2.3GHz Kryo 360 Gold & 1.7GHz Kryo 360 Silver CPU"

        ),
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg",
            "Vivo Z1Pro",
            "The vivo Z1Pro is yet another entrant in the absolute jam-packed budget mid-range smartphone segment. Currently dominated by the Xiaomi Redmi Note 7 Pro, the Z1Pro tried to beat Xiaomi at its own game by offering even more value at a similar price point.",
            "New, Vivo, Z1Pro",
            "9",
            "0",
            "6.53-inch",
            "32MP",
            "4GB",
            "5000mAh",
            "",
            "",
            "IPS LCD",
            "6.53-inch",
            "2340x1080 resolution",
            "Android 9",
            "Qualcomm Snapdragon",
            "Adreno 616 GPU",
            "2x2.3GHz Kryo 360 Gold & 1.7GHz Kryo 360 Silver CPU"
        )
    )

    val listData: ArrayList<Product>
        get() {
            val list = arrayListOf<Product>()
            for (mData in data) {

                val product = Product()
                product.img = mData[0]
                product.title = mData[1]
                product.description = mData[2]
                product.tag = mData[3]
                product.count_seen = mData[4]
                product.cuont_sold= mData[5]
                product.schreen_size = mData[6]
                product.camera = mData[7]
                product.ram = mData[8]
                product.battery = mData[9]
                product.announced_launch = mData[10]
                product.status_launch = mData[11]
                product.type_display = mData[12]
                product.size_display = mData[13]
                product.resolution_display = mData[14]
                product.os_platform = mData[15]
                product.chipset_platform = mData[16]
                product.gpu_platform = mData[17]
                product.cpu_platform = mData[18]
                list.add(product)
            }

            return list
        }
}