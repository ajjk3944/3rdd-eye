package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class c9 {

    /* renamed from: a, reason: collision with root package name */
    private vi1 f25571a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f25572b = new LinkedHashMap();

    public c9(vi1 vi1Var) {
        this.f25571a = vi1Var;
    }

    public final void a() {
        this.f25572b.clear();
    }

    public final boolean b() {
        Collection collectionValues = this.f25572b.values();
        return collectionValues.contains(im0.f28744d) || collectionValues.contains(im0.f28745e);
    }

    public final vi1 c() {
        return this.f25571a;
    }

    public final im0 a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        im0 im0Var = (im0) this.f25572b.get(videoAd);
        return im0Var == null ? im0.f28742b : im0Var;
    }

    public final void a(tn0 videoAd, im0 instreamAdStatus) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(instreamAdStatus, "instreamAdStatus");
        this.f25572b.put(videoAd, instreamAdStatus);
    }

    public final void a(vi1 vi1Var) {
        this.f25571a = vi1Var;
    }
}
