package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ku0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f29791a;

    /* renamed from: b, reason: collision with root package name */
    private final float f29792b;

    public ku0(String str, float f10) {
        this.f29791a = str;
        this.f29792b = f10;
    }

    public final float a() {
        return this.f29792b;
    }

    public final String b() {
        return this.f29791a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku0)) {
            return false;
        }
        ku0 ku0Var = (ku0) obj;
        return kotlin.jvm.internal.l.b(this.f29791a, ku0Var.f29791a) && Float.compare(this.f29792b, ku0Var.f29792b) == 0;
    }

    public final int hashCode() {
        String str = this.f29791a;
        return Float.floatToIntBits(this.f29792b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Media(htmlContent=" + this.f29791a + ", aspectRatio=" + this.f29792b + ")";
    }
}
