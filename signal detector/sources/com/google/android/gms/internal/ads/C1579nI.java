package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.nI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1579nI extends AbstractC1096eL {
    private static final C1579nI zzd;
    private static volatile CL zze;
    private int zza;
    private int zzb;
    private C1687pI zzc;

    static {
        C1579nI c1579nI = new C1579nI();
        zzd = c1579nI;
        AbstractC1096eL.u(C1579nI.class, c1579nI);
    }

    public static C1579nI C(QK qk, XK xk) {
        return (C1579nI) AbstractC1096eL.m(zzd, qk, xk);
    }

    public static C1525mI D() {
        return (C1525mI) zzd.r();
    }

    public static CL E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C1687pI B() {
        C1687pI c1687pI = this.zzc;
        return c1687pI == null ? C1687pI.D() : c1687pI;
    }

    public final /* synthetic */ void F(C1687pI c1687pI) {
        this.zzc = c1687pI;
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
            return new C1579nI();
        }
        if (iC == 4) {
            return new C1525mI(zzd);
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
        synchronized (C1579nI.class) {
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
