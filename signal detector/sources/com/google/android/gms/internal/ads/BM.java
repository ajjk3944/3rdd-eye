package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class BM extends AbstractC1096eL {
    private static final BM zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        BM bm = new BM();
        zze = bm;
        AbstractC1096eL.u(BM.class, bm);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            C1421kM c1421kM = C1421kM.f15117g;
            return new GL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", c1421kM, "zzc", "zzd", c1421kM});
        }
        if (iC == 3) {
            return new BM();
        }
        if (iC == 4) {
            return new C1691pM(zze);
        }
        if (iC == 5) {
            return zze;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzf;
        if (cl != null) {
            return cl;
        }
        synchronized (BM.class) {
            try {
                c1042dL = zzf;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zze);
                    zzf = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
