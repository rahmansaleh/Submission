package com.example.submission

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submission.model.Parcelable.ProductParcel

class DetailProduct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)
        setActionBarTitle("Phone Detail")

        val bundle = intent.getBundleExtra("bundle")
        val productParcel = bundle.getParcelable<ProductParcel>("productParcel")

        val iv_product: ImageView = findViewById(R.id.iv_product)
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

        Glide.with(applicationContext)
            .load(productParcel.img)
            .apply(RequestOptions().override(190))
            .into(iv_product)

        tv_title.text = productParcel.title
        tv_description.text = productParcel.description
        tv_display.text = productParcel.size_display
        tv_camera.text = productParcel.camera
        tv_battery.text = productParcel.battery
        tv_announcedlaunch.text = productParcel.announced_launch
        tv_statuslaunch.text = productParcel.status_launch
        tv_typesdisplay.text = productParcel.type_display
        tv_sizedisplay.text = productParcel.size_display
        tv_resolutiondisplay.text = productParcel.resolution_display
        tv_osplatform.text = productParcel.os_platform
        tv_chipsetdisplay.text = productParcel.chipset_platform
        tv_cpuplatform.text = productParcel.cpu_platform
        tv_gpuplatform.text = productParcel.gpu_platform


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
