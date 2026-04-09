package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class A7 extends AbstractC1096eL {
    private static final A7 zzd;
    private static volatile CL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        A7 a7 = new A7();
        zzd = a7;
        AbstractC1096eL.u(A7.class, a7);
    }

    public static A7 C() {
        return zzd;
    }

    public final int A() {
        return this.zzb;
    }

    public final int B() {
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
            return new GL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new A7();
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
        synchronized (A7.class) {
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
