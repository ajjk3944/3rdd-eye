package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class mm2 implements ot {

    /* renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.a f30450a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f30452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdRequestError adRequestError) {
            super(0);
            this.f30452c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            mm2.this.f30450a.onAdFailedToLoad(this.f30452c);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.mobile.ads.nativeads.e f30454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.yandex.mobile.ads.nativeads.e eVar) {
            super(0);
            this.f30454c = eVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            mm2.this.f30450a.onAdLoaded(this.f30454c);
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public c(com.yandex.mobile.ads.nativeads.e eVar) {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            mm2.this.f30450a.a();
            return C1992A.f18074a;
        }
    }

    public mm2(com.yandex.mobile.ads.nativeads.a loadListener) {
        kotlin.jvm.internal.l.f(loadListener, "loadListener");
        this.f30450a = loadListener;
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
