package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class q72 {

    /* renamed from: a, reason: collision with root package name */
    private final ui1 f32090a;

    /* renamed from: b, reason: collision with root package name */
    private final wl0 f32091b;

    /* renamed from: c, reason: collision with root package name */
    private final o72 f32092c;

    /* renamed from: d, reason: collision with root package name */
    private final xn0 f32093d;

    public /* synthetic */ q72(vu1 vu1Var, ui1 ui1Var, wl0 wl0Var, nl0 nl0Var) {
        this(vu1Var, ui1Var, wl0Var, nl0Var, new o72(vu1Var, nl0Var), new xn0());
    }

    public final p72 a(Context context, om0 viewHolder, zs coreInstreamAdBreak, mb2 videoAdInfo, zf2 videoTracker, sk1 imageProvider, ab2 playbackListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(viewHolder, "viewHolder");
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        pn0 pn0Var = new pn0((tn0) videoAdInfo.d(), this.f32091b);
        n72 n72VarA = this.f32092c.a(context, coreInstreamAdBreak, videoAdInfo, pn0Var, videoTracker, imageProvider, playbackListener);
        xn0 xn0Var = this.f32093d;
        ui1 ui1Var = this.f32090a;
        return new p72(viewHolder, n72VarA, videoAdInfo, xn0Var, ui1Var, pn0Var, new wn0(xn0Var, ui1Var), new vn0(xn0Var, pn0Var));
    }

    public q72(vu1 sdkEnvironmentModule, ui1 playerVolumeProvider, wl0 instreamAdPlayerController, nl0 customUiElementsHolder, o72 uiElementBinderProvider, xn0 videoAdOptionsStorage) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(playerVolumeProvider, "playerVolumeProvider");
        kotlin.jvm.internal.l.f(instreamAdPlayerController, "instreamAdPlayerController");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        kotlin.jvm.internal.l.f(uiElementBinderProvider, "uiElementBinderProvider");
        kotlin.jvm.internal.l.f(videoAdOptionsStorage, "videoAdOptionsStorage");
        this.f32090a = playerVolumeProvider;
        this.f32091b = instreamAdPlayerController;
        this.f32092c = uiElementBinderProvider;
        this.f32093d = videoAdOptionsStorage;
    }
}
