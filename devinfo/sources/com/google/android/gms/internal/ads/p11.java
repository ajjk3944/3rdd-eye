package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p11 implements j11 {

    /* renamed from: a, reason: collision with root package name */
    public final w01 f14858a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f14859b;

    /* renamed from: c, reason: collision with root package name */
    public final g21 f14860c;

    public p11(w01 w01Var, ExecutorService executorService, g21 g21Var) {
        this.f14858a = w01Var;
        this.f14859b = executorService;
        this.f14860c = g21Var;
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final h91 a() {
        h91 h91VarZ = yo0.z(this.f14859b, new o11(this, 1));
        this.f14860c.e(15302, h91VarZ);
        return h91VarZ;
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final vd.b b() {
        return yo0.e(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.j11
    public final vd.b c() {
        h91 h91VarZ = yo0.z(this.f14859b, new o11(this, 0));
        this.f14860c.e(15314, h91VarZ);
        return h91VarZ;
    }

    @Override // com.google.android.gms.internal.ads.i11
    public final vd.b d(zy0 zy0Var, byte[] bArr, byte[] bArr2) {
        h91 h91VarZ = yo0.z(this.f14859b, new ib0(this, zy0Var, bArr, bArr2, 6));
        this.f14860c.e(15321, h91VarZ);
        return h91VarZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.i11
    public final vd.b e(zy0 zy0Var, byte[] bArr) {
        h91 h91VarZ = yo0.z(this.f14859b, new u50(this, zy0Var, bArr, 3));
        this.f14860c.e(15305, h91VarZ);
        return h91VarZ;
    }
}
