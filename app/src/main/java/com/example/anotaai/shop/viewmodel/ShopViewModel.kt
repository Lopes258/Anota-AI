package com.example.anotaai.shop.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.Dispatchers
import androidx.lifecycle.liveData
import com.example.anotaai.shop.model.ShopModel

class ShopViewModel: ViewModel() {

    fun obterLista() = liveData(Dispatchers.IO){
        emit(mutableListOf<ShopModel>())
    }

    class ShopViewModelFactory(): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return ShopViewModel() as T
        }
    }
}