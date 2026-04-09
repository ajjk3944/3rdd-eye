package com.bytedance.sdk.openadsdk.tc.ouw;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {

    /* renamed from: lh, reason: collision with root package name */
    public static String f8661lh = "engaged_view";
    public static boolean ouw = false;
    public static int vt = 6;

    private static vt lh(vpp vppVar) {
        if (vppVar == null || !vppVar.mt()) {
            return null;
        }
        return vppVar.sn;
    }

    public static void ouw(vpp vppVar) {
        vt vtVarLh = lh(vppVar);
        if (vtVarLh != null && vtVarLh.yu.get() == 0) {
            vtVarLh.ouw = vtVarLh.vt.xdk() * 1000;
            vtVarLh.yu.set(1);
            vtVarLh.fkw = SystemClock.elapsedRealtime();
            Handler handlerOuw = ouw.ouw();
            if (handlerOuw != null) {
                handlerOuw.postDelayed(vtVarLh.ra, vtVarLh.ouw);
            }
        }
    }

    public static void vt(vpp vppVar) {
        vt vtVarLh = lh(vppVar);
        if (vtVarLh == null) {
            return;
        }
        vtVarLh.ouw();
    }

    public static void ouw(vpp vppVar, int i4) {
        vt vtVarLh = lh(vppVar);
        if (vtVarLh == null || vtVarLh.vt()) {
            return;
        }
        vtVarLh.ouw(i4);
    }

    public static void ouw(vpp vppVar, boolean z3) {
        vt vtVarLh = lh(vppVar);
        if (vtVarLh == null || vtVarLh.vt()) {
            return;
        }
        vtVarLh.f8663lh.set(z3);
        vtVarLh.ouw(z3 ? 4 : 8);
    }
}
