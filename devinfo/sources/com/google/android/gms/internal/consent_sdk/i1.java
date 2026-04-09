package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i1 extends w5 {
    private static final i1 zzb;

    static {
        i1 i1Var = new i1();
        zzb = i1Var;
        w5.l(i1.class, i1Var);
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
            return new i1();
        }
        if (i10 == 4) {
            return new z0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
