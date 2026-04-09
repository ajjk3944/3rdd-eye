package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class pm2 implements au {

    /* renamed from: a, reason: collision with root package name */
    private final RewardedAdEventListener f31836a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            RewardedAdEventListener rewardedAdEventListener = pm2.this.f31836a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdClicked();
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
            RewardedAdEventListener rewardedAdEventListener = pm2.this.f31836a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdDismissed();
            }
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ vk2 f31840c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vk2 vk2Var) {
            super(0);
            this.f31840c = vk2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            RewardedAdEventListener rewardedAdEventListener = pm2.this.f31836a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdFailedToShow(this.f31840c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ll2 f31842c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ll2 ll2Var) {
            super(0);
            this.f31842c = ll2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            RewardedAdEventListener rewardedAdEventListener = pm2.this.f31836a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdImpression(this.f31842c);
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
            RewardedAdEventListener rewardedAdEventListener = pm2.this.f31836a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdShown();
            }
            return C1992A.f18074a;
        }
    }

    public static final class f extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nm2 f31845c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(nm2 nm2Var) {
            super(0);
            this.f31845c = nm2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            RewardedAdEventListener rewardedAdEventListener = pm2.this.f31836a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onRewarded(this.f31845c);
            }
            return C1992A.f18074a;
        }
    }

    public pm2(RewardedAdEventListener rewardedAdEventListener) {
        this.f31836a = rewardedAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.au
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.au
    public final void onAdDismissed() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.au
    public final void onAdShown() {
        new CallbackStackTraceMarker(new e());
    }

    @Override // com.yandex.mobile.ads.impl.au
    public final void a(zx1 adError) {
        kotlin.jvm.internal.l.f(adError, "adError");
        new CallbackStackTraceMarker(new c(new vk2(adError.a())));
    }

    @Override // com.yandex.mobile.ads.impl.au
    public final void a(C4108f4 c4108f4) {
        new CallbackStackTraceMarker(new d(c4108f4 != null ? new ll2(c4108f4) : null));
    }

    @Override // com.yandex.mobile.ads.impl.au
    public final void a(pr1 reward) {
        kotlin.jvm.internal.l.f(reward, "reward");
        new CallbackStackTraceMarker(new f(new nm2(reward)));
    }
}
