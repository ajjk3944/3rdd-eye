package com.bytedance.sdk.component.vt.ouw.vt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class le {
    static fkw ouw;
    static long vt;

    private le() {
    }

    public static fkw ouw() {
        synchronized (le.class) {
            fkw fkwVar = ouw;
            if (fkwVar == null) {
                return new fkw();
            }
            ouw = fkwVar.f7669le;
            fkwVar.f7669le = null;
            vt -= 8192;
            return fkwVar;
        }
    }

    public static void ouw(fkw fkwVar) {
        if (fkwVar.f7669le == null && fkwVar.ra == null) {
            if (fkwVar.yu) {
                return;
            }
            synchronized (le.class) {
                try {
                    long j = vt;
                    if (j + 8192 > 65536) {
                        return;
                    }
                    vt = j + 8192;
                    fkwVar.f7669le = ouw;
                    fkwVar.f7670lh = 0;
                    fkwVar.vt = 0;
                    ouw = fkwVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
