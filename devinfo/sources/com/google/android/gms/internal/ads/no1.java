package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class no1 implements xo1 {

    /* renamed from: a, reason: collision with root package name */
    public final qm1 f14386a;

    /* renamed from: b, reason: collision with root package name */
    public final w5 f14387b;

    public no1(w5 w5Var, qm1 qm1Var) {
        cl1 cl1Var = kn1.f13216a;
        this.f14387b = w5Var;
        this.f14386a = qm1Var;
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final void a(Object obj) {
        this.f14387b.getClass();
        dp1 dp1Var = ((qn1) obj).zzt;
        if (dp1Var.f10540e) {
            dp1Var.f10540e = false;
        }
        cl1 cl1Var = kn1.f13216a;
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final qn1 b() {
        qm1 qm1Var = this.f14386a;
        return qm1Var instanceof qn1 ? ((qn1) qm1Var).p() : ((on1) ((qn1) qm1Var).w(5, null)).d();
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final void c(Object obj, Object obj2) {
        yo1.d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final void d(Object obj, androidx.datastore.preferences.protobuf.k kVar, jn1 jn1Var) {
        this.f14387b.getClass();
        w5.B(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final boolean e(qn1 qn1Var, qn1 qn1Var2) {
        return qn1Var.zzt.equals(qn1Var2.zzt);
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final boolean f(Object obj) {
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final int g(qn1 qn1Var) {
        dp1 dp1Var = qn1Var.zzt;
        int i4 = dp1Var.f10539d;
        if (i4 != -1) {
            return i4;
        }
        int iL = 0;
        for (int i10 = 0; i10 < dp1Var.f10536a; i10++) {
            int i11 = dp1Var.f10537b[i10] >>> 3;
            bn1 bn1Var = (bn1) dp1Var.f10538c[i10];
            int iJ = hn1.J(8);
            int iJ2 = hn1.J(i11) + hn1.J(16);
            int iJ3 = hn1.J(24);
            int i12 = bn1Var.i();
            iL = je.u.l(iJ + iJ, iJ2, d7.r(i12, i12, iJ3), iL);
        }
        dp1Var.f10539d = iL;
        return iL;
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final void h(Object obj, rg0 rg0Var) {
        throw a0.g.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final int i(qn1 qn1Var) {
        return qn1Var.zzt.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.xo1
    public final void j(Object obj, byte[] bArr, int i4, int i10, vm1 vm1Var) {
        qn1 qn1Var = (qn1) obj;
        if (qn1Var.zzt == dp1.f10535f) {
            qn1Var.zzt = dp1.a();
        }
        throw a0.g.h(obj);
    }
}
