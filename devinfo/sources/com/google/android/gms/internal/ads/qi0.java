package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qi0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15348a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f15349b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f15350c;

    /* renamed from: d, reason: collision with root package name */
    public final gs1 f15351d;

    public /* synthetic */ qi0(es1 es1Var, gs1 gs1Var, js1 js1Var, int i4) {
        this.f15348a = i4;
        this.f15349b = es1Var;
        this.f15351d = gs1Var;
        this.f15350c = js1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f15348a) {
            case 0:
                return new li0((Context) this.f15349b.a(), (p10) this.f15351d.f11600a, (Executor) this.f15350c.a(), 1);
            case 1:
                Context context = (Context) this.f15349b.a();
                za.a aVarB = ((g10) this.f15350c).b();
                t10 t10Var = (t10) this.f15351d.f11600a;
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new si0(context, aVarB, t10Var, exVar);
            case 2:
                return new li0((Context) this.f15349b.a(), (j10) this.f15351d.f11600a, (Executor) this.f15350c.a(), 2);
            case 3:
                return new si0((Context) this.f15349b.a(), (j10) this.f15351d.f11600a, ((g10) this.f15350c).b());
            case 4:
                return new sj0((Context) this.f15349b.a(), (Executor) this.f15350c.a(), (w10) this.f15351d.f11600a, 0);
            default:
                return new sj0((Context) this.f15349b.a(), (Executor) this.f15350c.a(), (w10) this.f15351d.f11600a, 1);
        }
    }

    public /* synthetic */ qi0(es1 es1Var, js1 js1Var, gs1 gs1Var, int i4) {
        this.f15348a = i4;
        this.f15349b = es1Var;
        this.f15350c = js1Var;
        this.f15351d = gs1Var;
    }
}
