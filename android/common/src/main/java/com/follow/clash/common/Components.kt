package com.follow.clash.common

import android.content.ComponentName

object Components {
    // Prefix for Flutter platform channels. Must stay in sync with
    // lib/common/constant.dart (packageName). This is NOT the applicationId.
    const val PACKAGE_NAME = "com.wicoo.vpn"

    // Class paths stay on the source namespace because applicationId
    // (com.wicoo.vpn) differs from the code namespace (com.follow.clash).
    val mainActivity =
        ComponentName(GlobalState.packageName, "com.follow.clash.MainActivity")

    val quickActionActivity =
        ComponentName(GlobalState.packageName, "com.follow.clash.QuickActionActivity")

    val serviceBroadcastReceiver =
        ComponentName(GlobalState.packageName, "com.follow.clash.ServiceBroadcastReceiver")
}
