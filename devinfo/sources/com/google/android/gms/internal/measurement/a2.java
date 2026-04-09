package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a2 extends g5 {
    private static final a2 zzi;
    private int zzb;
    private m5 zzd;
    private m5 zze;
    private m5 zzf;
    private boolean zzg;
    private m5 zzh;

    static {
        a2 a2Var = new a2();
        zzi = a2Var;
        g5.m(a2.class, a2Var);
    }

    public a2() {
        g6 g6Var = g6.f19756e;
        this.zzd = g6Var;
        this.zze = g6Var;
        this.zzf = g6Var;
        this.zzh = g6Var;
    }

    public static a2 v() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", x1.class, "zze", y1.class, "zzf", z1.class, "zzg", "zzh", x1.class});
        }
        if (i10 == 3) {
            return new a2();
        }
        if (i10 == 4) {
            return new r1(zzi);
        }
        if (i10 == 5) {
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

    public final m5 u() {
        return this.zzh;
    }
}
