package com.yandex.mobile.ads.impl;

import N7.C1154e9;

/* loaded from: classes3.dex */
public final class c6 extends Throwable {

    /* renamed from: b, reason: collision with root package name */
    private final String f25542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(String description) {
        super(description);
        kotlin.jvm.internal.l.f(description, "description");
        this.f25542b = description;
    }

    public final String a() {
        return this.f25542b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6) && kotlin.jvm.internal.l.b(this.f25542b, ((c6) obj).f25542b);
    }

    public final int hashCode() {
        return this.f25542b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return C1154e9.i("AdPresentationError(description=", this.f25542b, ")");
    }
}
