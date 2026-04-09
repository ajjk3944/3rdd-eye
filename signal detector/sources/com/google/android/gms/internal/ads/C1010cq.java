package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.cq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010cq implements InterfaceC0956bq {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0956bq f13680a;

    /* renamed from: b, reason: collision with root package name */
    public final NA f13681b;

    public C1010cq(InterfaceC0956bq interfaceC0956bq, NA na) {
        this.f13680a = interfaceC0956bq;
        this.f13681b = na;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final boolean a(Xt xt, Qt qt) {
        return this.f13680a.a(xt, qt);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final InterfaceFutureC2326a b(Xt xt, Qt qt) {
        return AbstractC1984ut.G(this.f13680a.b(xt, qt), this.f13681b, AbstractC0640Nf.f10005a);
    }
}
