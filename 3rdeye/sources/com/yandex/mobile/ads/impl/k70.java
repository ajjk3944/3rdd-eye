package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class k70 {

    /* renamed from: a, reason: collision with root package name */
    private final int f29546a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f29547b;

    public k70(int i, RectF rectF) {
        this.f29546a = i;
        this.f29547b = rectF;
    }

    public final int a() {
        return this.f29546a;
    }

    public final RectF b() {
        return this.f29547b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k70)) {
            return false;
        }
        k70 k70Var = (k70) obj;
        return this.f29546a == k70Var.f29546a && kotlin.jvm.internal.l.b(this.f29547b, k70Var.f29547b);
    }

    public final int hashCode() {
        int i = this.f29546a * 31;
        RectF rectF = this.f29547b;
        return i + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.f29546a + ", visibleRectangle=" + this.f29547b + ")";
    }
}
