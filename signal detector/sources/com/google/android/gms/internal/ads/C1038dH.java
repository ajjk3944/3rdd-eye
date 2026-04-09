package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.dH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038dH extends AbstractC1096eL {
    private static final C1038dH zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private C1256hH zzc;
    private TH zzd;

    static {
        C1038dH c1038dH = new C1038dH();
        zze = c1038dH;
        AbstractC1096eL.u(C1038dH.class, c1038dH);
    }

    public static C1038dH D(QK qk, XK xk) {
        return (C1038dH) AbstractC1096eL.m(zze, qk, xk);
    }

    public static C0983cH E() {
        return (C0983cH) zze.r();
    }

    public static CL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C1256hH B() {
        C1256hH c1256hH = this.zzc;
        return c1256hH == null ? C1256hH.E() : c1256hH;
    }

    public final TH C() {
        TH th = this.zzd;
        return th == null ? TH.F() : th;
    }

    public final /* synthetic */ void G(C1256hH c1256hH) {
        this.zzc = c1256hH;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(TH th) {
        this.zzd = th;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new C1038dH();
        }
        if (iC == 4) {
            return new C0983cH(zze);
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
        synchronized (C1038dH.class) {
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
