package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes.dex */
public class uym {
    static int emc = -1;
    private static long xq;
    static float ypw;

    public static class emc {
        public final int emc;
        public final float ypw;

        public emc(int i10, float f10) {
            this.emc = i10;
            this.ypw = f10;
        }
    }

    private static void emc(Intent intent) {
        if (intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 2) {
            emc = 1;
        } else {
            emc = 0;
        }
        ypw = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    public static emc emc() {
        if (xq == 0 || SystemClock.elapsedRealtime() - xq > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
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
