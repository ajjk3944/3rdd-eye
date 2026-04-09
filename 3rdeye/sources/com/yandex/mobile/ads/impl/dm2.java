package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;

/* loaded from: classes3.dex */
public final class dm2 implements NativeAdAssets {

    /* renamed from: a, reason: collision with root package name */
    private final kt f26269a;

    public dm2(kt assets) {
        kotlin.jvm.internal.l.f(assets, "assets");
        this.f26269a = assets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm2) && kotlin.jvm.internal.l.b(this.f26269a, ((dm2) obj).f26269a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getAge() {
        return this.f26269a.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getBody() {
        return this.f26269a.b();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getCallToAction() {
        return this.f26269a.c();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getDomain() {
        return this.f26269a.d();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getFavicon() {
        mt mtVarE = this.f26269a.e();
        if (mtVarE != null) {
            return new fm2(mtVarE);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getIcon() {
        mt mtVarG = this.f26269a.g();
        if (mtVarG != null) {
            return new fm2(mtVarG);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getImage() {
        mt mtVarH = this.f26269a.h();
        if (mtVarH != null) {
            return new fm2(mtVarH);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdMedia getMedia() {
        qt qtVarI = this.f26269a.i();
        if (qtVarI != null) {
            return new im2(qtVarI);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getPrice() {
        return this.f26269a.j();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final Float getRating() {
        return this.f26269a.k();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getReviewCount() {
        return this.f26269a.l();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getSponsored() {
        return this.f26269a.m();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getTitle() {
        return this.f26269a.n();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getWarning() {
        return this.f26269a.o();
    }

    public final int hashCode() {
        return this.f26269a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final boolean isFeedbackAvailable() {
        return this.f26269a.f();
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.f26269a + ")";
    }
}
