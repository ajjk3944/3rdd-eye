package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ff2 implements ul1 {

    /* renamed from: a, reason: collision with root package name */
    private final c9 f27315a;

    /* renamed from: b, reason: collision with root package name */
    private final nj1 f27316b;

    /* renamed from: c, reason: collision with root package name */
    private final be2 f27317c;

    /* renamed from: d, reason: collision with root package name */
    private final oi1 f27318d;

    public ff2(c9 adStateHolder, mi1 playerStateController, nj1 positionProviderHolder, be2 videoDurationHolder, oi1 playerStateHolder) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        this.f27315a = adStateHolder;
        this.f27316b = positionProviderHolder;
        this.f27317c = videoDurationHolder;
        this.f27318d = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.ul1
    public final xh1 a() {
        lj1 lj1VarA = this.f27316b.a();
        ii1 ii1VarB = this.f27316b.b();
        return new xh1(lj1VarA != null ? lj1VarA.a() : (ii1VarB == null || this.f27315a.b() || this.f27318d.c()) ? -1L : ii1VarB.a(), this.f27317c.a() != -9223372036854775807L ? this.f27317c.a() : -1L);
    }
}
