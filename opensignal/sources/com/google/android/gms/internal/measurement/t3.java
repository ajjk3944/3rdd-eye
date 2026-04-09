package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class t3 extends h5 {
    private static final t3 zzf;
    private int zzb;
    private String zzd = "";
    private n5 zze = h6.f5059x;

    static {
        t3 t3Var = new t3();
        zzf = t3Var;
        h5.m(t3.class, t3Var);
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", v3.class});
        }
        if (i11 == 3) {
            return new t3();
        }
        if (i11 == 4) {
            return new p1(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }
}
