package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class la0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13431a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final b60 f13432b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f13433c;

    public la0(a10 a10Var, b60 b60Var) {
        this.f13433c = a10Var;
        this.f13432b = b60Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f13431a) {
            case 0:
                return new bw(((a10) this.f13433c).b(), this.f13432b.b().g);
            default:
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new ol0(exVar, this.f13432b.b(), ((h10) this.f13433c).a(), 1);
        }
    }

    public la0(b60 b60Var, js1 js1Var) {
        this.f13432b = b60Var;
        this.f13433c = js1Var;
    }
}
