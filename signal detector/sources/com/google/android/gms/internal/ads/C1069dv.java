package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.dv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069dv extends AbstractC1096eL {
    private static final C1069dv zzc;
    private static volatile CL zzd;
    private int zza;
    private C0906av zzb;

    static {
        C1069dv c1069dv = new C1069dv();
        zzc = c1069dv;
        AbstractC1096eL.u(C1069dv.class, c1069dv);
    }

    public static C1015cv A() {
        return (C1015cv) zzc.r();
    }

    public final /* synthetic */ void B(C0906av c0906av) {
        this.zzb = c0906av;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new C1069dv();
        }
        if (iC == 4) {
            return new C1015cv(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzd;
        if (cl != null) {
            return cl;
        }
        synchronized (C1069dv.class) {
            try {
                c1042dL = zzd;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzc);
                    zzd = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
