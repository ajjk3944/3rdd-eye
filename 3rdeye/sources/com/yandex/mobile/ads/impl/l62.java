package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class l62 {

    /* renamed from: a, reason: collision with root package name */
    private final h9 f29908a;

    public l62(h9 adTracker) {
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        this.f29908a = adTracker;
    }

    public final void a(List<String> trackingUrls) {
        kotlin.jvm.internal.l.f(trackingUrls, "trackingUrls");
        Iterator<T> it = trackingUrls.iterator();
        while (it.hasNext()) {
            this.f29908a.a((String) it.next(), m62.f30283d);
        }
    }
}
