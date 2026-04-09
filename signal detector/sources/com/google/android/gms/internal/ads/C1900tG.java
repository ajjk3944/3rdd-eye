package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.tG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1900tG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16890a;

    /* renamed from: b, reason: collision with root package name */
    public final C1313iK f16891b;

    public /* synthetic */ C1900tG(Class cls, C1313iK c1313iK) {
        this.f16890a = cls;
        this.f16891b = c1313iK;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1900tG)) {
            return false;
        }
        C1900tG c1900tG = (C1900tG) obj;
        return c1900tG.f16890a.equals(this.f16890a) && c1900tG.f16891b.equals(this.f16891b);
    }

    public final int hashCode() {
        return Objects.hash(this.f16890a, this.f16891b);
    }

    public final String toString() {
        String simpleName = this.f16890a.getSimpleName();
        String strValueOf = String.valueOf(this.f16891b);
        return AbstractC1135f5.n(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
