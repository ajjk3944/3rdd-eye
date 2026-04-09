package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class YG extends AbstractC1096eL {
    private static final YG zzd;
    private static volatile CL zze;
    private int zza;
    private int zzb;
    private C0929bH zzc;

    static {
        YG yg = new YG();
        zzd = yg;
        AbstractC1096eL.u(YG.class, yg);
    }

    public static YG C(QK qk, XK xk) {
        return (YG) AbstractC1096eL.m(zzd, qk, xk);
    }

    public static XG D() {
        return (XG) zzd.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final C0929bH B() {
        C0929bH c0929bH = this.zzc;
        return c0929bH == null ? C0929bH.C() : c0929bH;
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void F(C0929bH c0929bH) {
        this.zzc = c0929bH;
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
            return new GL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new YG();
        }
        if (iC == 4) {
            return new XG(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zze;
        if (cl != null) {
            return cl;
        }
        synchronized (YG.class) {
            try {
                c1042dL = zze;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzd);
                    zze = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
