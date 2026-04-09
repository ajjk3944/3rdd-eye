package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class FI extends AbstractC1096eL {
    private static final FI zze;
    private static volatile CL zzf;
    private int zza;
    private HI zzb;
    private int zzc;
    private QK zzd = QK.f10609b;

    static {
        FI fi = new FI();
        zze = fi;
        AbstractC1096eL.u(FI.class, fi);
    }

    public static FI D(QK qk, XK xk) {
        return (FI) AbstractC1096eL.m(zze, qk, xk);
    }

    public static EI E() {
        return (EI) zze.r();
    }

    public final HI A() {
        HI hi = this.zzb;
        return hi == null ? HI.E() : hi;
    }

    public final int B() {
        return this.zzc;
    }

    public final QK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(HI hi) {
        this.zzb = hi;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void H(OK ok) {
        this.zzd = ok;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new FI();
        }
        if (iC == 4) {
            return new EI(zze);
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
        synchronized (FI.class) {
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
