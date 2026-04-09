package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.y9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2163y9 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C2163y9 zzj;
    private static volatile CL zzk;
    private int zze;
    private int zzg;
    private Q8 zzi;
    private String zzf = "";
    private InterfaceC1314iL zzh = C1151fL.f14062e;

    static {
        C2163y9 c2163y9 = new C2163y9();
        zzj = c2163y9;
        AbstractC1096eL.u(C2163y9.class, c2163y9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", J5.f9253x, "zzh", "zzi"});
        }
        if (iC == 3) {
            return new C2163y9();
        }
        if (iC == 4) {
            return new C1194g9(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzk;
        if (cl != null) {
            return cl;
        }
        synchronized (C2163y9.class) {
            try {
                c1042dL = zzk;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzj);
                    zzk = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
