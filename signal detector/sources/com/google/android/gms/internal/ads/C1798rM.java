package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.rM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1798rM extends AbstractC1096eL {
    private static final C1798rM zzc;
    private static volatile CL zzd;
    private int zza;
    private QK zzb = QK.f10609b;

    static {
        C1798rM c1798rM = new C1798rM();
        zzc = c1798rM;
        AbstractC1096eL.u(C1798rM.class, c1798rM);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new C1798rM();
        }
        if (iC == 4) {
            return new C1691pM(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzd;
        if (cl != null) {
            return cl;
        }
        synchronized (C1798rM.class) {
            try {
                c1042dL = zzd;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzc);
                    zzd = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
