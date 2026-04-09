package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yb0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18696a;

    /* renamed from: b, reason: collision with root package name */
    public final v40 f18697b;

    /* renamed from: c, reason: collision with root package name */
    public final zm0 f18698c;

    /* renamed from: d, reason: collision with root package name */
    public final m20 f18699d;

    public /* synthetic */ yb0(v40 v40Var, zm0 zm0Var, m20 m20Var, int i4) {
        this.f18696a = i4;
        this.f18697b = v40Var;
        this.f18698c = zm0Var;
        this.f18699d = m20Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18696a) {
            case 0:
                return new xb0((String) this.f18697b.f17495b.f15075d, (ca0) this.f18698c.a(), this.f18699d.b());
            default:
                return new zb0((String) this.f18697b.f17495b.f15075d, (ca0) this.f18698c.a(), this.f18699d.b());
        }
    }
}
