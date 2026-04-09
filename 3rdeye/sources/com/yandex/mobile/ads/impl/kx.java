package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.impl.Oo;

/* loaded from: classes3.dex */
public final class kx {

    /* renamed from: a, reason: collision with root package name */
    private final String f29804a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29805b;

    public kx(String name, String value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        this.f29804a = name;
        this.f29805b = value;
    }

    public final String a() {
        return this.f29804a;
    }

    public final String b() {
        return this.f29805b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj;
        return kotlin.jvm.internal.l.b(this.f29804a, kxVar.f29804a) && kotlin.jvm.internal.l.b(this.f29805b, kxVar.f29805b);
    }

    public final int hashCode() {
        return this.f29805b.hashCode() + (this.f29804a.hashCode() * 31);
    }

    public final String toString() {
        return Oo.h("DebugPanelMediationAdapterParameterData(name=", this.f29804a, ", value=", this.f29805b, ")");
    }
}
