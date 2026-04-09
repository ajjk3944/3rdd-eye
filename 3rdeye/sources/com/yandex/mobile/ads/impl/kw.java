package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class kw {

    /* renamed from: a, reason: collision with root package name */
    private final List<ew> f29796a;

    public kw(ArrayList adUnits) {
        kotlin.jvm.internal.l.f(adUnits, "adUnits");
        this.f29796a = adUnits;
    }

    public final List<ew> a() {
        return this.f29796a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kw) && kotlin.jvm.internal.l.b(this.f29796a, ((kw) obj).f29796a);
    }

    public final int hashCode() {
        return this.f29796a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitsData(adUnits=" + this.f29796a + ")";
    }
}
