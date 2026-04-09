package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    private wi1 f26021a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f26022b = new LinkedHashMap();

    public d9(wi1 wi1Var) {
        this.f26021a = wi1Var;
    }

    public final void a() {
        this.f26022b.clear();
    }

    public final boolean b() {
        Collection collectionValues = this.f26022b.values();
        return collectionValues.contains(jm0.f29211d) || collectionValues.contains(jm0.f29212e);
    }

    public final wi1 c() {
        return this.f26021a;
    }

    public final jm0 a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        jm0 jm0Var = (jm0) this.f26022b.get(videoAd);
        return jm0Var == null ? jm0.f29209b : jm0Var;
    }

    public final void a(tn0 videoAd, jm0 instreamAdStatus) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(instreamAdStatus, "instreamAdStatus");
        this.f26022b.put(videoAd, instreamAdStatus);
    }

    public final void a(wi1 wi1Var) {
        this.f26021a = wi1Var;
    }
}
