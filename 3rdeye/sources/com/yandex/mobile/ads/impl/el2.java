package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class el2 implements qs {

    /* renamed from: a, reason: collision with root package name */
    private final AppOpenAdLoadListener f26895a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f26897c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdRequestError adRequestError) {
            super(0);
            this.f26897c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            AppOpenAdLoadListener appOpenAdLoadListener = el2.this.f26895a;
            if (appOpenAdLoadListener != null) {
                appOpenAdLoadListener.onAdFailedToLoad(this.f26897c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cl2 f26899c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cl2 cl2Var) {
            super(0);
            this.f26899c = cl2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            AppOpenAdLoadListener appOpenAdLoadListener = el2.this.f26895a;
            if (appOpenAdLoadListener != null) {
                appOpenAdLoadListener.onAdLoaded(this.f26899c);
            }
            return C1992A.f18074a;
        }
    }

    public el2(AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f26895a = appOpenAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.qs
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.qs
    public final void a(os appOpenAd) {
        kotlin.jvm.internal.l.f(appOpenAd, "appOpenAd");
        new CallbackStackTraceMarker(new b(new cl2(appOpenAd, new wk2())));
    }
}
