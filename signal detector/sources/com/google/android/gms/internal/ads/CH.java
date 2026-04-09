package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class CH extends AbstractC1096eL {
    private static final CH zzc;
    private static volatile CL zzd;
    private int zza;
    private QK zzb = QK.f10609b;

    static {
        CH ch = new CH();
        zzc = ch;
        AbstractC1096eL.u(CH.class, ch);
    }

    public static CH C(QK qk, XK xk) {
        return (CH) AbstractC1096eL.m(zzc, qk, xk);
    }

    public static AH D() {
        return (AH) zzc.r();
    }

    public static CL E() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final QK B() {
        return this.zzb;
    }

    public final /* synthetic */ void F(QK qk) {
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
            return new CH();
        }
        if (iC == 4) {
            return new AH(zzc);
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
        synchronized (CH.class) {
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
