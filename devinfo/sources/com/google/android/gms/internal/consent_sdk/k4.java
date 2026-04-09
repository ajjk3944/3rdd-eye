package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k4 extends w5 {
    private static final k4 zzb;
    private int zzd;
    private j4 zze;
    private a1 zzf;
    private String zzg = "";

    static {
        k4 k4Var = new k4();
        zzb = k4Var;
        w5.l(k4.class, k4Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new k4();
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
