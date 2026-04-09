package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class DH extends AbstractC1096eL {
    private static final DH zza;
    private static volatile CL zzb;

    static {
        DH dh = new DH();
        zza = dh;
        AbstractC1096eL.u(DH.class, dh);
    }

    public static void A(QK qk, XK xk) {
    }

    public static DH B() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zza, "\u0000\u0000", null);
        }
        if (iC == 3) {
            return new DH();
        }
        if (iC == 4) {
            return new C1194g9(zza);
        }
        if (iC == 5) {
            return zza;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzb;
        if (cl != null) {
            return cl;
        }
        synchronized (DH.class) {
            try {
                c1042dL = zzb;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zza);
                    zzb = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
