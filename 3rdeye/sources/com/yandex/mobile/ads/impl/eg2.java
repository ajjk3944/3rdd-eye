package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class eg2 extends ig2<ob1, ya2> {

    /* renamed from: c, reason: collision with root package name */
    private final a8<?> f26838c;

    /* renamed from: d, reason: collision with root package name */
    private final cg2 f26839d;

    /* renamed from: e, reason: collision with root package name */
    private final gb1 f26840e;

    /* renamed from: f, reason: collision with root package name */
    private final bg2 f26841f;

    /* renamed from: g, reason: collision with root package name */
    private final ua1 f26842g;

    /* renamed from: h, reason: collision with root package name */
    private ag2 f26843h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg2(vu1 sdkEnvironmentModule, ob1 view, ke2 videoOptions, C4072a3 adConfiguration, a8 adResponse, ck0 impressionEventsObservable, ta1 nativeVideoPlaybackEventListener, j81 nativeForcePauseObserver, v41 nativeAdControllers, ej0 imageProvider, nx1 nx1Var, cg2 videoTrackerForceImpressionController) {
        super(view);
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(videoOptions, "videoOptions");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        kotlin.jvm.internal.l.f(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(videoTrackerForceImpressionController, "videoTrackerForceImpressionController");
        this.f26838c = adResponse;
        this.f26839d = videoTrackerForceImpressionController;
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        this.f26840e = new gb1(context, this, videoOptions, adConfiguration, adResponse, impressionEventsObservable, nativeVideoPlaybackEventListener, nativeForcePauseObserver, imageProvider, nx1Var);
        this.f26841f = new bg2(sdkEnvironmentModule.d());
        this.f26842g = nativeAdControllers.a();
        impressionEventsObservable.a(videoTrackerForceImpressionController);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(View view) {
        ob1 view2 = (ob1) view;
        kotlin.jvm.internal.l.f(view2, "view");
        this.f26840e.a(view2);
        super.a(view2);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void b(View view, ya2 ya2Var) {
        ob1 view2 = (ob1) view;
        ya2 video = ya2Var;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(video, "video");
        mb2<ab1> mb2VarB = video.b();
        bg2 bg2Var = this.f26841f;
        Context context = view2.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        ag2 ag2VarA = bg2Var.a(context, mb2VarB, nc2.f30843e);
        this.f26843h = ag2VarA;
        this.f26839d.a(ag2VarA);
        ua1 ua1Var = this.f26842g;
        Context context2 = view2.getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        ua1Var.a(context2, mb2VarB, this.f26838c);
        this.f26840e.a(view2, video, ag2VarA);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(ag asset, lg2 viewConfigurator, ya2 ya2Var) {
        ya2 ya2Var2 = ya2Var;
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        ob1 ob1VarB = b();
        if (ob1VarB != null) {
            viewConfigurator.a(ob1VarB, asset);
            if (ya2Var2 == null || this.f26843h == null) {
                return;
            }
            mb2<ab1> mb2VarB = ya2Var2.b();
            viewConfigurator.a((ag<?>) asset, new td2(ob1VarB, mb2VarB.b()));
            this.f26840e.a(ob1VarB, mb2VarB);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a() {
        ag2 ag2Var = this.f26843h;
        if (ag2Var != null) {
            ag2Var.k();
        }
        this.f26839d.a(null);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, ya2 ya2Var) {
        ob1 view2 = (ob1) view;
        ya2 value = ya2Var;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(value, "value");
        return true;
    }
}
