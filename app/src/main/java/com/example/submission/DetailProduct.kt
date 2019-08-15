package com.example.submission

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.submission.model.Parcelable.ProductParcel

class DetailProduct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)
        setActionBarTitle("Phone Detail")

        val bundle = intent.getBundleExtra("bundle")
        val ProductParcel = bundle.getParcelable<ProductParcel>("productParcel")

        val iv_product: ImageView = findViewById(R.id.iv_photo)
        val tv_title: TextView = findViewById(R.id.tv_title)
        val tv_description: TextView = findViewById(R.id.tv_description)
        val tv_display: TextView = findViewById(R.id.tv_display)
        val tv_camera: TextView = findViewById(R.id.tv_camera)
        val iv_ram: TextView = findViewById(R.id.tv_ram)
        val tv_battery: TextView = findViewById(R.id.tv_battery)
        val tv_announcedlaunch: TextView = findViewById(R.id.tv_announcedlaunch)
        val tv_statuslaunch: TextView = findViewById(R.id.tv_statuslaunch)
        val tv_typesdisplay: TextView = findViewById(R.id.tv_typesdisplay)
        val tv_sizedisplay: TextView = findViewById(R.id.tv_sizedisplay)
        val tv_resolutiondisplay: TextView = findViewById(R.id.tv_resolutiondisplay)
        val tv_osplatform: TextView = findViewById(R.id.tv_osplatform)
        val tv_chipsetdisplay: TextView = findViewById(R.id.tv_chipsetdisplay)
        val tv_cpuplatform: TextView = findViewById(R.id.tv_cpuplatform)
        val tv_gpuplatform: TextView = findViewById(R.id.tv_gpuplatform)



    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true;
    }

    private fun setActionBarTitle(title: String) {
        if( supportActionBar != null ) {
            (supportActionBar as ActionBar).title = title
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }
    }
}
