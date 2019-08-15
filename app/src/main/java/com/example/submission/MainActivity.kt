package com.example.submission

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.submission.Adapter.CardViewProductAdapter
import com.example.submission.model.Product
import com.example.submission.model.ProductData

class MainActivity : AppCompatActivity() {

    private lateinit var rv_main: RecyclerView
    private var list: ArrayList<Product> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle()

        rv_main = findViewById(R.id.rv_main)
        rv_main.setHasFixedSize(true)

        list.addAll(ProductData.listData)
        showRecyclerCardView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainact_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        setMode(item!!.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBarTitle() {
        if( supportActionBar != null ) {
            (supportActionBar as ActionBar).title = null
        }
    }

    private fun showRecyclerCardView() {
        rv_main.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewProductAdapter(list)
        rv_main.adapter = cardViewHeroAdapter

        cardViewHeroAdapter.setOnItemClickCallBack(object : CardViewProductAdapter.OnItemClickCallBack{
            override fun onItemClicked(data: Product) {
                moveActivity(data)
            }
        })
    }

    private fun moveActivity(product: Product) {
        startActivity(Intent(this, DetailProduct::class.java))
    }

    private fun setMode(id: Int) {
        when(id) {
            R.id.nav_aboutus -> {
                startActivity(Intent(this@MainActivity, AboutUs::class.java))
            }
        }
    }
}
