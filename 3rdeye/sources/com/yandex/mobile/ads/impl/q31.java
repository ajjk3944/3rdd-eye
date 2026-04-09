package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class q31 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final pn0 f32010a;

    /* renamed from: b, reason: collision with root package name */
    private final C4192r5 f32011b;

    /* renamed from: c, reason: collision with root package name */
    private final ym0 f32012c;

    /* renamed from: d, reason: collision with root package name */
    private final p31 f32013d;

    public q31(pn0 instreamVastAdPlayer, C4192r5 adPlayerVolumeConfigurator, ym0 instreamControlsState, p31 p31Var) {
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        kotlin.jvm.internal.l.f(adPlayerVolumeConfigurator, "adPlayerVolumeConfigurator");
        kotlin.jvm.internal.l.f(instreamControlsState, "instreamControlsState");
        this.f32010a = instreamVastAdPlayer;
        this.f32011b = adPlayerVolumeConfigurator;
        this.f32012c = instreamControlsState;
        this.f32013d = p31Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View volumeControl) {
        kotlin.jvm.internal.l.f(volumeControl, "volumeControl");
        boolean z10 = !(this.f32010a.getVolume() == 0.0f);
        this.f32011b.a(this.f32012c.a(), z10);
        p31 p31Var = this.f32013d;
        if (p31Var != null) {
            p31Var.setMuted(z10);
        }
    }
}
