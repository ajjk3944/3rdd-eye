package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.mt0;

/* loaded from: classes3.dex */
public final class ht0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f28348a;

    /* renamed from: b, reason: collision with root package name */
    private final zs f28349b;

    /* renamed from: c, reason: collision with root package name */
    private final C4148l2 f28350c;

    /* renamed from: d, reason: collision with root package name */
    private final lt0 f28351d;

    /* renamed from: e, reason: collision with root package name */
    private final nl0 f28352e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f28353f;

    public ht0(Context context, vu1 sdkEnvironmentModule, zs instreamAdBreak, C4148l2 adBreakStatusController, lt0 manualPlaybackEventListener, nl0 instreamAdCustomUiElementsHolder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamAdBreak, "instreamAdBreak");
        kotlin.jvm.internal.l.f(adBreakStatusController, "adBreakStatusController");
        kotlin.jvm.internal.l.f(manualPlaybackEventListener, "manualPlaybackEventListener");
        kotlin.jvm.internal.l.f(instreamAdCustomUiElementsHolder, "instreamAdCustomUiElementsHolder");
        this.f28348a = sdkEnvironmentModule;
        this.f28349b = instreamAdBreak;
        this.f28350c = adBreakStatusController;
        this.f28351d = manualPlaybackEventListener;
        this.f28352e = instreamAdCustomUiElementsHolder;
        this.f28353f = context.getApplicationContext();
    }

    public final gt0 a(ul2 instreamAdPlayer) {
        kotlin.jvm.internal.l.f(instreamAdPlayer, "instreamAdPlayer");
        wl0 wl0Var = new wl0(instreamAdPlayer);
        Context context = this.f28353f;
        kotlin.jvm.internal.l.e(context, "context");
        vu1 vu1Var = this.f28348a;
        zs zsVar = this.f28349b;
        C4148l2 c4148l2 = this.f28350c;
        lt0 lt0Var = this.f28351d;
        nl0 nl0Var = this.f28352e;
        mt0 mt0VarA = mt0.a.a();
        pm0 pm0Var = new pm0();
        return new gt0(context, vu1Var, zsVar, wl0Var, c4148l2, lt0Var, nl0Var, mt0VarA, pm0Var, new C4113g2(context, zsVar, wl0Var, new lm0(context, vu1Var, pm0Var, new nt0(wl0Var, zsVar), wl0Var, nl0Var), pm0Var, c4148l2));
    }
}
