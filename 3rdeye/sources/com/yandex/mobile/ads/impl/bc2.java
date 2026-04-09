package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class bc2<T> implements lc2 {

    /* renamed from: a, reason: collision with root package name */
    private final mb2<T> f25216a;

    /* renamed from: b, reason: collision with root package name */
    private final jc2<T> f25217b;

    /* renamed from: c, reason: collision with root package name */
    private final tc2 f25218c;

    /* renamed from: d, reason: collision with root package name */
    private final wc2 f25219d;

    /* renamed from: e, reason: collision with root package name */
    private final dd2 f25220e;

    /* renamed from: f, reason: collision with root package name */
    private final C4198s4 f25221f;

    /* renamed from: g, reason: collision with root package name */
    private final zf2 f25222g;

    /* renamed from: h, reason: collision with root package name */
    private final cc2<T> f25223h;
    private ic2 i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25224j;

    public bc2(mb2 videoAdInfo, jc2 videoAdPlayer, tc2 progressTrackingManager, wc2 videoAdRenderingController, dd2 videoAdStatusController, C4198s4 adLoadingPhasesManager, ag2 videoTracker, cc2 playbackEventsListener) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(progressTrackingManager, "progressTrackingManager");
        kotlin.jvm.internal.l.f(videoAdRenderingController, "videoAdRenderingController");
        kotlin.jvm.internal.l.f(videoAdStatusController, "videoAdStatusController");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(playbackEventsListener, "playbackEventsListener");
        this.f25216a = videoAdInfo;
        this.f25217b = videoAdPlayer;
        this.f25218c = progressTrackingManager;
        this.f25219d = videoAdRenderingController;
        this.f25220e = videoAdStatusController;
        this.f25221f = adLoadingPhasesManager;
        this.f25222g = videoTracker;
        this.f25223h = playbackEventsListener;
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a(ec2 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        this.f25224j = false;
        this.f25220e.b(cd2.f25606g);
        this.f25222g.b();
        this.f25218c.b();
        this.f25219d.c();
        this.f25223h.g(this.f25216a);
        this.f25217b.a((bc2) null);
        this.f25223h.j(this.f25216a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void b(ec2 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        this.f25220e.b(cd2.f25607h);
        if (this.f25224j) {
            this.f25222g.d();
        }
        this.f25223h.b(this.f25216a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void c(ec2 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        if (this.f25224j) {
            this.f25220e.b(cd2.f25604e);
            this.f25222g.j();
        }
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void d(ec2 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        this.f25220e.b(cd2.f25603d);
        this.f25221f.a(EnumC4191r4.f32473w);
        this.f25223h.d(this.f25216a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void e(ec2 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        this.f25222g.g();
        this.f25224j = false;
        this.f25220e.b(cd2.f25605f);
        this.f25218c.b();
        this.f25219d.d();
        this.f25223h.e(this.f25216a);
        this.f25217b.a((bc2) null);
        this.f25223h.j(this.f25216a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void f(ec2 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        if (this.f25224j) {
            this.f25220e.b(cd2.i);
            this.f25222g.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void g(ec2 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        this.f25220e.b(cd2.f25604e);
        if (this.f25224j) {
            this.f25222g.c();
        }
        this.f25218c.a();
        this.f25223h.f(this.f25216a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void h(ec2 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        this.f25224j = true;
        this.f25220e.b(cd2.f25604e);
        this.f25218c.a();
        this.i = new ic2(this.f25217b, this.f25222g);
        this.f25223h.c(this.f25216a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a(kn0 playbackInfo) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        this.f25222g.e();
        this.f25224j = false;
        this.f25220e.b(cd2.f25605f);
        this.f25218c.b();
        this.f25219d.d();
        this.f25223h.a(this.f25216a);
        this.f25217b.a((bc2) null);
        this.f25223h.j(this.f25216a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a(ec2 playbackInfo, kc2 videoAdPlayerError) {
        cd2 cd2Var;
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        kotlin.jvm.internal.l.f(videoAdPlayerError, "videoAdPlayerError");
        this.f25224j = false;
        if (this.f25220e.a(cd2.f25603d)) {
            cd2Var = cd2.f25608j;
        } else {
            cd2Var = cd2.f25609k;
        }
        this.f25220e.b(cd2Var);
        this.f25218c.b();
        this.f25219d.a(videoAdPlayerError);
        this.f25222g.a(videoAdPlayerError);
        this.f25223h.a(this.f25216a, videoAdPlayerError);
        this.f25217b.a((bc2) null);
        this.f25223h.j(this.f25216a);
    }

    @Override // com.yandex.mobile.ads.impl.lc2
    public final void a(ec2 playbackInfo, float f10) {
        kotlin.jvm.internal.l.f(playbackInfo, "playbackInfo");
        this.f25222g.a(f10);
        ic2 ic2Var = this.i;
        if (ic2Var != null) {
            ic2Var.a(f10);
        }
        this.f25223h.a(this.f25216a, f10);
    }
}
