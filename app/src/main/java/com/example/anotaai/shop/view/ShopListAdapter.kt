package com.example.anotaai.shop.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.anotaai.R
import com.example.anotaai.shop.model.ShopModel

class ShopListAdapter (private var list: MutableList<ShopModel>): RecyclerView.Adapter<ShopListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fragment, parent, false)
        return ShopListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShopListViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size
    }

