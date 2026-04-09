package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ws0 extends qn1 {
    private static final ws0 zzc;
    private static volatile po1 zzd;
    private boolean zza;
    private boolean zzb;

    static {
        ws0 ws0Var = new ws0();
        zzc = ws0Var;
        qn1.u(ws0.class, ws0Var);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new ws0();
        }
        if (iC == 4) {
            return new rj(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzd;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (ws0.class) {
            try {
                pn1Var = zzd;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzc);
                    zzd = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
