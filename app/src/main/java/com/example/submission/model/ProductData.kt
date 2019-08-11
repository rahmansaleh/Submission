package com.example.submission.model

object ProductData {
    private val data = arrayOf(
        arrayOf(
            "Ahmad Dahlan",
            "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH. Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang masih harus belajar dan berbuat.",
            "https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg",
            "9",
            "1"
        ),
        arrayOf(
            "Ahmad Dahlan",
            "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH. Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk menyadari nasibnya sebagai bangsa terjajah yang masih harus belajar dan berbuat.",
            "https://upload.wikimedia.org/wikipedia/commons/8/87/Ahmad_Dahlan.jpg",
            "10",
            "0"
        )
    )

    val listData: ArrayList<Product>
        get() {
            val list = arrayListOf<Product>()
            for (mData in data) {

                val product = Product()
                product.img = mData[2]
                product.title = mData[0]
                product.tag = mData[1]
                product.count_seen = mData[3]
                product.cuont_sold = mData[4]
                list.add(product)
            }

            return list
        }
}