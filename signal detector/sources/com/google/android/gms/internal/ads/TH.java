package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class TH extends AbstractC1096eL {
    private static final TH zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private XH zzc;
    private QK zzd = QK.f10609b;

    static {
        TH th = new TH();
        zze = th;
        AbstractC1096eL.u(TH.class, th);
    }

    public static TH D(QK qk, XK xk) {
        return (TH) AbstractC1096eL.m(zze, qk, xk);
    }

    public static SH E() {
        return (SH) zze.r();
    }

    public static TH F() {
        return zze;
    }

    public static CL G() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final XH B() {
        XH xh = this.zzc;
        return xh == null ? XH.D() : xh;
    }

    public final QK C() {
        return this.zzd;
    }

    public final /* synthetic */ void H(XH xh) {
        this.zzc = xh;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(QK qk) {
        this.zzd = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new TH();
        }
        if (iC == 4) {
            return new SH(zze);
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
        synchronized (TH.class) {
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
