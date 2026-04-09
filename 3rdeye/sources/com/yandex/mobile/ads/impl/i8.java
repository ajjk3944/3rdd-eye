package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class i8 {

    /* renamed from: a, reason: collision with root package name */
    private final yn0 f28576a;

    /* renamed from: b, reason: collision with root package name */
    private final uk1 f28577b;

    /* renamed from: c, reason: collision with root package name */
    private final qh1 f28578c;

    /* renamed from: d, reason: collision with root package name */
    private final h8 f28579d;

    /* renamed from: e, reason: collision with root package name */
    private g8 f28580e;

    /* renamed from: f, reason: collision with root package name */
    private g8 f28581f;

    /* renamed from: g, reason: collision with root package name */
    private g8 f28582g;

    public /* synthetic */ i8(Context context, vu1 vu1Var, xs xsVar, wl0 wl0Var, pm0 pm0Var, te2 te2Var, pe2 pe2Var, yn0 yn0Var, nl0 nl0Var) {
        this(context, vu1Var, xsVar, wl0Var, pm0Var, te2Var, pe2Var, yn0Var, nl0Var, new uk1(te2Var), new qh1(context, vu1Var, xsVar, wl0Var, pm0Var, te2Var, pe2Var, nl0Var), new h8());
    }

    private final g8 a(j8 adSectionPlaybackController) {
        h8 h8Var = this.f28579d;
        m8 m8Var = new m8();
        ab2 ab2Var = new ab2();
        h8Var.getClass();
        kotlin.jvm.internal.l.f(adSectionPlaybackController, "adSectionPlaybackController");
        g8 g8Var = new g8(adSectionPlaybackController, m8Var, ab2Var);
        g8Var.a(this.f28576a);
        return g8Var;
    }

    public final g8 b() {
        j8 j8VarB;
        if (this.f28582g == null && (j8VarB = this.f28578c.b()) != null) {
            this.f28582g = a(j8VarB);
        }
        return this.f28582g;
    }

    public final g8 c() {
        j8 j8VarC;
        if (this.f28580e == null && this.f28577b.a() && (j8VarC = this.f28578c.c()) != null) {
            this.f28580e = a(j8VarC);
        }
        return this.f28580e;
    }

    public i8(Context context, vu1 sdkEnvironmentModule, xs instreamVideoAd, wl0 instreamAdPlayerController, pm0 instreamAdViewHolderProvider, te2 videoPlayerController, pe2 videoPlaybackController, yn0 adCreativePlaybackListener, nl0 customUiElementsHolder, uk1 prerollVideoPositionStartValidator, qh1 playbackControllerHolder, h8 adSectionControllerFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(instreamAdViewHolderProvider, "instreamAdViewHolderProvider");
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(videoPlaybackController, "videoPlaybackController");
        kotlin.jvm.internal.l.f(adCreativePlaybackListener, "adCreativePlaybackListener");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(prerollVideoPositionStartValidator, "prerollVideoPositionStartValidator");
        kotlin.jvm.internal.l.f(playbackControllerHolder, "playbackControllerHolder");
        kotlin.jvm.internal.l.f(adSectionControllerFactory, "adSectionControllerFactory");
        this.f28576a = adCreativePlaybackListener;
        this.f28577b = prerollVideoPositionStartValidator;
        this.f28578c = playbackControllerHolder;
        this.f28579d = adSectionControllerFactory;
    }

    public final g8 a() {
        g8 g8Var = this.f28581f;
        if (g8Var != null) {
            return g8Var;
        }
        g8 g8VarA = a(this.f28578c.a());
        this.f28581f = g8VarA;
        return g8VarA;
    }
}
