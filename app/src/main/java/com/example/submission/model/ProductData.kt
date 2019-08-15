package com.example.submission.model

object ProductData {
    private val data = arrayOf(
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg",
            "Ahmad Dahlan",
            "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH. Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang masih harus belajar dan berbuat.",
            "Pahlawan, Kemerdekaan",
            "9",
            "1",
            "5.0",
            "13MP",
            "4GB",
            "4000mAh",
            "2016, November",
            "Avaiable, Released 2016",
            "OLED",
            "5.0-inch",
            "2340x1080 resolution",
            "Android Pie",
            "Celeron",
            "GPU AB",
            "CPU AB"

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