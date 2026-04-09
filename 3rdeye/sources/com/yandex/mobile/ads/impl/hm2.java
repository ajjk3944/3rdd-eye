package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class hm2 implements ot {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAdLoadListener f28281a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f28283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdRequestError adRequestError) {
            super(0);
            this.f28283c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            hm2.this.f28281a.onAdFailedToLoad(this.f28283c);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.mobile.ads.nativeads.e f28285c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.yandex.mobile.ads.nativeads.e eVar) {
            super(0);
            this.f28285c = eVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            hm2.this.f28281a.onAdLoaded(this.f28285c);
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.mobile.ads.nativeads.e f28287c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.yandex.mobile.ads.nativeads.e eVar) {
            super(0);
            this.f28287c = eVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            hm2.this.f28281a.onAdLoaded(this.f28287c);
            return C1992A.f18074a;
        }
    }

    public hm2(NativeAdLoadListener nativeAdLoadListener) {
        kotlin.jvm.internal.l.f(nativeAdLoadListener, "nativeAdLoadListener");
        this.f28281a = nativeAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.ot
    public final void b(h61 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        new CallbackStackTraceMarker(new c(new com.yandex.mobile.ads.nativeads.e(nativeAd)));
    }

    @Override // com.yandex.mobile.ads.impl.ot
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.ot
    public final void a(h61 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        new CallbackStackTraceMarker(new b(new com.yandex.mobile.ads.nativeads.e(nativeAd)));
    }
}
