package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class r3 extends h5 {
    private static final r3 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        r3 r3Var = new r3();
        zzj = r3Var;
        h5.m(r3.class, r3Var);
    }

    public static q3 A() {
        return (q3) zzj.h();
    }

    public final /* synthetic */ void B(long j) {
        this.zzb |= 1;
        this.zzd = j;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void E() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void H(double d6) {
        this.zzb |= 32;
        this.zzi = d6;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new r3();
        }
        if (i11 == 4) {
            return new q3(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final long q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final long v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 16) != 0;
    }

    public final float x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zzb & 32) != 0;
    }

    public final double z() {
        return this.zzi;
    }
}
