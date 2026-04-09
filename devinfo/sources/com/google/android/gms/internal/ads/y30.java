package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y30 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18621a;

    /* renamed from: b, reason: collision with root package name */
    public final aw f18622b;

    public /* synthetic */ y30(aw awVar, int i4) {
        this.f18621a = i4;
        this.f18622b = awVar;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18621a) {
            case 0:
                View view = (View) this.f18622b.f9452c;
                al0.z(view);
                return view;
            case 1:
                xp0 xp0Var = (xp0) this.f18622b.f9453d;
                al0.z(xp0Var);
                return xp0Var;
            case 2:
                return (n40) this.f18622b.f9451b;
            default:
                return (qz) this.f18622b.f9454e;
        }
    }
}
