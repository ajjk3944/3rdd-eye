package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final e6 f19355a;

    /* renamed from: b, reason: collision with root package name */
    public final h7 f19356b;

    /* renamed from: c, reason: collision with root package name */
    public final h7 f19357c;

    public g(e6 e6Var, h7 h7Var, h7 h7Var2) {
        this.f19355a = e6Var;
        this.f19356b = h7Var;
        this.f19357c = h7Var2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a0.x0 a() {
        Application application = (Application) this.f19355a.f19335b;
        h hVar = (h) this.f19356b.a();
        x3 x3Var = (x3) this.f19357c.a();
        i0 i0Var = j0.f19384b;
        l0.c(i0Var);
        return new a0.x0(application, hVar, x3Var, i0Var, 6);
    }
}
