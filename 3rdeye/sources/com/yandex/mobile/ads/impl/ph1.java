package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ph1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31754a;

    /* renamed from: b, reason: collision with root package name */
    private final wl0 f31755b;

    /* renamed from: c, reason: collision with root package name */
    private final te2 f31756c;

    /* renamed from: d, reason: collision with root package name */
    private final pe2 f31757d;

    /* renamed from: e, reason: collision with root package name */
    private final pm0 f31758e;

    /* renamed from: f, reason: collision with root package name */
    private final lm0 f31759f;

    /* renamed from: g, reason: collision with root package name */
    private final C4155m2 f31760g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ph1(Context context, vu1 vu1Var, wl0 wl0Var, te2 te2Var, pe2 pe2Var, pm0 pm0Var, dm0 dm0Var, nl0 nl0Var) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, vu1Var, wl0Var, te2Var, pe2Var, pm0Var, dm0Var, nl0Var, new lm0(applicationContext, vu1Var, pm0Var, te2Var, wl0Var, nl0Var), new C4155m2(dm0Var));
    }

    public final j01 a(bm0 instreamAdPlaylist) {
        kotlin.jvm.internal.l.f(instreamAdPlaylist, "instreamAdPlaylist");
        Context applicationContext = this.f31754a.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        C4148l2 c4148l2A = this.f31760g.a();
        wl0 wl0Var = this.f31755b;
        lm0 lm0Var = this.f31759f;
        pm0 pm0Var = this.f31758e;
        te2 te2Var = this.f31756c;
        return new j01(applicationContext, instreamAdPlaylist, c4148l2A, wl0Var, lm0Var, pm0Var, te2Var, this.f31757d, new ab2(), new aj1(te2Var, c4148l2A));
    }

    public ph1(Context context, vu1 sdkEnvironmentModule, wl0 instreamAdPlayerController, te2 videoPlayerController, pe2 videoPlaybackController, pm0 instreamAdViewsHolderManager, dm0 instreamAdPlaylistHolder, nl0 customUiElementsHolder, lm0 instreamAdUiElementsManager, C4155m2 adBreakStatusControllerHolder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(videoPlaybackController, "videoPlaybackController");
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        kotlin.jvm.internal.l.f(instreamAdPlaylistHolder, "instreamAdPlaylistHolder");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(instreamAdUiElementsManager, "instreamAdUiElementsManager");
        kotlin.jvm.internal.l.f(adBreakStatusControllerHolder, "adBreakStatusControllerHolder");
        this.f31754a = context;
        this.f31755b = instreamAdPlayerController;
        this.f31756c = videoPlayerController;
        this.f31757d = videoPlaybackController;
        this.f31758e = instreamAdViewsHolderManager;
        this.f31759f = instreamAdUiElementsManager;
        this.f31760g = adBreakStatusControllerHolder;
    }

    public final ly1 a(zs adBreak) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        Context applicationContext = this.f31754a.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        wl0 wl0Var = this.f31755b;
        lm0 lm0Var = this.f31759f;
        pm0 pm0Var = this.f31758e;
        C4148l2 c4148l2A = this.f31760g.a();
        return new ly1(applicationContext, adBreak, wl0Var, lm0Var, pm0Var, c4148l2A, new C4113g2(applicationContext, adBreak, wl0Var, lm0Var, pm0Var, c4148l2A));
    }
}
