package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class k1 extends h5 {
    private static final k1 zzi;
    private int zzb;
    private int zzd;
    private n5 zze;
    private n5 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        k1 k1Var = new k1();
        zzi = k1Var;
        h5.m(k1.class, k1Var);
    }

    public k1() {
        h6 h6Var = h6.f5059x;
        this.zze = h6Var;
        this.zzf = h6Var;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", t1.class, "zzf", m1.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new k1();
        }
        if (i11 == 4) {
            return new j1(zzi);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final t1 t(int i10) {
        return (t1) this.zze.get(i10);
    }

    public final n5 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final m1 w(int i10) {
        return (m1) this.zzf.get(i10);
    }

    public final void x(int i10, t1 t1Var) {
        n5 n5Var = this.zze;
        if (!((t4) n5Var).f5208a) {
            int size = n5Var.size();
            this.zze = n5Var.V(size + size);
        }
        this.zze.set(i10, t1Var);
    }

    public final void y(int i10, m1 m1Var) {
        n5 n5Var = this.zzf;
        if (!((t4) n5Var).f5208a) {
            int size = n5Var.size();
            this.zzf = n5Var.V(size + size);
        }
        this.zzf.set(i10, m1Var);
    }
}
