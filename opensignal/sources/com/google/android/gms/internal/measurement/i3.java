package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class i3 extends h5 {
    private static final i3 zzf;
    private int zzb;
    private int zzd = 1;
    private n5 zze = h6.f5059x;

    static {
        i3 i3Var = new i3();
        zzf = i3Var;
        h5.m(i3.class, i3Var);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", q1.k, "zze", a3.class});
        }
        if (i11 == 3) {
            return new i3();
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
