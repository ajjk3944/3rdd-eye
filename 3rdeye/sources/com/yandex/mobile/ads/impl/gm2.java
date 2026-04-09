package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class gm2 implements nt {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAdImageLoadingListener f27824a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            gm2.this.f27824a.onFinishLoadingImages();
            return C1992A.f18074a;
        }
    }

    public gm2(NativeAdImageLoadingListener imageLoadingListener) {
        kotlin.jvm.internal.l.f(imageLoadingListener, "imageLoadingListener");
        this.f27824a = imageLoadingListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm2) && kotlin.jvm.internal.l.b(this.f27824a, ((gm2) obj).f27824a);
    }

    public final int hashCode() {
        return this.f27824a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.nt
    public final void onFinishLoadingImages() {
        new CallbackStackTraceMarker(new a());
    }

    public final String toString() {
        return "YandexNativeAdImageLoadingListenerAdapter(imageLoadingListener=" + this.f27824a + ")";
    }
}
