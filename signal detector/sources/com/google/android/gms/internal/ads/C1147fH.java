package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.fH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147fH extends AbstractC1096eL {
    private static final C1147fH zzd;
    private static volatile CL zze;
    private int zza;
    private C1362jH zzb;
    private VH zzc;

    static {
        C1147fH c1147fH = new C1147fH();
        zzd = c1147fH;
        AbstractC1096eL.u(C1147fH.class, c1147fH);
    }

    public static C1147fH C(QK qk, XK xk) {
        return (C1147fH) AbstractC1096eL.m(zzd, qk, xk);
    }

    public static C1092eH D() {
        return (C1092eH) zzd.r();
    }

    public final C1362jH A() {
        C1362jH c1362jH = this.zzb;
        return c1362jH == null ? C1362jH.D() : c1362jH;
    }

    public final VH B() {
        VH vh = this.zzc;
        return vh == null ? VH.F() : vh;
    }

    public final /* synthetic */ void E(C1362jH c1362jH) {
        this.zzb = c1362jH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(VH vh) {
        this.zzc = vh;
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
            return new GL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new C1147fH();
        }
        if (iC == 4) {
            return new C1092eH(zzd);
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
        synchronized (C1147fH.class) {
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
