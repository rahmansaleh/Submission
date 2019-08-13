package com.example.submission

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar

class DetailProduct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)

        setActionBarTitle("Phone Detail")
    }

    private fun setActionBarTitle(title: String) {
        if( supportActionBar != null ) {
            (supportActionBar as ActionBar).title = title
        }
    }
}
