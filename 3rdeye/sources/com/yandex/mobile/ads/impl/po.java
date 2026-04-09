package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class po {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f31853a = new LinkedHashMap();

    public final void a(int i, oo clickConnector) {
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        this.f31853a.put(Integer.valueOf(i), clickConnector);
    }

    public final LinkedHashMap a() {
        return this.f31853a;
    }
}
