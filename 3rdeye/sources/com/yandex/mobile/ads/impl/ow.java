package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ow {

    /* renamed from: a, reason: collision with root package name */
    private final List<mw> f31507a;

    public ow(ArrayList adapters) {
        kotlin.jvm.internal.l.f(adapters, "adapters");
        this.f31507a = adapters;
    }

    public final List<mw> a() {
        return this.f31507a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ow) && kotlin.jvm.internal.l.b(this.f31507a, ((ow) obj).f31507a);
    }

    public final int hashCode() {
        return this.f31507a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdaptersData(adapters=" + this.f31507a + ")";
    }
}
