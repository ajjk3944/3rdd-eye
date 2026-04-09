package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class w1 extends h5 {
    private static final w1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        w1 w1Var = new w1();
        zzf = w1Var;
        h5.m(w1.class, w1Var);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            q1 q1Var = q1.f5170e;
            return new i6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", q1Var, "zze", q1Var});
        }
        if (i11 == 3) {
            return new w1();
        }
        if (i11 == 4) {
            return new p1(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int p() {
        int iE0 = xu.l.e0(this.zzd);
        if (iE0 == 0) {
            return 1;
        }
        return iE0;
    }

    public final int q() {
        int iE0 = xu.l.e0(this.zze);
        if (iE0 == 0) {
            return 1;
        }
        return iE0;
    }
}
