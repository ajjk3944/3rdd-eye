package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* loaded from: classes3.dex */
public final class fm2 implements NativeAdImage {

    /* renamed from: a, reason: collision with root package name */
    private final mt f27390a;

    public fm2(mt image) {
        kotlin.jvm.internal.l.f(image, "image");
        this.f27390a = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm2) && kotlin.jvm.internal.l.b(this.f27390a, ((fm2) obj).f27390a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final Bitmap getBitmap() {
        return this.f27390a.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getHeight() {
        return this.f27390a.b();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getWidth() {
        return this.f27390a.d();
    }

    public final int hashCode() {
        return this.f27390a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.f27390a + ")";
    }
}
