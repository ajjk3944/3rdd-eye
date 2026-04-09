package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ko0 implements pc2 {

    /* renamed from: a, reason: collision with root package name */
    private final jc2<tn0> f29740a;

    /* renamed from: b, reason: collision with root package name */
    private final dd2 f29741b;

    /* renamed from: c, reason: collision with root package name */
    private final hg2 f29742c;

    public /* synthetic */ ko0(pn0 pn0Var, io0 io0Var, dd2 dd2Var) {
        this(pn0Var, io0Var, dd2Var, new v21());
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        boolean zA = this.f29742c.a();
        if (this.f29741b.a() != cd2.i) {
            if (zA) {
                if (this.f29740a.isPlayingAd()) {
                    return;
                }
                this.f29740a.resumeAd();
            } else if (this.f29740a.isPlayingAd()) {
                this.f29740a.pauseAd();
            }
        }
    }

    public ko0(pn0 videoAdPlayer, io0 videoViewProvider, dd2 videoAdStatusController, v21 mrcVideoAdViewValidatorFactory) {
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(videoAdStatusController, "videoAdStatusController");
        kotlin.jvm.internal.l.f(mrcVideoAdViewValidatorFactory, "mrcVideoAdViewValidatorFactory");
        this.f29740a = videoAdPlayer;
        this.f29741b = videoAdStatusController;
        this.f29742c = v21.a(videoViewProvider);
    }
}
