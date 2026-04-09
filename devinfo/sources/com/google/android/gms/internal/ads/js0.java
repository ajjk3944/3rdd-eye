package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class js0 extends qn1 {
    private static final js0 zzb;
    private static volatile po1 zzc;
    private String zza = "";

    static {
        js0 js0Var = new js0();
        zzb = js0Var;
        qn1.u(js0.class, js0Var);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iC == 3) {
            return new js0();
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
        synchronized (js0.class) {
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
