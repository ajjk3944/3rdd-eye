package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class jl2 implements ss {

    /* renamed from: a, reason: collision with root package name */
    private final ClosableBannerAdEventListener f29194a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = jl2.this.f29194a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.closeBannerAd();
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
            ClosableBannerAdEventListener closableBannerAdEventListener = jl2.this.f29194a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onAdClicked();
            }
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f29198c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdRequestError adRequestError) {
            super(0);
            this.f29198c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = jl2.this.f29194a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onAdFailedToLoad(this.f29198c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public d() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = jl2.this.f29194a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onAdLoaded();
            }
            return C1992A.f18074a;
        }
    }

    public static final class e extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ll2 f29201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ll2 ll2Var) {
            super(0);
            this.f29201c = ll2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = jl2.this.f29194a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onImpression(this.f29201c);
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
            ClosableBannerAdEventListener closableBannerAdEventListener = jl2.this.f29194a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onLeftApplication();
            }
            return C1992A.f18074a;
        }
    }

    public static final class g extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public g() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = jl2.this.f29194a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onReturnedToApplication();
            }
            return C1992A.f18074a;
        }
    }

    public jl2(ClosableBannerAdEventListener closableBannerAdEventListener) {
        this.f29194a = closableBannerAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void closeBannerAd() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new d());
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new f());
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new g());
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        new CallbackStackTraceMarker(new c(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.ss
    public final void a(C4108f4 c4108f4) {
        new CallbackStackTraceMarker(new e(c4108f4 != null ? new ll2(c4108f4) : null));
    }
}
