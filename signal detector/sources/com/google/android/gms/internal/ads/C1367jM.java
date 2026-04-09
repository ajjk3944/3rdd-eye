package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.jM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1367jM extends AbstractC1096eL {
    private static final C1367jM zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private QK zzd = QK.f10609b;

    static {
        C1367jM c1367jM = new C1367jM();
        zze = c1367jM;
        AbstractC1096eL.u(C1367jM.class, c1367jM);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", J5.f9230D, "zzc", "zzd"});
        }
        if (iC == 3) {
            return new C1367jM();
        }
        if (iC == 4) {
            return new C1194g9(zze);
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
        synchronized (C1367jM.class) {
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
