package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.pI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1687pI extends AbstractC1096eL {
    private static final C1687pI zzb;
    private static volatile CL zzc;
    private String zza = "";

    static {
        C1687pI c1687pI = new C1687pI();
        zzb = c1687pI;
        AbstractC1096eL.u(C1687pI.class, c1687pI);
    }

    public static C1687pI B(QK qk, XK xk) {
        return (C1687pI) AbstractC1096eL.m(zzb, qk, xk);
    }

    public static C1633oI C() {
        return (C1633oI) zzb.r();
    }

    public static C1687pI D() {
        return zzb;
    }

    public final String A() {
        return this.zza;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iC == 3) {
            return new C1687pI();
        }
        if (iC == 4) {
            return new C1633oI(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzc;
        if (cl != null) {
            return cl;
        }
        synchronized (C1687pI.class) {
            try {
                c1042dL = zzc;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzb);
                    zzc = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
