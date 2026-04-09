package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class xs {

    /* renamed from: a, reason: collision with root package name */
    private final List<zs> f35405a;

    public xs(ArrayList adBreaks) {
        kotlin.jvm.internal.l.f(adBreaks, "adBreaks");
        this.f35405a = adBreaks;
    }

    public final List<zs> a() {
        return this.f35405a;
    }

    public final void b() {
        Iterator<zs> it = this.f35405a.iterator();
        while (it.hasNext()) {
            it.next().a(null);
        }
    }
}
