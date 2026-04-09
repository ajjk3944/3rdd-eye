package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j3 extends p1 {
    private static final j3 zzb;
    private int zzd;
    private int zze;

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        p1.k(j3.class, j3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p1
    public final Object d(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new k2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", a1.g});
        }
        if (i10 == 3) {
            return new j3();
        }
        if (i10 == 4) {
            return new v0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
