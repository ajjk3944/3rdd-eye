package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class PI extends AbstractC1096eL {
    private static final PI zzd;
    private static volatile CL zze;
    private int zza;
    private int zzb;
    private RI zzc;

    static {
        PI pi = new PI();
        zzd = pi;
        AbstractC1096eL.u(PI.class, pi);
    }

    public static PI C(QK qk, XK xk) {
        return (PI) AbstractC1096eL.m(zzd, qk, xk);
    }

    public static OI D() {
        return (OI) zzd.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final RI B() {
        RI ri = this.zzc;
        return ri == null ? RI.C() : ri;
    }

    public final /* synthetic */ void E(RI ri) {
        this.zzc = ri;
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
            return new GL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new PI();
        }
        if (iC == 4) {
            return new OI(zzd);
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
        synchronized (PI.class) {
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
