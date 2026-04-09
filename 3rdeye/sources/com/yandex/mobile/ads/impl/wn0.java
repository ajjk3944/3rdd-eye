package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class wn0 {

    /* renamed from: a, reason: collision with root package name */
    private final xn0 f35025a;

    /* renamed from: b, reason: collision with root package name */
    private final uz f35026b;

    public wn0(xn0 instreamVideoAdControlsStateStorage, ui1 playerVolumeProvider) {
        kotlin.jvm.internal.l.f(instreamVideoAdControlsStateStorage, "instreamVideoAdControlsStateStorage");
        kotlin.jvm.internal.l.f(playerVolumeProvider, "playerVolumeProvider");
        this.f35025a = instreamVideoAdControlsStateStorage;
        this.f35026b = new uz(playerVolumeProvider);
    }

    public final ym0 a(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        ym0 ym0VarA = this.f35025a.a(videoAdInfo);
        return ym0VarA == null ? this.f35026b.a() : ym0VarA;
    }
}
