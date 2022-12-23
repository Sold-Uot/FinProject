package com.example.finproject.SplashScreen.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.finproject.SplashScreen.data.checkers.CheckOnlineStatusImpl
import com.example.finproject.SplashScreen.domain.UseCase.CheckOnlineStatusUseCase

class SplashScreenViewModelFactory(val context: Context): ViewModelProvider.Factory {


    private val cheaker : CheckOnlineStatusImpl = CheckOnlineStatusImpl(context)


    private val cheakerUseCase by lazy {
        CheckOnlineStatusUseCase(cheaker)
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SplashScreenViewModel(cheakerUseCase) as T
    }
}