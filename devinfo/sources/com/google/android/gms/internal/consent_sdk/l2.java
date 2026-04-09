package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l2 extends w5 {
    private static final l2 zzb;
    private int zzd = 0;
    private Object zze;

    static {
        l2 l2Var = new l2();
        zzb = l2Var;
        w5.l(l2.class, l2Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", k2.class, j2.class});
        }
        if (i10 == 3) {
            return new l2();
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
