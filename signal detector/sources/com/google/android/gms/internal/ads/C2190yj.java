package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2190yj implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17748a;

    /* renamed from: b, reason: collision with root package name */
    public final C1338iu f17749b;

    public /* synthetic */ C2190yj(C1338iu c1338iu, int i) {
        this.f17748a = i;
        this.f17749b = c1338iu;
    }

    public Qt a() {
        Qt qt = (Qt) this.f17749b.f14823c;
        Cr.v(qt);
        return qt;
    }

    public Xt b() {
        Xt xt = (Xt) this.f17749b.f14822b;
        Cr.v(xt);
        return xt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f17748a) {
            case 0:
                Qt qt = (Qt) this.f17749b.f14823c;
                Cr.v(qt);
                return qt;
            case 1:
                return (String) this.f17749b.f14824d;
            case 2:
                return this.f17749b.w();
            default:
                Xt xt = (Xt) this.f17749b.f14822b;
                Cr.v(xt);
                return xt;
        }
    }
}
