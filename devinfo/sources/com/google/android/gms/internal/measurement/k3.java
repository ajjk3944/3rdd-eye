package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k3 extends g5 {
    private static final k3 zzf;
    private int zzb;
    private int zzd = 1;
    private m5 zze = g6.f19756e;

    static {
        k3 k3Var = new k3();
        zzf = k3Var;
        g5.m(k3.class, k3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", s1.f19919k, "zze", c3.class});
        }
        if (i10 == 3) {
            return new k3();
        }
        if (i10 == 4) {
            return new r1(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }
}
