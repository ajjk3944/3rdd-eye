package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;

/* renamed from: com.yandex.mobile.ads.impl.m4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4157m4 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f30197a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f30198b = new LinkedHashMap();

    public final C4122h4 a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        return (C4122h4) this.f30197a.get(videoAd);
    }

    public final tn0 a(C4122h4 adInfo) {
        kotlin.jvm.internal.l.f(adInfo, "adInfo");
        return (tn0) this.f30198b.get(adInfo);
    }

    public final void a(C4122h4 adInfo, tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(adInfo, "adInfo");
        this.f30197a.put(videoAd, adInfo);
        this.f30198b.put(adInfo, videoAd);
    }
}
