package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class gf2 implements vl1 {

    /* renamed from: a, reason: collision with root package name */
    private final d9 f27678a;

    /* renamed from: b, reason: collision with root package name */
    private final oj1 f27679b;

    /* renamed from: c, reason: collision with root package name */
    private final ce2 f27680c;

    /* renamed from: d, reason: collision with root package name */
    private final pi1 f27681d;

    public gf2(d9 adStateHolder, ni1 playerStateController, oj1 positionProviderHolder, ce2 videoDurationHolder, pi1 playerStateHolder) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        this.f27678a = adStateHolder;
        this.f27679b = positionProviderHolder;
        this.f27680c = videoDurationHolder;
        this.f27681d = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    public final wh1 a() {
        mj1 mj1VarA = this.f27679b.a();
        ji1 ji1VarB = this.f27679b.b();
        return new wh1(mj1VarA != null ? mj1VarA.a() : (ji1VarB == null || this.f27678a.b() || this.f27681d.c()) ? -1L : ji1VarB.a(), this.f27680c.a() != -9223372036854775807L ? this.f27680c.a() : -1L);
    }
}
