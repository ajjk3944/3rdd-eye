package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o3 extends g5 {
    private static final o3 zzf;
    private int zzb;
    private int zzd;
    private l5 zze = u5.f19949e;

    static {
        o3 o3Var = new o3();
        zzf = o3Var;
        g5.m(o3.class, o3Var);
    }

    public static n3 u() {
        return (n3) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i10 == 3) {
            return new o3();
        }
        if (i10 == 4) {
            return new n3(zzf);
        }
        if (i10 == 5) {
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
        return ((u5) this.zze).size();
    }

    public final long t(int i4) {
        return ((u5) this.zze).c(i4);
    }

    public final /* synthetic */ void v(int i4) {
        this.zzb |= 1;
        this.zzd = i4;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((t4) randomAccess).f19936a) {
            u5 u5Var = (u5) randomAccess;
            int i4 = u5Var.f19951c;
            this.zze = u5Var.P1(i4 + i4);
        }
        s4.c(list, this.zze);
    }
}
