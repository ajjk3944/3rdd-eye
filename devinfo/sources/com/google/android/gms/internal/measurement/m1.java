package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m1 extends g5 {
    private static final m1 zzi;
    private int zzb;
    private int zzd;
    private m5 zze;
    private m5 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        m1 m1Var = new m1();
        zzi = m1Var;
        g5.m(m1.class, m1Var);
    }

    public m1() {
        g6 g6Var = g6.f19756e;
        this.zze = g6Var;
        this.zzf = g6Var;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", v1.class, "zzf", o1.class, "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new m1();
        }
        if (i10 == 4) {
            return new l1(zzi);
        }
        if (i10 == 5) {
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

    public final v1 t(int i4) {
        return (v1) this.zze.get(i4);
    }

    public final m5 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final o1 w(int i4) {
        return (o1) this.zzf.get(i4);
    }

    public final void x(int i4, v1 v1Var) {
        m5 m5Var = this.zze;
        if (!((t4) m5Var).f19936a) {
            int size = m5Var.size();
            this.zze = m5Var.P1(size + size);
        }
        this.zze.set(i4, v1Var);
    }

    public final void y(int i4, o1 o1Var) {
        m5 m5Var = this.zzf;
        if (!((t4) m5Var).f19936a) {
            int size = m5Var.size();
            this.zzf = m5Var.P1(size + size);
        }
        this.zzf.set(i4, o1Var);
    }
}
