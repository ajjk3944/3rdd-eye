package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19342a;

    /* renamed from: b, reason: collision with root package name */
    public final e6 f19343b;

    public /* synthetic */ f(e6 e6Var, int i4) {
        this.f19342a = i4;
        this.f19343b = e6Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    public final Object a() {
        switch (this.f19342a) {
            case 0:
                return new e((Application) this.f19343b.f19335b);
            case 1:
                return new h((Application) this.f19343b.f19335b);
            default:
                return new d0((Application) this.f19343b.f19335b);
        }
    }
}
