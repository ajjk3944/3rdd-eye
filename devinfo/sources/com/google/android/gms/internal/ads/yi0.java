package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yi0 implements zh0 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f18756b;

    /* renamed from: c, reason: collision with root package name */
    public final wc0 f18757c;

    /* renamed from: d, reason: collision with root package name */
    public final hq0 f18758d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f18759e;

    /* renamed from: f, reason: collision with root package name */
    public final za.a f18760f;
    public final qo g;

    /* renamed from: i, reason: collision with root package name */
    public final qh0 f18762i;
    public final od0 j;

    /* renamed from: k, reason: collision with root package name */
    public final qd0 f18763k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f18764l;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18755a = 0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18761h = ((Boolean) va.s.f36163e.f36166c.a(sk.f16141ga)).booleanValue();

    public yi0(Context context, za.a aVar, hq0 hq0Var, Executor executor, t10 t10Var, wc0 wc0Var, qo qoVar, qh0 qh0Var, od0 od0Var, qd0 qd0Var) {
        this.f18756b = context;
        this.f18758d = hq0Var;
        this.f18764l = t10Var;
        this.f18759e = executor;
        this.f18760f = aVar;
        this.f18757c = wc0Var;
        this.g = qoVar;
        this.f18762i = qh0Var;
        this.j = od0Var;
        this.f18763k = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(dq0 dq0Var, wp0 wp0Var) {
        switch (this.f18755a) {
            case 0:
                aq0 aq0Var = wp0Var.f18106s;
                if (aq0Var == null || aq0Var.f9386a == null) {
                }
                break;
            default:
                aq0 aq0Var2 = wp0Var.f18106s;
                if (aq0Var2 == null || aq0Var2.f9386a == null) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final vd.b b(dq0 dq0Var, wp0 wp0Var) {
        switch (this.f18755a) {
            case 0:
                h80 h80Var = new h80(17);
                s81 s81Var = s81.f15906b;
                s40 s40Var = new s40(this, wp0Var, dq0Var, h80Var, 7);
                Executor executor = this.f18759e;
                w71 w71VarF = yo0.F(s81Var, s40Var, executor);
                w71VarF.a(new ce(5), executor);
                return w71VarF;
            default:
                h80 h80Var2 = new h80(17);
                s81 s81Var2 = s81.f15906b;
                s40 s40Var2 = new s40(this, wp0Var, dq0Var, h80Var2, 9);
                Executor executor2 = this.f18759e;
                w71 w71VarF2 = yo0.F(s81Var2, s40Var2, executor2);
                w71VarF2.a(new ce(6), executor2);
                return w71VarF2;
        }
    }

    public yi0(Context context, za.a aVar, hq0 hq0Var, Executor executor, w10 w10Var, wc0 wc0Var, qo qoVar, qh0 qh0Var, od0 od0Var, qd0 qd0Var) {
        this.f18756b = context;
        this.f18758d = hq0Var;
        this.f18764l = w10Var;
        this.f18759e = executor;
        this.f18760f = aVar;
        this.f18757c = wc0Var;
        this.g = qoVar;
        this.f18762i = qh0Var;
        this.j = od0Var;
        this.f18763k = qd0Var;
    }
}
