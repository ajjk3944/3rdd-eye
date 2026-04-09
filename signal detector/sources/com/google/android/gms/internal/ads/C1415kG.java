package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.kG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1415kG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f15105a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f15106b;

    public /* synthetic */ C1415kG(Class cls, Class cls2) {
        this.f15105a = cls;
        this.f15106b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1415kG)) {
            return false;
        }
        C1415kG c1415kG = (C1415kG) obj;
        return c1415kG.f15105a.equals(this.f15105a) && c1415kG.f15106b.equals(this.f15106b);
    }

    public final int hashCode() {
        return Objects.hash(this.f15105a, this.f15106b);
    }

    public final String toString() {
        String simpleName = this.f15105a.getSimpleName();
        String simpleName2 = this.f15106b.getSimpleName();
        return AbstractC1135f5.n(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
