package com.example.finproject.SplashScreen.domain.UseCase

import com.example.finproject.SplashScreen.domain.iChekers.iCheckOnlineStatus


class OnlineStatusCheckUseCase(val iCheckOnlineStatus: iCheckOnlineStatus) {                  // 1.2
    fun exucte():Boolean {

    return iCheckOnlineStatus.isOnline()
    }
}