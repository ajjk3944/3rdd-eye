package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.rI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1794rI extends AbstractC1096eL {
    private static final C1794rI zzd;
    private static volatile CL zze;
    private int zza;
    private int zzb;
    private C1902tI zzc;

    static {
        C1794rI c1794rI = new C1794rI();
        zzd = c1794rI;
        AbstractC1096eL.u(C1794rI.class, c1794rI);
    }

    public static C1794rI C(QK qk, XK xk) {
        return (C1794rI) AbstractC1096eL.m(zzd, qk, xk);
    }

    public static C1741qI D() {
        return (C1741qI) zzd.r();
    }

    public static CL E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C1902tI B() {
        C1902tI c1902tI = this.zzc;
        return c1902tI == null ? C1902tI.E() : c1902tI;
    }

    public final /* synthetic */ void F(C1902tI c1902tI) {
        this.zzc = c1902tI;
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
            return new C1794rI();
        }
        if (iC == 4) {
            return new C1741qI(zzd);
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
        synchronized (C1794rI.class) {
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
