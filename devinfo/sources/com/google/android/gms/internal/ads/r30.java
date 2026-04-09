package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r30 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final es1 f15518a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f15519b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f15520c;

    public r30(es1 es1Var, es1 es1Var2, es1 es1Var3) {
        this.f15518a = es1Var;
        this.f15519b = es1Var2;
        this.f15520c = es1Var3;
    }

    @Override // com.google.android.gms.internal.ads.js1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k70 a() {
        return new k70((ScheduledExecutorService) this.f15518a.a(), (tb.a) this.f15519b.a(), (qd0) this.f15520c.a());
    }
}
