package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y1 extends g5 {
    private static final y1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        y1 y1Var = new y1();
        zzf = y1Var;
        g5.m(y1.class, y1Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            s1 s1Var = s1.f19915e;
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", s1Var, "zze", s1Var});
        }
        if (i10 == 3) {
            return new y1();
        }
        if (i10 == 4) {
            return new r1(zzf);
        }
        if (i10 == 5) {
            return zzf;
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
        int iR = cm.g.R(this.zze);
        if (iR == 0) {
            return 1;
        }
        return iR;
    }
}
