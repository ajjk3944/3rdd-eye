package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class d60 implements ct {

    /* renamed from: a, reason: collision with root package name */
    private final c9 f25978a;

    /* renamed from: b, reason: collision with root package name */
    private final ul1 f25979b;

    /* renamed from: c, reason: collision with root package name */
    private final C4172o5 f25980c;

    /* renamed from: d, reason: collision with root package name */
    private final C4158m5 f25981d;

    /* renamed from: e, reason: collision with root package name */
    private final C4144k5 f25982e;

    /* renamed from: f, reason: collision with root package name */
    private final oi1 f25983f;

    /* renamed from: g, reason: collision with root package name */
    private final si1 f25984g;

    public d60(c9 adStateHolder, mi1 playerStateController, ll1 progressProvider, C4172o5 prepareController, C4158m5 playController, C4144k5 adPlayerEventsController, oi1 playerStateHolder, si1 playerVolumeController) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(progressProvider, "progressProvider");
        kotlin.jvm.internal.l.f(prepareController, "prepareController");
        kotlin.jvm.internal.l.f(playController, "playController");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(playerVolumeController, "playerVolumeController");
        this.f25978a = adStateHolder;
        this.f25979b = progressProvider;
        this.f25980c = prepareController;
        this.f25981d = playController;
        this.f25982e = adPlayerEventsController;
        this.f25983f = playerStateHolder;
        this.f25984g = playerVolumeController;
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final long a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f25979b.a().b();
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final long b(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f25979b.a().c();
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void c(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f25981d.b(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void d(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f25980c.a(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void e(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void f(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f25981d.a(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void g(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f25981d.c(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void h(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f25981d.d(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void i(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f25981d.e(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final boolean j(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f25978a.a(videoAd) != im0.f28742b && this.f25983f.c();
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final float k(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        Float fA = this.f25984g.a();
        if (fA != null) {
            return fA.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void a(xl0 xl0Var) {
        this.f25982e.a(xl0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void a(tn0 videoAd, float f10) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f25984g.a(f10);
        this.f25982e.a(videoAd, f10);
    }
}
