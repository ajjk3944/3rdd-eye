package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351j6 extends AbstractC1096eL {
    private static final C1351j6 zze;
    private static volatile CL zzf;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;

    static {
        C1351j6 c1351j6 = new C1351j6();
        zze = c1351j6;
        AbstractC1096eL.u(C1351j6.class, c1351j6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new C1351j6();
        }
        if (iC == 4) {
            return new L5(zze);
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
        synchronized (C1351j6.class) {
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
