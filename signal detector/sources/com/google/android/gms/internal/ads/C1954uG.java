package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.uG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954uG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f17095a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f17096b;

    public /* synthetic */ C1954uG(Class cls, Class cls2) {
        this.f17095a = cls;
        this.f17096b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1954uG)) {
            return false;
        }
        C1954uG c1954uG = (C1954uG) obj;
        return c1954uG.f17095a.equals(this.f17095a) && c1954uG.f17096b.equals(this.f17096b);
    }

    public final int hashCode() {
        return Objects.hash(this.f17095a, this.f17096b);
    }

    public final String toString() {
        String simpleName = this.f17095a.getSimpleName();
        String simpleName2 = this.f17096b.getSimpleName();
        return AbstractC1135f5.n(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
