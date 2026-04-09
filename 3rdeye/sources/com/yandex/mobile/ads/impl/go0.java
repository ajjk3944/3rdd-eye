package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class go0 {

    /* renamed from: a, reason: collision with root package name */
    private final wl0 f27852a;

    /* renamed from: b, reason: collision with root package name */
    private final te2 f27853b;

    /* renamed from: c, reason: collision with root package name */
    private final pm0 f27854c;

    /* renamed from: d, reason: collision with root package name */
    private final eo0 f27855d;

    public /* synthetic */ go0(Context context, vu1 vu1Var, xs xsVar, wl0 wl0Var, te2 te2Var, nl0 nl0Var) {
        pm0 pm0Var = new pm0();
        this(context, vu1Var, xsVar, wl0Var, te2Var, nl0Var, pm0Var, new eo0(context, vu1Var, xsVar, wl0Var, pm0Var, te2Var, nl0Var));
    }

    public final void a(o70 instreamAdView, List<kb2> friendlyOverlays) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        this.f27854c.a(instreamAdView, friendlyOverlays);
        this.f27852a.a();
        this.f27853b.g();
        this.f27855d.a();
    }

    public final void b() {
        this.f27855d.d();
    }

    public final void c() {
        this.f27852a.a();
        this.f27855d.h();
    }

    public final void d() {
        this.f27855d.j();
        this.f27854c.b();
    }

    public go0(Context context, vu1 sdkEnvironmentModule, xs instreamVideoAd, wl0 instreamAdPlayerController, te2 videoPlayerController, nl0 customUiElementsHolder, pm0 instreamAdViewsHolderManager, eo0 instreamVideoPresenter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        kotlin.jvm.internal.l.f(instreamVideoPresenter, "instreamVideoPresenter");
        this.f27852a = instreamAdPlayerController;
        this.f27853b = videoPlayerController;
        this.f27854c = instreamAdViewsHolderManager;
        this.f27855d = instreamVideoPresenter;
    }

    public final void a() {
        this.f27855d.c();
    }

    public final void a(yn0 yn0Var) {
        this.f27855d.a(yn0Var);
    }

    public final void a(fo0 fo0Var) {
        this.f27855d.a(fo0Var);
    }
}
