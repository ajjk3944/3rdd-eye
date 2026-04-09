package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class y1 extends h5 {
    private static final y1 zzi;
    private int zzb;
    private n5 zzd;
    private n5 zze;
    private n5 zzf;
    private boolean zzg;
    private n5 zzh;

    static {
        y1 y1Var = new y1();
        zzi = y1Var;
        h5.m(y1.class, y1Var);
    }

    public y1() {
        h6 h6Var = h6.f5059x;
        this.zzd = h6Var;
        this.zze = h6Var;
        this.zzf = h6Var;
        this.zzh = h6Var;
    }

    public static y1 v() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", v1.class, "zze", w1.class, "zzf", x1.class, "zzg", "zzh", v1.class});
        }
        if (i11 == 3) {
            return new y1();
        }
        if (i11 == 4) {
            return new p1(zzi);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final n5 u() {
        return this.zzh;
    }
}
