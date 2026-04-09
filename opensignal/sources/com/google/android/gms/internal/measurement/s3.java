package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class s3 extends h5 {
    private static final s3 zzd;
    private n5 zzb = h6.f5059x;

    static {
        s3 s3Var = new s3();
        zzd = s3Var;
        h5.m(s3.class, s3Var);
    }

    public static s3 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", t3.class});
        }
        if (i11 == 3) {
            return new s3();
        }
        if (i11 == 4) {
            return new p1(zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
}
