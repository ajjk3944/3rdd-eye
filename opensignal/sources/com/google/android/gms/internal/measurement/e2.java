package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class e2 extends h5 {
    private static final e2 zzd;
    private n5 zzb = h6.f5059x;

    static {
        e2 e2Var = new e2();
        zzd = e2Var;
        h5.m(e2.class, e2Var);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new e2();
        }
        if (i11 == 4) {
            return new p1(zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
