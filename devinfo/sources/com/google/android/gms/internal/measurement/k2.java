package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k2 extends g5 {
    private static final k2 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        k2 k2Var = new k2();
        zzi = k2Var;
        g5.m(k2.class, k2Var);
    }

    public static k2 r() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new k2();
        }
        if (i10 == 4) {
            return new r1(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        throw null;
    }

    public final int p() {
        return this.zzg;
    }

    public final String q() {
        return this.zzh;
    }
}
