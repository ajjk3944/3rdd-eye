package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qh1 {

    /* renamed from: a, reason: collision with root package name */
    private final dm0 f32218a;

    /* renamed from: b, reason: collision with root package name */
    private final ph1 f32219b;

    /* renamed from: c, reason: collision with root package name */
    private ly1 f32220c;

    /* renamed from: d, reason: collision with root package name */
    private j01 f32221d;

    /* renamed from: e, reason: collision with root package name */
    private ly1 f32222e;

    public /* synthetic */ qh1(Context context, vu1 vu1Var, xs xsVar, wl0 wl0Var, pm0 pm0Var, te2 te2Var, pe2 pe2Var, nl0 nl0Var) {
        this(context, vu1Var, xsVar, wl0Var, pm0Var, te2Var, pe2Var, nl0Var, new dm0(xsVar, te2Var));
    }

    public final j8 a() {
        j01 j01Var = this.f32221d;
        if (j01Var != null) {
            return j01Var;
        }
        j01 j01VarA = this.f32219b.a(this.f32218a.a());
        this.f32221d = j01VarA;
        return j01VarA;
    }

    public final j8 b() {
        ly1 ly1VarA = this.f32222e;
        if (ly1VarA == null) {
            zs zsVarB = this.f32218a.a().b();
            ly1VarA = zsVarB != null ? this.f32219b.a(zsVarB) : null;
            this.f32222e = ly1VarA;
        }
        return ly1VarA;
    }

    public final j8 c() {
        ly1 ly1VarA = this.f32220c;
        if (ly1VarA == null) {
            zs zsVarC = this.f32218a.a().c();
            ly1VarA = zsVarC != null ? this.f32219b.a(zsVarC) : null;
            this.f32220c = ly1VarA;
        }
        return ly1VarA;
    }

    public qh1(Context context, vu1 sdkEnvironmentModule, xs instreamVideoAd, wl0 instreamAdPlayerController, pm0 instreamAdViewHolderProvider, te2 videoPlayerController, pe2 videoPlaybackController, nl0 customUiElementsHolder, dm0 instreamAdPlaylistHolder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(instreamAdViewHolderProvider, "instreamAdViewHolderProvider");
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(videoPlaybackController, "videoPlaybackController");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(instreamAdPlaylistHolder, "instreamAdPlaylistHolder");
        this.f32218a = instreamAdPlaylistHolder;
        this.f32219b = new ph1(context, sdkEnvironmentModule, instreamAdPlayerController, videoPlayerController, videoPlaybackController, instreamAdViewHolderProvider, instreamAdPlaylistHolder, customUiElementsHolder);
    }
}
