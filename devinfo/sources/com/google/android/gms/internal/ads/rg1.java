package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rg1 extends qn1 {
    private static final rg1 zza;
    private static volatile po1 zzb;

    static {
        rg1 rg1Var = new rg1();
        zza = rg1Var;
        qn1.u(rg1.class, rg1Var);
    }

    public static void A(bn1 bn1Var, jn1 jn1Var) {
    }

    public static rg1 B() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zza, "\u0000\u0000", null);
        }
        if (iC == 3) {
            return new rg1();
        }
        if (iC == 4) {
            return new rj(zza);
        }
        if (iC == 5) {
            return zza;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzb;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (rg1.class) {
            try {
                pn1Var = zzb;
                if (pn1Var == null) {
                    pn1Var = new pn1(zza);
                    zzb = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
