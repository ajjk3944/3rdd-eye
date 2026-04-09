package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j5 extends w5 {
    private static final j5 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private y5 zzg = x5.f19565e;

    static {
        j5 j5Var = new j5();
        zzb = j5Var;
        w5.l(j5.class, j5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            q4 q4Var = q4.f19486p;
            return new p6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ࠬ\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzg", q4Var, "zzf", q4Var});
        }
        if (i10 == 3) {
            return new j5();
        }
        if (i10 == 4) {
            return new i5(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
