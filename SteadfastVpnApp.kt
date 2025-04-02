package com.servicepro.steadfastvpn

import android.app.Application
import com.google.android.gms.ads.MobileAds
import com.onesignal.OneSignal
import com.servicepro.steadfastvpn.utils.AppConstants.ONE_SIGNAL_APP_ID

class SteadfastVpnApp : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize AdMob
        MobileAds.initialize(this) { status ->
            // You can check status.adapterStatusMap here if needed
        }

        // Initialize OneSignal
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONE_SIGNAL_APP_ID)

        if (BuildConfig.DEBUG) {
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        }
    }
}