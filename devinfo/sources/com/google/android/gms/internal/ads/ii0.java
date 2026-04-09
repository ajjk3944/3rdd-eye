package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ii0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12342a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f12343b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f12344c;

    /* renamed from: d, reason: collision with root package name */
    public final b60 f12345d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f12346e;

    /* renamed from: f, reason: collision with root package name */
    public final gs1 f12347f;
    public final es1 g;

    /* renamed from: h, reason: collision with root package name */
    public final js1 f12348h;

    /* renamed from: i, reason: collision with root package name */
    public final es1 f12349i;
    public final js1 j;

    public /* synthetic */ ii0(es1 es1Var, g10 g10Var, b60 b60Var, es1 es1Var2, gs1 gs1Var, es1 es1Var3, es1 es1Var4, es1 es1Var5, es1 es1Var6, int i4) {
        this.f12342a = i4;
        this.f12343b = es1Var;
        this.f12344c = g10Var;
        this.f12345d = b60Var;
        this.f12346e = es1Var2;
        this.f12347f = gs1Var;
        this.g = es1Var3;
        this.f12348h = es1Var4;
        this.f12349i = es1Var5;
        this.j = es1Var6;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f12342a) {
            case 0:
                n10 n10Var = (n10) this.f12347f.f11600a;
                return new hi0(n10Var, (Executor) this.f12344c.a(), (wc0) this.g.a(), this.f12345d.b(), ((g10) this.f12346e).b(), new qo(), (qh0) this.f12348h.a(), (od0) this.f12349i.a(), (qd0) this.j.a());
            case 1:
                return new yi0((Context) this.f12343b.a(), ((g10) this.f12344c).b(), this.f12345d.b(), (Executor) this.f12346e.a(), (t10) this.f12347f.f11600a, (wc0) this.g.a(), new qo(), (qh0) this.f12348h.a(), (od0) this.f12349i.a(), (qd0) this.j.a());
            default:
                return new yi0((Context) this.f12343b.a(), ((g10) this.f12344c).b(), this.f12345d.b(), (Executor) this.f12346e.a(), (w10) this.f12347f.f11600a, (wc0) this.g.a(), new qo(), (qh0) this.f12348h.a(), (od0) this.f12349i.a(), (qd0) this.j.a());
        }
    }

    public ii0(gs1 gs1Var, es1 es1Var, es1 es1Var2, es1 es1Var3, b60 b60Var, g10 g10Var, es1 es1Var4, es1 es1Var5, es1 es1Var6) {
        this.f12342a = 0;
        this.f12347f = gs1Var;
        this.f12343b = es1Var;
        this.f12344c = es1Var2;
        this.g = es1Var3;
        this.f12345d = b60Var;
        this.f12346e = g10Var;
        this.f12348h = es1Var4;
        this.f12349i = es1Var5;
        this.j = es1Var6;
    }
}
