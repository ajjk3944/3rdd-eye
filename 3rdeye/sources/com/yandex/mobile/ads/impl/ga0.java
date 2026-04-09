package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class ga0 {

    /* renamed from: a, reason: collision with root package name */
    private final z90 f27597a;

    /* renamed from: b, reason: collision with root package name */
    private final List<i90> f27598b;

    public ga0(z90 state, List<i90> items) {
        kotlin.jvm.internal.l.f(state, "state");
        kotlin.jvm.internal.l.f(items, "items");
        this.f27597a = state;
        this.f27598b = items;
    }

    public final z90 a() {
        return this.f27597a;
    }

    public final List<i90> b() {
        return this.f27598b;
    }

    public final z90 c() {
        return this.f27597a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga0)) {
            return false;
        }
        ga0 ga0Var = (ga0) obj;
        return kotlin.jvm.internal.l.b(this.f27597a, ga0Var.f27597a) && kotlin.jvm.internal.l.b(this.f27598b, ga0Var.f27598b);
    }

    public final int hashCode() {
        return this.f27598b.hashCode() + (this.f27597a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedState(state=" + this.f27597a + ", items=" + this.f27598b + ")";
    }
}
