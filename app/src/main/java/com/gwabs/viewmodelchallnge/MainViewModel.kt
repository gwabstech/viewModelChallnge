package com.gwabs.viewmodelchallnge

import androidx.lifecycle.ViewModel

// receive  startingNumber from the viewModelFactory constructor and pass it to viewModel
class MainViewModel(startingNumber :Int):ViewModel() {

    private var number = 0

    // initialize number to the startingNumber from constructor
    init {
        number = startingNumber
    }

    fun add(num:Int){
        number+=num

    }

    fun getNumber():Int{
        return number
    }
}