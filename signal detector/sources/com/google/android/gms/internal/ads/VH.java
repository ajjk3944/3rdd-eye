package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class VH extends AbstractC1096eL {
    private static final VH zze;
    private static volatile CL zzf;
    private int zza;
    private XH zzb;
    private int zzc;
    private int zzd;

    static {
        VH vh = new VH();
        zze = vh;
        AbstractC1096eL.u(VH.class, vh);
    }

    public static VH D(QK qk, XK xk) {
        return (VH) AbstractC1096eL.m(zze, qk, xk);
    }

    public static UH E() {
        return (UH) zze.r();
    }

    public static VH F() {
        return zze;
    }

    public final XH A() {
        XH xh = this.zzb;
        return xh == null ? XH.D() : xh;
    }

    public final int B() {
        return this.zzc;
    }

    public final int C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(XH xh) {
        this.zzb = xh;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new VH();
        }
        if (iC == 4) {
            return new UH(zze);
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
        synchronized (VH.class) {
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
