package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.yc2;

/* loaded from: classes3.dex */
public final class i92<T> {

    /* renamed from: a, reason: collision with root package name */
    private final jc2<T> f28597a;

    /* renamed from: b, reason: collision with root package name */
    private final fg2 f28598b;

    /* renamed from: c, reason: collision with root package name */
    private final mb2<T> f28599c;

    /* renamed from: d, reason: collision with root package name */
    private final dd2 f28600d;

    /* renamed from: e, reason: collision with root package name */
    private final zf2 f28601e;

    /* renamed from: f, reason: collision with root package name */
    private final C4198s4 f28602f;

    /* renamed from: g, reason: collision with root package name */
    private final wc2 f28603g;

    /* renamed from: h, reason: collision with root package name */
    private final tc2 f28604h;
    private final bc2<T> i;

    public i92(Context context, C4072a3 adConfiguration, jc2 videoAdPlayer, fg2 videoViewProvider, mb2 videoAdInfo, hf2 videoRenderValidator, dd2 videoAdStatusController, ag2 videoTracker, qc2 progressEventsObservable, cc2 playbackEventsListener, a8 a8Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoRenderValidator, "videoRenderValidator");
        kotlin.jvm.internal.l.f(videoAdStatusController, "videoAdStatusController");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(progressEventsObservable, "progressEventsObservable");
        kotlin.jvm.internal.l.f(playbackEventsListener, "playbackEventsListener");
        this.f28597a = videoAdPlayer;
        this.f28598b = videoViewProvider;
        this.f28599c = videoAdInfo;
        this.f28600d = videoAdStatusController;
        this.f28601e = videoTracker;
        C4198s4 c4198s4 = new C4198s4();
        this.f28602f = c4198s4;
        wc2 wc2Var = new wc2(context, adConfiguration, a8Var, videoAdInfo, c4198s4, videoAdStatusController, videoViewProvider, videoRenderValidator, videoTracker);
        this.f28603g = wc2Var;
        tc2 tc2Var = new tc2(videoAdPlayer, progressEventsObservable);
        this.f28604h = tc2Var;
        this.i = new bc2<>(videoAdInfo, videoAdPlayer, tc2Var, wc2Var, videoAdStatusController, c4198s4, videoTracker, playbackEventsListener);
        new sc2(context, videoAdInfo, videoViewProvider, videoAdStatusController, videoTracker, videoAdPlayer, playbackEventsListener).a(progressEventsObservable);
    }

    public final void a() {
        this.f28604h.b();
        this.f28597a.a((bc2) null);
        this.f28600d.b();
        this.f28603g.e();
        this.f28602f.a();
    }

    public final void b() {
        this.f28604h.b();
        this.f28597a.pauseAd();
    }

    public final void c() {
        this.f28597a.c();
    }

    public final void d() {
        this.f28597a.a(this.i);
        this.f28597a.a(this.f28599c);
        C4198s4 c4198s4 = this.f28602f;
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32473w;
        uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        View view = this.f28598b.getView();
        if (view != null) {
            this.f28601e.a(view, this.f28598b.a());
        }
        this.f28603g.f();
        this.f28600d.b(cd2.f25602c);
    }

    public final void e() {
        this.f28597a.resumeAd();
    }

    public final void f() {
        this.f28597a.a();
    }

    public final void a(yc2.b reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f28603g.a(reportParameterManager);
    }

    public final void a(yc2.a reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f28603g.a(reportParameterManager);
    }
}
