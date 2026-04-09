package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class iw {

    /* renamed from: a, reason: collision with root package name */
    private final List<hw> f28882a;

    public iw(List<hw> adapters) {
        kotlin.jvm.internal.l.f(adapters, "adapters");
        this.f28882a = adapters;
    }

    public final List<hw> a() {
        return this.f28882a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iw) && kotlin.jvm.internal.l.b(this.f28882a, ((iw) obj).f28882a);
    }

    public final int hashCode() {
        return this.f28882a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationData(adapters=" + this.f28882a + ")";
    }
}
