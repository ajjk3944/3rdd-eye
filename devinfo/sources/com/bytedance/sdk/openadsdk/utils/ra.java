package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {

    /* renamed from: lh, reason: collision with root package name */
    private static long f8711lh = 0;
    static int ouw = -1;
    static float vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public final int ouw;
        public final float vt;

        public ouw(int i4, float f10) {
            this.ouw = i4;
            this.vt = f10;
        }
    }

    public static ouw ouw() {
        if (f8711lh == 0 || SystemClock.elapsedRealtime() - f8711lh > 60000) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.zih.ouw().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                if (intentRegisterReceiver.getIntExtra("status", -1) == 2) {
                    ouw = 1;
                } else {
                    ouw = 0;
                }
                vt = (intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intentRegisterReceiver.getIntExtra("scale", -1);
                com.bytedance.sdk.component.utils.ko.vt("BatteryDataWatcher", "updateFromIntent: status=" + ouw + ", level=" + vt);
                f8711lh = SystemClock.elapsedRealtime();
            }
        }
        ouw ouwVar = new ouw(ouw, vt);
        com.bytedance.sdk.component.utils.ko.vt("BatteryDataWatcher", "obtainCurrentState: " + ouwVar.ouw + ", " + ouwVar.vt);
        return ouwVar;
    }
}
