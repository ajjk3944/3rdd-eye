package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m3 extends g5 {
    private static final m3 zzg;
    private l5 zzb;
    private l5 zzd;
    private m5 zze;
    private m5 zzf;

    static {
        m3 m3Var = new m3();
        zzg = m3Var;
        g5.m(m3.class, m3Var);
    }

    public m3() {
        u5 u5Var = u5.f19949e;
        this.zzb = u5Var;
        this.zzd = u5Var;
        g6 g6Var = g6.f19756e;
        this.zze = g6Var;
        this.zzf = g6Var;
    }

    public static l3 x() {
        return (l3) zzg.h();
    }

    public static m3 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = u5.f19949e;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((t4) randomAccess).f19936a) {
            u5 u5Var = (u5) randomAccess;
            int i4 = u5Var.f19951c;
            this.zzd = u5Var.P1(i4 + i4);
        }
        s4.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = u5.f19949e;
    }

    public final void D(ArrayList arrayList) {
        m5 m5Var = this.zze;
        if (!((t4) m5Var).f19936a) {
            int size = m5Var.size();
            this.zze = m5Var.P1(size + size);
        }
        s4.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = g6.f19756e;
    }

    public final void F(Iterable iterable) {
        m5 m5Var = this.zzf;
        if (!((t4) m5Var).f19936a) {
            int size = m5Var.size();
            this.zzf = m5Var.P1(size + size);
        }
        s4.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = g6.f19756e;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", z2.class, "zzf", o3.class});
        }
        if (i10 == 3) {
            return new m3();
        }
        if (i10 == 4) {
            return new l3(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((u5) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((u5) this.zzd).size();
    }

    public final m5 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((t4) randomAccess).f19936a) {
            u5 u5Var = (u5) randomAccess;
            int i4 = u5Var.f19951c;
            this.zzb = u5Var.P1(i4 + i4);
        }
        s4.c(iterable, this.zzb);
    }
}
