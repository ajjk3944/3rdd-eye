package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1191g6 extends AbstractC1096eL {
    private static final C1191g6 zzl;
    private static volatile CL zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private InterfaceC1314iL zze = C1151fL.f14062e;
    private InterfaceC1474lL zzh = FL.f8088e;

    static {
        C1191g6 c1191g6 = new C1191g6();
        zzl = c1191g6;
        AbstractC1096eL.u(C1191g6.class, c1191g6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", C1351j6.class, "zzi", "zzj", "zzk"});
        }
        if (iC == 3) {
            return new C1191g6();
        }
        if (iC == 4) {
            return new L5(zzl);
        }
        if (iC == 5) {
            return zzl;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzm;
        if (cl != null) {
            return cl;
        }
        synchronized (C1191g6.class) {
            try {
                c1042dL = zzm;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzl);
                    zzm = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
