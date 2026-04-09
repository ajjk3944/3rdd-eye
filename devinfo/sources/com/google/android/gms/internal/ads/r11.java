package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r11 implements i11 {

    /* renamed from: a, reason: collision with root package name */
    public final ky0 f15502a;

    /* renamed from: b, reason: collision with root package name */
    public final ky0 f15503b;

    /* renamed from: c, reason: collision with root package name */
    public final cs1 f15504c;

    /* renamed from: d, reason: collision with root package name */
    public final g21 f15505d;

    public r11(ky0 ky0Var, ky0 ky0Var2, cs1 cs1Var, g21 g21Var) {
        this.f15502a = ky0Var;
        this.f15503b = ky0Var2;
        this.f15504c = cs1Var;
        this.f15505d = g21Var;
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final h91 a() {
        ky0 ky0Var = this.f15502a;
        ky0Var.getClass();
        h91 h91VarZ = yo0.z(ky0Var.f13290b, new go0(4, ky0Var));
        this.f15505d.e(20302, h91VarZ);
        return h91VarZ;
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final vd.b b() {
        return yo0.e(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final vd.b d(zy0 zy0Var, byte[] bArr, byte[] bArr2) {
        h91 h91VarA = ((ky0) this.f15504c.a()).a(bArr);
        g21 g21Var = this.f15505d;
        g21Var.e(20307, h91VarA);
        h91 h91VarA2 = this.f15503b.a(bArr2);
        g21Var.e(20305, h91VarA2);
        return yo0.F(n81.s(new f81(x41.r(new vd.b[]{h91VarA, h91VarA2}), true)), new q11(this, zy0Var, 0), k81.f13081a);
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final vd.b e(zy0 zy0Var, byte[] bArr) {
        h91 h91VarA = this.f15503b.a(bArr);
        this.f15505d.e(20305, h91VarA);
        return yo0.F(n81.s(h91VarA), new q11(this, zy0Var, 1), k81.f13081a);
    }
}
