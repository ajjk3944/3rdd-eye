package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes3.dex */
public final class Qj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f40022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40023b;

    public Qj(AdRevenue adRevenue, boolean z10) {
        this.f40022a = adRevenue;
        this.f40023b = z10;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.reportAdRevenue(this.f40022a, this.f40023b);
    }
}
