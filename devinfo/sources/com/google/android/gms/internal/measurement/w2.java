package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w2 extends g5 {
    private static final w2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        w2 w2Var = new w2();
        zzf = w2Var;
        g5.m(w2.class, w2Var);
    }

    public static v2 p() {
        return (v2) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", s1.f19917h, "zze", s1.f19918i});
        }
        if (i10 == 3) {
            return new w2();
        }
        if (i10 == 4) {
            return new v2(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int q() {
        int i4;
        int i10 = this.zzd;
        if (i10 != 0) {
            i4 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i4 = 4;
                    if (i10 != 3) {
                        i4 = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i4 = 3;
                }
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

    public final /* synthetic */ void s(int i4) {
        this.zzd = i4 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void t(int i4) {
        this.zze = i4 - 1;
        this.zzb |= 2;
    }
}
