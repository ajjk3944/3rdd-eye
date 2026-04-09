package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.pH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1686pH extends AbstractC1096eL {
    private static final C1686pH zzd;
    private static volatile CL zze;
    private int zza;
    private C1793rH zzb;
    private int zzc;

    static {
        C1686pH c1686pH = new C1686pH();
        zzd = c1686pH;
        AbstractC1096eL.u(C1686pH.class, c1686pH);
    }

    public static C1686pH C(QK qk, XK xk) {
        return (C1686pH) AbstractC1096eL.m(zzd, qk, xk);
    }

    public static C1632oH D() {
        return (C1632oH) zzd.r();
    }

    public final C1793rH A() {
        C1793rH c1793rH = this.zzb;
        return c1793rH == null ? C1793rH.C() : c1793rH;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(C1793rH c1793rH) {
        this.zzb = c1793rH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
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
            return new GL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new C1686pH();
        }
        if (iC == 4) {
            return new C1632oH(zzd);
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
        synchronized (C1686pH.class) {
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
