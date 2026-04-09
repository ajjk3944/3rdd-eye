package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class sb {
    private static final Object emc = new Object();
    private static final Map<emc, Object> ypw = new ConcurrentHashMap();
    private static AtomicBoolean xq = new AtomicBoolean(false);
    private static volatile int dg = -1;
    private static volatile long bw = 0;
    private static volatile int ycc = 60000;
    private static yzg uym = null;
    private static final AtomicBoolean msw = new AtomicBoolean(false);

    public interface emc {
        void emc(Context context, Intent intent, boolean z6, int i);
    }

    public static class ypw extends BroadcastReceiver {
        private ypw() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                boolean z6 = false;
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (sb.ypw != null && sb.ypw.size() > 0) {
                    z6 = true;
                }
                sb.ypw(context, intent, z6, booleanExtra);
            } catch (Throwable unused) {
            }
        }
    }

    private static int xq(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        yzg yzgVar = uym;
                        return (yzgVar == null || !yzgVar.emc(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(final Context context, final Intent intent, final boolean z6, final boolean z7) {
        if (!z6 && z7) {
            dg = 0;
        } else if (msw.compareAndSet(false, true)) {
            com.bytedance.sdk.component.msw.ycc.ypw(new com.bytedance.sdk.component.msw.msw("getNetworkType") { // from class: com.bytedance.sdk.component.utils.sb.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = sb.dg = z7 ? 0 : sb.ypw(context);
                    sb.msw.set(false);
                    if (z6) {
                        sb.ypw(context, intent, sb.dg, z7);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(Context context, Intent intent, int i, boolean z6) {
        Map<emc, Object> map = ypw;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (emc emcVar : map.keySet()) {
            if (emcVar != null) {
                try {
                    emcVar.emc(context, intent, !z6, i);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static int emc(Context context, long j6) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (bw + j6 <= jElapsedRealtime) {
            return ypw(context);
        }
        if (dg == -1) {
            return ypw(context);
        }
        if (jElapsedRealtime - bw >= ycc) {
            ypw(context, (Intent) null, false, false);
        }
        return dg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ypw(Context context) {
        dg = xq(context);
        bw = SystemClock.elapsedRealtime();
        return dg;
    }

    public static void emc(emc emcVar, Context context) {
        if (emcVar == null) {
            return;
        }
        if (!xq.get()) {
            try {
                context.registerReceiver(new ypw(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                xq.set(true);
            } catch (Throwable unused) {
            }
        }
        ypw.put(emcVar, emc);
    }

    public static void emc(emc emcVar) {
        if (emcVar == null) {
            return;
        }
        ypw.remove(emcVar);
    }
}
