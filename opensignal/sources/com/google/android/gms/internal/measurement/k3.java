package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class k3 extends h5 {
    private static final k3 zzg;
    private m5 zzb;
    private m5 zzd;
    private n5 zze;
    private n5 zzf;

    static {
        k3 k3Var = new k3();
        zzg = k3Var;
        h5.m(k3.class, k3Var);
    }

    public k3() {
        v5 v5Var = v5.f5234x;
        this.zzb = v5Var;
        this.zzd = v5Var;
        h6 h6Var = h6.f5059x;
        this.zze = h6Var;
        this.zzf = h6Var;
    }

    public static j3 x() {
        return (j3) zzg.h();
    }

    public static k3 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = v5.f5234x;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((t4) randomAccess).f5208a) {
            v5 v5Var = (v5) randomAccess;
            int i10 = v5Var.f5236g;
            this.zzd = v5Var.V(i10 + i10);
        }
        s4.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = v5.f5234x;
    }

    public final void D(ArrayList arrayList) {
        n5 n5Var = this.zze;
        if (!((t4) n5Var).f5208a) {
            int size = n5Var.size();
            this.zze = n5Var.V(size + size);
        }
        s4.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = h6.f5059x;
    }

    public final void F(Iterable iterable) {
        n5 n5Var = this.zzf;
        if (!((t4) n5Var).f5208a) {
            int size = n5Var.size();
            this.zzf = n5Var.V(size + size);
        }
        s4.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = h6.f5059x;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", x2.class, "zzf", m3.class});
        }
        if (i11 == 3) {
            return new k3();
        }
        if (i11 == 4) {
            return new j3(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((v5) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((v5) this.zzd).size();
    }

    public final n5 t() {
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
        if (!((t4) randomAccess).f5208a) {
            v5 v5Var = (v5) randomAccess;
            int i10 = v5Var.f5236g;
            this.zzb = v5Var.V(i10 + i10);
        }
        s4.c(iterable, this.zzb);
    }
}
