package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class xn0 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f35363a = new LinkedHashMap();

    public final ym0 a(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        return (ym0) this.f35363a.get(videoAdInfo);
    }

    public final void a(mb2<tn0> videoAdInfo, ym0 controlsState) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(controlsState, "controlsState");
        this.f35363a.put(videoAdInfo, controlsState);
    }
}
