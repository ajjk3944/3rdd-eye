package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class p72 {

    /* renamed from: a, reason: collision with root package name */
    private final om0 f31624a;

    /* renamed from: b, reason: collision with root package name */
    private final n72 f31625b;

    /* renamed from: c, reason: collision with root package name */
    private final mb2<tn0> f31626c;

    /* renamed from: d, reason: collision with root package name */
    private final wn0 f31627d;

    /* renamed from: e, reason: collision with root package name */
    private final vn0 f31628e;

    /* renamed from: f, reason: collision with root package name */
    private ym0 f31629f;

    public p72(om0 instreamAdViewsHolder, n72 uiElementBinder, mb2<tn0> videoAdInfo, xn0 videoAdControlsStateStorage, ui1 playerVolumeProvider, pn0 instreamVastAdPlayer, wn0 videoAdControlsStateProvider, vn0 instreamVideoAdControlsStateManager) {
        kotlin.jvm.internal.l.f(instreamAdViewsHolder, "instreamAdViewsHolder");
        kotlin.jvm.internal.l.f(uiElementBinder, "uiElementBinder");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoAdControlsStateStorage, "videoAdControlsStateStorage");
        kotlin.jvm.internal.l.f(playerVolumeProvider, "playerVolumeProvider");
        kotlin.jvm.internal.l.f(instreamVastAdPlayer, "instreamVastAdPlayer");
        kotlin.jvm.internal.l.f(videoAdControlsStateProvider, "videoAdControlsStateProvider");
        kotlin.jvm.internal.l.f(instreamVideoAdControlsStateManager, "instreamVideoAdControlsStateManager");
        this.f31624a = instreamAdViewsHolder;
        this.f31625b = uiElementBinder;
        this.f31626c = videoAdInfo;
        this.f31627d = videoAdControlsStateProvider;
        this.f31628e = instreamVideoAdControlsStateManager;
    }

    public final void a() {
        o70 o70VarB = this.f31624a.b();
        if (this.f31629f != null || o70VarB == null) {
            return;
        }
        ym0 ym0VarA = this.f31627d.a(this.f31626c);
        this.f31625b.a(o70VarB, ym0VarA);
        this.f31629f = ym0VarA;
    }

    public final void b() {
        ym0 ym0Var;
        o70 o70VarB = this.f31624a.b();
        if (o70VarB == null || (ym0Var = this.f31629f) == null) {
            return;
        }
        this.f31628e.b(this.f31626c, o70VarB, ym0Var);
        this.f31629f = null;
        this.f31625b.a(o70VarB);
    }

    public final void a(mb2<tn0> nextVideo) {
        ym0 ym0Var;
        kotlin.jvm.internal.l.f(nextVideo, "nextVideo");
        o70 o70VarB = this.f31624a.b();
        if (o70VarB == null || (ym0Var = this.f31629f) == null) {
            return;
        }
        this.f31628e.a(nextVideo, o70VarB, ym0Var);
    }
}
