package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class bx0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f25454a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f25455b;

    /* renamed from: c, reason: collision with root package name */
    private final uf2 f25456c;

    /* renamed from: d, reason: collision with root package name */
    private final jv f25457d;

    /* renamed from: e, reason: collision with root package name */
    private final ib1 f25458e;

    /* renamed from: f, reason: collision with root package name */
    private final xa1 f25459f;

    /* renamed from: g, reason: collision with root package name */
    private final rb1 f25460g;

    public /* synthetic */ bx0(vu1 vu1Var, a8 a8Var) {
        this(vu1Var, a8Var, new uf2(), new jv(), new ib1());
    }

    public final rv1 a(CustomizableMediaView mediaView, ov0 customControls, C4072a3 adConfiguration, ck0 impressionEventsObservable, ta1 listener, j81 nativeForcePauseObserver, v41 nativeAdControllers, cx0 mediaViewRenderController, ej0 imageProvider, nx1 nx1Var, ya2 ya2Var) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(customControls, "customControls");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        Context context = mediaView.getContext();
        lf2 lf2VarA = this.f25458e.a(mediaView);
        xa1 xa1Var = this.f25459f;
        nf2 nf2VarD = ya2Var != null ? ya2Var.d() : null;
        xa1Var.getClass();
        ke2 ke2Var = new ke2(lf2VarA, nf2VarD != null ? nf2VarD.b() : true, nf2VarD != null ? nf2VarD.c() : false, nf2VarD != null ? nf2VarD.a() : null);
        this.f25457d.getClass();
        int videoControlsLayoutId = mediaView.getVideoControlsLayoutId();
        rb1 rb1Var = this.f25460g;
        kotlin.jvm.internal.l.c(context);
        ob1 nativeVideoView = rb1Var.a(context, ke2Var, customControls, ya2Var, videoControlsLayoutId);
        this.f25456c.getClass();
        kotlin.jvm.internal.l.f(nativeVideoView, "nativeVideoView");
        Context context2 = mediaView.getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        if (!s80.a(context2, r80.f32551e)) {
            mediaView.removeAllViews();
        }
        mediaView.addView(nativeVideoView, new FrameLayout.LayoutParams(-1, -1));
        eg2 eg2Var = new eg2(this.f25454a, nativeVideoView, ke2Var, adConfiguration, this.f25455b, impressionEventsObservable, listener, nativeForcePauseObserver, nativeAdControllers, imageProvider, nx1Var, new cg2());
        return new rv1(mediaView, eg2Var, mediaViewRenderController, new jg2(eg2Var));
    }

    public bx0(vu1 sdkEnvironmentModule, a8<?> adResponse, uf2 videoSubViewBinder, jv customizableMediaViewManager, ib1 nativeVideoScaleTypeProvider) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(videoSubViewBinder, "videoSubViewBinder");
        kotlin.jvm.internal.l.f(customizableMediaViewManager, "customizableMediaViewManager");
        kotlin.jvm.internal.l.f(nativeVideoScaleTypeProvider, "nativeVideoScaleTypeProvider");
        this.f25454a = sdkEnvironmentModule;
        this.f25455b = adResponse;
        this.f25456c = videoSubViewBinder;
        this.f25457d = customizableMediaViewManager;
        this.f25458e = nativeVideoScaleTypeProvider;
        this.f25459f = new xa1();
        this.f25460g = new rb1();
    }
}
