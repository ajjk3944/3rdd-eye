package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class lm0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30043a;

    /* renamed from: b, reason: collision with root package name */
    private final pm0 f30044b;

    /* renamed from: c, reason: collision with root package name */
    private final q72 f30045c;

    /* renamed from: d, reason: collision with root package name */
    private p72 f30046d;

    public lm0(Context context, vu1 sdkEnvironmentModule, pm0 instreamAdViewsHolderManager, ui1 playerVolumeProvider, wl0 playerController, nl0 customUiElementsHolder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        kotlin.jvm.internal.l.f(playerVolumeProvider, "playerVolumeProvider");
        kotlin.jvm.internal.l.f(playerController, "playerController");
        kotlin.jvm.internal.l.f(customUiElementsHolder, "customUiElementsHolder");
        this.f30043a = context;
        this.f30044b = instreamAdViewsHolderManager;
        this.f30045c = new q72(sdkEnvironmentModule, playerVolumeProvider, playerController, customUiElementsHolder);
    }

    public final void a(zs coreInstreamAdBreak, mb2 videoAdInfo, zf2 videoTracker, ab2 playbackListener, sk1 imageProvider) {
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        a();
        om0 om0VarA = this.f30044b.a();
        if (om0VarA != null) {
            q72 q72Var = this.f30045c;
            Context applicationContext = this.f30043a.getApplicationContext();
            kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
            p72 p72VarA = q72Var.a(applicationContext, om0VarA, coreInstreamAdBreak, videoAdInfo, videoTracker, imageProvider, playbackListener);
            p72VarA.a();
            this.f30046d = p72VarA;
        }
    }

    public final void a() {
        p72 p72Var = this.f30046d;
        if (p72Var != null) {
            p72Var.b();
        }
        this.f30046d = null;
    }

    public final void a(mb2<tn0> nextVideo) {
        kotlin.jvm.internal.l.f(nextVideo, "nextVideo");
        p72 p72Var = this.f30046d;
        if (p72Var != null) {
            p72Var.a(nextVideo);
        }
    }
}
