package com.example.dummymobpro.ui.screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dummymobpro.network.HewanApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    init {
        retrieveData()
    }

    private fun retrieveData() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val result = HewanApi.service.getHewan()
                Log.d("MainViewModel", "success: $result")
            } catch (e: Exception) {
                Log.d("MainViewModel", "failure: ${e.message}")
            }
        }
    }
}