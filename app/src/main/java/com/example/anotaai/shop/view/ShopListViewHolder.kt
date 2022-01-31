package com.example.anotaai.shop.view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.anotaai.R
import com.example.anotaai.shop.model.ShopModel

class ShopListViewHolder(private var view: View): RecyclerView.ViewHolder(view) {

    private val name = view.findViewById<TextView>(R.id.name)

    fun bind(shopModel: ShopModel){

    }
}