package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.nH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1578nH extends AbstractC1096eL {
    private static final C1578nH zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private C1793rH zzc;
    private QK zzd = QK.f10609b;

    static {
        C1578nH c1578nH = new C1578nH();
        zze = c1578nH;
        AbstractC1096eL.u(C1578nH.class, c1578nH);
    }

    public static C1578nH D(QK qk, XK xk) {
        return (C1578nH) AbstractC1096eL.m(zze, qk, xk);
    }

    public static C1524mH E() {
        return (C1524mH) zze.r();
    }

    public static CL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C1793rH B() {
        C1793rH c1793rH = this.zzc;
        return c1793rH == null ? C1793rH.C() : c1793rH;
    }

    public final QK C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(C1793rH c1793rH) {
        this.zzc = c1793rH;
        this.zza |= 1;
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
            return new GL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new C1578nH();
        }
        if (iC == 4) {
            return new C1524mH(zze);
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
        synchronized (C1578nH.class) {
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
