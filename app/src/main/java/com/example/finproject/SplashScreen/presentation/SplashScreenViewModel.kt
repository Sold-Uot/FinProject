package com.example.finproject.SplashScreen.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.finproject.SplashScreen.domain.UseCase.CheckOnlineStatusUseCase

class SplashScreenViewModel(var checkStatusUseCase: CheckOnlineStatusUseCase) : ViewModel(){
    private val mutableLiveData = MutableLiveData<String>()

    val liveData: LiveData<String> = mutableLiveData
    fun checks():Boolean{
        return checkStatusUseCase.exucte()

    }
}
