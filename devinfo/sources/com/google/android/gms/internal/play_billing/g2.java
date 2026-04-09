package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.vm1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g2 implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f20134a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f20135b;

    public g2(n1 n1Var, b1 b1Var) {
        n1 n1Var2 = j1.f20159a;
        this.f20135b = n1Var;
        this.f20134a = b1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final boolean a(Object obj) {
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final void b(Object obj) {
        this.f20135b.getClass();
        p2 p2Var = ((p1) obj).zzc;
        if (p2Var.f20212e) {
            p2Var.f20212e = false;
        }
        n1 n1Var = j1.f20159a;
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final p1 c() {
        b1 b1Var = this.f20134a;
        return b1Var instanceof p1 ? (p1) ((p1) b1Var).d(4) : ((o1) ((p1) b1Var).d(5)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final int d(p1 p1Var) {
        return p1Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final void e(Object obj, Object obj2) {
        m2.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final void f(Object obj, a2 a2Var) {
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final void g(Object obj, byte[] bArr, int i4, int i10, vm1 vm1Var) {
        p1 p1Var = (p1) obj;
        if (p1Var.zzc == p2.f20207f) {
            p1Var.zzc = p2.b();
        }
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final int h(b1 b1Var) {
        p2 p2Var = ((p1) b1Var).zzc;
        int i4 = p2Var.f20211d;
        if (i4 != -1) {
            return i4;
        }
        int iL = 0;
        for (int i10 = 0; i10 < p2Var.f20208a; i10++) {
            int i11 = p2Var.f20209b[i10] >>> 3;
            g1 g1Var = (g1) p2Var.f20210c[i10];
            int iW = h1.W(8);
            int iW2 = h1.W(i11) + h1.W(16);
            int iW3 = h1.W(24);
            int iD = g1Var.d();
            iL = je.u.l(iW + iW, iW2, d7.x(iD, iD, iW3), iL);
        }
        p2Var.f20211d = iL;
        return iL;
    }

    @Override // com.google.android.gms.internal.play_billing.l2
    public final boolean i(p1 p1Var, p1 p1Var2) {
        return p1Var.zzc.equals(p1Var2.zzc);
    }
}
