package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class dl2 implements ps {

    /* renamed from: a, reason: collision with root package name */
    private final AppOpenAdEventListener f26243a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            AppOpenAdEventListener appOpenAdEventListener = dl2.this.f26243a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdClicked();
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
            AppOpenAdEventListener appOpenAdEventListener = dl2.this.f26243a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdDismissed();
            }
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vk2 f26247c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vk2 vk2Var) {
            super(0);
            this.f26247c = vk2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            AppOpenAdEventListener appOpenAdEventListener = dl2.this.f26243a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdFailedToShow(this.f26247c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ll2 f26249c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ll2 ll2Var) {
            super(0);
            this.f26249c = ll2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            AppOpenAdEventListener appOpenAdEventListener = dl2.this.f26243a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdImpression(this.f26249c);
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
            AppOpenAdEventListener appOpenAdEventListener = dl2.this.f26243a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdShown();
            }
            return C1992A.f18074a;
        }
    }

    public dl2(AppOpenAdEventListener appOpenAdEventListener) {
        this.f26243a = appOpenAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ps
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.ps
    public final void onAdDismissed() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.ps
    public final void onAdShown() {
        new CallbackStackTraceMarker(new e());
    }

    @Override // com.yandex.mobile.ads.impl.ps
    public final void a(zx1 adError) {
        kotlin.jvm.internal.l.f(adError, "adError");
        new CallbackStackTraceMarker(new c(new vk2(adError.a())));
    }

    @Override // com.yandex.mobile.ads.impl.ps
    public final void a(C4108f4 c4108f4) {
        new CallbackStackTraceMarker(new d(c4108f4 != null ? new ll2(c4108f4) : null));
    }
}
