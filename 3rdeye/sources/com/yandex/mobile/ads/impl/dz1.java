package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class dz1 {

    /* renamed from: a, reason: collision with root package name */
    private final pn0 f26568a;

    /* renamed from: b, reason: collision with root package name */
    private final bd2 f26569b;

    public /* synthetic */ dz1(pn0 pn0Var, tn0 tn0Var) {
        this(pn0Var, tn0Var, tn0Var.h());
    }

    public final void a(View skipControl, ym0 controlsState) {
        kotlin.jvm.internal.l.f(skipControl, "skipControl");
        kotlin.jvm.internal.l.f(controlsState, "controlsState");
        if (this.f26569b == null) {
            skipControl.setVisibility(8);
            return;
        }
        skipControl.setOnClickListener(new cz1(this.f26568a));
        if (controlsState.c()) {
            skipControl.setVisibility(0);
        }
        skipControl.setEnabled(controlsState.c());
    }

    public dz1(pn0 instreamVastAdPlayer, tn0 instreamVideoAd, bd2 bd2Var) {
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        this.f26568a = instreamVastAdPlayer;
        this.f26569b = bd2Var;
    }
}
