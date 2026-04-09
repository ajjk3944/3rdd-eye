package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class u1 extends h5 {
    private static final u1 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private n5 zzg = h6.f5059x;

    static {
        u1 u1Var = new u1();
        zzh = u1Var;
        h5.m(u1.class, u1Var);
    }

    public static u1 w() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", q1.f5168c, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new u1();
        }
        if (i11 == 4) {
            return new p1(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final boolean q() {
        return (this.zzb & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final n5 u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int x() {
        int i10;
        switch (this.zzd) {
            case 0:
                i10 = 1;
                break;
            case 1:
                i10 = 2;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                i10 = 6;
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
