package com.gwabs.viewmodelchallnge

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.gwabs.viewmodelchallnge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // initialize viewModel object
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.txtResult.text = viewModel.getNumber().toString()
        binding.btnAdd.setOnClickListener {
            if (TextUtils.isEmpty(binding.edtNumber.text.toString())){
                binding.edtNumber.setError("enter number")
            }else {
                val number: String = binding.edtNumber.text.toString()
                viewModel.add(number.toInt())
                binding.edtNumber.text = null
                binding.txtResult.text = viewModel.getNumber().toString()

            }
        }

    }
}