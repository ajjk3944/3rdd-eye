package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f3 extends g5 {
    private static final f3 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private p2 zzf;

    static {
        f3 f3Var = new f3();
        zzg = f3Var;
        g5.m(f3.class, f3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new f3();
        }
        if (i10 == 4) {
            return new r1(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }
}
