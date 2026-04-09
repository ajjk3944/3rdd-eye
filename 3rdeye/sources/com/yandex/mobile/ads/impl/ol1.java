package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public final class ol1 implements pc2 {

    /* renamed from: a, reason: collision with root package name */
    private final pm0 f31419a;

    /* renamed from: b, reason: collision with root package name */
    private final nm0 f31420b;

    /* renamed from: c, reason: collision with root package name */
    private final il1 f31421c;

    public /* synthetic */ ol1(pm0 pm0Var) {
        this(pm0Var, new nm0(), new il1());
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        om0 om0VarA = this.f31419a.a();
        ProgressBar progressBarJ = null;
        o70 o70VarB = om0VarA != null ? om0VarA.b() : null;
        if (o70VarB != null) {
            this.f31420b.getClass();
            bb2 adUiElements = o70VarB.getAdUiElements();
            if (adUiElements != null) {
                progressBarJ = adUiElements.j();
            }
        }
        ProgressBar progressBar = progressBarJ;
        if (progressBar != null) {
            this.f31421c.a(progressBar, j10, j4);
        }
    }

    public ol1(pm0 instreamAdViewsHolderManager, nm0 instreamAdViewUiElementsManager, il1 progressBarConfigurator) {
        kotlin.jvm.internal.l.f(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        kotlin.jvm.internal.l.f(instreamAdViewUiElementsManager, "instreamAdViewUiElementsManager");
        kotlin.jvm.internal.l.f(progressBarConfigurator, "progressBarConfigurator");
        this.f31419a = instreamAdViewsHolderManager;
        this.f31420b = instreamAdViewUiElementsManager;
        this.f31421c = progressBarConfigurator;
    }
}
