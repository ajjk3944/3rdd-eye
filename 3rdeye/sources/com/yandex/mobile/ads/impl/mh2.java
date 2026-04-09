package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class mh2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f30392a;

    public mh2(ArrayList viewableUrls) {
        kotlin.jvm.internal.l.f(viewableUrls, "viewableUrls");
        this.f30392a = viewableUrls;
    }

    public final List<String> a() {
        return this.f30392a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh2) && kotlin.jvm.internal.l.b(this.f30392a, ((mh2) obj).f30392a);
    }

    public final int hashCode() {
        return this.f30392a.hashCode();
    }

    public final String toString() {
        return "ViewableImpression(viewableUrls=" + this.f30392a + ")";
    }
}
