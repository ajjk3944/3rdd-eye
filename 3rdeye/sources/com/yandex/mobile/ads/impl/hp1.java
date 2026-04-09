package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class hp1 implements ac2 {

    /* renamed from: a, reason: collision with root package name */
    private final ia1 f28322a;

    /* renamed from: b, reason: collision with root package name */
    private final mb2<ab1> f28323b;

    /* renamed from: c, reason: collision with root package name */
    private final tc2 f28324c;

    /* renamed from: d, reason: collision with root package name */
    private final a f28325d;

    /* renamed from: e, reason: collision with root package name */
    private gc2 f28326e;

    public /* synthetic */ hp1(ia1 ia1Var, mb2 mb2Var, qc2 qc2Var) {
        ka1 ka1Var = new ka1(ia1Var);
        this(ia1Var, mb2Var, qc2Var, ka1Var, new tc2(ka1Var, qc2Var));
    }

    @Override // com.yandex.mobile.ads.impl.ac2
    public final void play() {
        this.f28322a.a(this.f28325d);
        this.f28322a.a(this.f28323b.d());
    }

    @Override // com.yandex.mobile.ads.impl.ac2
    public final void stop() {
        this.f28324c.b();
        this.f28322a.pauseAd();
        this.f28322a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ac2
    public final void a(gc2 gc2Var) {
        this.f28326e = gc2Var;
    }

    public final class a implements lc2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void a(ec2 playbackInfo) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
            hp1.this.f28324c.b();
            hp1.this.f28322a.a((lc2) null);
            gc2 gc2Var = hp1.this.f28326e;
            if (gc2Var != null) {
                gc2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void b(ec2 playbackInfo) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void c(ec2 playbackInfo) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void d(ec2 playbackInfo) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
            hp1.this.f28322a.c();
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void e(ec2 playbackInfo) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
            hp1.this.f28324c.b();
            hp1.this.f28322a.a((lc2) null);
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void f(ec2 playbackInfo) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void g(ec2 playbackInfo) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void h(ec2 playbackInfo) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
            hp1.this.f28324c.a();
            gc2 gc2Var = hp1.this.f28326e;
            if (gc2Var != null) {
                gc2Var.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void a(kn0 playbackInfo) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
            hp1.this.f28324c.b();
            hp1.this.f28322a.a((lc2) null);
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void a(ec2 playbackInfo, kc2 videoAdPlayerError) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
            kotlin.jvm.internal.l.f(videoAdPlayerError, "videoAdPlayerError");
            hp1.this.f28324c.b();
            hp1.this.f28322a.a((lc2) null);
            hp1.this.f28322a.a(videoAdPlayerError);
        }

        @Override // com.yandex.mobile.ads.impl.lc2
        public final void a(ec2 playbackInfo, float f10) {
            kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        }
    }

    public hp1(ia1 nativeVideoAdPlayer, mb2<ab1> videoAdInfo, qc2 videoAdProgressEventsObservable, jc2<?> videoAdPlayer, tc2 videoAdProgressTrackingManager) {
        kotlin.jvm.internal.l.f(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoAdProgressEventsObservable, "videoAdProgressEventsObservable");
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(videoAdProgressTrackingManager, "videoAdProgressTrackingManager");
        this.f28322a = nativeVideoAdPlayer;
        this.f28323b = videoAdInfo;
        this.f28324c = videoAdProgressTrackingManager;
        this.f28325d = new a();
    }
}
