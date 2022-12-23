package com.example.finproject.SplashScreen.domain.UseCase

import com.example.finproject.SplashScreen.domain.iChekers.isRootedCheck

class isRootedCheckUseCase(private val isRootedCheck: isRootedCheck) {
    fun execute():Boolean =isRootedCheck.isRooted()



}