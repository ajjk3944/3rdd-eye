package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import b9.C1992A;
import c9.C2100u;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.yandex.mobile.ads.impl.C4128i3;
import com.yandex.mobile.ads.impl.ao1;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.bo1;
import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.ex0;
import com.yandex.mobile.ads.impl.fa;
import com.yandex.mobile.ads.impl.fp0;
import com.yandex.mobile.ads.impl.fx0;
import com.yandex.mobile.ads.impl.hx0;
import com.yandex.mobile.ads.impl.td0;
import com.yandex.mobile.ads.impl.x6;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;
import p9.InterfaceC5480a;
import p9.l;
import w9.i;

/* loaded from: classes2.dex */
public final class a<T extends td0<T>> implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ i<Object>[] f23713e;

    /* renamed from: a, reason: collision with root package name */
    private final fx0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f23714a;

    /* renamed from: b, reason: collision with root package name */
    private final bk0 f23715b;

    /* renamed from: c, reason: collision with root package name */
    private final ao1 f23716c;

    /* renamed from: d, reason: collision with root package name */
    private final ao1 f23717d;

    /* renamed from: com.monetization.ads.mediation.interstitial.a$a, reason: collision with other inner class name */
    public static final class C0363a extends m implements InterfaceC5480a<C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f23718b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0363a(a<T> aVar) {
            super(0);
            this.f23718b = aVar;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            a.a(this.f23718b);
            return C1992A.f18074a;
        }
    }

    public static final class b extends m implements l<String, C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f23719b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T> aVar) {
            super(1);
            this.f23719b = aVar;
        }

        public final void a(String errorDescription) {
            kotlin.jvm.internal.l.f(errorDescription, "errorDescription");
            this.f23719b.onInterstitialFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  ".concat(errorDescription)));
        }

        @Override // p9.l
        public final /* bridge */ /* synthetic */ C1992A invoke(String str) {
            a(str);
            return C1992A.f18074a;
        }
    }

    static {
        n nVar = new n(a.class, "contentController", "getContentController()Lcom/monetization/ads/fullscreen/FullscreenContentController;");
        x.f43661a.getClass();
        f23713e = new i[]{nVar, fa.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};
    }

    public /* synthetic */ a(dd0 dd0Var, fx0 fx0Var) {
        this(dd0Var, fx0Var, new bk0(fx0Var));
    }

    public final void a(td0<T> td0Var) {
        this.f23716c.setValue(this, f23713e[0], td0Var);
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onAdImpression() {
        td0 td0Var;
        if (this.f23714a.b() || (td0Var = (td0) this.f23716c.getValue(this, f23713e[0])) == null) {
            return;
        }
        this.f23714a.b(td0Var.e(), C2100u.f18582b);
        td0Var.a(this.f23715b.a());
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialClicked() {
        x6 x6VarJ;
        ao1 ao1Var = this.f23716c;
        i<?>[] iVarArr = f23713e;
        td0 td0Var = (td0) ao1Var.getValue(this, iVarArr[0]);
        if (td0Var != null) {
            Context contextE = td0Var.e();
            dd0 dd0Var = (dd0) this.f23717d.getValue(this, iVarArr[1]);
            if (dd0Var != null && (x6VarJ = dd0Var.j()) != null) {
                x6VarJ.a();
            }
            this.f23714a.a(contextE, C2100u.f18582b);
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialDismissed() {
        x6 x6VarJ;
        ao1 ao1Var = this.f23716c;
        i<?>[] iVarArr = f23713e;
        td0 td0Var = (td0) ao1Var.getValue(this, iVarArr[0]);
        if (td0Var != null) {
            td0Var.p();
        }
        dd0 dd0Var = (dd0) this.f23717d.getValue(this, iVarArr[1]);
        if (dd0Var == null || (x6VarJ = dd0Var.j()) == null) {
            return;
        }
        x6VarJ.b();
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialFailedToLoad(MediatedAdRequestError adRequestError) {
        kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
        dd0 dd0Var = (dd0) this.f23717d.getValue(this, f23713e[1]);
        if (dd0Var != null) {
            this.f23714a.b(dd0Var.l(), new C4128i3(adRequestError.getCode(), adRequestError.getDescription(), adRequestError.getDescription(), null), this);
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLeftApplication() {
        td0 td0Var = (td0) this.f23716c.getValue(this, f23713e[0]);
        if (td0Var != null) {
            td0Var.onLeftApplication();
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLoaded() {
        hx0 hx0VarA;
        ao1 ao1Var = this.f23717d;
        i<?>[] iVarArr = f23713e;
        dd0 dd0Var = (dd0) ao1Var.getValue(this, iVarArr[1]);
        if (dd0Var != null) {
            ex0<T> ex0VarA = this.f23714a.a();
            MediatedAdObject mediatedAdObjectA = (ex0VarA == 0 || (hx0VarA = ex0VarA.a()) == null) ? null : hx0VarA.a();
            if (mediatedAdObjectA != null) {
                dd0Var.a(mediatedAdObjectA.getAd(), mediatedAdObjectA.getInfo(), new C0363a(this), new b(this));
                return;
            }
            fp0.a(new Object[0]);
            dd0 dd0Var2 = (dd0) this.f23717d.getValue(this, iVarArr[1]);
            if (dd0Var2 != null) {
                this.f23714a.c(dd0Var2.l(), C2100u.f18582b);
                dd0Var2.u();
            }
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialShown() {
        td0 td0Var;
        ao1 ao1Var = this.f23716c;
        i<?>[] iVarArr = f23713e;
        td0 td0Var2 = (td0) ao1Var.getValue(this, iVarArr[0]);
        if (td0Var2 != null) {
            td0Var2.q();
            this.f23714a.c(td0Var2.e());
        }
        if (!this.f23714a.b() || (td0Var = (td0) this.f23716c.getValue(this, iVarArr[0])) == null) {
            return;
        }
        this.f23714a.b(td0Var.e(), C2100u.f18582b);
        td0Var.a(this.f23715b.a());
    }

    public static final void a(a aVar) {
        dd0 dd0Var = (dd0) aVar.f23717d.getValue(aVar, f23713e[1]);
        if (dd0Var != null) {
            aVar.f23714a.c(dd0Var.l(), C2100u.f18582b);
            dd0Var.u();
        }
    }

    public a(dd0<T> loadController, fx0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> mediatedAdController, bk0 impressionDataProvider) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        kotlin.jvm.internal.l.f(mediatedAdController, "mediatedAdController");
        kotlin.jvm.internal.l.f(impressionDataProvider, "impressionDataProvider");
        this.f23714a = mediatedAdController;
        this.f23715b = impressionDataProvider;
        this.f23716c = bo1.a(null);
        this.f23717d = bo1.a(loadController);
    }
}
