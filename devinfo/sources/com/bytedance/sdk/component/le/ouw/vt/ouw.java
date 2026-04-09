package com.bytedance.sdk.component.le.ouw.vt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.ouw.fkw;
import com.bytedance.sdk.component.le.ouw.pno;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static boolean fkw() {
        fkw fkwVar = pno.vt().ra;
        return (fkwVar == null || TextUtils.isEmpty(fkwVar.lh())) ? false : true;
    }

    public static boolean le() {
        fkw fkwVar = pno.vt().ra;
        return (fkwVar == null || TextUtils.isEmpty(fkwVar.le())) ? false : true;
    }

    public static boolean lh() {
        fkw fkwVar = pno.vt().ra;
        return (fkwVar == null || TextUtils.isEmpty(fkwVar.yu())) ? false : true;
    }

    public static long ouw(int i4, Context context) {
        long jVt = vt(i4, context);
        "ad limit by memory:".concat(String.valueOf(jVt));
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        return jVt;
    }

    private static long vt(int i4, Context context) {
        if (context == null) {
            return i4;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i4, 10) : Math.min((jFreeMemory / 2) * 10, i4);
        }
        long j = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        return j <= 10 ? Math.min(i4, 10) : Math.min(j * 10, i4);
    }

    public static boolean yu() {
        fkw fkwVar = pno.vt().ra;
        return (fkwVar == null || TextUtils.isEmpty(fkwVar.fkw())) ? false : true;
    }

    public static boolean ouw() {
        fkw fkwVar = pno.vt().ra;
        return (fkwVar == null || TextUtils.isEmpty(fkwVar.ouw())) ? false : true;
    }

    public static boolean vt() {
        fkw fkwVar = pno.vt().ra;
        return (fkwVar == null || TextUtils.isEmpty(fkwVar.vt())) ? false : true;
    }
}
