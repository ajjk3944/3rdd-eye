package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdMedia;

/* loaded from: classes3.dex */
public final class im2 implements NativeAdMedia {

    /* renamed from: a, reason: collision with root package name */
    private final qt f28754a;

    public im2(qt media) {
        kotlin.jvm.internal.l.f(media, "media");
        this.f28754a = media;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im2) && kotlin.jvm.internal.l.b(this.f28754a, ((im2) obj).f28754a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdMedia
    public final float getAspectRatio() {
        return this.f28754a.a();
    }

    public final int hashCode() {
        return this.f28754a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdMediaAdapter(media=" + this.f28754a + ")";
    }
}
