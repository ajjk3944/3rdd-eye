package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import b9.C1992A;
import b9.m;
import b9.n;
import c9.C2077A;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.yandex.mobile.ads.impl.C4072a3;
import com.yandex.mobile.ads.impl.C4198s4;
import com.yandex.mobile.ads.impl.a8;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.dy0;
import com.yandex.mobile.ads.impl.ex0;
import com.yandex.mobile.ads.impl.fp0;
import com.yandex.mobile.ads.impl.fx0;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.td0;
import com.yandex.mobile.ads.impl.ux0;
import com.yandex.mobile.ads.impl.vy0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.impl.zx0;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c<T extends td0<T>> implements wc0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final dd0<T> f23721a;

    /* renamed from: b, reason: collision with root package name */
    private final fx0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f23722b;

    /* renamed from: c, reason: collision with root package name */
    private final b f23723c;

    /* renamed from: d, reason: collision with root package name */
    private final a<T> f23724d;

    /* renamed from: e, reason: collision with root package name */
    private final ux0 f23725e;

    public c(dd0<T> loadController, a8<String> adResponse, vy0 mediationData) {
        l.f(loadController, "loadController");
        l.f(adResponse, "adResponse");
        l.f(mediationData, "mediationData");
        this.f23721a = loadController;
        C4072a3 c4072a3F = loadController.f();
        zx0 zx0Var = new zx0(c4072a3F);
        ux0 ux0Var = new ux0(c4072a3F, adResponse);
        this.f23725e = ux0Var;
        dy0 dy0Var = new dy0(new nx0(mediationData.c(), zx0Var, ux0Var));
        C4198s4 c4198s4I = loadController.i();
        cg1 cg1Var = new cg1(loadController, mediationData, c4198s4I);
        b bVar = new b();
        this.f23723c = bVar;
        fx0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> fx0Var = new fx0<>(c4072a3F, c4198s4I, bVar, ux0Var, dy0Var, cg1Var);
        this.f23722b = fx0Var;
        this.f23724d = new a<>(loadController, fx0Var);
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context, a8<String> adResponse) {
        l.f(context, "context");
        l.f(adResponse, "adResponse");
        this.f23722b.a(context, (Context) this.f23724d);
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final String getAdInfo() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final Object a(T contentController, Activity activity) {
        Object objA;
        ex0<T> ex0VarA;
        l.f(contentController, "contentController");
        l.f(activity, "activity");
        try {
            MediatedInterstitialAdapter mediatedInterstitialAdapterA = this.f23723c.a();
            if (mediatedInterstitialAdapterA != null) {
                this.f23724d.a(contentController);
                this.f23721a.j().c();
                mediatedInterstitialAdapterA.showInterstitial(activity);
            }
            objA = C1992A.f18074a;
        } catch (Throwable th) {
            objA = n.a(th);
        }
        Throwable thA = m.a(objA);
        if (thA != null && (ex0VarA = this.f23722b.a()) != 0) {
            Context applicationContext = activity.getApplicationContext();
            l.e(applicationContext, "getApplicationContext(...)");
            fp0.c(new Object[0]);
            this.f23725e.a(applicationContext, ex0VarA.c(), C2077A.m(new b9.l("reason", C2077A.m(new b9.l("exception_in_adapter", thA.toString())))), ex0VarA.a().b().getNetworkName());
        }
        return objA;
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context) {
        l.f(context, "context");
        this.f23721a.j().d();
        this.f23722b.a(context);
    }
}
