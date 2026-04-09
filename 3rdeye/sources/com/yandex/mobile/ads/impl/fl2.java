package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class fl2 implements ss {

    /* renamed from: a, reason: collision with root package name */
    private final BannerAdEventListener f27374a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            BannerAdEventListener bannerAdEventListener = fl2.this.f27374a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdClicked();
            }
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f27377c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AdRequestError adRequestError) {
            super(0);
            this.f27377c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            BannerAdEventListener bannerAdEventListener = fl2.this.f27374a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdFailedToLoad(this.f27377c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            BannerAdEventListener bannerAdEventListener = fl2.this.f27374a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdLoaded();
            }
            return C1992A.f18074a;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ll2 f27380c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ll2 ll2Var) {
            super(0);
            this.f27380c = ll2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            BannerAdEventListener bannerAdEventListener = fl2.this.f27374a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onImpression(this.f27380c);
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
            BannerAdEventListener bannerAdEventListener = fl2.this.f27374a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onLeftApplication();
            }
            return C1992A.f18074a;
        }
    }

    public static final class f extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public f() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            BannerAdEventListener bannerAdEventListener = fl2.this.f27374a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onReturnedToApplication();
            }
            return C1992A.f18074a;
        }
    }

    public fl2(BannerAdEventListener bannerAdEventListener) {
        this.f27374a = bannerAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new c());
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new e());
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new f());
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        new CallbackStackTraceMarker(new b(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void a(C4108f4 c4108f4) {
        new CallbackStackTraceMarker(new d(c4108f4 != null ? new ll2(c4108f4) : null));
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void closeBannerAd() {
    }
}
