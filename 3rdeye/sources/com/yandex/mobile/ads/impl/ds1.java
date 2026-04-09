package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import c9.C2100u;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.rewarded.MediatedReward;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class ds1 implements MediatedRewardedAdapterListener {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f26306e;

    /* renamed from: a, reason: collision with root package name */
    private final fx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f26307a;

    /* renamed from: b, reason: collision with root package name */
    private final bk0 f26308b;

    /* renamed from: c, reason: collision with root package name */
    private final ao1 f26309c;

    /* renamed from: d, reason: collision with root package name */
    private final ao1 f26310d;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            ds1.a(ds1.this);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements p9.l<String, C1992A> {
        public b() {
            super(1);
        }

        public final void a(String errorDescription) {
            kotlin.jvm.internal.l.f(errorDescription, "errorDescription");
            ds1.this.onRewardedAdFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  ".concat(errorDescription)));
        }

        @Override // p9.l
        public final /* bridge */ /* synthetic */ C1992A invoke(String str) {
            a(str);
            return C1992A.f18074a;
        }
    }

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(ds1.class, "contentController", "getContentController()Lcom/monetization/ads/rewarded/content/RewardedAdContentController;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f26306e = new w9.i[]{nVar, fa.a(ds1.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};
    }

    public /* synthetic */ ds1(dd0 dd0Var, fx0 fx0Var) {
        this(dd0Var, fx0Var, new bk0(fx0Var));
    }

    public static final void a(ds1 ds1Var) {
        dd0 dd0Var = (dd0) ds1Var.f26310d.getValue(ds1Var, f26306e[1]);
        if (dd0Var != null) {
            ds1Var.f26307a.c(dd0Var.l(), C2100u.f18582b);
            dd0Var.u();
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onAdImpression() {
        vr1 vr1VarA;
        if (this.f26307a.b() || (vr1VarA = a()) == null) {
            return;
        }
        this.f26307a.b(vr1VarA.e(), C2100u.f18582b);
        vr1VarA.a(this.f26308b.a());
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewarded(MediatedReward mediatedReward) {
        vr1 vr1VarA = a();
        if (vr1VarA != null) {
            this.f26307a.a(vr1VarA.e(), vr1VarA.d());
            vr1VarA.r();
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdClicked() {
        x6 x6VarJ;
        vr1 vr1VarA = a();
        if (vr1VarA != null) {
            Context contextE = vr1VarA.e();
            dd0 dd0Var = (dd0) this.f26310d.getValue(this, f26306e[1]);
            if (dd0Var != null && (x6VarJ = dd0Var.j()) != null) {
                x6VarJ.a();
            }
            this.f26307a.a(contextE, C2100u.f18582b);
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdDismissed() {
        x6 x6VarJ;
        vr1 vr1VarA = a();
        if (vr1VarA != null) {
            vr1VarA.p();
        }
        dd0 dd0Var = (dd0) this.f26310d.getValue(this, f26306e[1]);
        if (dd0Var == null || (x6VarJ = dd0Var.j()) == null) {
            return;
        }
        x6VarJ.b();
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdFailedToLoad(MediatedAdRequestError error) {
        kotlin.jvm.internal.l.f(error, "error");
        dd0 dd0Var = (dd0) this.f26310d.getValue(this, f26306e[1]);
        if (dd0Var != null) {
            this.f26307a.b(dd0Var.l(), new C4128i3(error.getCode(), error.getDescription(), error.getDescription(), null), this);
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdLeftApplication() {
        vr1 vr1VarA = a();
        if (vr1VarA != null) {
            vr1VarA.onLeftApplication();
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdLoaded() {
        hx0 hx0VarA;
        ao1 ao1Var = this.f26310d;
        w9.i<?>[] iVarArr = f26306e;
        dd0 dd0Var = (dd0) ao1Var.getValue(this, iVarArr[1]);
        if (dd0Var != null) {
            ex0<T> ex0VarA = this.f26307a.a();
            MediatedAdObject mediatedAdObjectA = (ex0VarA == 0 || (hx0VarA = ex0VarA.a()) == null) ? null : hx0VarA.a();
            if (mediatedAdObjectA != null) {
                dd0Var.a(mediatedAdObjectA.getAd(), mediatedAdObjectA.getInfo(), new a(), new b());
                return;
            }
            fp0.a(new Object[0]);
            dd0 dd0Var2 = (dd0) this.f26310d.getValue(this, iVarArr[1]);
            if (dd0Var2 != null) {
                this.f26307a.c(dd0Var2.l(), C2100u.f18582b);
                dd0Var2.u();
            }
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdShown() {
        vr1 vr1VarA;
        vr1 vr1VarA2 = a();
        if (vr1VarA2 != null) {
            vr1VarA2.q();
            this.f26307a.c(vr1VarA2.e());
        }
        if (!this.f26307a.b() || (vr1VarA = a()) == null) {
            return;
        }
        this.f26307a.b(vr1VarA.e(), C2100u.f18582b);
        vr1VarA.a(this.f26308b.a());
    }

    public ds1(dd0<vr1> loadController, fx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> mediatedAdController, bk0 impressionDataProvider) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        kotlin.jvm.internal.l.f(mediatedAdController, "mediatedAdController");
        kotlin.jvm.internal.l.f(impressionDataProvider, "impressionDataProvider");
        this.f26307a = mediatedAdController;
        this.f26308b = impressionDataProvider;
        this.f26309c = bo1.a(null);
        this.f26310d = bo1.a(loadController);
    }

    public final vr1 a() {
        return (vr1) this.f26309c.getValue(this, f26306e[0]);
    }

    public final void a(vr1 vr1Var) {
        this.f26309c.setValue(this, f26306e[0], vr1Var);
    }
}
