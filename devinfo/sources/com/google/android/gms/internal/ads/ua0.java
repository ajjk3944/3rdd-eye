package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ua0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17134a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f17135b;

    /* renamed from: c, reason: collision with root package name */
    public final t90 f17136c;

    public ua0(t90 t90Var, es1 es1Var) {
        this.f17136c = t90Var;
        this.f17135b = es1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f17134a) {
            case 0:
                hc0 hc0Var = (hc0) this.f17136c.f16758b.f9452c;
                al0.z(hc0Var);
                return new ta0(hc0Var, (tb.a) this.f17135b.a());
            default:
                wc0 wc0Var = (wc0) this.f17135b.a();
                hc0 hc0Var2 = (hc0) this.f17136c.f16758b.f9452c;
                al0.z(hc0Var2);
                return new ab0(wc0Var, hc0Var2);
        }
    }

    public ua0(es1 es1Var, t90 t90Var) {
        this.f17135b = es1Var;
        this.f17136c = t90Var;
    }
}
