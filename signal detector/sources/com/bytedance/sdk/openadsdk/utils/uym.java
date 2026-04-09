package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes.dex */
public class uym {
    static int emc = -1;
    private static long xq;
    static float ypw;

    public static class emc {
        public final int emc;
        public final float ypw;

        public emc(int i, float f2) {
            this.emc = i;
            this.ypw = f2;
        }
    }

    private static void emc(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            emc = 1;
        } else {
            emc = 0;
        }
        ypw = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static emc emc() {
        if (xq == 0 || SystemClock.elapsedRealtime() - xq > 60000) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.aa.emc().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                emc(intentRegisterReceiver);
                xq = SystemClock.elapsedRealtime();
            }
        }
        return new emc(emc, ypw);
    }
}
