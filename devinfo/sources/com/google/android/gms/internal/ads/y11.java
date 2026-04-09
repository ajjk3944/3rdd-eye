package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y11 implements w11, my0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18601a;

    /* renamed from: b, reason: collision with root package name */
    public final g21 f18602b;

    /* renamed from: c, reason: collision with root package name */
    public final w81 f18603c;

    /* renamed from: d, reason: collision with root package name */
    public final sx0 f18604d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f18605e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public vd.b f18606f = s81.f15906b;

    public y11(Context context, sx0 sx0Var, g21 g21Var, w81 w81Var) {
        this.f18601a = context;
        this.f18602b = g21Var;
        this.f18603c = w81Var;
        this.f18604d = sx0Var;
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void a(HashMap map) {
        map.put("gs", this.f18606f);
    }

    @Override // com.google.android.gms.internal.ads.my0
    public final vd.b b() {
        if (this.f18605e.getAndSet(true) || !this.f18604d.H()) {
            return s81.f15906b;
        }
        return ((ex) this.f18603c).c(new du0(7, this));
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void c(HashMap map) {
        map.put("gs", this.f18606f);
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void d(HashMap map, Context context, View view) {
        map.put("gs", this.f18606f);
    }
}
