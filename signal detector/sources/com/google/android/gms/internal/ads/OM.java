package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class OM extends AbstractC1096eL {
    private static final OM zzd;
    private static volatile CL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        OM om = new OM();
        zzd = om;
        AbstractC1096eL.u(OM.class, om);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            C1421kM c1421kM = C1421kM.f15123n;
            return new GL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", c1421kM, "zzc", c1421kM});
        }
        if (iC == 3) {
            return new OM();
        }
        if (iC == 4) {
            return new C1691pM(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zze;
        if (cl != null) {
            return cl;
        }
        synchronized (OM.class) {
            try {
                c1042dL = zze;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzd);
                    zze = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
