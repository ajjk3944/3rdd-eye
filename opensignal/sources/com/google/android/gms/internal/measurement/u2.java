package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class u2 extends h5 {
    private static final u2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        u2 u2Var = new u2();
        zzf = u2Var;
        h5.m(u2.class, u2Var);
    }

    public static t2 p() {
        return (t2) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", q1.f5173h, "zze", q1.f5174i});
        }
        if (i11 == 3) {
            return new u2();
        }
        if (i11 == 4) {
            return new t2(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int q() {
        int i10;
        int i11 = this.zzd;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
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

    public final /* synthetic */ void s(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void t(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
