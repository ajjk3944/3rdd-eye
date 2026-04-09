package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.tI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1902tI extends AbstractC1096eL {
    private static final C1902tI zzd;
    private static volatile CL zze;
    private int zza;
    private String zzb = "";
    private C0984cI zzc;

    static {
        C1902tI c1902tI = new C1902tI();
        zzd = c1902tI;
        AbstractC1096eL.u(C1902tI.class, c1902tI);
    }

    public static C1902tI C(QK qk, XK xk) {
        return (C1902tI) AbstractC1096eL.m(zzd, qk, xk);
    }

    public static C1848sI D() {
        return (C1848sI) zzd.r();
    }

    public static C1902tI E() {
        return zzd;
    }

    public final String A() {
        return this.zzb;
    }

    public final C0984cI B() {
        C0984cI c0984cI = this.zzc;
        return c0984cI == null ? C0984cI.F() : c0984cI;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void G(C0984cI c0984cI) {
        c0984cI.getClass();
        this.zzc = c0984cI;
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
            return new GL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new C1902tI();
        }
        if (iC == 4) {
            return new C1848sI(zzd);
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
        synchronized (C1902tI.class) {
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
