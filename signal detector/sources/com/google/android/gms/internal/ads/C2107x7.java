package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.x7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2107x7 extends AbstractC1096eL {
    private static final C2107x7 zzf;
    private static volatile CL zzg;
    private int zza;
    private A7 zzb;
    private QK zzc = QK.f10609b;
    private long zzd;
    private long zze;

    static {
        C2107x7 c2107x7 = new C2107x7();
        zzf = c2107x7;
        AbstractC1096eL.u(C2107x7.class, c2107x7);
    }

    public static C2107x7 D() {
        return zzf;
    }

    public final A7 A() {
        A7 a7 = this.zzb;
        return a7 == null ? A7.C() : a7;
    }

    public final QK B() {
        return this.zzc;
    }

    public final long C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new C2107x7();
        }
        if (iC == 4) {
            return new L5(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzg;
        if (cl != null) {
            return cl;
        }
        synchronized (C2107x7.class) {
            try {
                c1042dL = zzg;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzf);
                    zzg = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
