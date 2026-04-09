package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class d3 extends h5 {
    private static final d3 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private n2 zzf;

    static {
        d3 d3Var = new d3();
        zzg = d3Var;
        h5.m(d3.class, d3Var);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new d3();
        }
        if (i11 == 4) {
            return new p1(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
