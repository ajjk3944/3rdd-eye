package com.bytedance.sdk.openadsdk.core;

import A.f;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qh {
    public static long dg = 0;
    public static volatile boolean emc = false;
    private static volatile HandlerThread msw;
    public static long ycc;
    public static AtomicBoolean ypw = new AtomicBoolean(false);
    public static long xq = 0;
    private static volatile int uym = 0;
    public static float bw = 1.0f;
    private static volatile Handler zz = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.qh.1
            boolean emc = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.emc) {
                    return;
                }
                this.emc = true;
                super.start();
            }
        };
        msw = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.msw.emc(msw);
        ycc = System.currentTimeMillis();
    }

    public static boolean bw() {
        return dg() == 1;
    }

    public static int dg() {
        return uym;
    }

    public static void emc(long j6) {
        ycc = j6;
    }

    public static void msw() {
        ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qh.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.qh.4.1
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            return f.e("init");
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.xq("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static void uym() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - xq <= 10000) {
            return;
        }
        synchronized (qh.class) {
            try {
                if (jElapsedRealtime - xq <= 10000) {
                    return;
                }
                xq = jElapsedRealtime;
                com.bytedance.sdk.component.utils.zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qh.3
                    @Override // java.lang.Runnable
                    public void run() {
                        String strYpw = com.bytedance.sdk.openadsdk.core.settings.gbl.ypw(aa.emc());
                        if (TextUtils.equals(strYpw, com.bytedance.sdk.openadsdk.core.settings.gbl.dg)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.settings.gbl.xq().emc(6, true);
                        com.bytedance.sdk.openadsdk.core.settings.gbl.dg = strYpw;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Handler xq() {
        return new Handler(Looper.getMainLooper());
    }

    public static void ycc() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - xq <= 10000) {
            return;
        }
        xq = jElapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.iyl.emc(new com.bytedance.sdk.component.msw.msw("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.qh.2
            @Override // java.lang.Runnable
            public void run() {
                String strYpw = com.bytedance.sdk.openadsdk.core.settings.gbl.ypw(aa.emc());
                if (TextUtils.equals(strYpw, com.bytedance.sdk.openadsdk.core.settings.gbl.dg)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.gbl.xq().emc(6, true);
                com.bytedance.sdk.openadsdk.core.settings.gbl.dg = strYpw;
            }
        });
    }

    public static Handler ypw() {
        if (msw == null || !msw.isAlive()) {
            synchronized (qh.class) {
                try {
                    if (msw == null || !msw.isAlive()) {
                        msw = com.bytedance.sdk.component.utils.msw.emc("csj_init_handle", -1);
                        zz = new Handler(msw.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zz == null) {
            synchronized (qh.class) {
                try {
                    if (zz == null) {
                        zz = new Handler(msw.getLooper());
                    }
                } finally {
                }
            }
        }
        return zz;
    }

    public static long emc() {
        return ycc;
    }

    public static void emc(int i) {
        uym = i;
    }

    public static void emc(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    zz.ypw().ypw(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("InitHelper", th.getMessage());
        }
    }
}
