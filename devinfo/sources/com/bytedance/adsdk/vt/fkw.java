package com.bytedance.adsdk.vt;

import android.content.Context;
import android.os.Trace;
import d.h;
import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    private static com.bytedance.adsdk.vt.yu.le bly = null;

    /* renamed from: cf, reason: collision with root package name */
    private static volatile com.bytedance.adsdk.vt.yu.pno f7036cf = null;
    private static String[] fkw = null;

    /* renamed from: le, reason: collision with root package name */
    private static long[] f7037le = null;

    /* renamed from: lh, reason: collision with root package name */
    private static boolean f7038lh = true;
    public static boolean ouw = false;
    private static int pno = 0;
    private static int ra = 0;
    private static volatile com.bytedance.adsdk.vt.yu.ra ryl = null;
    private static com.bytedance.adsdk.vt.yu.fkw tlj = null;
    private static boolean vt = false;
    private static boolean yu = true;

    public static void ouw(String str) {
        if (vt) {
            int i4 = ra;
            if (i4 == 20) {
                pno++;
                return;
            }
            fkw[i4] = str;
            f7037le[i4] = System.nanoTime();
            Trace.beginSection(str);
            ra++;
        }
    }

    public static float vt(String str) {
        int i4 = pno;
        if (i4 > 0) {
            pno = i4 - 1;
            return 0.0f;
        }
        if (!vt) {
            return 0.0f;
        }
        int i10 = ra - 1;
        ra = i10;
        if (i10 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(fkw[i10])) {
            throw new IllegalStateException(h.w(h.A("Unbalanced trace call ", str, ". Expected "), fkw[ra], "."));
        }
        Trace.endSection();
        return (System.nanoTime() - f7037le[ra]) / 1000000.0f;
    }

    public static com.bytedance.adsdk.vt.yu.pno ouw(Context context) {
        com.bytedance.adsdk.vt.yu.pno pnoVar;
        com.bytedance.adsdk.vt.yu.pno pnoVar2 = f7036cf;
        if (pnoVar2 != null) {
            return pnoVar2;
        }
        synchronized (com.bytedance.adsdk.vt.yu.pno.class) {
            try {
                pnoVar = f7036cf;
                if (pnoVar == null) {
                    com.bytedance.adsdk.vt.yu.ra raVarVt = vt(context);
                    com.bytedance.adsdk.vt.yu.le vtVar = bly;
                    if (vtVar == null) {
                        vtVar = new com.bytedance.adsdk.vt.yu.vt();
                    }
                    pnoVar = new com.bytedance.adsdk.vt.yu.pno(raVarVt, vtVar);
                    f7036cf = pnoVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pnoVar;
    }

    public static boolean ouw() {
        return yu;
    }

    private static com.bytedance.adsdk.vt.yu.ra vt(Context context) {
        com.bytedance.adsdk.vt.yu.ra raVar;
        if (!f7038lh) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.vt.yu.ra raVar2 = ryl;
        if (raVar2 != null) {
            return raVar2;
        }
        synchronized (com.bytedance.adsdk.vt.yu.ra.class) {
            try {
                raVar = ryl;
                if (raVar == null) {
                    com.bytedance.adsdk.vt.yu.fkw fkwVar = tlj;
                    if (fkwVar == null) {
                        fkwVar = new com.bytedance.adsdk.vt.yu.fkw() { // from class: com.bytedance.adsdk.vt.fkw.1
                            @Override // com.bytedance.adsdk.vt.yu.fkw
                            public final File ouw() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    raVar = new com.bytedance.adsdk.vt.yu.ra(fkwVar);
                    ryl = raVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return raVar;
    }
}
