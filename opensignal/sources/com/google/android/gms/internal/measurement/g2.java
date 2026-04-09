package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class g2 extends h5 {
    private static final g2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        g2 g2Var = new g2();
        zzf = g2Var;
        h5.m(g2.class, g2Var);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new g2();
        }
        if (i11 == 4) {
            return new p1(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
