package io.appmetrica.analytics.screenshot.impl;

import N7.C1154e9;

/* renamed from: io.appmetrica.analytics.screenshot.impl.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5143i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42563a;

    public C5143i(boolean z10) {
        this.f42563a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5143i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f42563a == ((C5143i) obj).f42563a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return this.f42563a ? 1231 : 1237;
    }

    public final String toString() {
        return C1154e9.k(new StringBuilder("ClientSideApiCaptorConfig(enabled="), this.f42563a, ')');
    }

    public C5143i(C5157x c5157x) {
        this(c5157x.a());
    }
}
