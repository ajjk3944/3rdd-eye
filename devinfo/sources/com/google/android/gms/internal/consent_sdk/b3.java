package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b3 extends w5 {
    private static final b3 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        b3 b3Var = new b3();
        zzb = b3Var;
        w5.l(b3.class, b3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", y0.f19586o, "zzf", y0.f19585n});
        }
        if (i10 == 3) {
            return new b3();
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
