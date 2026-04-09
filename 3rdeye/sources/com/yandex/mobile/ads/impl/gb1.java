package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class gb1 {

    /* renamed from: a, reason: collision with root package name */
    private final j81 f27613a;

    /* renamed from: b, reason: collision with root package name */
    private final eb1 f27614b;

    /* renamed from: c, reason: collision with root package name */
    private final qd2 f27615c;

    /* renamed from: d, reason: collision with root package name */
    private final la1 f27616d;

    /* renamed from: e, reason: collision with root package name */
    private db1 f27617e;

    /* renamed from: f, reason: collision with root package name */
    private i81 f27618f;

    public gb1(Context context, eg2 viewAdapter, ke2 videoOptions, C4072a3 adConfiguration, a8 adResponse, he2 impressionTrackingListener, ta1 nativeVideoPlaybackEventListener, j81 nativeForcePauseObserver, ej0 imageProvider, eb1 presenterCreator, qd2 aspectRatioProvider, la1 nativeVideoAdPlayerProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(viewAdapter, "viewAdapter");
        kotlin.jvm.internal.l.f(videoOptions, "videoOptions");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(impressionTrackingListener, "impressionTrackingListener");
        kotlin.jvm.internal.l.f(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(presenterCreator, "presenterCreator");
        kotlin.jvm.internal.l.f(aspectRatioProvider, "aspectRatioProvider");
        kotlin.jvm.internal.l.f(nativeVideoAdPlayerProvider, "nativeVideoAdPlayerProvider");
        this.f27613a = nativeForcePauseObserver;
        this.f27614b = presenterCreator;
        this.f27615c = aspectRatioProvider;
        this.f27616d = nativeVideoAdPlayerProvider;
    }

    public final void a(ob1 videoView, mb2<ab1> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoView, "videoView");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f27615c.getClass();
        videoView.setAspectRatio(videoAdInfo.d().getAdHeight() != 0 ? r3.getAdWidth() / r3.getAdHeight() : 1.7777778f);
        db1 db1Var = this.f27617e;
        if (db1Var != null) {
            db1Var.a();
        }
    }

    public /* synthetic */ gb1(Context context, eg2 eg2Var, ke2 ke2Var, C4072a3 c4072a3, a8 a8Var, he2 he2Var, ta1 ta1Var, j81 j81Var, ej0 ej0Var, nx1 nx1Var) {
        eb1 eb1Var = new eb1(eg2Var, ke2Var, c4072a3, a8Var, he2Var, ta1Var, ej0Var, nx1Var);
        qd2 qd2Var = new qd2();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, eg2Var, ke2Var, c4072a3, a8Var, he2Var, ta1Var, j81Var, ej0Var, eb1Var, qd2Var, new la1(applicationContext, c4072a3, a8Var));
    }

    public final void a(ob1 videoView) {
        kotlin.jvm.internal.l.f(videoView, "videoView");
        db1 db1Var = this.f27617e;
        if (db1Var != null) {
            db1Var.b(videoView);
        }
        i81 i81Var = this.f27618f;
        if (i81Var != null) {
            this.f27613a.b(i81Var);
            this.f27618f = null;
        }
        videoView.setOnAttachStateChangeListener(null);
    }

    public final void a(ob1 videoView, ya2 video, ag2 videoTracker) {
        kotlin.jvm.internal.l.f(videoView, "videoView");
        kotlin.jvm.internal.l.f(video, "video");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        ia1 ia1VarA = this.f27616d.a(video.b());
        Context context = videoView.getContext();
        eb1 eb1Var = this.f27614b;
        kotlin.jvm.internal.l.c(context);
        db1 db1VarA = eb1Var.a(context, ia1VarA, video, videoTracker);
        this.f27617e = db1VarA;
        db1VarA.a(videoView);
        i81 i81Var = new i81(ia1VarA);
        this.f27618f = i81Var;
        this.f27613a.a(i81Var);
        videoView.setOnAttachStateChangeListener(new qa1(ia1VarA, videoView));
    }
}
