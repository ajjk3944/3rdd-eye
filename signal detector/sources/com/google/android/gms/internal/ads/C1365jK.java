package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.jK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365jK extends AbstractC1096eL {
    private static final C1365jK zzf;
    private static volatile CL zzg;
    private int zza;
    private QK zzb = QK.f10609b;
    private String zzc = "";
    private InterfaceC1474lL zzd = FL.f8088e;
    private boolean zze;

    static {
        C1365jK c1365jK = new C1365jK();
        zzf = c1365jK;
        AbstractC1096eL.u(C1365jK.class, c1365jK);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (iC == 3) {
            return new C1365jK();
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
        synchronized (C1365jK.class) {
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
