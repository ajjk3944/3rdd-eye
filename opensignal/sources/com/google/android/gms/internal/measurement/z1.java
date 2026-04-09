package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class z1 extends h5 {
    private static final z1 zzg;
    private int zzb;
    private String zzd = "";
    private n5 zze = h6.f5059x;
    private boolean zzf;

    static {
        z1 z1Var = new z1();
        zzg = z1Var;
        h5.m(z1.class, z1Var);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", g2.class, "zzf"});
        }
        if (i11 == 3) {
            return new z1();
        }
        if (i11 == 4) {
            return new p1(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
