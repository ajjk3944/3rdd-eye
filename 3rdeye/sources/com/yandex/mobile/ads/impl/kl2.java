package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class kl2 implements lt {

    /* renamed from: a, reason: collision with root package name */
    private final ClosableNativeAdEventListener f29712a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            kl2.this.f29712a.closeNativeAd();
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public b() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            kl2.this.f29712a.onAdClicked();
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ll2 f29716c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ll2 ll2Var) {
            super(0);
            this.f29716c = ll2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            kl2.this.f29712a.onImpression(this.f29716c);
            return C1992A.f18074a;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public d() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            kl2.this.f29712a.onLeftApplication();
            return C1992A.f18074a;
        }
    }

    public static final class e extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public e() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            kl2.this.f29712a.onReturnedToApplication();
            return C1992A.f18074a;
        }
    }

    public kl2(ClosableNativeAdEventListener adEventListener) {
        kotlin.jvm.internal.l.f(adEventListener, "adEventListener");
        this.f29712a = adEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void closeNativeAd() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new d());
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new e());
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void a(C4108f4 c4108f4) {
        new CallbackStackTraceMarker(new c(c4108f4 != null ? new ll2(c4108f4) : null));
    }
}
