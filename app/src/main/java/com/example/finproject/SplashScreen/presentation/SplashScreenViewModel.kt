package com.example.finproject.SplashScreen.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.finproject.SplashScreen.domain.UseCase.OnlineStatusCheckUseCase
import com.example.finproject.SplashScreen.domain.UseCase.GetCountryCheckUseCase
import com.example.finproject.SplashScreen.domain.UseCase.isRootedCheckUseCase


class SplashScreenViewModel(
    var checkStatusUseCase: OnlineStatusCheckUseCase,
    var getCountryUseCase: GetCountryCheckUseCase,
    var isRootedCheckUseCase: isRootedCheckUseCase
) : ViewModel() {

    private val mutableLiveData = MutableLiveData<String>()
    val liveData: LiveData<String> = mutableLiveData

    fun getHomeCountry(): String? = getCountryUseCase.execute()

    fun checkOnlineStatusVM(): Boolean = checkStatusUseCase.exucte()

    fun checkIsRooted(): Boolean = isRootedCheckUseCase.execute()
    fun allCheakers() {
        val p1 = checkOnlineStatusVM()           // p1
        if (checkOnlineStatusVM()) {// check internet
            val p2 = getHomeCountry()
            if (!checkIsRooted()) {
                val p3 = null
            }

        }


    }
}
