package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class em2 implements lt {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAdEventListener f26903a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            em2.this.f26903a.onAdClicked();
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ll2 f26906c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ll2 ll2Var) {
            super(0);
            this.f26906c = ll2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            em2.this.f26903a.onImpression(this.f26906c);
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            em2.this.f26903a.onLeftApplication();
            return C1992A.f18074a;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public d() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            em2.this.f26903a.onReturnedToApplication();
            return C1992A.f18074a;
        }
    }

    public em2(NativeAdEventListener nativeAdEventListener) {
        kotlin.jvm.internal.l.f(nativeAdEventListener, "nativeAdEventListener");
        this.f26903a = nativeAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new c());
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new d());
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void a(C4108f4 c4108f4) {
        new CallbackStackTraceMarker(new b(c4108f4 != null ? new ll2(c4108f4) : null));
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void closeNativeAd() {
    }
}
