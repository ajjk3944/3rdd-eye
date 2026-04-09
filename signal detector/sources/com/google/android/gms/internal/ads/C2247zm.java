package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2247zm implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17938a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f17939b;

    /* renamed from: c, reason: collision with root package name */
    public final C0850Zl f17940c;

    public C2247zm(C0850Zl c0850Zl, C1799rN c1799rN) {
        this.f17940c = c0850Zl;
        this.f17939b = c1799rN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f17938a) {
            case 0:
                C1547mn c1547mn = (C1547mn) this.f17940c.f12948b.f15174c;
                Cr.v(c1547mn);
                return new ViewOnClickListenerC2193ym(c1547mn, (Q2.a) this.f17939b.c());
            default:
                C0427An c0427An = (C0427An) this.f17939b.c();
                C1547mn c1547mn2 = (C1547mn) this.f17940c.f12948b.f15174c;
                Cr.v(c1547mn2);
                return new C0511Fm(c0427An, c1547mn2);
        }
    }

    public C2247zm(C1799rN c1799rN, C0850Zl c0850Zl) {
        this.f17939b = c1799rN;
        this.f17940c = c0850Zl;
    }
}
