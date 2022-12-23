package com.example.finproject.SplashScreen.data.checkers

import android.content.Context
import android.telephony.TelephonyManager
import android.text.TextUtils
import com.example.finproject.SplashScreen.domain.iChekers.iGetCountry


class GetCountryImpl(var context : Context):iGetCountry {
    override fun nameCountry(): String? {

        val telephonyManager = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        if (telephonyManager == null)
            return null

        val simCountryIso = telephonyManager.simCountryIso
        if (TextUtils.isEmpty(simCountryIso)) return null

        return simCountryIso

    }
}