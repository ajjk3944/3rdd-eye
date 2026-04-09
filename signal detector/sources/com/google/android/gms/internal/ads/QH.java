package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class QH extends AbstractC1096eL {
    private static final QH zzc;
    private static volatile CL zzd;
    private int zza;
    private QK zzb = QK.f10609b;

    static {
        QH qh = new QH();
        zzc = qh;
        AbstractC1096eL.u(QH.class, qh);
    }

    public static QH C(QK qk, XK xk) {
        return (QH) AbstractC1096eL.m(zzc, qk, xk);
    }

    public static PH D() {
        return (PH) zzc.r();
    }

    public static QH E() {
        return zzc;
    }

    public static CL F() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final QK B() {
        return this.zzb;
    }

    public final /* synthetic */ void G(QK qk) {
        this.zzb = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new QH();
        }
        if (iC == 4) {
            return new PH(zzc);
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
        synchronized (QH.class) {
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
