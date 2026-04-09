package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class o1 extends h5 {
    private static final o1 zzh;
    private int zzb;
    private u1 zzd;
    private r1 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        o1 o1Var = new o1();
        zzh = o1Var;
        h5.m(o1.class, o1Var);
    }

    public static o1 x() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new o1();
        }
        if (i11 == 4) {
            return new n1(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final u1 q() {
        u1 u1Var = this.zzd;
        return u1Var == null ? u1.w() : u1Var;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final r1 s() {
        r1 r1Var = this.zze;
        return r1Var == null ? r1.y() : r1Var;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final String w() {
        return this.zzg;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
