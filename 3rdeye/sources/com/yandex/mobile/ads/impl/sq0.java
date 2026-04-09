package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class sq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final int f33183a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<V> f33184b;

    /* renamed from: c, reason: collision with root package name */
    private final w00<V> f33185c;

    /* renamed from: d, reason: collision with root package name */
    private final x00 f33186d;

    public sq0(int i, uq designComponentBinder, x00 designConstraint) {
        kotlin.jvm.internal.l.f(designComponentBinder, "designComponentBinder");
        kotlin.jvm.internal.l.f(designConstraint, "designConstraint");
        this.f33183a = i;
        this.f33184b = ExtendedNativeAdView.class;
        this.f33185c = designComponentBinder;
        this.f33186d = designConstraint;
    }

    public final w00<V> a() {
        return this.f33185c;
    }

    public final x00 b() {
        return this.f33186d;
    }

    public final int c() {
        return this.f33183a;
    }

    public final Class<V> d() {
        return this.f33184b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq0)) {
            return false;
        }
        sq0 sq0Var = (sq0) obj;
        return this.f33183a == sq0Var.f33183a && kotlin.jvm.internal.l.b(this.f33184b, sq0Var.f33184b) && kotlin.jvm.internal.l.b(this.f33185c, sq0Var.f33185c) && kotlin.jvm.internal.l.b(this.f33186d, sq0Var.f33186d);
    }

    public final int hashCode() {
        return this.f33186d.hashCode() + ((this.f33185c.hashCode() + ((this.f33184b.hashCode() + (this.f33183a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutDesign(layoutId=" + this.f33183a + ", layoutViewClass=" + this.f33184b + ", designComponentBinder=" + this.f33185c + ", designConstraint=" + this.f33186d + ")";
    }
}
