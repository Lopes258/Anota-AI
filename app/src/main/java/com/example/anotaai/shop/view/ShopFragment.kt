package com.example.anotaai.shop.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.anotaai.R
import com.example.anotaai.shop.viewmodel.ShopViewModel

class ShopFragment : Fragment() {
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
        loadShopList()
    }

    private fun loadShopList() {
        model.obterLista().observe(viewLifecycleOwner, {
            showList()
        })
    }

    private fun showList() {

    }

    private fun loadViewModel(){
            model = ViewModelProvider(this,
                ShopViewModel.ShopViewModelFactory())[ShopViewModel::class.java]
    }


}