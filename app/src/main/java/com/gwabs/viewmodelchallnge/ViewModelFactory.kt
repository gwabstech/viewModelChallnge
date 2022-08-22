package com.gwabs.viewmodelchallnge

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelFactory (private val startingNumber :Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            //this startingNumber will be passed to the viewModel constructor as the value of number
            return MainViewModel(startingNumber)as T
        }
        throw IllegalArgumentException("Unknown viewModel class")
    }
}