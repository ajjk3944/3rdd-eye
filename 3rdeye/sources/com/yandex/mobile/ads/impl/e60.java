package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class e60 implements ct {

    /* renamed from: a, reason: collision with root package name */
    private final d9 f26686a;

    /* renamed from: b, reason: collision with root package name */
    private final vl1 f26687b;

    /* renamed from: c, reason: collision with root package name */
    private final C4179p5 f26688c;

    /* renamed from: d, reason: collision with root package name */
    private final C4165n5 f26689d;

    /* renamed from: e, reason: collision with root package name */
    private final C4151l5 f26690e;

    /* renamed from: f, reason: collision with root package name */
    private final pi1 f26691f;

    /* renamed from: g, reason: collision with root package name */
    private final ti1 f26692g;

    public e60(d9 adStateHolder, ni1 playerStateController, ml1 progressProvider, C4179p5 prepareController, C4165n5 playController, C4151l5 adPlayerEventsController, pi1 playerStateHolder, ti1 playerVolumeController) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(progressProvider, "progressProvider");
        kotlin.jvm.internal.l.f(prepareController, "prepareController");
        kotlin.jvm.internal.l.f(playController, "playController");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(playerVolumeController, "playerVolumeController");
        this.f26686a = adStateHolder;
        this.f26687b = progressProvider;
        this.f26688c = prepareController;
        this.f26689d = playController;
        this.f26690e = adPlayerEventsController;
        this.f26691f = playerStateHolder;
        this.f26692g = playerVolumeController;
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final long a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f26687b.a().b();
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final long b(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f26687b.a().c();
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void c(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f26689d.b(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void d(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f26688c.a(videoAd);
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
            this.f26689d.a(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void g(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f26689d.c(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void h(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f26689d.d(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void i(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        try {
            this.f26689d.e(videoAd);
        } catch (RuntimeException e4) {
            fp0.b(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final boolean j(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return this.f26686a.a(videoAd) != jm0.f29209b && this.f26691f.c();
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final float k(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        Float fA = this.f26692g.a();
        if (fA != null) {
            return fA.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void a(xl0 xl0Var) {
        this.f26690e.a(xl0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ct
    public final void a(tn0 videoAd, float f10) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f26692g.a(f10);
        this.f26690e.a(videoAd, f10);
    }
}
