package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x2 extends g5 {
    private static final x2 zzd;
    private m5 zzb = g6.f19756e;

    static {
        x2 x2Var = new x2();
        zzd = x2Var;
        g5.m(x2.class, x2Var);
    }

    public static u2 q() {
        return (u2) zzd.h();
    }

    public static x2 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", w2.class});
        }
        if (i10 == 3) {
            return new x2();
        }
        if (i10 == 4) {
            return new u2(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        m5 m5Var = this.zzb;
        if (!((t4) m5Var).f19936a) {
            int size = m5Var.size();
            this.zzb = m5Var.P1(size + size);
        }
        s4.c(arrayList, this.zzb);
    }
}
