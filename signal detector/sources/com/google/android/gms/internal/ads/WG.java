package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class WG extends AbstractC1096eL {
    private static final WG zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private QK zzc = QK.f10609b;
    private C0929bH zzd;

    static {
        WG wg = new WG();
        zze = wg;
        AbstractC1096eL.u(WG.class, wg);
    }

    public static WG D(QK qk, XK xk) {
        return (WG) AbstractC1096eL.m(zze, qk, xk);
    }

    public static VG E() {
        return (VG) zze.r();
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

    public final C0929bH C() {
        C0929bH c0929bH = this.zzd;
        return c0929bH == null ? C0929bH.C() : c0929bH;
    }

    public final /* synthetic */ void G(QK qk) {
        this.zzc = qk;
    }

    public final /* synthetic */ void H(C0929bH c0929bH) {
        this.zzd = c0929bH;
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
            return new WG();
        }
        if (iC == 4) {
            return new VG(zze);
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
        synchronized (WG.class) {
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
