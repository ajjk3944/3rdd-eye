package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z4 extends w5 {
    private static final z4 zzb;
    private y5 zzd = x5.f19565e;

    static {
        z4 z4Var = new z4();
        zzb = z4Var;
        w5.l(z4.class, z4Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", q4.g});
        }
        if (i10 == 3) {
            return new z4();
        }
        if (i10 == 4) {
            return new z3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
