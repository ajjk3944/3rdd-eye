package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wz0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18242a;

    /* renamed from: b, reason: collision with root package name */
    public final gs1 f18243b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f18244c;

    /* renamed from: d, reason: collision with root package name */
    public final gs1 f18245d;

    /* renamed from: e, reason: collision with root package name */
    public final gs1 f18246e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f18247f;

    public /* synthetic */ wz0(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, gs1 gs1Var3, es1 es1Var2, int i4) {
        this.f18242a = i4;
        this.f18243b = gs1Var;
        this.f18244c = es1Var;
        this.f18245d = gs1Var2;
        this.f18246e = gs1Var3;
        this.f18247f = es1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18242a) {
            case 0:
                return new vz0((zc) this.f18243b.f11600a, (sz0) this.f18244c.a(), (View) this.f18245d.f11600a, (Activity) this.f18246e.f11600a, (g21) this.f18247f.a());
            default:
                return new vz0((zc) this.f18243b.f11600a, (sz0) this.f18244c.a(), (zx0) this.f18245d.f11600a, (Map) this.f18246e.f11600a, (g21) this.f18247f.a());
        }
    }
}
