package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19408a;

    /* renamed from: b, reason: collision with root package name */
    public final e6 f19409b;

    /* renamed from: c, reason: collision with root package name */
    public final h7 f19410c;

    public /* synthetic */ l4(e6 e6Var, h7 h7Var, int i4) {
        this.f19408a = i4;
        this.f19409b = e6Var;
        this.f19410c = h7Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    public final Object a() {
        switch (this.f19408a) {
            case 0:
                return new x3((Application) this.f19409b.f19335b, (e) this.f19410c.a());
            default:
                return b();
        }
    }

    public v4 b() {
        return new v4((Application) this.f19409b.f19335b, (h) this.f19410c.a());
    }
}
