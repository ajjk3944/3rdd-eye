package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class up0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17285a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f17286b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17287c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17288d;

    public /* synthetic */ up0(int i4, es1 es1Var, es1 es1Var2, Object obj) {
        this.f17285a = i4;
        this.f17286b = es1Var;
        this.f17287c = es1Var2;
        this.f17288d = obj;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f17285a) {
            case 0:
                return new tp0((qp0) this.f17286b.a(), (np0) ((es1) this.f17287c).a(), (eq0) ((es1) this.f17288d).a());
            case 1:
                dy0 dy0Var = ((sx0) ((gs1) this.f17288d).f11600a).X() ? (dy0) es1.c(this.f17286b).a() : (dy0) es1.c((es1) this.f17287c).a();
                al0.z(dy0Var);
                return dy0Var;
            default:
                Context context = (Context) ((gs1) this.f17287c).f11600a;
                return new e21(context, (ExecutorService) ((gs1) this.f17288d).f11600a, e21.g);
        }
    }

    public up0(gs1 gs1Var, es1 es1Var, gs1 gs1Var2) {
        this.f17285a = 2;
        this.f17287c = gs1Var;
        this.f17286b = es1Var;
        this.f17288d = gs1Var2;
    }
}
