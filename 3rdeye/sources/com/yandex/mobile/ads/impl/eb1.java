package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class eb1 {

    /* renamed from: a, reason: collision with root package name */
    private final eg2 f26773a;

    /* renamed from: b, reason: collision with root package name */
    private final ke2 f26774b;

    /* renamed from: c, reason: collision with root package name */
    private final C4072a3 f26775c;

    /* renamed from: d, reason: collision with root package name */
    private final a8<?> f26776d;

    /* renamed from: e, reason: collision with root package name */
    private final he2 f26777e;

    /* renamed from: f, reason: collision with root package name */
    private final za1 f26778f;

    /* renamed from: g, reason: collision with root package name */
    private final ej0 f26779g;

    /* renamed from: h, reason: collision with root package name */
    private final nx1 f26780h;

    public eb1(eg2 videoViewAdapter, ke2 videoOptions, C4072a3 adConfiguration, a8 adResponse, he2 videoImpressionListener, ta1 nativeVideoPlaybackEventListener, ej0 imageProvider, nx1 nx1Var) {
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        kotlin.jvm.internal.l.f(videoOptions, "videoOptions");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(videoImpressionListener, "videoImpressionListener");
        kotlin.jvm.internal.l.f(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        this.f26773a = videoViewAdapter;
        this.f26774b = videoOptions;
        this.f26775c = adConfiguration;
        this.f26776d = adResponse;
        this.f26777e = videoImpressionListener;
        this.f26778f = nativeVideoPlaybackEventListener;
        this.f26779g = imageProvider;
        this.f26780h = nx1Var;
    }

    public final db1 a(Context context, ia1 videoAdPlayer, ya2 video, ag2 videoTracker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(video, "video");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        return new db1(context, this.f26776d, this.f26775c, videoAdPlayer, video, this.f26774b, this.f26773a, new hc2(this.f26775c, this.f26776d), videoTracker, this.f26777e, this.f26778f, this.f26779g, this.f26780h);
    }
}
