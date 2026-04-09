package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class qt {

    /* renamed from: a, reason: collision with root package name */
    private final float f32334a;

    public qt(float f10) {
        this.f32334a = f10;
    }

    public final float a() {
        return this.f32334a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qt) && Float.compare(this.f32334a, ((qt) obj).f32334a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32334a);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.f32334a + ")";
    }
}
