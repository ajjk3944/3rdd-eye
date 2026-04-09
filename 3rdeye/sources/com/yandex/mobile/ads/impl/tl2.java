package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class tl2 implements bt {

    /* renamed from: a, reason: collision with root package name */
    private final InstreamAdLoadListener f33674a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33676c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f33676c = str;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            tl2.this.f33674a.onInstreamAdFailedToLoad(this.f33676c);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nl2 f33678c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nl2 nl2Var) {
            super(0);
            this.f33678c = nl2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            tl2.this.f33674a.onInstreamAdLoaded(this.f33678c);
            return C1992A.f18074a;
        }
    }

    public tl2(InstreamAdLoadListener yandexAdLoadListener) {
        kotlin.jvm.internal.l.f(yandexAdLoadListener, "yandexAdLoadListener");
        this.f33674a = yandexAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.bt
    public final void onInstreamAdFailedToLoad(String reason) {
        kotlin.jvm.internal.l.f(reason, "reason");
        new CallbackStackTraceMarker(new a(reason));
    }

    @Override // com.yandex.mobile.ads.impl.bt
    public final void a(xs instreamAd) {
        kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
        new CallbackStackTraceMarker(new b(new nl2(instreamAd)));
    }
}
