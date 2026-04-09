package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class em0 {

    /* renamed from: a, reason: collision with root package name */
    private final fz1 f26900a;

    /* renamed from: b, reason: collision with root package name */
    private final ol1 f26901b;

    /* renamed from: c, reason: collision with root package name */
    private final ko0 f26902c;

    public /* synthetic */ em0(tn0 tn0Var, io0 io0Var, pn0 pn0Var, pm0 pm0Var, dd2 dd2Var) {
        this(tn0Var, io0Var, pn0Var, pm0Var, dd2Var, new fz1(pm0Var, tn0Var), new ol1(pm0Var), new ko0(pn0Var, io0Var, dd2Var));
    }

    public final void a(qc2 progressEventsObservable) {
        kotlin.jvm.internal.l.f(progressEventsObservable, "progressEventsObservable");
        progressEventsObservable.a(this.f26900a, this.f26901b, this.f26902c);
    }

    public em0(tn0 instreamVideoAd, io0 videoViewProvider, pn0 videoAdPlayer, pm0 adViewsHolderManager, dd2 adStatusController, fz1 skipDisplayTracker, ol1 progressDisplayTracker, ko0 visibilityTracker) {
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(adViewsHolderManager, "adViewsHolderManager");
        kotlin.jvm.internal.l.f(adStatusController, "adStatusController");
        kotlin.jvm.internal.l.f(skipDisplayTracker, "skipDisplayTracker");
        kotlin.jvm.internal.l.f(progressDisplayTracker, "progressDisplayTracker");
        kotlin.jvm.internal.l.f(visibilityTracker, "visibilityTracker");
        this.f26900a = skipDisplayTracker;
        this.f26901b = progressDisplayTracker;
        this.f26902c = visibilityTracker;
    }
}
