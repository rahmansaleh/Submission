package com.example.submission.Adapter

import android.media.Image
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submission.R
import com.example.submission.model.Product

class CardViewProductAdapter(private val listProduct: ArrayList<Product>) : RecyclerView.Adapter<CardViewProductAdapter.CardViewHolder>() {

    private lateinit var onItemClickCallBack: OnItemClickCallBack

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CardViewHolder {
        val view: View = LayoutInflater.from(p0.context).inflate(R.layout.item_cardview, p0, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }

    override fun onBindViewHolder(p0: CardViewHolder, p1: Int) {
//        val(image, title, tag, count_seen, count_sold) = listProduct[p1]

        Glide.with(p0.itemView.context)
            .load(listProduct[p1].img)
            .apply(RequestOptions().override(180, 180))
            .into(p0.imgProduct)

        p0.tvName.text = listProduct[p1].title
        p0.tvTag.text = listProduct[p1].description
        p0.tvProductSeen.text = listProduct[p1].count_seen
        p0.tvProductSold.text = listProduct[p1].cuont_sold

        p0.btnDetail.setOnClickListener {
            onItemClickCallBack.onItemClicked(listProduct[p1])
        }
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvTag: TextView = itemView.findViewById(R.id.tv_item_tag)
        val tvProductSeen: TextView = itemView.findViewById(R.id.tv_item_seen)
        val tvProductSold: TextView = itemView.findViewById(R.id.tv_item_sold)
        val imgProduct: ImageView = itemView.findViewById(R.id.iv_item_photo)
        val btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }

    interface OnItemClickCallBack {
        fun onItemClicked(data: Product)
    }

}