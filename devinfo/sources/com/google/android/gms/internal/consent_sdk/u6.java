package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u6 extends w5 {
    private static final u6 zzb;
    private long zzd;
    private int zze;

    static {
        u6 u6Var = new u6();
        zzb = u6Var;
        w5.l(u6.class, u6Var);
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
            return new u6();
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
