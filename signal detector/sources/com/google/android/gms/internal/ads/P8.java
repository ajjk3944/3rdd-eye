package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class P8 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final P8 zzh;
    private static volatile CL zzi;
    private int zzd;
    private String zze = "";
    private int zzf;
    private Q8 zzg;

    static {
        P8 p8 = new P8();
        zzh = p8;
        AbstractC1096eL.u(P8.class, p8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", J5.f9253x, "zzg"});
        }
        if (iC == 3) {
            return new P8();
        }
        if (iC == 4) {
            return new L5(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzi;
        if (cl != null) {
            return cl;
        }
        synchronized (P8.class) {
            try {
                c1042dL = zzi;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzh);
                    zzi = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
