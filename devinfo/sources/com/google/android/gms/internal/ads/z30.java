package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z30 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18983a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f18984b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f18985c;

    /* renamed from: d, reason: collision with root package name */
    public final v40 f18986d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f18987e;

    public z30(aw awVar, es1 es1Var, g10 g10Var, v40 v40Var, b60 b60Var) {
        this.f18984b = es1Var;
        this.f18985c = g10Var;
        this.f18986d = v40Var;
        this.f18987e = b60Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18983a) {
            case 0:
                return new q80(new x30((Context) this.f18984b.a(), ((g10) this.f18985c).b(), this.f18986d.b(), ((b60) this.f18987e).b(), 0), fx.g);
            default:
                return new q80(new x30((Context) this.f18984b.a(), ((g10) this.f18985c).b(), this.f18986d.b(), ((b60) this.f18987e).b(), 1), fx.g);
        }
    }

    public z30(es1 es1Var, g10 g10Var, v40 v40Var, b60 b60Var) {
        this.f18984b = es1Var;
        this.f18985c = g10Var;
        this.f18986d = v40Var;
        this.f18987e = b60Var;
    }
}
