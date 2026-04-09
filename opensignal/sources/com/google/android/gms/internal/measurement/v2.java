package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v2 extends h5 {
    private static final v2 zzd;
    private n5 zzb = h6.f5059x;

    static {
        v2 v2Var = new v2();
        zzd = v2Var;
        h5.m(v2.class, v2Var);
    }

    public static s2 q() {
        return (s2) zzd.h();
    }

    public static v2 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", u2.class});
        }
        if (i11 == 3) {
            return new v2();
        }
        if (i11 == 4) {
            return new s2(zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        n5 n5Var = this.zzb;
        if (!((t4) n5Var).f5208a) {
            int size = n5Var.size();
            this.zzb = n5Var.V(size + size);
        }
        s4.c(arrayList, this.zzb);
    }
}
