package com.bytedance.sdk.component.le.ouw;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class pno {

    /* renamed from: jg, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.le.ouw.fkw.ouw f7552jg;
    private static pno ko;
    public volatile fkw bly;

    /* renamed from: cf, reason: collision with root package name */
    public volatile Map<Integer, com.bytedance.sdk.component.le.ouw.vt.lh> f7553cf;
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw fkw;

    /* renamed from: le, reason: collision with root package name */
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw f7554le;

    /* renamed from: lh, reason: collision with root package name */
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw f7555lh;
    long mwh;
    public volatile Context ouw;
    public volatile boolean pno;
    public volatile com.bytedance.sdk.component.le.ouw.ouw.fkw ra;
    public final AtomicBoolean ryl = new AtomicBoolean(false);
    public volatile com.bytedance.sdk.component.le.ouw.vt.lh tlj;
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw vt;
    public volatile com.bytedance.sdk.component.le.ouw.yu.vt.ouw yu;

    private pno() {
    }

    public static void lh() {
        final com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        yuVar.vt();
        fkw fkwVar = vt().bly;
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        final com.bytedance.sdk.component.le.ouw.vt.lh.lh lhVar = yuVar.vt;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (lhVar != null) {
                lhVar.lh(2);
                return;
            }
            return;
        }
        fkw fkwVar2 = vt().bly;
        if (fkwVar2 == null) {
            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
            return;
        }
        Executor executorOuw = fkwVar2.ouw();
        if (executorOuw == null) {
            executorOuw = fkwVar2.vt();
        }
        if (executorOuw != null) {
            final String str = "flush";
            executorOuw.execute(new com.bytedance.sdk.component.le.ouw.fkw.fkw(str) { // from class: com.bytedance.sdk.component.le.ouw.vt.yu.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.le.ouw.vt.lh.lh lhVar2 = lhVar;
                    if (lhVar2 != null) {
                        lhVar2.lh(2);
                    }
                }
            });
        }
    }

    public static synchronized pno vt() {
        try {
            if (ko == null) {
                ko = new pno();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ko;
    }

    public static void yu() {
        com.bytedance.sdk.component.le.ouw.vt.yu.ouw.ouw();
    }

    public final long fkw() {
        return this.mwh * 86400000;
    }

    public final void ouw(boolean z3) {
        this.ryl.set(z3);
    }

    public static com.bytedance.sdk.component.le.ouw.fkw.ouw ouw() {
        if (f7552jg == null) {
            synchronized (pno.class) {
                try {
                    if (f7552jg == null) {
                        f7552jg = new com.bytedance.sdk.component.le.ouw.fkw.vt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7552jg;
    }

    public static void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar) {
        if (ouwVar == null) {
            return;
        }
        ouwVar.ouw(System.currentTimeMillis());
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        ouwVar.yu();
        yuVar.vt();
        fkw fkwVar = vt().bly;
        com.bytedance.sdk.component.le.ouw.vt.lh.lh lhVar = yuVar.vt;
        if (lhVar != null) {
            boolean z3 = ouwVar.fkw() == 4;
            ouwVar.yu();
            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            if (z3) {
                if (lhVar.yu != null) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(ouwVar);
                    lhVar.ouw((List<com.bytedance.sdk.component.le.ouw.yu.ouw>) arrayList, true);
                    return;
                }
                com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                return;
            }
            lhVar.f7561lh.add(ouwVar);
            lhVar.yu(2);
        }
    }

    public static void ouw(String str, boolean z3) {
        com.bytedance.sdk.component.le.ouw.le.ouw.ouw().ouw(str, z3);
    }

    public static void ouw(String str, List<String> list, Map<String, String> map, int i4, String str2) {
        com.bytedance.sdk.component.le.ouw.le.ouw.ouw().ouw(str, list, true, map, i4, str2);
    }
}
