package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.SliderAdLoadListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class um2 implements du {

    /* renamed from: a, reason: collision with root package name */
    private final SliderAdLoadListener f34090a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f34092c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdRequestError adRequestError) {
            super(0);
            this.f34092c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            um2.this.f34090a.onSliderAdFailedToLoad(this.f34092c);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.mobile.ads.nativeads.i f34094c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.yandex.mobile.ads.nativeads.i iVar) {
            super(0);
            this.f34094c = iVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            um2.this.f34090a.onSliderAdLoaded(this.f34094c);
            return C1992A.f18074a;
        }
    }

    public um2(SliderAdLoadListener loadListener) {
        kotlin.jvm.internal.l.f(loadListener, "loadListener");
        this.f34090a = loadListener;
    }

    @Override // com.yandex.mobile.ads.impl.du
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.du
    public final void a(pz1 sliderAd) {
        kotlin.jvm.internal.l.f(sliderAd, "sliderAd");
        new CallbackStackTraceMarker(new b(new com.yandex.mobile.ads.nativeads.i(sliderAd, new com.yandex.mobile.ads.nativeads.g())));
    }
}
