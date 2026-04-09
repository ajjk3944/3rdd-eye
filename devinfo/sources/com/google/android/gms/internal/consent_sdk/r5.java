package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r5 extends w5 {
    private static final r5 zzb;
    private long zzd;
    private int zze;

    static {
        r5 r5Var = new r5();
        zzb = r5Var;
        w5.l(r5.class, r5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new r5();
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
