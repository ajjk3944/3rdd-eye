package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;

/* renamed from: com.yandex.mobile.ads.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4150l4 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f29873a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f29874b = new LinkedHashMap();

    public final C4115g4 a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return (C4115g4) this.f29873a.get(videoAd);
    }

    public final tn0 a(C4115g4 adInfo) {
        kotlin.jvm.internal.l.f(adInfo, "adInfo");
        return (tn0) this.f29874b.get(adInfo);
    }

    public final void a(C4115g4 adInfo, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(adInfo, "adInfo");
        this.f29873a.put(videoAd, adInfo);
        this.f29874b.put(adInfo, videoAd);
    }
}
