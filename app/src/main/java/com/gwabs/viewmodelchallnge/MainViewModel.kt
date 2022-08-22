package com.gwabs.viewmodelchallnge

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// receive  startingNumber from the viewModelFactory constructor and pass it to viewModel
class MainViewModel(startingNumber :Int):ViewModel() {

   // private var number = 0
    private var number = MutableLiveData<Int>()
    // seting a liveData to encapsulate the number variable

    val total :LiveData<Int>
        get() = number

    val  input = MutableLiveData<String>()
    // initialize number to the startingNumber from constructor
    init {
        // initialize the liveData value to the startingNumber received from constructor
        number.value = startingNumber
    }

    fun add(){
        val num = input.value?.toInt()
        number.value = num?.let { number.value?.plus(it) }

    }



}