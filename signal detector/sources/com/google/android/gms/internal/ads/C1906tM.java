package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.tM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1906tM extends AbstractC1096eL {
    private static final C1906tM zzf;
    private static volatile CL zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    static {
        C1906tM c1906tM = new C1906tM();
        zzf = c1906tM;
        AbstractC1096eL.u(C1906tM.class, c1906tM);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", C1421kM.f15116f, "zzc", C1421kM.f15115e, "zzd", "zze"});
        }
        if (iC == 3) {
            return new C1906tM();
        }
        if (iC == 4) {
            return new C1691pM(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzg;
        if (cl != null) {
            return cl;
        }
        synchronized (C1906tM.class) {
            try {
                c1042dL = zzg;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzf);
                    zzg = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
