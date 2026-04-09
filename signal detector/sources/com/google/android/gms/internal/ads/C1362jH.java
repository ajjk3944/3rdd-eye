package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.jH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362jH extends AbstractC1096eL {
    private static final C1362jH zzd;
    private static volatile CL zze;
    private int zza;
    private C1470lH zzb;
    private int zzc;

    static {
        C1362jH c1362jH = new C1362jH();
        zzd = c1362jH;
        AbstractC1096eL.u(C1362jH.class, c1362jH);
    }

    public static C1310iH C() {
        return (C1310iH) zzd.r();
    }

    public static C1362jH D() {
        return zzd;
    }

    public final C1470lH A() {
        C1470lH c1470lH = this.zzb;
        return c1470lH == null ? C1470lH.C() : c1470lH;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(C1470lH c1470lH) {
        this.zzb = c1470lH;
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
            return new C1362jH();
        }
        if (iC == 4) {
            return new C1310iH(zzd);
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
        synchronized (C1362jH.class) {
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
