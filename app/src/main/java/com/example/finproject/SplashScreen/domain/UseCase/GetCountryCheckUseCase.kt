package com.example.finproject.SplashScreen.domain.UseCase

import com.example.finproject.SplashScreen.domain.iChekers.iGetCountry

class GetCountryCheckUseCase(var iGetCountry: iGetCountry) {

    fun  execute(): String? {

        return iGetCountry.nameCountry()
    }

}