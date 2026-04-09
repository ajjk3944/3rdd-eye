package com.bytedance.sdk.component.ypw.emc.ypw;

/* loaded from: classes.dex */
final class ycc {
    static bw emc;
    static long ypw;

    private ycc() {
    }

    public static bw emc() {
        synchronized (ycc.class) {
            bw bwVar = emc;
            if (bwVar == null) {
                return new bw();
            }
            emc = bwVar.ycc;
            bwVar.ycc = null;
            ypw -= 8192;
            return bwVar;
        }
    }

    public static void emc(bw bwVar) {
        if (bwVar.ycc == null && bwVar.uym == null) {
            if (bwVar.dg) {
                return;
            }
            synchronized (ycc.class) {
                try {
                    long j10 = ypw;
                    if (j10 + 8192 > 65536) {
                        return;
                    }
                    ypw = j10 + 8192;
                    bwVar.ycc = emc;
                    bwVar.xq = 0;
                    bwVar.ypw = 0;
                    emc = bwVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
