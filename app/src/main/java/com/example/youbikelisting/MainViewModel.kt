package com.example.youbikelisting

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {
    val myResponse: MutableLiveData<List<DataModel>> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }
    }
}