package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class jd2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<za2> f29112a;

    /* renamed from: b, reason: collision with root package name */
    private final List<za2> f29113b;

    public jd2(List<za2> inLineAds, List<za2> wrapperAds) {
        kotlin.jvm.internal.l.f(inLineAds, "inLineAds");
        kotlin.jvm.internal.l.f(wrapperAds, "wrapperAds");
        this.f29112a = inLineAds;
        this.f29113b = wrapperAds;
    }

    public final List<za2> a() {
        return this.f29112a;
    }

    public final List<za2> b() {
        return this.f29113b;
    }
}
