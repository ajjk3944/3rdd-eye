package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class r31 {

    /* renamed from: a, reason: collision with root package name */
    private final pn0 f32450a;

    /* renamed from: b, reason: collision with root package name */
    private final C4192r5 f32451b;

    public /* synthetic */ r31(pn0 pn0Var) {
        this(pn0Var, new C4192r5(pn0Var));
    }

    public final void a(bb2 uiElements, ym0 controlsState) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        kotlin.jvm.internal.l.f(controlsState, "controlsState");
        float fA = controlsState.a();
        boolean zD = controlsState.d();
        p31 p31VarI = uiElements.i();
        q31 q31Var = new q31(this.f32450a, this.f32451b, controlsState, p31VarI);
        if (p31VarI != null) {
            p31VarI.setOnClickListener(q31Var);
        }
        if (p31VarI != null) {
            p31VarI.setMuted(zD);
        }
        this.f32451b.a(fA, zD);
    }

    public r31(pn0 instreamVastAdPlayer, C4192r5 adPlayerVolumeConfigurator) {
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        kotlin.jvm.internal.l.f(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        this.f32450a = instreamVastAdPlayer;
        this.f32451b = adPlayerVolumeConfigurator;
    }
}
