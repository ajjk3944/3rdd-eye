package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ksc {
    private static final Object ouw = new Object();
    private static final Map<ouw, Object> vt = new ConcurrentHashMap();

    /* renamed from: lh, reason: collision with root package name */
    private static AtomicBoolean f7634lh = new AtomicBoolean(false);
    private static volatile int yu = -1;
    private static volatile long fkw = 0;

    /* renamed from: le, reason: collision with root package name */
    private static volatile int f7633le = 60000;
    private static th ra = null;
    private static final AtomicBoolean pno = new AtomicBoolean(false);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(boolean z3, int i4);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt extends BroadcastReceiver {
        private vt() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            try {
                boolean z3 = false;
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (ksc.vt != null && ksc.vt.size() > 0) {
                    z3 = true;
                }
                ksc.vt(context, intent, z3, booleanExtra);
            } catch (Throwable unused) {
            }
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }
    }

    private static int lh(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                context.getSystemService("phone");
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
                        th thVar = ra;
                        return (thVar == null || !thVar.ouw()) ? 5 : 6;
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
    public static void vt(final Context context, final Intent intent, final boolean z3, final boolean z10) {
        if (!z3 && z10) {
            yu = 0;
        } else if (pno.compareAndSet(false, true)) {
            com.bytedance.sdk.component.pno.le.vt(new com.bytedance.sdk.component.pno.pno("getNetworkType") { // from class: com.bytedance.sdk.component.utils.ksc.1
                @Override // java.lang.Runnable
                public final void run() {
                    int unused = ksc.yu = z10 ? 0 : ksc.vt(context);
                    ksc.pno.set(false);
                    if (z3) {
                        ksc.ouw(ksc.yu, z10);
                    }
                }
            });
        }
    }

    public static int ouw(Context context, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (fkw + j <= jElapsedRealtime) {
            return vt(context);
        }
        if (yu == -1) {
            return vt(context);
        }
        if (jElapsedRealtime - fkw >= f7633le) {
            vt(context, null, false, false);
        }
        return yu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int vt(Context context) {
        yu = lh(context);
        fkw = SystemClock.elapsedRealtime();
        return yu;
    }

    public static void ouw(ouw ouwVar, Context context) {
        if (ouwVar == null) {
            return;
        }
        if (!f7634lh.get()) {
            try {
                context.registerReceiver(new vt((byte) 0), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                f7634lh.set(true);
            } catch (Throwable unused) {
            }
        }
        vt.put(ouwVar, ouw);
    }

    public static void ouw(ouw ouwVar) {
        if (ouwVar == null) {
            return;
        }
        vt.remove(ouwVar);
    }

    public static /* synthetic */ void ouw(int i4, boolean z3) {
        Map<ouw, Object> map = vt;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (ouw ouwVar : map.keySet()) {
            if (ouwVar != null) {
                try {
                    ouwVar.ouw(!z3, i4);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
