package com.example.finproject.SplashScreen.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.ViewModelProvider
import com.example.finproject.R

class SplashScreen : AppCompatActivity() {
    private lateinit var viewModel: SplashScreenViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(
            owner = this,
            SplashScreenViewModelFactory(context = applicationContext)
        ).get(SplashScreenViewModel::class.java)

//        Toast.makeText(applicationContext , "Start",Toast.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()


        viewModel.checks()
    }

}