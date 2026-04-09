package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ah1 extends qn1 {
    private static final ah1 zzb;
    private static volatile po1 zzc;
    private int zza;

    static {
        ah1 ah1Var = new ah1();
        zzb = ah1Var;
        qn1.u(ah1.class, ah1Var);
    }

    public static ah1 B(bn1 bn1Var, jn1 jn1Var) {
        return (ah1) qn1.m(zzb, bn1Var, jn1Var);
    }

    public static ah1 C() {
        return zzb;
    }

    public final int A() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iC == 3) {
            return new ah1();
        }
        if (iC == 4) {
            return new rj(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzc;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (ah1.class) {
            try {
                pn1Var = zzc;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzb);
                    zzc = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
