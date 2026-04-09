package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m11 implements j11 {

    /* renamed from: a, reason: collision with root package name */
    public final ky0 f13722a;

    /* renamed from: b, reason: collision with root package name */
    public final ky0 f13723b;

    /* renamed from: c, reason: collision with root package name */
    public final ky0 f13724c;

    /* renamed from: d, reason: collision with root package name */
    public final ky0 f13725d;

    /* renamed from: e, reason: collision with root package name */
    public final cs1 f13726e;

    /* renamed from: f, reason: collision with root package name */
    public final cs1 f13727f;
    public final File g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f13728h;

    /* renamed from: i, reason: collision with root package name */
    public final g21 f13729i;

    public m11(ky0 ky0Var, ky0 ky0Var2, cs1 cs1Var, ky0 ky0Var3, ky0 ky0Var4, cs1 cs1Var2, File file, ExecutorService executorService, g21 g21Var) {
        this.f13722a = ky0Var;
        this.f13724c = ky0Var2;
        this.f13726e = cs1Var;
        this.f13723b = ky0Var3;
        this.f13725d = ky0Var4;
        this.f13727f = cs1Var2;
        this.g = file;
        this.f13728h = executorService;
        this.f13729i = g21Var;
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final h91 a() {
        ky0 ky0Var = this.f13722a;
        ky0Var.getClass();
        h91 h91VarZ = yo0.z(ky0Var.f13290b, new go0(4, ky0Var));
        this.f13729i.e(15302, h91VarZ);
        return h91VarZ;
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final vd.b b() {
        return yo0.z(this.f13728h, new go0(7, this));
    }

    @Override // com.google.android.gms.internal.ads.j11
    public final vd.b c() {
        ky0 ky0Var = this.f13722a;
        ky0Var.getClass();
        x71 x71VarG = yo0.G(n81.s(yo0.z(ky0Var.f13290b, new go0(4, ky0Var))), new hu(13, this), k81.f13081a);
        this.f13729i.e(15314, x71VarG);
        return x71VarG;
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final vd.b d(zy0 zy0Var, byte[] bArr, byte[] bArr2) {
        h91 h91VarA = ((ky0) this.f13727f.a()).a(bArr);
        g21 g21Var = this.f13729i;
        g21Var.e(15307, h91VarA);
        h91 h91VarA2 = this.f13725d.a(bArr2);
        g21Var.e(15305, h91VarA2);
        return yo0.F(n81.s(new f81(x41.r(new vd.b[]{h91VarA, h91VarA2}), true)), new l11(this, zy0Var, 1), k81.f13081a);
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final vd.b e(zy0 zy0Var, byte[] bArr) {
        h91 h91VarA = this.f13725d.a(bArr);
        this.f13729i.e(15305, h91VarA);
        return yo0.F(n81.s(h91VarA), new l11(this, zy0Var, 0), k81.f13081a);
    }
}
