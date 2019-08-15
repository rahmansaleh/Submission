package com.example.submission

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar

class AboutUs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)
        setActionBarTitle("About Me")
    }

    private fun setActionBarTitle( title: String ) {
        if( supportActionBar != null ) {
            (supportActionBar as ActionBar).title = title
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true;
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}
