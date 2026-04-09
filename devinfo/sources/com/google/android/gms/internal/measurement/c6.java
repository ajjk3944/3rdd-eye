package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.vm1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c6 implements i6 {

    /* renamed from: a, reason: collision with root package name */
    public final s4 f19647a;

    /* renamed from: b, reason: collision with root package name */
    public final e5 f19648b;

    public c6(e5 e5Var, s4 s4Var) {
        e5 e5Var2 = a5.f19609a;
        this.f19648b = e5Var;
        this.f19647a = s4Var;
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final boolean a(Object obj) {
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final g5 b() {
        s4 s4Var = this.f19647a;
        return s4Var instanceof g5 ? (g5) ((g5) s4Var).o(4) : ((f5) ((g5) s4Var).o(5)).e();
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final void c(Object obj, Object obj2) {
        j6.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final int d(s4 s4Var) {
        m6 m6Var = ((g5) s4Var).zzc;
        int i4 = m6Var.f19829d;
        if (i4 != -1) {
            return i4;
        }
        int iL = 0;
        for (int i10 = 0; i10 < m6Var.f19826a; i10++) {
            int i11 = m6Var.f19827b[i10] >>> 3;
            x4 x4Var = (x4) m6Var.f19828c[i10];
            int iH0 = y4.h0(8);
            int iH02 = y4.h0(i11) + y4.h0(16);
            int iH03 = y4.h0(24);
            int iD = x4Var.d();
            iL = je.u.l(iH0 + iH0, iH02, com.google.android.gms.internal.ads.d7.v(iD, iD, iH03), iL);
        }
        m6Var.f19829d = iL;
        return iL;
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final void e(Object obj, v5 v5Var) {
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final boolean f(g5 g5Var, g5 g5Var2) {
        return g5Var.zzc.equals(g5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final void g(Object obj) {
        this.f19648b.getClass();
        m6 m6Var = ((g5) obj).zzc;
        if (m6Var.f19830e) {
            m6Var.f19830e = false;
        }
        e5 e5Var = a5.f19609a;
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final void h(Object obj, byte[] bArr, int i4, int i10, vm1 vm1Var) {
        g5 g5Var = (g5) obj;
        if (g5Var.zzc == m6.f19825f) {
            g5Var.zzc = m6.a();
        }
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.measurement.i6
    public final int i(g5 g5Var) {
        return g5Var.zzc.hashCode();
    }
}
