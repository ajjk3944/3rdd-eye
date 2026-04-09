package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class z20 implements x00 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f36149a;

    public z20(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f36149a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.x00
    public final boolean a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return kotlin.jvm.internal.l.b(b10.f25040c.a(), this.f36149a.w());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z20) && kotlin.jvm.internal.l.b(this.f36149a, ((z20) obj).f36149a);
    }

    public final int hashCode() {
        return this.f36149a.hashCode();
    }

    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.f36149a + ")";
    }
}
