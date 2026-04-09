package com.bytedance.sdk.openadsdk.yu.ouw;

import android.content.Context;
import com.bytedance.sdk.component.le.ouw.ouw;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static AtomicInteger ouw = new AtomicInteger(0);
    public static final AtomicBoolean vt = new AtomicBoolean(false);

    public static void lh() {
        try {
            com.bytedance.sdk.component.le.ouw.vt.yu();
            com.bytedance.sdk.component.le.ouw.vt.fkw();
        } catch (Throwable th2) {
            qbp.lh("AdLogSwitchUtils", th2.getMessage());
        }
    }

    public static void ouw(Context context, boolean z3) {
        try {
            if (vt.compareAndSet(false, true)) {
                ouw.C0054ouw c0054ouw = new ouw.C0054ouw();
                c0054ouw.ouw = new ra();
                c0054ouw.f7545lh = com.bytedance.sdk.component.le.ouw.yu.vt.ouw.ouw();
                c0054ouw.yu = new com.bytedance.sdk.component.le.ouw.yu.vt.ouw(3);
                c0054ouw.vt = new com.bytedance.sdk.component.le.ouw.yu.vt.ouw(1);
                c0054ouw.f7544le = z3;
                c0054ouw.ra = new pno();
                c0054ouw.pno = fkw.ouw;
                com.bytedance.sdk.openadsdk.core.settings.cf cfVarYu = zih.yu();
                cfVarYu.ey();
                c0054ouw.f7543cf = cfVarYu.f8442cf;
                com.bytedance.sdk.openadsdk.core.settings.cf cfVarYu2 = zih.yu();
                cfVarYu2.ey();
                c0054ouw.tlj = cfVarYu2.tlj;
                c0054ouw.ryl = zih.yu().pno.ouw("perf_con_adlog_expire_time", 0L);
                com.bytedance.sdk.component.le.ouw.ouw ouwVar = new com.bytedance.sdk.component.le.ouw.ouw((byte) 0);
                ouwVar.vt = c0054ouw.ouw;
                ouwVar.f7535lh = c0054ouw.vt;
                ouwVar.yu = c0054ouw.f7545lh;
                ouwVar.fkw = c0054ouw.yu;
                ouwVar.f7534le = c0054ouw.fkw;
                ouwVar.pno = c0054ouw.f7544le;
                ouwVar.bly = c0054ouw.ra;
                ouwVar.ouw = c0054ouw.pno;
                ouwVar.tlj = c0054ouw.bly;
                ouwVar.ryl = c0054ouw.f7543cf;
                ouwVar.f7533cf = c0054ouw.tlj;
                ouwVar.mwh = c0054ouw.ryl;
                com.bytedance.sdk.component.le.ouw.vt.ouw(ouwVar, context);
                com.bytedance.sdk.component.le.ouw.vt.lh();
            }
        } catch (Throwable unused) {
            vt.set(false);
        }
    }

    public static void vt() {
        com.bytedance.sdk.component.le.ouw.vt.lh();
    }

    public static void ouw(com.bytedance.sdk.openadsdk.yu.ouw ouwVar) {
        com.bytedance.sdk.component.le.ouw.yu.ouw.ouw ouwVar2 = new com.bytedance.sdk.component.le.ouw.yu.ouw.ouw(ouwVar.ouw, ouwVar);
        ouwVar2.vt = ouwVar.le() ? (byte) 1 : (byte) 2;
        ouwVar2.ouw = (byte) 0;
        if (com.bytedance.sdk.component.le.ouw.vt.vt()) {
            ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh());
        }
        com.bytedance.sdk.component.le.ouw.vt.ouw(ouwVar2);
    }

    public static com.bytedance.sdk.openadsdk.rn.lh.lh ouw() {
        return bly.ouw;
    }

    public static void ouw(final List<String> list, final int i4, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("track") { // from class: com.bytedance.sdk.openadsdk.yu.ouw.vt.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.bytedance.sdk.component.le.ouw.vt.vt()) {
                    vt.ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh());
                }
                com.bytedance.sdk.component.le.ouw.vt.ouw(ryl.ouw(zih.ouw()), list, i4, str);
            }
        });
    }

    public static void ouw(String str) {
        ouw(str, false);
    }

    public static void ouw(String str, boolean z3) {
        if (com.bytedance.sdk.component.le.ouw.vt.vt()) {
            ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh());
        }
        com.bytedance.sdk.component.le.ouw.vt.ouw(str, z3);
    }
}
