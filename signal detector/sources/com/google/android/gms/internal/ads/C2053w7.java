package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053w7 extends AbstractC1096eL {
    private static final C2053w7 zzd;
    private static volatile CL zze;
    private int zza;
    private C2107x7 zzb;
    private QK zzc = QK.f10609b;

    static {
        C2053w7 c2053w7 = new C2053w7();
        zzd = c2053w7;
        AbstractC1096eL.u(C2053w7.class, c2053w7);
    }

    public static C2053w7 E() {
        return zzd;
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final C2107x7 B() {
        C2107x7 c2107x7 = this.zzb;
        return c2107x7 == null ? C2107x7.D() : c2107x7;
    }

    public final boolean C() {
        return (this.zza & 2) != 0;
    }

    public final QK D() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new C2053w7();
        }
        if (iC == 4) {
            return new L5(zzd);
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
        synchronized (C2053w7.class) {
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
