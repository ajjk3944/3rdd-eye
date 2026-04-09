package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.msw.xq.ycc;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class iyl {
    private static volatile com.bytedance.sdk.component.msw.xq.ycc bw;
    private static volatile com.bytedance.sdk.component.msw.xq.ycc dg;
    private static volatile ThreadPoolExecutor emc;
    private static volatile com.bytedance.sdk.component.msw.xq.ycc gbl;
    private static volatile com.bytedance.sdk.component.msw.xq.ycc msw;
    private static volatile com.bytedance.sdk.component.msw.xq.ycc ru;
    private static volatile com.bytedance.sdk.component.msw.xq.ycc uym;
    private static volatile com.bytedance.sdk.component.msw.xq.ycc xq;
    private static volatile com.bytedance.sdk.component.msw.xq.ycc ycc;
    private static volatile boolean ypw;
    private static volatile com.bytedance.sdk.component.msw.xq.ycc zz;

    static {
        com.bytedance.sdk.component.msw.xq.xq.emc(new com.bytedance.sdk.component.msw.xq.emc() { // from class: com.bytedance.sdk.openadsdk.utils.iyl.1
            @Override // com.bytedance.sdk.component.msw.xq.emc
            public void emc(com.bytedance.sdk.component.msw.xq.ycc yccVar, com.bytedance.sdk.component.msw.xq.ypw ypwVar) {
                ypwVar.ypw();
                new RuntimeException();
            }
        });
        emc = null;
        ypw = false;
    }

    private static com.bytedance.sdk.component.msw.xq.ycc aa() {
        com.bytedance.sdk.component.msw.xq.ycc yccVar;
        com.bytedance.sdk.component.msw.xq.ycc yccVar2 = gbl;
        if (!emc(yccVar2)) {
            return yccVar2;
        }
        synchronized (iyl.class) {
            try {
                if (emc(gbl)) {
                    try {
                        gbl = emc("imgdisk", gbl);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                yccVar = gbl;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yccVar;
    }

    public static ExecutorService bw() {
        return zz();
    }

    private static com.bytedance.sdk.component.msw.xq.ycc cf() {
        com.bytedance.sdk.component.msw.xq.ycc yccVar;
        com.bytedance.sdk.component.msw.xq.ycc yccVar2 = msw;
        if (!emc(yccVar2)) {
            return yccVar2;
        }
        synchronized (iyl.class) {
            try {
                if (emc(msw)) {
                    try {
                        msw = emc("image", msw);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                yccVar = msw;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yccVar;
    }

    public static ExecutorService dg() {
        return sz();
    }

    public static ScheduledExecutorService emc() {
        return com.bytedance.sdk.component.msw.ycc.dg();
    }

    public static com.bytedance.sdk.component.msw.xq.ycc gbl() {
        com.bytedance.sdk.component.msw.xq.ycc yccVar;
        com.bytedance.sdk.component.msw.xq.ycc yccVar2 = ru;
        if (!emc(yccVar2)) {
            return yccVar2;
        }
        synchronized (iyl.class) {
            try {
                if (emc(ru)) {
                    try {
                        ru = emc("net", ru);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                yccVar = ru;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yccVar;
    }

    public static ExecutorService msw() {
        return vk();
    }

    private static com.bytedance.sdk.component.msw.xq.ycc qh() {
        com.bytedance.sdk.component.msw.xq.ycc yccVar;
        com.bytedance.sdk.component.msw.xq.ycc yccVar2 = bw;
        if (!emc(yccVar2)) {
            return yccVar2;
        }
        synchronized (iyl.class) {
            try {
                if (emc(bw)) {
                    try {
                        bw = emc("aidl", bw);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                yccVar = bw;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yccVar;
    }

    public static com.bytedance.sdk.component.msw.xq.ycc ru() {
        com.bytedance.sdk.component.msw.xq.ycc yccVar;
        com.bytedance.sdk.component.msw.xq.ycc yccVar2 = zz;
        if (!emc(yccVar2)) {
            return yccVar2;
        }
        synchronized (iyl.class) {
            try {
                if (emc(zz)) {
                    try {
                        zz = emc("express", zz);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                yccVar = zz;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yccVar;
    }

    private static ThreadPoolExecutor sup() {
        com.bytedance.sdk.component.msw.xq.ycc yccVar;
        com.bytedance.sdk.component.msw.xq.ycc yccVar2 = xq;
        if (!emc(yccVar2)) {
            return yccVar2;
        }
        synchronized (iyl.class) {
            try {
                if (emc(xq)) {
                    try {
                        xq = emc("ad", xq);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                yccVar = xq;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yccVar;
    }

    private static com.bytedance.sdk.component.msw.xq.ycc sz() {
        com.bytedance.sdk.component.msw.xq.ycc yccVar;
        com.bytedance.sdk.component.msw.xq.ycc yccVar2 = dg;
        if (!emc(yccVar2)) {
            return yccVar2;
        }
        synchronized (iyl.class) {
            try {
                if (emc(dg)) {
                    try {
                        dg = emc("log", dg);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                yccVar = dg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yccVar;
    }

    public static boolean uym() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    private static com.bytedance.sdk.component.msw.xq.ycc vk() {
        com.bytedance.sdk.component.msw.xq.ycc yccVar;
        com.bytedance.sdk.component.msw.xq.ycc yccVar2 = uym;
        if (!emc(yccVar2)) {
            return yccVar2;
        }
        synchronized (iyl.class) {
            try {
                if (emc(uym)) {
                    try {
                        uym = emc("io", uym);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                yccVar = uym;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yccVar;
    }

    public static ExecutorService xq() {
        return aa();
    }

    public static boolean ycc() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static ExecutorService ypw() {
        return cf();
    }

    public static com.bytedance.sdk.component.msw.xq.ycc zz() {
        com.bytedance.sdk.component.msw.xq.ycc yccVar;
        com.bytedance.sdk.component.msw.xq.ycc yccVar2 = ycc;
        if (!emc(yccVar2)) {
            return yccVar2;
        }
        synchronized (iyl.class) {
            try {
                if (emc(ycc)) {
                    try {
                        ycc = emc("cache", ycc);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                yccVar = ycc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yccVar;
    }

    public static void bw(final com.bytedance.sdk.component.msw.msw mswVar) {
        if (cuf.emc) {
            return;
        }
        sup().execute(new com.bytedance.sdk.component.msw.xq.ypw(mswVar.getName(), mswVar) { // from class: com.bytedance.sdk.openadsdk.utils.iyl.9
            @Override // java.lang.Runnable
            public void run() {
                mswVar.run();
            }
        });
    }

    public static void dg(final com.bytedance.sdk.component.msw.msw mswVar) {
        if (mswVar == null || cuf.emc) {
            return;
        }
        sup().execute(new com.bytedance.sdk.component.msw.xq.ypw(mswVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.iyl.7
            @Override // java.lang.Runnable
            public void run() {
                mswVar.run();
            }
        });
    }

    public static void emc(Runnable runnable) {
        if (runnable == null || cuf.emc) {
            return;
        }
        if (ycc()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.qh.xq().post(runnable);
        }
    }

    public static void xq(final com.bytedance.sdk.component.msw.msw mswVar) {
        if (mswVar == null || cuf.emc) {
            return;
        }
        sz().execute(new com.bytedance.sdk.component.msw.xq.ypw(mswVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.iyl.5
            @Override // java.lang.Runnable
            public void run() {
                mswVar.run();
            }
        });
    }

    public static void ypw(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.qh.xq().removeCallbacks(runnable);
    }

    public static void ypw(final com.bytedance.sdk.component.msw.msw mswVar) {
        if (cuf.emc) {
            return;
        }
        vk().execute(new com.bytedance.sdk.component.msw.xq.ypw(mswVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.iyl.3
            @Override // java.lang.Runnable
            public void run() {
                mswVar.run();
            }
        });
    }

    public static void xq(final com.bytedance.sdk.component.msw.msw mswVar, int i10) {
        if (mswVar == null || cuf.emc) {
            return;
        }
        qh().execute(new com.bytedance.sdk.component.msw.xq.ypw(mswVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.iyl.8
            @Override // java.lang.Runnable
            public void run() {
                mswVar.run();
            }
        });
    }

    public static void ypw(final com.bytedance.sdk.component.msw.msw mswVar, int i10) {
        if (mswVar == null || cuf.emc) {
            return;
        }
        com.bytedance.sdk.component.msw.xq.ypw ypwVar = new com.bytedance.sdk.component.msw.xq.ypw(mswVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.iyl.6
            @Override // java.lang.Runnable
            public void run() {
                mswVar.run();
            }
        };
        ypwVar.emc(i10);
        sz().execute(ypwVar);
    }

    public static void emc(final com.bytedance.sdk.component.msw.msw mswVar) {
        if (cuf.emc) {
            return;
        }
        zz().execute(new com.bytedance.sdk.component.msw.xq.ypw(mswVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.iyl.2
            @Override // java.lang.Runnable
            public void run() {
                mswVar.run();
            }
        });
    }

    public static void emc(final com.bytedance.sdk.component.msw.msw mswVar, int i10) {
        if (mswVar == null || cuf.emc) {
            return;
        }
        com.bytedance.sdk.component.msw.xq.ypw ypwVar = new com.bytedance.sdk.component.msw.xq.ypw(mswVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.iyl.4
            @Override // java.lang.Runnable
            public void run() {
                mswVar.run();
            }
        };
        ypwVar.emc(i10);
        vk().execute(ypwVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.bytedance.sdk.component.msw.xq.ycc.emc ypw(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.iyl.ypw(java.lang.String):com.bytedance.sdk.component.msw.xq.ycc$emc");
    }

    public static void emc(com.bytedance.sdk.component.msw.xq.ypw ypwVar) {
        gbl().execute(ypwVar);
    }

    private static boolean emc(com.bytedance.sdk.component.msw.xq.ycc yccVar) {
        if (yccVar != null) {
            return !yccVar.emc() && com.bytedance.sdk.openadsdk.core.settings.gbl.kkn();
        }
        return true;
    }

    private static com.bytedance.sdk.component.msw.xq.ycc emc(String str, com.bytedance.sdk.component.msw.xq.ycc yccVar) {
        ycc.emc emcVarEmc = emc(str);
        if (yccVar == null) {
            return emcVarEmc.emc();
        }
        yccVar.emc(emcVarEmc);
        return yccVar;
    }

    private static ycc.emc emc(String str) {
        ycc.emc emcVarYpw = ypw(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.gbl.kkn()) {
                emcVarYpw.ypw(true);
                JSONObject jSONObjectYuz = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().yuz();
                JSONObject jSONObjectOptJSONObject = jSONObjectYuz != null ? jSONObjectYuz.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    emcVarYpw.ypw(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        emcVarYpw.emc(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        emcVarYpw.ypw(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        emcVarYpw.xq(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        emcVarYpw.emc(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        emcVarYpw.emc(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                    }
                }
            }
            return emcVarYpw;
        } catch (Throwable th) {
            th.getMessage();
            return emcVarYpw;
        }
    }
}
