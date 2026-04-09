package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class d2 extends h5 {
    private static final d2 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private n5 zzg;
    private n5 zzh;
    private n5 zzi;
    private String zzj;
    private boolean zzk;
    private n5 zzl;
    private n5 zzm;
    private String zzn;
    private String zzo;
    private y1 zzp;
    private f2 zzq;
    private i2 zzr;
    private g2 zzs;
    private e2 zzt;

    static {
        d2 d2Var = new d2();
        zzu = d2Var;
        h5.m(d2.class, d2Var);
    }

    public d2() {
        h6 h6Var = h6.f5059x;
        this.zzg = h6Var;
        this.zzh = h6Var;
        this.zzi = h6Var;
        this.zzj = "";
        this.zzl = h6Var;
        this.zzm = h6Var;
        this.zzn = "";
        this.zzo = "";
    }

    public static c2 F() {
        return (c2) zzu.h();
    }

    public static d2 G() {
        return zzu;
    }

    public final String A() {
        return this.zzn;
    }

    public final boolean B() {
        return (this.zzb & 128) != 0;
    }

    public final y1 C() {
        y1 y1Var = this.zzp;
        return y1Var == null ? y1.v() : y1Var;
    }

    public final boolean D() {
        return (this.zzb & 512) != 0;
    }

    public final i2 E() {
        i2 i2Var = this.zzr;
        return i2Var == null ? i2.r() : i2Var;
    }

    public final void H(int i10, b2 b2Var) {
        n5 n5Var = this.zzh;
        if (!((t4) n5Var).f5208a) {
            int size = n5Var.size();
            this.zzh = n5Var.V(size + size);
        }
        this.zzh.set(i10, b2Var);
    }

    public final void I() {
        this.zzi = h6.f5059x;
    }

    public final void J() {
        this.zzl = h6.f5059x;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", h2.class, "zzh", b2.class, "zzi", k1.class, "zzj", "zzk", "zzl", u3.class, "zzm", z1.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new d2();
        }
        if (i11 == 4) {
            return new c2(zzu);
        }
        if (i11 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final long q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final n5 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final b2 v(int i10) {
        return (b2) this.zzh.get(i10);
    }

    public final n5 w() {
        return this.zzi;
    }

    public final n5 x() {
        return this.zzl;
    }

    public final int y() {
        return this.zzl.size();
    }

    public final List z() {
        return this.zzm;
    }
}
