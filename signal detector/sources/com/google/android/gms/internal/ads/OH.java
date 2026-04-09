package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class OH extends AbstractC1096eL {
    private static final OH zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private QK zzc = QK.f10609b;
    private QH zzd;

    static {
        OH oh = new OH();
        zze = oh;
        AbstractC1096eL.u(OH.class, oh);
    }

    public static OH D(QK qk, XK xk) {
        return (OH) AbstractC1096eL.m(zze, qk, xk);
    }

    public static NH E() {
        return (NH) zze.r();
    }

    public static CL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final QK B() {
        return this.zzc;
    }

    public final QH C() {
        QH qh = this.zzd;
        return qh == null ? QH.E() : qh;
    }

    public final /* synthetic */ void G(QK qk) {
        this.zzc = qk;
    }

    public final /* synthetic */ void H(QH qh) {
        this.zzd = qh;
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
            return new GL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new OH();
        }
        if (iC == 4) {
            return new NH(zze);
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
        synchronized (OH.class) {
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
