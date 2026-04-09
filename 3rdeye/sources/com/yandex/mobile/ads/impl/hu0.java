package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class hu0 {

    /* renamed from: a, reason: collision with root package name */
    private final iu0 f28370a;

    /* renamed from: b, reason: collision with root package name */
    private final iu0 f28371b;

    public hu0(iu0 width, iu0 height) {
        kotlin.jvm.internal.l.f(width, "width");
        kotlin.jvm.internal.l.f(height, "height");
        this.f28370a = width;
        this.f28371b = height;
    }

    public final iu0 a() {
        return this.f28371b;
    }

    public final iu0 b() {
        return this.f28370a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu0)) {
            return false;
        }
        hu0 hu0Var = (hu0) obj;
        return kotlin.jvm.internal.l.b(this.f28370a, hu0Var.f28370a) && kotlin.jvm.internal.l.b(this.f28371b, hu0Var.f28371b);
    }

    public final int hashCode() {
        return this.f28371b.hashCode() + (this.f28370a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.f28370a + ", height=" + this.f28371b + ")";
    }
}
