package com.bytedance.sdk.component.ycc.emc.ypw;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.emc.bw;
import com.bytedance.sdk.component.ycc.emc.msw;

/* loaded from: classes.dex */
public class emc {
    public static boolean bw() {
        bw bwVarDg = msw.uym().dg();
        return (bwVarDg == null || TextUtils.isEmpty(bwVarDg.xq())) ? false : true;
    }

    public static boolean dg() {
        bw bwVarDg = msw.uym().dg();
        return (bwVarDg == null || TextUtils.isEmpty(bwVarDg.bw())) ? false : true;
    }

    public static long emc(int i10, Context context) {
        return ypw(i10, context);
    }

    public static boolean xq() {
        bw bwVarDg = msw.uym().dg();
        return (bwVarDg == null || TextUtils.isEmpty(bwVarDg.dg())) ? false : true;
    }

    public static boolean ycc() {
        bw bwVarDg = msw.uym().dg();
        return (bwVarDg == null || TextUtils.isEmpty(bwVarDg.ycc())) ? false : true;
    }

    private static long ypw(int i10, Context context) {
        if (context == null) {
            return i10;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i10, 10) : Math.min((jFreeMemory / 2) * 10, i10);
        }
        long j10 = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j10 <= 2) {
            return 1L;
        }
        return j10 <= 10 ? Math.min(i10, 10) : Math.min(j10 * 10, i10);
    }

    public static boolean emc() {
        bw bwVarDg = msw.uym().dg();
        return (bwVarDg == null || TextUtils.isEmpty(bwVarDg.emc())) ? false : true;
    }

    public static boolean ypw() {
        bw bwVarDg = msw.uym().dg();
        return (bwVarDg == null || TextUtils.isEmpty(bwVarDg.ypw())) ? false : true;
    }
}
