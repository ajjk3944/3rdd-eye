package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class m3 extends h5 {
    private static final m3 zzf;
    private int zzb;
    private int zzd;
    private m5 zze = v5.f5234x;

    static {
        m3 m3Var = new m3();
        zzf = m3Var;
        h5.m(m3.class, m3Var);
    }

    public static l3 u() {
        return (l3) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new m3();
        }
        if (i11 == 4) {
            return new l3(zzf);
        }
        if (i11 == 5) {
            return zzf;
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
        return ((v5) this.zze).size();
    }

    public final long t(int i10) {
        return ((v5) this.zze).b(i10);
    }

    public final /* synthetic */ void v(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((t4) randomAccess).f5208a) {
            v5 v5Var = (v5) randomAccess;
            int i10 = v5Var.f5236g;
            this.zze = v5Var.V(i10 + i10);
        }
        s4.c(list, this.zze);
    }
}
