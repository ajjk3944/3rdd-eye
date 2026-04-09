package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.hH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1256hH extends AbstractC1096eL {
    private static final C1256hH zze;
    private static volatile CL zzf;
    private int zza;
    private int zzb;
    private C1470lH zzc;
    private QK zzd = QK.f10609b;

    static {
        C1256hH c1256hH = new C1256hH();
        zze = c1256hH;
        AbstractC1096eL.u(C1256hH.class, c1256hH);
    }

    public static C1202gH D() {
        return (C1202gH) zze.r();
    }

    public static C1256hH E() {
        return zze;
    }

    public final int A() {
        return this.zzb;
    }

    public final C1470lH B() {
        C1470lH c1470lH = this.zzc;
        return c1470lH == null ? C1470lH.C() : c1470lH;
    }

    public final QK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(C1470lH c1470lH) {
        this.zzc = c1470lH;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(QK qk) {
        this.zzd = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new C1256hH();
        }
        if (iC == 4) {
            return new C1202gH(zze);
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
        synchronized (C1256hH.class) {
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
