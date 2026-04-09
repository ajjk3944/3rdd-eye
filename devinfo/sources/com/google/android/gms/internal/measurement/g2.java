package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g2 extends g5 {
    private static final g2 zzd;
    private m5 zzb = g6.f19756e;

    static {
        g2 g2Var = new g2();
        zzd = g2Var;
        g5.m(g2.class, g2Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i10 == 3) {
            return new g2();
        }
        if (i10 == 4) {
            return new r1(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }
}
