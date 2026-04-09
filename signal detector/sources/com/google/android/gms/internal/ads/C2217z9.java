package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2217z9 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C2217z9 zzf;
    private static volatile CL zzg;
    private int zzc;
    private int zzd;
    private InterfaceC1314iL zze = C1151fL.f14062e;

    static {
        C2217z9 c2217z9 = new C2217z9();
        zzf = c2217z9;
        AbstractC1096eL.u(C2217z9.class, c2217z9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzc", "zzd", J5.f9253x, "zze"});
        }
        if (iC == 3) {
            return new C2217z9();
        }
        if (iC == 4) {
            return new C1194g9(zzf);
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
        synchronized (C2217z9.class) {
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
