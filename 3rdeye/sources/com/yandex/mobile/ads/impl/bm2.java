package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class bm2 implements ht {

    /* renamed from: a, reason: collision with root package name */
    private final InterstitialAdLoadListener f25334a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f25336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdRequestError adRequestError) {
            super(0);
            this.f25336c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            InterstitialAdLoadListener interstitialAdLoadListener = bm2.this.f25334a;
            if (interstitialAdLoadListener != null) {
                interstitialAdLoadListener.onAdFailedToLoad(this.f25336c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ zl2 f25338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zl2 zl2Var) {
            super(0);
            this.f25338c = zl2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            InterstitialAdLoadListener interstitialAdLoadListener = bm2.this.f25334a;
            if (interstitialAdLoadListener != null) {
                interstitialAdLoadListener.onAdLoaded(this.f25338c);
            }
            return C1992A.f18074a;
        }
    }

    public bm2(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f25334a = interstitialAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.ht
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.ht
    public final void a(ft interstitialAd) {
        kotlin.jvm.internal.l.f(interstitialAd, "interstitialAd");
        new CallbackStackTraceMarker(new b(new zl2(interstitialAd, new wk2())));
    }
}
