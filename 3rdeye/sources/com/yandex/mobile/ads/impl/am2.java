package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class am2 implements gt {

    /* renamed from: a, reason: collision with root package name */
    private final InterstitialAdEventListener f24739a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            InterstitialAdEventListener interstitialAdEventListener = am2.this.f24739a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdClicked();
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
            InterstitialAdEventListener interstitialAdEventListener = am2.this.f24739a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdDismissed();
            }
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vk2 f24743c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vk2 vk2Var) {
            super(0);
            this.f24743c = vk2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            InterstitialAdEventListener interstitialAdEventListener = am2.this.f24739a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdFailedToShow(this.f24743c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ll2 f24745c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ll2 ll2Var) {
            super(0);
            this.f24745c = ll2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            InterstitialAdEventListener interstitialAdEventListener = am2.this.f24739a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdImpression(this.f24745c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class e extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public e() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            InterstitialAdEventListener interstitialAdEventListener = am2.this.f24739a;
            if (interstitialAdEventListener != null) {
                interstitialAdEventListener.onAdShown();
            }
            return C1992A.f18074a;
        }
    }

    public am2(InterstitialAdEventListener interstitialAdEventListener) {
        this.f24739a = interstitialAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void onAdDismissed() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void onAdShown() {
        new CallbackStackTraceMarker(new e());
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void a(zx1 adError) {
        kotlin.jvm.internal.l.f(adError, "adError");
        new CallbackStackTraceMarker(new c(new vk2(adError.a())));
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void a(C4108f4 c4108f4) {
        new CallbackStackTraceMarker(new d(c4108f4 != null ? new ll2(c4108f4) : null));
    }
}
