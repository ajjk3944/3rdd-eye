package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nm0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14332a;

    /* renamed from: b, reason: collision with root package name */
    public final w81 f14333b;

    public /* synthetic */ nm0(w81 w81Var, int i4) {
        this.f14332a = i4;
        this.f14333b = w81Var;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        switch (this.f14332a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 45;
            default:
                return 51;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        switch (this.f14332a) {
            case 0:
                return ((ex) this.f14333b).e(new mk(1));
            case 1:
                return ((ex) this.f14333b).e(mk.f13917c);
            case 2:
                return ((ex) this.f14333b).e(an0.f9367a);
            case 3:
                return ((ex) this.f14333b).e(new mk(4));
            default:
                return ((ex) this.f14333b).e(mk.f13918d);
        }
    }
}
