package com.example.finproject.SplashScreen.data.checkers

import android.content.Context
import com.example.finproject.SplashScreen.domain.iChekers.isRootedCheck
import com.scottyab.rootbeer.RootBeer


class isRootedCheckImpl(private val context: Context) : isRootedCheck {
    override fun isRooted(): Boolean {
        val rootBeer = RootBeer(context)
        return rootBeer.isRooted

    }
}