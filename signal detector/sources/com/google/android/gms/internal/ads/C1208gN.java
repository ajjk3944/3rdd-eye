package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.gN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1208gN extends AbstractC1096eL {
    private static final C1208gN zze;
    private static volatile CL zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        C1208gN c1208gN = new C1208gN();
        zze = c1208gN;
        AbstractC1096eL.u(C1208gN.class, c1208gN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", C1421kM.f15132w, "zzd"});
        }
        if (iC == 3) {
            return new C1208gN();
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
        synchronized (C1208gN.class) {
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
