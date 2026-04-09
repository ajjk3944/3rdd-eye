package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b2 extends g5 {
    private static final b2 zzg;
    private int zzb;
    private String zzd = "";
    private m5 zze = g6.f19756e;
    private boolean zzf;

    static {
        b2 b2Var = new b2();
        zzg = b2Var;
        g5.m(b2.class, b2Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", i2.class, "zzf"});
        }
        if (i10 == 3) {
            return new b2();
        }
        if (i10 == 4) {
            return new r1(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
