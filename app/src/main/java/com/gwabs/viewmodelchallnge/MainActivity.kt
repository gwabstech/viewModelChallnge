package com.gwabs.viewmodelchallnge

import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gwabs.viewmodelchallnge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // global variablesfor binding object , viewModel and viewModelFactory
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel:MainViewModel
    private lateinit var viewModelFactory: ViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // initialize binding object
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // initialize viewModelFactory and assign the startingNumber
        viewModelFactory = ViewModelFactory(10)
        // initialize viewModel object
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
        binding.lifecycleOwner = this
        binding.myViewModel = viewModel

    }
}