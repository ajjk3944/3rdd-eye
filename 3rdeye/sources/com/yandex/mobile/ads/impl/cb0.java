package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class cb0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<cl0> f25588a;

    public cb0(ArrayList installedPackages) {
        kotlin.jvm.internal.l.f(installedPackages, "installedPackages");
        this.f25588a = installedPackages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb0) && kotlin.jvm.internal.l.b(this.f25588a, ((cb0) obj).f25588a);
    }

    public final int hashCode() {
        return this.f25588a.hashCode();
    }

    public final String toString() {
        return "FilteringRule(installedPackages=" + this.f25588a + ")";
    }
}
