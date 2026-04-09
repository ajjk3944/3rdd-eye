package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.feed.FeedAdLoadListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class y80 implements vs {

    /* renamed from: a, reason: collision with root package name */
    private final FeedAdLoadListener f35657a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f35659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdRequestError adRequestError) {
            super(0);
            this.f35659c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            FeedAdLoadListener feedAdLoadListener = y80.this.f35657a;
            if (feedAdLoadListener != null) {
                feedAdLoadListener.onAdFailedToLoad(this.f35659c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public b() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            FeedAdLoadListener feedAdLoadListener = y80.this.f35657a;
            if (feedAdLoadListener != null) {
                feedAdLoadListener.onAdLoaded();
            }
            return C1992A.f18074a;
        }
    }

    public y80(FeedAdLoadListener feedAdLoadListener) {
        this.f35657a = feedAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.vs
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }
}
