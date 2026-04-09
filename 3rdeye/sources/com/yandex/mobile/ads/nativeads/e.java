package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.dm2;
import com.yandex.mobile.ads.impl.em2;
import com.yandex.mobile.ads.impl.gm2;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.j61;
import com.yandex.mobile.ads.impl.jm2;
import com.yandex.mobile.ads.impl.kl2;
import com.yandex.mobile.ads.impl.km2;
import com.yandex.mobile.ads.impl.rt;
import com.yandex.mobile.ads.impl.v51;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public class e implements NativeAd, CustomClickable, com.yandex.mobile.ads.nativeads.video.a, j61 {

    /* renamed from: a, reason: collision with root package name */
    private final h61 f36862a;

    /* renamed from: b, reason: collision with root package name */
    private final g f36863b;

    /* renamed from: c, reason: collision with root package name */
    private final jm2 f36864c;

    public /* synthetic */ e(h61 h61Var) {
        this(h61Var, new h(), new g(), new jm2());
    }

    @Override // com.yandex.mobile.ads.impl.j61
    public final h61 a() {
        return this.f36862a;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void addImageLoadingListener(NativeAdImageLoadingListener listener) {
        l.f(listener, "listener");
        this.f36862a.b(new gm2(listener));
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(NativeAdViewBinder viewBinder) throws NativeAdException {
        l.f(viewBinder, "viewBinder");
        try {
            this.f36863b.getClass();
            this.f36862a.b(g.a(viewBinder));
        } catch (v51 e4) {
            throw new NativeAdException(e4.a(), e4);
        } catch (Throwable th) {
            throw new NativeAdException("Ad binding failed with unexpected exception", th);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.b(((e) obj).f36862a, this.f36862a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return new dm2(this.f36862a.getAdAssets());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdType getAdType() {
        jm2 jm2Var = this.f36864c;
        ar1 responseNativeType = this.f36862a.getAdType();
        jm2Var.getClass();
        l.f(responseNativeType, "responseNativeType");
        int iOrdinal = responseNativeType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? NativeAdType.CONTENT : NativeAdType.CONTENT : NativeAdType.MEDIA : NativeAdType.APP_INSTALL : NativeAdType.CONTENT;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final String getInfo() {
        return this.f36862a.getInfo();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.NativeAdVideoControllerProvider
    public final com.yandex.mobile.ads.nativeads.video.b getNativeAdVideoController() {
        rt nativeAdVideoController = this.f36862a.getNativeAdVideoController();
        if (nativeAdVideoController != null) {
            return new km2(nativeAdVideoController);
        }
        return null;
    }

    public int hashCode() {
        return this.f36862a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void loadImages() {
        this.f36862a.loadImages();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void removeImageLoadingListener(NativeAdImageLoadingListener listener) {
        l.f(listener, "listener");
        this.f36862a.a(new gm2(listener));
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickable
    public final void setCustomClickHandler(CustomClickHandler customClickHandler) {
        this.f36862a.a(customClickHandler != null ? new c(customClickHandler) : null);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        this.f36862a.a(nativeAdEventListener instanceof ClosableNativeAdEventListener ? new kl2((ClosableNativeAdEventListener) nativeAdEventListener) : nativeAdEventListener != null ? new em2(nativeAdEventListener) : null);
    }

    public e(h61 nativeAdPrivate, h nativePromoAdViewAdapter, g nativeAdViewBinderAdapter, jm2 nativeAdTypeConverter) {
        l.f(nativeAdPrivate, "nativeAdPrivate");
        l.f(nativePromoAdViewAdapter, "nativePromoAdViewAdapter");
        l.f(nativeAdViewBinderAdapter, "nativeAdViewBinderAdapter");
        l.f(nativeAdTypeConverter, "nativeAdTypeConverter");
        this.f36862a = nativeAdPrivate;
        this.f36863b = nativeAdViewBinderAdapter;
        this.f36864c = nativeAdTypeConverter;
    }
}
