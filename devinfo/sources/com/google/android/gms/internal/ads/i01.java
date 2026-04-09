package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i01 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12105a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final gs1 f12106b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f12107c;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f12108d;

    /* renamed from: e, reason: collision with root package name */
    public final gs1 f12109e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f12110f;

    public i01(gs1 gs1Var, es1 es1Var, es1 es1Var2, gs1 gs1Var2, es1 es1Var3) {
        this.f12106b = gs1Var;
        this.f12107c = es1Var;
        this.f12108d = es1Var2;
        this.f12109e = gs1Var2;
        this.f12110f = es1Var3;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f12105a) {
            case 0:
                return new e01((zc) this.f12106b.f11600a, (sz0) this.f12107c.a(), (Map) this.f12109e.f11600a, (DisplayMetrics) this.f12108d.a(), (g21) this.f12110f.a());
            default:
                return new vz0((zc) this.f12106b.f11600a, (sz0) this.f12107c.a(), (DisplayMetrics) this.f12108d.a(), (View) this.f12109e.f11600a, (g21) this.f12110f.a());
        }
    }

    public i01(gs1 gs1Var, es1 es1Var, gs1 gs1Var2, es1 es1Var2, es1 es1Var3) {
        this.f12106b = gs1Var;
        this.f12107c = es1Var;
        this.f12109e = gs1Var2;
        this.f12108d = es1Var2;
        this.f12110f = es1Var3;
    }
}
