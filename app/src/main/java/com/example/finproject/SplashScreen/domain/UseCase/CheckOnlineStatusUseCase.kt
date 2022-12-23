package com.example.finproject.SplashScreen.domain.UseCase

import android.content.Context
import com.example.finproject.SplashScreen.domain.IChekers.iCheckOnlineStatus


class CheckOnlineStatusUseCase(val iCheckOnlineStatus: iCheckOnlineStatus) {                  // 1.2
    fun exucte():Boolean {

    return iCheckOnlineStatus.isOnline()
    }
}