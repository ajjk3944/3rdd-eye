package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class z2 extends h5 {
    private static final z2 zzj;
    private int zzb;
    private n5 zzd = h6.f5059x;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        z2 z2Var = new z2();
        zzj = z2Var;
        h5.m(z2.class, z2Var);
    }

    public static y2 z() {
        return (y2) zzj.h();
    }

    public final /* synthetic */ void A(int i10, c3 c3Var) {
        J();
        this.zzd.set(i10, c3Var);
    }

    public final /* synthetic */ void B(c3 c3Var) {
        c3Var.getClass();
        J();
        this.zzd.add(c3Var);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        J();
        s4.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = h6.f5059x;
    }

    public final /* synthetic */ void E(int i10) {
        J();
        this.zzd.remove(i10);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void J() {
        n5 n5Var = this.zzd;
        if (((t4) n5Var).f5208a) {
            return;
        }
        int size = n5Var.size();
        this.zzd = n5Var.V(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", c3.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new z2();
        }
        if (i11 == 4) {
            return new y2(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final c3 r(int i10) {
        return (c3) this.zzd.get(i10);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final int y() {
        return this.zzh;
    }
}
