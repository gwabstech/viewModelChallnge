package com.gwabs.viewmodelchallnge

import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    private var number = 0

    fun add(num:Int){
        number+=num

    }

    fun getNumber():Int{
        return number
    }
}