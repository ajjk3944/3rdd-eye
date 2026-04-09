package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public final class hs {

    /* renamed from: a, reason: collision with root package name */
    private final zf2 f28343a;

    /* renamed from: b, reason: collision with root package name */
    private final r31 f28344b;

    /* renamed from: c, reason: collision with root package name */
    private final dz1 f28345c;

    /* renamed from: d, reason: collision with root package name */
    private final il1 f28346d;

    /* renamed from: e, reason: collision with root package name */
    private final wm0 f28347e;

    public /* synthetic */ hs(Context context, pn0 pn0Var, zs zsVar, mb2 mb2Var, zf2 zf2Var, ab2 ab2Var) {
        this(context, pn0Var, zsVar, mb2Var, zf2Var, ab2Var, new r31(pn0Var), new dz1(pn0Var, (tn0) mb2Var.d()), new il1(), new wm0(zsVar, mb2Var));
    }

    public final void a(bb2 uiElements, ym0 controlsState) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        kotlin.jvm.internal.l.f(controlsState, "controlsState");
        this.f28347e.a(uiElements);
        this.f28344b.a(uiElements, controlsState);
        View viewN = uiElements.n();
        if (viewN != null) {
            this.f28345c.a(viewN, controlsState);
        }
        ProgressBar progressBarJ = uiElements.j();
        if (progressBarJ != null) {
            this.f28346d.getClass();
            progressBarJ.setProgress((int) (progressBarJ.getMax() * controlsState.b()));
        }
    }

    public hs(Context context, pn0 instreamVastAdPlayer, zs adBreak, mb2 videoAdInfo, zf2 videoTracker, ab2 playbackListener, r31 muteControlConfigurator, dz1 skipControlConfigurator, il1 progressBarConfigurator, wm0 instreamContainerTagConfigurator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(playbackListener, "playbackListener");
        kotlin.jvm.internal.l.f(muteControlConfigurator, "muteControlConfigurator");
        kotlin.jvm.internal.l.f(skipControlConfigurator, "skipControlConfigurator");
        kotlin.jvm.internal.l.f(progressBarConfigurator, "progressBarConfigurator");
        kotlin.jvm.internal.l.f(instreamContainerTagConfigurator, "instreamContainerTagConfigurator");
        this.f28343a = videoTracker;
        this.f28344b = muteControlConfigurator;
        this.f28345c = skipControlConfigurator;
        this.f28346d = progressBarConfigurator;
        this.f28347e = instreamContainerTagConfigurator;
    }
}
