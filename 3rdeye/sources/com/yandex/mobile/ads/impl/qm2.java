package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class qm2 implements bu {

    /* renamed from: a, reason: collision with root package name */
    private final RewardedAdLoadListener f32286a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f32288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdRequestError adRequestError) {
            super(0);
            this.f32288c = adRequestError;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            RewardedAdLoadListener rewardedAdLoadListener = qm2.this.f32286a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onAdFailedToLoad(this.f32288c);
            }
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ om2 f32290c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(om2 om2Var) {
            super(0);
            this.f32290c = om2Var;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            RewardedAdLoadListener rewardedAdLoadListener = qm2.this.f32286a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onAdLoaded(this.f32290c);
            }
            return C1992A.f18074a;
        }
    }

    public qm2(RewardedAdLoadListener rewardedAdLoadListener) {
        this.f32286a = rewardedAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.bu
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.bu
    public final void a(zt rewarded) {
        kotlin.jvm.internal.l.f(rewarded, "rewarded");
        new CallbackStackTraceMarker(new b(new om2(rewarded, new wk2())));
    }
}
