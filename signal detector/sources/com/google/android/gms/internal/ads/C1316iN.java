package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.iN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316iN extends AbstractC1096eL {
    private static final C1316iN zzd;
    private static volatile CL zze;
    private int zza;
    private String zzb = "";
    private InterfaceC1474lL zzc = FL.f8088e;

    static {
        C1316iN c1316iN = new C1316iN();
        zzd = c1316iN;
        AbstractC1096eL.u(C1316iN.class, c1316iN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zzb", "zzc", C1208gN.class});
        }
        if (iC == 3) {
            return new C1316iN();
        }
        if (iC == 4) {
            return new C1262hN(zzd);
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
        synchronized (C1316iN.class) {
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
