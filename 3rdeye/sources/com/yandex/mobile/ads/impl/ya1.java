package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ya1 implements ac2 {

    /* renamed from: a, reason: collision with root package name */
    private final ia1 f35681a;

    /* renamed from: b, reason: collision with root package name */
    private final he2 f35682b;

    /* renamed from: c, reason: collision with root package name */
    private final dc2 f35683c;

    /* renamed from: d, reason: collision with root package name */
    private final i92<ab1> f35684d;

    /* renamed from: e, reason: collision with root package name */
    private gc2 f35685e;

    public /* synthetic */ ya1(Context context, a8 a8Var, C4072a3 c4072a3, ia1 ia1Var, mb2 mb2Var, sb1 sb1Var, hc2 hc2Var, ag2 ag2Var, qc2 qc2Var, he2 he2Var) {
        this(context, a8Var, c4072a3, ia1Var, mb2Var, sb1Var, hc2Var, ag2Var, qc2Var, he2Var, new dc2(context, c4072a3, hc2Var));
    }

    @Override // com.yandex.mobile.ads.impl.ac2
    public final void play() {
        this.f35684d.d();
    }

    @Override // com.yandex.mobile.ads.impl.ac2
    public final void stop() {
        this.f35684d.b();
        this.f35681a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ac2
    public final void a(gc2 gc2Var) {
        this.f35685e = gc2Var;
    }

    public final class a implements cc2<ab1> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void a(mb2<ab1> videoAdPlaybackInfo, kc2 videoAdPlayerError) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            kotlin.jvm.internal.l.f(videoAdPlayerError, "videoAdPlayerError");
            ya1.this.f35681a.a(videoAdPlayerError);
            gc2 gc2Var = ya1.this.f35685e;
            if (gc2Var != null) {
                gc2Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void b(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void c(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            ya1.this.f35683c.b();
            gc2 gc2Var = ya1.this.f35685e;
            if (gc2Var != null) {
                gc2Var.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void d(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            ya1.this.f35684d.c();
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void e(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            gc2 gc2Var = ya1.this.f35685e;
            if (gc2Var != null) {
                gc2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void f(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void g(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            ya1.this.f35683c.a();
            gc2 gc2Var = ya1.this.f35685e;
            if (gc2Var != null) {
                gc2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void i(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void j(mb2<ab1> videoAdInfo) {
            kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void k(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            ya1.this.f35682b.h();
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void l(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            ya1.this.f35682b.d();
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void a(mb2<ab1> videoAdPlaybackInfo) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
            gc2 gc2Var = ya1.this.f35685e;
            if (gc2Var != null) {
                gc2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.cc2
        public final void a(mb2<ab1> videoAdPlaybackInfo, float f10) {
            kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        }
    }

    public ya1(Context context, a8 adResponse, C4072a3 adConfiguration, ia1 videoAdPlayer, mb2 videoAdInfo, sb1 videoViewProvider, hc2 playbackParametersProvider, ag2 videoTracker, qc2 progressEventsObservable, he2 videoImpressionTrackingListener, dc2 playbackEventsReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(playbackParametersProvider, "playbackParametersProvider");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(progressEventsObservable, "progressEventsObservable");
        kotlin.jvm.internal.l.f(videoImpressionTrackingListener, "videoImpressionTrackingListener");
        kotlin.jvm.internal.l.f(playbackEventsReporter, "playbackEventsReporter");
        this.f35681a = videoAdPlayer;
        this.f35682b = videoImpressionTrackingListener;
        this.f35683c = playbackEventsReporter;
        i92<ab1> i92Var = new i92<>(context, adConfiguration, new ka1(videoAdPlayer), videoViewProvider, videoAdInfo, new fb1(videoViewProvider), new dd2(), videoTracker, progressEventsObservable, new a(), adResponse);
        this.f35684d = i92Var;
        i92Var.a(playbackParametersProvider);
    }
}
