package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class pn0 implements jc2<tn0> {

    /* renamed from: a, reason: collision with root package name */
    private final tn0 f31846a;

    /* renamed from: b, reason: collision with root package name */
    private final wl0 f31847b;

    /* renamed from: c, reason: collision with root package name */
    private a f31848c;

    public pn0(tn0 instreamVideoAd, wl0 instreamAdPlayerController) {
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        this.f31846a = instreamVideoAd;
        this.f31847b = instreamAdPlayerController;
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void a(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f31847b.g(videoAdInfo.d());
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final long b() {
        return this.f31847b.a(this.f31846a);
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void c() {
        this.f31847b.f(this.f31846a);
    }

    public final void d() {
        this.f31847b.h(this.f31846a);
    }

    public final void e() {
        this.f31847b.j(this.f31846a);
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final long getAdPosition() {
        return this.f31847b.b(this.f31846a);
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final float getVolume() {
        return this.f31847b.c(this.f31846a);
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final boolean isPlayingAd() {
        return this.f31847b.d(this.f31846a);
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void pauseAd() {
        this.f31847b.e(this.f31846a);
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void resumeAd() {
        this.f31847b.i(this.f31846a);
    }

    public static final class a implements dt {

        /* renamed from: a, reason: collision with root package name */
        private final lc2 f31849a;

        public a(bc2 listener) {
            kotlin.jvm.internal.l.f(listener, "listener");
            this.f31849a = listener;
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void a(tn0 videoAd) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.a(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void b(tn0 videoAd) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.d(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void c(tn0 videoAd) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.b(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void d(tn0 videoAd) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.h(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void e(tn0 videoAd) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.g(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void f(tn0 videoAd) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.e(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void g(tn0 videoAd) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.a((ec2) videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void h(tn0 videoAd) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.c(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void i(tn0 videoAd) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.f(videoAd.g());
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void a(tn0 videoAd, kc2 error) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            kotlin.jvm.internal.l.f(error, "error");
            this.f31849a.a(videoAd.g(), error);
        }

        @Override // com.yandex.mobile.ads.impl.dt
        public final void a(tn0 videoAd, float f10) {
            kotlin.jvm.internal.l.f(videoAd, "videoAd");
            this.f31849a.a(videoAd.g(), f10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void a(bc2 bc2Var) {
        a aVar = this.f31848c;
        if (aVar != null) {
            this.f31847b.b(this.f31846a, aVar);
            this.f31848c = null;
        }
        if (bc2Var != null) {
            a aVar2 = new a(bc2Var);
            this.f31847b.a(this.f31846a, aVar2);
            this.f31848c = aVar2;
        }
    }

    public final void a(float f10) {
        this.f31847b.a(this.f31846a, f10);
    }

    @Override // com.yandex.mobile.ads.impl.jc2
    public final void a() {
        this.f31847b.k(this.f31846a);
    }
}
