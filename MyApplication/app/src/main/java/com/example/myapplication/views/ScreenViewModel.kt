package com.example.myapplication.views

import androidx.lifecycle.ViewModel
import com.example.myapplication.models.Page
import androidx.lifecycle.viewModelScope
import com.example.myapplication.network.ApiRepository
import kotlinx.coroutines.launch

class ScreenViewModel : ViewModel() {

    var apiRepository: ApiRepository = ApiRepository()

    fun getPage(pageId: String, callback: (page: Page?) -> Unit) {
        viewModelScope.launch {
            val page = apiRepository.getPage(pageId)
            callback(page)
        }
    }

}