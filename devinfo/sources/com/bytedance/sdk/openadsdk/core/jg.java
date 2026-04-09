package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class jg {
    public static long fkw = 0;
    public static volatile boolean ouw = false;
    private static volatile HandlerThread ra;
    public static AtomicBoolean vt = new AtomicBoolean(false);

    /* renamed from: lh, reason: collision with root package name */
    public static long f8184lh = 0;

    /* renamed from: le, reason: collision with root package name */
    private static volatile int f8183le = 0;
    public static float yu = 1.0f;
    private static volatile Handler pno = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle") { // from class: com.bytedance.sdk.openadsdk.core.jg.1
            boolean ouw = false;

            @Override // java.lang.Thread
            public final synchronized void start() {
                if (this.ouw) {
                    return;
                }
                this.ouw = true;
                super.start();
            }
        };
        ra = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.pno.ouw = ra;
        fkw = System.currentTimeMillis();
    }

    public static boolean fkw() {
        return f8183le == 1;
    }

    public static void le() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f8184lh <= 10000) {
            return;
        }
        f8184lh = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new com.bytedance.sdk.component.pno.pno("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.jg.2
            @Override // java.lang.Runnable
            public final void run() {
                String strVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(zih.ouw());
                if (TextUtils.equals(strVt, com.bytedance.sdk.openadsdk.core.settings.cf.fkw)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(6, true);
                com.bytedance.sdk.openadsdk.core.settings.cf.fkw = strVt;
            }
        });
    }

    public static Handler lh() {
        return new Handler(Looper.getMainLooper());
    }

    public static void ouw(long j) {
        fkw = j;
    }

    public static void pno() {
        vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jg.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jg.4.1
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f8751lh = "init";
                            return ouwVar;
                        }
                    });
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.lh("InitHelper", th2.getMessage());
                }
            }
        });
    }

    public static void ra() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f8184lh <= 10000) {
            return;
        }
        synchronized (jg.class) {
            try {
                if (jElapsedRealtime - f8184lh <= 10000) {
                    return;
                }
                f8184lh = jElapsedRealtime;
                com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jg.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        String strVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(zih.ouw());
                        if (TextUtils.equals(strVt, com.bytedance.sdk.openadsdk.core.settings.cf.fkw)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.settings.cf.vt().ouw(6, true);
                        com.bytedance.sdk.openadsdk.core.settings.cf.fkw = strVt;
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler vt() {
        if (ra == null || !ra.isAlive()) {
            synchronized (jg.class) {
                try {
                    if (ra == null || !ra.isAlive()) {
                        ra = com.bytedance.sdk.component.utils.pno.ouw("csj_init_handle", -1);
                        pno = new Handler(ra.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (pno == null) {
            synchronized (jg.class) {
                try {
                    if (pno == null) {
                        pno = new Handler(ra.getLooper());
                    }
                } finally {
                }
            }
        }
        return pno;
    }

    public static int yu() {
        return f8183le;
    }

    public static long ouw() {
        return fkw;
    }

    public static void ouw(int i4) {
        f8183le = i4;
    }

    public static void ouw(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    String strOptString = jSONObject.optString("value", "");
                    bly.ouw().f8051lh = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        return;
                    }
                    bly.ouw("mediation_info", strOptString);
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("InitHelper", th2.getMessage());
        }
    }
}
