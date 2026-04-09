package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class r2 extends h5 {
    private static final r2 zzh;
    private int zzb;
    private int zzd;
    private k3 zze;
    private k3 zzf;
    private boolean zzg;

    static {
        r2 r2Var = new r2();
        zzh = r2Var;
        h5.m(r2.class, r2Var);
    }

    public static q2 w() {
        return (q2) zzh.h();
    }

    public final /* synthetic */ void A(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new r2();
        }
        if (i11 == 4) {
            return new q2(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final k3 r() {
        k3 k3Var = this.zze;
        return k3Var == null ? k3.y() : k3Var;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final k3 t() {
        k3 k3Var = this.zzf;
        return k3Var == null ? k3.y() : k3Var;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final /* synthetic */ void x(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void y(k3 k3Var) {
        this.zze = k3Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void z(k3 k3Var) {
        this.zzf = k3Var;
        this.zzb |= 4;
    }
}
