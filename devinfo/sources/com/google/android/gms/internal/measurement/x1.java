package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x1 extends g5 {
    private static final x1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        x1 x1Var = new x1();
        zzg = x1Var;
        g5.m(x1.class, x1Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", s1.f19915e, "zze", s1.f19914d, "zzf", s1.f19916f});
        }
        if (i10 == 3) {
            return new x1();
        }
        if (i10 == 4) {
            return new r1(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int p() {
        int iR = cm.g.R(this.zzd);
        if (iR == 0) {
            return 1;
        }
        return iR;
    }

    public final int q() {
        int i4;
        int i10 = this.zze;
        if (i10 != 0) {
            i4 = 2;
            if (i10 != 1) {
                i4 = i10 != 2 ? 0 : 3;
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final int r() {
        int i4;
        int i10 = this.zzf;
        if (i10 != 0) {
            i4 = 2;
            if (i10 != 1) {
                i4 = i10 != 2 ? 0 : 3;
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }
}
