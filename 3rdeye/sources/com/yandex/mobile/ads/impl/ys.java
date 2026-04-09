package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hl0;
import java.util.List;

/* loaded from: classes3.dex */
public final class ys implements u72 {

    /* renamed from: a, reason: collision with root package name */
    private final ct f35969a;

    /* renamed from: b, reason: collision with root package name */
    private final fu f35970b;

    /* renamed from: c, reason: collision with root package name */
    private final mn0 f35971c;

    /* renamed from: d, reason: collision with root package name */
    private final hl0 f35972d;

    /* renamed from: e, reason: collision with root package name */
    private final ab2 f35973e;

    /* renamed from: f, reason: collision with root package name */
    private final nl0 f35974f;

    /* renamed from: g, reason: collision with root package name */
    private final yl0 f35975g;

    /* renamed from: h, reason: collision with root package name */
    private final co0 f35976h;
    private final go0 i;

    public /* synthetic */ ys(Context context, vu1 vu1Var, xs xsVar, ct ctVar, fu fuVar) {
        this(context, vu1Var, xsVar, ctVar, fuVar, new am0(), new do0(), new mn0(), hl0.a.a(), new ab2(), new nl0());
    }

    public final void a(o70 instreamAdView, List<kb2> friendlyOverlays) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        ys ysVarA = this.f35972d.a(instreamAdView);
        if (!equals(ysVarA)) {
            if (ysVarA != null && ysVarA.f35972d.a(ysVarA)) {
                ysVarA.i.d();
            }
            if (this.f35972d.a(this)) {
                this.i.d();
            }
            this.f35972d.a(instreamAdView, this);
        }
        this.f35975g.a(this.f35969a);
        this.f35976h.a(this.f35970b);
        this.i.a(instreamAdView, friendlyOverlays);
    }

    public final void b() {
        this.i.c();
    }

    public final void c() {
        this.f35974f.b();
    }

    public final void d() {
        this.f35974f.c();
    }

    public final void e() {
        if (this.f35972d.a(this)) {
            this.i.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.u72
    public final void invalidateAdPlayer() {
        this.f35975g.b(this.f35969a);
        this.i.a();
    }

    public ys(Context context, vu1 sdkEnvironmentModule, xs instreamAd, ct instreamAdPlayer, fu videoPlayer, am0 instreamAdPlayerReuseControllerFactory, do0 instreamVideoPlayerReuseControllerFactory, mn0 playbackEventListener, hl0 bindingManager, ab2 playbackProxyListener, nl0 customUiElementsHolder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
        kotlin.jvm.internal.l.f(instreamAdPlayer, "instreamAdPlayer");
        kotlin.jvm.internal.l.f(videoPlayer, "videoPlayer");
        kotlin.jvm.internal.l.f(instreamAdPlayerReuseControllerFactory, "instreamAdPlayerReuseControllerFactory");
        kotlin.jvm.internal.l.f(instreamVideoPlayerReuseControllerFactory, "instreamVideoPlayerReuseControllerFactory");
        kotlin.jvm.internal.l.f(playbackEventListener, "playbackEventListener");
        kotlin.jvm.internal.l.f(bindingManager, "bindingManager");
        kotlin.jvm.internal.l.f(playbackProxyListener, "playbackProxyListener");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        this.f35969a = instreamAdPlayer;
        this.f35970b = videoPlayer;
        this.f35971c = playbackEventListener;
        this.f35972d = bindingManager;
        this.f35973e = playbackProxyListener;
        this.f35974f = customUiElementsHolder;
        this.f35975g = am0.a(this);
        this.f35976h = do0.a(this);
        go0 go0Var = new go0(context, sdkEnvironmentModule, instreamAd, new wl0(instreamAdPlayer), new te2(videoPlayer), customUiElementsHolder);
        this.i = go0Var;
        go0Var.a(playbackEventListener);
        go0Var.a(playbackProxyListener);
    }

    public final void a() {
        this.f35976h.b(this.f35970b);
        this.i.b();
    }

    public final void a(yn0 yn0Var) {
        this.f35973e.a(yn0Var);
    }

    public final void a(sl2 sl2Var) {
        this.f35971c.a(sl2Var);
    }
}
