package com.bytedance.adsdk.ypw;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* loaded from: classes.dex */
public class bw {
    private static String[] bw = null;
    private static boolean dg = true;
    public static boolean emc = false;
    private static volatile com.bytedance.adsdk.ypw.dg.msw gbl = null;
    private static int msw = 0;
    private static com.bytedance.adsdk.ypw.dg.bw ru = null;
    private static volatile com.bytedance.adsdk.ypw.dg.uym sup = null;
    private static int uym = 0;
    private static boolean xq = true;
    private static long[] ycc = null;
    private static boolean ypw = false;
    private static com.bytedance.adsdk.ypw.dg.ycc zz;

    public static void emc(String str) {
        if (ypw) {
            int i10 = uym;
            if (i10 == 20) {
                msw++;
                return;
            }
            bw[i10] = str;
            ycc[i10] = System.nanoTime();
            Trace.beginSection(str);
            uym++;
        }
    }

    public static float ypw(String str) {
        int i10 = msw;
        if (i10 > 0) {
            msw = i10 - 1;
            return 0.0f;
        }
        if (!ypw) {
            return 0.0f;
        }
        int i11 = uym - 1;
        uym = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(bw[i11])) {
            Trace.endSection();
            return (System.nanoTime() - ycc[uym]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + bw[uym] + ".");
    }

    public static com.bytedance.adsdk.ypw.dg.msw emc(Context context) {
        com.bytedance.adsdk.ypw.dg.msw mswVar;
        com.bytedance.adsdk.ypw.dg.msw mswVar2 = gbl;
        if (mswVar2 != null) {
            return mswVar2;
        }
        synchronized (com.bytedance.adsdk.ypw.dg.msw.class) {
            try {
                mswVar = gbl;
                if (mswVar == null) {
                    com.bytedance.adsdk.ypw.dg.uym uymVarYpw = ypw(context);
                    com.bytedance.adsdk.ypw.dg.ycc ypwVar = zz;
                    if (ypwVar == null) {
                        ypwVar = new com.bytedance.adsdk.ypw.dg.ypw();
                    }
                    mswVar = new com.bytedance.adsdk.ypw.dg.msw(uymVarYpw, ypwVar);
                    gbl = mswVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mswVar;
    }

    public static com.bytedance.adsdk.ypw.dg.uym ypw(Context context) {
        com.bytedance.adsdk.ypw.dg.uym uymVar;
        if (!xq) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.ypw.dg.uym uymVar2 = sup;
        if (uymVar2 != null) {
            return uymVar2;
        }
        synchronized (com.bytedance.adsdk.ypw.dg.uym.class) {
            try {
                uymVar = sup;
                if (uymVar == null) {
                    com.bytedance.adsdk.ypw.dg.bw bwVar = ru;
                    if (bwVar == null) {
                        bwVar = new com.bytedance.adsdk.ypw.dg.bw() { // from class: com.bytedance.adsdk.ypw.bw.1
                            @Override // com.bytedance.adsdk.ypw.dg.bw
                            public File emc() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    uymVar = new com.bytedance.adsdk.ypw.dg.uym(bwVar);
                    sup = uymVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uymVar;
    }

    public static boolean emc() {
        return dg;
    }
}
