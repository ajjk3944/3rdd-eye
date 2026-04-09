package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class m1 extends h5 {
    private static final m1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private n5 zzf = h6.f5059x;
    private boolean zzg;
    private r1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        m1 m1Var = new m1();
        zzl = m1Var;
        h5.m(m1.class, m1Var);
    }

    public static l1 B() {
        return (l1) zzl.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void D(int i10, o1 o1Var) {
        n5 n5Var = this.zzf;
        if (!((t4) n5Var).f5208a) {
            int size = n5Var.size();
            this.zzf = n5Var.V(size + size);
        }
        this.zzf.set(i10, o1Var);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", o1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new m1();
        }
        if (i11 == 4) {
            return new l1(zzl);
        }
        if (i11 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final o1 u(int i10) {
        return (o1) this.zzf.get(i10);
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final r1 w() {
        r1 r1Var = this.zzh;
        return r1Var == null ? r1.y() : r1Var;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return (this.zzb & 64) != 0;
    }
}
