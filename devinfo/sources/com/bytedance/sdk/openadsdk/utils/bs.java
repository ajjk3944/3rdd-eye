package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.pno.lh.le;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class bs {
    private static volatile com.bytedance.sdk.component.pno.lh.le bly;

    /* renamed from: cf, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f8689cf;
    private static volatile com.bytedance.sdk.component.pno.lh.le fkw;

    /* renamed from: le, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f8690le;

    /* renamed from: lh, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.pno.lh.le f8691lh;
    private static volatile ThreadPoolExecutor ouw;
    private static volatile com.bytedance.sdk.component.pno.lh.le pno;
    private static volatile com.bytedance.sdk.component.pno.lh.le ra;
    private static volatile com.bytedance.sdk.component.pno.lh.le tlj;
    private static volatile boolean vt;
    private static volatile com.bytedance.sdk.component.pno.lh.le yu;

    static {
        com.bytedance.sdk.component.pno.lh.lh.ouw(new com.bytedance.sdk.component.pno.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.utils.bs.1
            @Override // com.bytedance.sdk.component.pno.lh.ouw
            public final void ouw(com.bytedance.sdk.component.pno.lh.vt vtVar) {
                com.bytedance.sdk.component.utils.ko.ouw("ThreadUtils", " cycleCallTask = ", vtVar.yu, new RuntimeException());
            }
        });
        ouw = null;
        vt = false;
    }

    public static com.bytedance.sdk.component.pno.lh.le bly() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f8690le;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            try {
                if (ouw(f8690le)) {
                    try {
                        f8690le = ouw("cache", f8690le);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                    }
                }
                leVar = f8690le;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return leVar;
    }

    public static com.bytedance.sdk.component.pno.lh.le cf() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = tlj;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            try {
                if (ouw(tlj)) {
                    try {
                        tlj = ouw("net", tlj);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                    }
                }
                leVar = tlj;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return leVar;
    }

    public static ExecutorService fkw() {
        return bly();
    }

    private static com.bytedance.sdk.component.pno.lh.le jg() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = fkw;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            try {
                if (ouw(fkw)) {
                    try {
                        fkw = ouw("aidl", fkw);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                    }
                }
                leVar = fkw;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return leVar;
    }

    private static com.bytedance.sdk.component.pno.lh.le ko() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = pno;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            try {
                if (ouw(pno)) {
                    try {
                        pno = ouw("image", pno);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                    }
                }
                leVar = pno;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return leVar;
    }

    public static boolean le() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService lh() {
        return zih();
    }

    private static com.bytedance.sdk.component.pno.lh.le mwh() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = yu;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            try {
                if (ouw(yu)) {
                    try {
                        yu = ouw("log", yu);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                    }
                }
                leVar = yu;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return leVar;
    }

    public static ScheduledExecutorService ouw() {
        return com.bytedance.sdk.component.pno.le.vt();
    }

    public static ExecutorService pno() {
        return rn();
    }

    public static boolean ra() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    private static com.bytedance.sdk.component.pno.lh.le rn() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = ra;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            try {
                if (ouw(ra)) {
                    try {
                        ra = ouw("io", ra);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                    }
                }
                leVar = ra;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return leVar;
    }

    private static ThreadPoolExecutor ryl() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f8691lh;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            try {
                if (ouw(f8691lh)) {
                    try {
                        f8691lh = ouw("ad", f8691lh);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                    }
                }
                leVar = f8691lh;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return leVar;
    }

    public static com.bytedance.sdk.component.pno.lh.le tlj() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = bly;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            try {
                if (ouw(bly)) {
                    try {
                        bly = ouw("express", bly);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                    }
                }
                leVar = bly;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return leVar;
    }

    public static ExecutorService vt() {
        return ko();
    }

    public static ExecutorService yu() {
        return mwh();
    }

    private static com.bytedance.sdk.component.pno.lh.le zih() {
        com.bytedance.sdk.component.pno.lh.le leVar;
        com.bytedance.sdk.component.pno.lh.le leVar2 = f8689cf;
        if (!ouw(leVar2)) {
            return leVar2;
        }
        synchronized (bs.class) {
            try {
                if (ouw(f8689cf)) {
                    try {
                        f8689cf = ouw("imgdisk", f8689cf);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
                    }
                }
                leVar = f8689cf;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return leVar;
    }

    public static void fkw(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        jg().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.8
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void le(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        ryl().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName(), pnoVar) { // from class: com.bytedance.sdk.openadsdk.utils.bs.9
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void lh(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        mwh().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.5
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void ouw(Runnable runnable) {
        if (runnable == null || uq.ouw) {
            return;
        }
        if (le()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.jg.lh().post(runnable);
        }
    }

    public static void vt(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.jg.lh().removeCallbacks(runnable);
    }

    public static void yu(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (pnoVar == null || uq.ouw) {
            return;
        }
        ryl().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.7
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void vt(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        rn().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.3
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void vt(final com.bytedance.sdk.component.pno.pno pnoVar, int i4) {
        if (pnoVar == null || uq.ouw) {
            return;
        }
        com.bytedance.sdk.component.pno.lh.vt vtVar = new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.6
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        };
        vtVar.f7614lh = i4;
        mwh().execute(vtVar);
    }

    public static void ouw(final com.bytedance.sdk.component.pno.pno pnoVar) {
        if (uq.ouw) {
            return;
        }
        bly().execute(new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.2
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        });
    }

    public static void ouw(final com.bytedance.sdk.component.pno.pno pnoVar, int i4) {
        if (pnoVar == null || uq.ouw) {
            return;
        }
        com.bytedance.sdk.component.pno.lh.vt vtVar = new com.bytedance.sdk.component.pno.lh.vt(pnoVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.bs.4
            @Override // java.lang.Runnable
            public final void run() {
                pnoVar.run();
            }
        };
        vtVar.f7614lh = i4;
        rn().execute(vtVar);
    }

    public static void ouw(com.bytedance.sdk.component.pno.lh.vt vtVar) {
        cf().execute(vtVar);
    }

    private static com.bytedance.sdk.component.pno.lh.le ouw(String str, com.bytedance.sdk.component.pno.lh.le leVar) {
        le.ouw ouwVarOuw = ouw(str);
        if (leVar == null) {
            return ouwVarOuw.ouw();
        }
        leVar.ouw(ouwVarOuw);
        return leVar;
    }

    private static boolean ouw(com.bytedance.sdk.component.pno.lh.le leVar) {
        if (leVar != null) {
            return !leVar.ouw && com.bytedance.sdk.openadsdk.core.settings.cf.hun();
        }
        return true;
    }

    private static le.ouw ouw(String str) {
        String str2;
        le.ouw ouwVar;
        str2 = TextUtils.isEmpty(str) ? AppLovinMediationProvider.UNKNOWN : str;
        ouwVar = new le.ouw();
        str2.getClass();
        switch (str2) {
            case "express":
                ouwVar.ouw = str2;
                ouwVar.vt = 2;
                ouwVar.f7611lh = 4;
                ouwVar.yu = 0;
                ouwVar.fkw = 10000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            case "ad":
                ouwVar.ouw = str2;
                ouwVar.vt = 4;
                ouwVar.f7611lh = 4;
                ouwVar.yu = 0;
                ouwVar.fkw = 20000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            case "io":
                ouwVar.ouw = str2;
                ouwVar.vt = 4;
                ouwVar.f7611lh = 10;
                ouwVar.yu = 0;
                ouwVar.fkw = 20000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            case "log":
                ouwVar.ouw = str2;
                ouwVar.vt = 4;
                ouwVar.f7611lh = 6;
                ouwVar.yu = 2;
                ouwVar.fkw = 20000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            case "net":
                ouwVar.ouw = str2;
                ouwVar.vt = 10;
                ouwVar.f7611lh = 10;
                ouwVar.yu = 0;
                ouwVar.fkw = 10000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            case "aidl":
                ouwVar.ouw = str2;
                ouwVar.vt = 2;
                ouwVar.f7611lh = 4;
                ouwVar.yu = 0;
                ouwVar.fkw = 10000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            case "cache":
                ouwVar.ouw = str2;
                ouwVar.vt = 0;
                ouwVar.f7611lh = 0;
                ouwVar.yu = 0;
                ouwVar.fkw = 5000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            case "image":
                ouwVar.ouw = str2;
                ouwVar.vt = 3;
                ouwVar.f7611lh = 3;
                ouwVar.yu = 0;
                ouwVar.fkw = 20000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            case "monitor":
                ouwVar.ouw = str2;
                ouwVar.vt = 2;
                ouwVar.f7611lh = 2;
                ouwVar.yu = 0;
                ouwVar.fkw = 10000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            case "imgdisk":
                ouwVar.ouw = str2;
                ouwVar.vt = 1;
                ouwVar.f7611lh = 2;
                ouwVar.yu = 3;
                ouwVar.fkw = 10000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
            default:
                ouwVar.ouw = str2;
                ouwVar.vt = 8;
                ouwVar.f7611lh = 16;
                ouwVar.yu = 2;
                ouwVar.fkw = 20000L;
                ouwVar.f7610le = true;
                ouwVar.pno = false;
                break;
        }
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.cf.hun()) {
                ouwVar.pno = true;
                com.bytedance.sdk.openadsdk.core.settings.cf cfVarVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt();
                JSONObject jSONObject = (JSONObject) cfVarVt.pno.ouw("perf_con_thread_pool_config", new JSONObject(), cfVarVt.rn);
                JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    ouwVar.pno = true;
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        ouwVar.vt = jSONObjectOptJSONObject.optInt("coreSize");
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        ouwVar.f7611lh = jSONObjectOptJSONObject.optInt("maxSize");
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        ouwVar.yu = jSONObjectOptJSONObject.optInt("createSize");
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        ouwVar.fkw = jSONObjectOptJSONObject.optInt("keepAlive");
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        ouwVar.f7610le = jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut");
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                    }
                }
            }
            return ouwVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.lh("ThreadUtils", th2.getMessage());
            return ouwVar;
        }
    }
}
