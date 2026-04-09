package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gf0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11510a;

    /* renamed from: b, reason: collision with root package name */
    public final a10 f11511b;

    /* renamed from: c, reason: collision with root package name */
    public final g10 f11512c;

    public /* synthetic */ gf0(a10 a10Var, g10 g10Var, int i4) {
        this.f11510a = i4;
        this.f11511b = a10Var;
        this.f11512c = g10Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f11510a) {
            case 0:
                return new hf0(this.f11511b.b(), this.f11512c.b());
            default:
                Context contextB = this.f11511b.b();
                za.a aVarB = this.f11512c.b();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new tf0(contextB, aVarB, exVar);
        }
    }
}
