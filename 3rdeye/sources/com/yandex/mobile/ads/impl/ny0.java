package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import b9.C1992A;
import c9.C2077A;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;

/* loaded from: classes3.dex */
public final class ny0 implements wc0<vr1> {

    /* renamed from: a, reason: collision with root package name */
    private final dd0<vr1> f31056a;

    /* renamed from: b, reason: collision with root package name */
    private final fx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f31057b;

    /* renamed from: c, reason: collision with root package name */
    private final py0 f31058c;

    /* renamed from: d, reason: collision with root package name */
    private final ds1 f31059d;

    /* renamed from: e, reason: collision with root package name */
    private final ux0 f31060e;

    public ny0(dd0<vr1> loadController, a8<String> adResponse, vy0 mediationData) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(mediationData, "mediationData");
        this.f31056a = loadController;
        C4072a3 c4072a3F = loadController.f();
        zx0 zx0Var = new zx0(c4072a3F);
        ux0 ux0Var = new ux0(c4072a3F, adResponse);
        this.f31060e = ux0Var;
        oy0 oy0Var = new oy0(new nx0(mediationData.c(), zx0Var, ux0Var));
        C4198s4 c4198s4I = loadController.i();
        cg1 cg1Var = new cg1(loadController, mediationData, c4198s4I);
        py0 py0Var = new py0();
        this.f31058c = py0Var;
        fx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> fx0Var = new fx0<>(c4072a3F, c4198s4I, py0Var, ux0Var, oy0Var, cg1Var);
        this.f31057b = fx0Var;
        this.f31059d = new ds1(loadController, fx0Var);
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f31056a.j().d();
        this.f31057b.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final String getAdInfo() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context, a8<String> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f31057b.a(context, (Context) this.f31059d);
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final Object a(td0 td0Var, Activity activity) {
        Object objA;
        ex0<T> ex0VarA;
        vr1 contentController = (vr1) td0Var;
        kotlin.jvm.internal.l.f(contentController, "contentController");
        kotlin.jvm.internal.l.f(activity, "activity");
        try {
            MediatedRewardedAdapter mediatedRewardedAdapterA = this.f31058c.a();
            if (mediatedRewardedAdapterA != null) {
                this.f31059d.a(contentController);
                this.f31056a.j().c();
                mediatedRewardedAdapterA.showRewardedAd(activity);
            }
            objA = C1992A.f18074a;
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        Throwable thA = b9.m.a(objA);
        if (thA != null && (ex0VarA = this.f31057b.a()) != 0) {
            Context applicationContext = activity.getApplicationContext();
            kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
            fp0.c(new Object[0]);
            this.f31060e.a(applicationContext, ex0VarA.c(), C2077A.m(new b9.l("reason", C2077A.m(new b9.l("exception_in_adapter", thA.toString())))), ex0VarA.a().b().getNetworkName());
        }
        return objA;
    }
}
