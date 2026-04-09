package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pi0 implements zh0 {

    /* renamed from: a, reason: collision with root package name */
    public final p10 f15009a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15010b;

    /* renamed from: c, reason: collision with root package name */
    public final wc0 f15011c;

    /* renamed from: d, reason: collision with root package name */
    public final hq0 f15012d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15013e;

    /* renamed from: f, reason: collision with root package name */
    public final z21 f15014f;
    public final od0 g;

    public pi0(p10 p10Var, Context context, Executor executor, wc0 wc0Var, hq0 hq0Var, z21 z21Var, od0 od0Var) {
        this.f15010b = context;
        this.f15009a = p10Var;
        this.f15013e = executor;
        this.f15011c = wc0Var;
        this.f15012d = hq0Var;
        this.f15014f = z21Var;
        this.g = od0Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(dq0 dq0Var, wp0 wp0Var) {
        aq0 aq0Var = wp0Var.f18106s;
        return (aq0Var == null || aq0Var.f9386a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final vd.b b(dq0 dq0Var, wp0 wp0Var) {
        return yo0.F(s81.f15906b, new s40(this, dq0Var, wp0Var, 4), this.f15013e);
    }
}
