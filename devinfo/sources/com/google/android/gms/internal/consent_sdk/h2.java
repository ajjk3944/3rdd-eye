package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h2 extends w5 {
    private static final h2 zzb;
    private int zzd;
    private String zze = "";

    static {
        h2 h2Var = new h2();
        zzb = h2Var;
        w5.l(h2.class, h2Var);
    }

    public static f2 m() {
        return (f2) zzb.g();
    }

    public static /* synthetic */ void n(h2 h2Var) {
        h2Var.zzd |= 1;
        h2Var.zze = "4.0.0";
    }

    @Override // com.google.android.gms.internal.consent_sdk.w5
    public final Object f(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new p6(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new h2();
        }
        if (i10 == 4) {
            return new f2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
