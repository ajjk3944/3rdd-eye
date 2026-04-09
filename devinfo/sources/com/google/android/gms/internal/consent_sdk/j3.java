package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j3 extends w5 {
    private static final j3 zzb;

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        w5.l(j3.class, j3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new j3();
        }
        if (i10 == 4) {
            return new o2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
