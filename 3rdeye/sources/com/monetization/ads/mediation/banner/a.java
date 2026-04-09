package com.monetization.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import b9.C1992A;
import c9.C2100u;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.banner.d;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.yandex.mobile.ads.impl.C4128i3;
import com.yandex.mobile.ads.impl.ao1;
import com.yandex.mobile.ads.impl.bk0;
import com.yandex.mobile.ads.impl.bo1;
import com.yandex.mobile.ads.impl.ex0;
import com.yandex.mobile.ads.impl.fa;
import com.yandex.mobile.ads.impl.fp0;
import com.yandex.mobile.ads.impl.fx0;
import com.yandex.mobile.ads.impl.hx0;
import com.yandex.mobile.ads.impl.ti;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import p9.l;
import w9.i;

/* loaded from: classes2.dex */
public final class a implements MediatedBannerAdapter.MediatedBannerAdapterListener {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ i<Object>[] f23679f = {fa.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/banner/BannerAdLoadController;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final fx0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f23680a;

    /* renamed from: b, reason: collision with root package name */
    private final d f23681b;

    /* renamed from: c, reason: collision with root package name */
    private final bk0 f23682c;

    /* renamed from: d, reason: collision with root package name */
    private final ao1 f23683d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23684e;

    /* renamed from: com.monetization.ads.mediation.banner.a$a, reason: collision with other inner class name */
    public final class C0362a implements d.a {
        public C0362a() {
        }

        @Override // com.monetization.ads.mediation.banner.d.a
        public final void a() {
            ti tiVarA = a.this.a();
            if (tiVarA != null) {
                a.this.f23680a.c(tiVarA.l());
            }
            if (a.this.f23680a.b()) {
                a.c(a.this);
            }
        }
    }

    public static final class b extends m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f23687c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f23687c = view;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            a.this.a(this.f23687c);
            return C1992A.f18074a;
        }
    }

    public static final class c extends m implements l<String, C1992A> {
        public c() {
            super(1);
        }

        public final void a(String errorDescription) {
            kotlin.jvm.internal.l.f(errorDescription, "errorDescription");
            a.this.onAdFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  ".concat(errorDescription)));
        }

        @Override // p9.l
        public final /* bridge */ /* synthetic */ C1992A invoke(String str) {
            a(str);
            return C1992A.f18074a;
        }
    }

    public /* synthetic */ a(ti tiVar, fx0 fx0Var, d dVar) {
        this(tiVar, fx0Var, dVar, new bk0(fx0Var));
    }

    public static final void c(a aVar) {
        ti tiVarA = aVar.a();
        if (tiVarA != null) {
            aVar.f23680a.b(tiVarA.l(), C2100u.f18582b);
            tiVarA.a(aVar.f23682c.a());
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdClicked() {
        ti tiVarA = a();
        if (tiVarA != null) {
            tiVarA.j().a();
            this.f23680a.a(tiVarA.l(), C2100u.f18582b);
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdFailedToLoad(MediatedAdRequestError adRequestError) {
        kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
        ti tiVarA = a();
        if (tiVarA != null) {
            Context contextL = tiVarA.l();
            C4128i3 c4128i3 = new C4128i3(adRequestError.getCode(), adRequestError.getDescription(), adRequestError.getDescription(), null);
            if (this.f23684e) {
                this.f23680a.a(contextL, c4128i3, this);
            } else {
                this.f23680a.b(contextL, c4128i3, this);
            }
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdImpression() {
        ti tiVarA;
        if (this.f23680a.b() || (tiVarA = a()) == null) {
            return;
        }
        this.f23680a.b(tiVarA.l(), C2100u.f18582b);
        tiVarA.a(this.f23682c.a());
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdLeftApplication() {
        ti tiVarA = a();
        if (tiVarA != null) {
            tiVarA.onLeftApplication();
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdLoaded(View view) {
        hx0 hx0VarA;
        kotlin.jvm.internal.l.f(view, "view");
        ti tiVarA = a();
        if (tiVarA != null) {
            ex0<T> ex0VarA = this.f23680a.a();
            MediatedAdObject mediatedAdObjectA = (ex0VarA == 0 || (hx0VarA = ex0VarA.a()) == null) ? null : hx0VarA.a();
            if (mediatedAdObjectA != null) {
                tiVarA.a(mediatedAdObjectA.getAd(), mediatedAdObjectA.getInfo(), new b(view), new c());
            } else {
                fp0.a(new Object[0]);
                a(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ti a() {
        return (ti) this.f23683d.getValue(this, f23679f[0]);
    }

    public a(ti loadController, fx0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> mediatedAdController, d mediatedContentViewPublisher, bk0 impressionDataProvider) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        kotlin.jvm.internal.l.f(mediatedAdController, "mediatedAdController");
        kotlin.jvm.internal.l.f(mediatedContentViewPublisher, "mediatedContentViewPublisher");
        kotlin.jvm.internal.l.f(impressionDataProvider, "impressionDataProvider");
        this.f23680a = mediatedAdController;
        this.f23681b = mediatedContentViewPublisher;
        this.f23682c = impressionDataProvider;
        this.f23683d = bo1.a(loadController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(View view) {
        ti tiVarA = a();
        if (tiVarA != null) {
            Context context = view.getContext();
            kotlin.jvm.internal.l.e(context, "getContext(...)");
            if (!this.f23684e) {
                this.f23684e = true;
                this.f23680a.c(context, C2100u.f18582b);
            } else {
                this.f23680a.b(context);
            }
            C0362a c0362a = new C0362a();
            tiVarA.j().c();
            this.f23681b.a(view, c0362a);
            tiVarA.u();
        }
    }
}
