package com.example.finproject.SplashScreen.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.finproject.SplashScreen.data.checkers.CheckOnlineStatusImpl
import com.example.finproject.SplashScreen.data.checkers.GetCountryImpl
import com.example.finproject.SplashScreen.data.checkers.isRootedCheckImpl
import com.example.finproject.SplashScreen.domain.UseCase.OnlineStatusCheckUseCase
import com.example.finproject.SplashScreen.domain.UseCase.GetCountryCheckUseCase
import com.example.finproject.SplashScreen.domain.UseCase.isRootedCheckUseCase

class SplashScreenViewModelFactory(val context: Context) : ViewModelProvider.Factory {

    private val cheaker: CheckOnlineStatusImpl = CheckOnlineStatusImpl(context = context)
    private val getCountryImpl: GetCountryImpl = GetCountryImpl(context = context)
    private val isRootedCheck : isRootedCheckImpl = isRootedCheckImpl(context = context)


    private val cheakerOnlineStatusUseCase by lazy {
        OnlineStatusCheckUseCase(iCheckOnlineStatus = cheaker)
    }
    private val getCountryUseCase by lazy {
        GetCountryCheckUseCase(iGetCountry = getCountryImpl)
    }
    private val isRootedUseCase by lazy {
        isRootedCheckUseCase(isRootedCheck = isRootedCheck)
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SplashScreenViewModel(
            checkStatusUseCase = cheakerOnlineStatusUseCase,
            getCountryUseCase = getCountryUseCase,
            isRootedCheckUseCase = isRootedUseCase
        ) as T
    }
}