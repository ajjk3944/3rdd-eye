package com.yandex.mobile.ads.impl;

import N7.C1154e9;

/* loaded from: classes3.dex */
public final class fa0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27251a;

    public fa0(String value) {
        kotlin.jvm.internal.l.f(value, "value");
        this.f27251a = value;
    }

    public final String a() {
        return this.f27251a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa0) && kotlin.jvm.internal.l.b(this.f27251a, ((fa0) obj).f27251a);
    }

    public final int hashCode() {
        return this.f27251a.hashCode();
    }

    public final String toString() {
        return C1154e9.i("FeedSessionData(value=", this.f27251a, ")");
    }
}
