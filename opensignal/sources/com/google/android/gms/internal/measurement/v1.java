package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class v1 extends h5 {
    private static final v1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        v1 v1Var = new v1();
        zzg = v1Var;
        h5.m(v1.class, v1Var);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", q1.f5170e, "zze", q1.f5169d, "zzf", q1.f5171f});
        }
        if (i11 == 3) {
            return new v1();
        }
        if (i11 == 4) {
            return new p1(zzg);
        }
        if (i11 == 5) {
            return zzg;
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
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? 0 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int r() {
        int i10;
        int i11 = this.zzf;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? 0 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
