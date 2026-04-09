package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.ov, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1663ov extends AbstractC1096eL {
    private static final C1663ov zzg;
    private static volatile CL zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        C1663ov c1663ov = new C1663ov();
        zzg = c1663ov;
        AbstractC1096eL.u(C1663ov.class, c1663ov);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iC == 3) {
            return new C1663ov();
        }
        if (iC == 4) {
            return new C1194g9(zzg);
        }
        if (iC == 5) {
            return zzg;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzh;
        if (cl != null) {
            return cl;
        }
        synchronized (C1663ov.class) {
            try {
                c1042dL = zzh;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzg);
                    zzh = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
