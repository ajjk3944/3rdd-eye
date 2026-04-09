package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class LI extends AbstractC1096eL {
    private static final LI zzf;
    private static volatile CL zzg;
    private int zza;
    private int zzb;
    private HI zzc;
    private QK zzd;
    private QK zze;

    static {
        LI li = new LI();
        zzf = li;
        AbstractC1096eL.u(LI.class, li);
    }

    public LI() {
        OK ok = QK.f10609b;
        this.zzd = ok;
        this.zze = ok;
    }

    public static LI E(QK qk, XK xk) {
        return (LI) AbstractC1096eL.m(zzf, qk, xk);
    }

    public static KI F() {
        return (KI) zzf.r();
    }

    public static LI G() {
        return zzf;
    }

    public static CL H() {
        return zzf.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final HI B() {
        HI hi = this.zzc;
        return hi == null ? HI.E() : hi;
    }

    public final QK C() {
        return this.zzd;
    }

    public final QK D() {
        return this.zze;
    }

    public final /* synthetic */ void I(int i) {
        this.zzb = 0;
    }

    public final /* synthetic */ void J(HI hi) {
        this.zzc = hi;
        this.zza |= 1;
    }

    public final /* synthetic */ void K(OK ok) {
        this.zzd = ok;
    }

    public final /* synthetic */ void L(OK ok) {
        this.zze = ok;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new LI();
        }
        if (iC == 4) {
            return new KI(zzf);
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
        synchronized (LI.class) {
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
