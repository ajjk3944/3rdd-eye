package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yz0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18938a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final gs1 f18939b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f18940c;

    /* renamed from: d, reason: collision with root package name */
    public final gs1 f18941d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f18942e;

    public yz0(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, es1 es1Var2) {
        this.f18939b = gs1Var;
        this.f18940c = es1Var;
        this.f18941d = gs1Var2;
        this.f18942e = es1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18938a) {
            case 0:
                return new xz0((zc) this.f18939b.f11600a, (Map) this.f18941d.f11600a, (sx0) this.f18940c.a(), (g21) this.f18942e.a());
            default:
                return new c01((zc) this.f18939b.f11600a, (sz0) this.f18940c.a(), (Map) this.f18941d.f11600a, (g21) this.f18942e.a());
        }
    }

    public yz0(gs1 gs1Var, gs1 gs1Var2, gs1 gs1Var3, es1 es1Var) {
        this.f18939b = gs1Var;
        this.f18941d = gs1Var2;
        this.f18940c = gs1Var3;
        this.f18942e = es1Var;
    }
}
