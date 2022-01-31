package com.example.anotaai.shop.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.anotaai.R
import com.example.anotaai.shop.model.ShopModel
import com.example.anotaai.shop.viewmodel.ShopViewModel

class ShopFragment : Fragment() {
    private lateinit var _shoplistAdapter: ShopListAdapter
    private val _shoplist: MutableList<ShopModel> = mutableListOf()
    private lateinit var _view: View
    private lateinit var model : ShopViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _view = view
        loadViewModel()
        loadRecyclerView()
        loadShopList()
    }

    private fun loadRecyclerView() {
        val shoppinglist = _view.findViewById<RecyclerView>(R.id.rv_shopList)
        val manager = LinearLayoutManager(_view.context)

        _shoplistAdapter = ShopListAdapter(_shoplist)

        shoppinglist.apply {
            setHasFixedSize(true)

            layoutManager = LinearLayoutManager(_view.context)
            adapter = _shoplistAdapter
        }
    }

    private fun loadShopList() {
        model.obterLista().observe(viewLifecycleOwner, {
            showList(it)
        })
    }

    private fun showList(list: MutableList<ShopModel>) {
        list.let { _shoplist.addAll(it) }
        _shoplistAdapter.notifyDataSetChanged()
    }


    private fun loadViewModel(){
            model = ViewModelProvider(this,
                ShopViewModel.ShopViewModelFactory())[ShopViewModel::class.java]
    }


}