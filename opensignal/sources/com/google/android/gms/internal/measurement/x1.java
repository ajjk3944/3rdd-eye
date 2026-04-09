package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class x1 extends h5 {
    private static final x1 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        x1 x1Var = new x1();
        zzf = x1Var;
        h5.m(x1.class, x1Var);
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
            return new x1();
        }
        if (i11 == 4) {
            return new p1(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
