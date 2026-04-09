package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k30 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13005a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f13006b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f13007c;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f13008d;

    /* renamed from: e, reason: collision with root package name */
    public final es1 f13009e;

    /* renamed from: f, reason: collision with root package name */
    public final js1 f13010f;

    public k30(es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, es1 es1Var5) {
        this.f13007c = es1Var;
        this.f13008d = es1Var2;
        this.f13006b = es1Var3;
        this.f13009e = es1Var4;
        this.f13010f = es1Var5;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f13005a) {
            case 0:
                return new j30((uq) this.f13007c.a(), (f30) this.f13008d.a(), (Executor) this.f13006b.a(), (e30) this.f13009e.a(), (tb.a) this.f13010f.a());
            case 1:
                return new dw0((Context) this.f13006b.a(), (ew0) this.f13007c.a(), (gv0) this.f13008d.a(), (fv0) this.f13009e.a(), ((sx0) this.f13010f.a()).V());
            default:
                return new a11((dw0) this.f13007c.a(), (j11) this.f13008d.a(), (s11) this.f13009e.a(), (g21) this.f13006b.a(), (ExecutorService) this.f13010f.a());
        }
    }

    public k30(es1 es1Var, es1 es1Var2, es1 es1Var3, es1 es1Var4, gs1 gs1Var) {
        this.f13007c = es1Var;
        this.f13008d = es1Var2;
        this.f13009e = es1Var3;
        this.f13006b = es1Var4;
        this.f13010f = gs1Var;
    }

    public k30(gs1 gs1Var, es1 es1Var, es1 es1Var2, gs1 gs1Var2, es1 es1Var3) {
        this.f13006b = gs1Var;
        this.f13007c = es1Var;
        this.f13008d = es1Var2;
        this.f13009e = es1Var3;
        this.f13010f = gs1Var2;
    }
}
