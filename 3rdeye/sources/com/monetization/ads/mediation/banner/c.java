package com.monetization.ads.mediation.banner;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.yandex.mobile.ads.impl.C4072a3;
import com.yandex.mobile.ads.impl.C4146l0;
import com.yandex.mobile.ads.impl.C4198s4;
import com.yandex.mobile.ads.impl.a8;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.fp0;
import com.yandex.mobile.ads.impl.fx0;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.ti;
import com.yandex.mobile.ads.impl.ux0;
import com.yandex.mobile.ads.impl.vy0;
import com.yandex.mobile.ads.impl.wx0;
import com.yandex.mobile.ads.impl.xi;
import com.yandex.mobile.ads.impl.yx0;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c implements xi {

    /* renamed from: a, reason: collision with root package name */
    private final a8<String> f23689a;

    /* renamed from: b, reason: collision with root package name */
    private final a f23690b;

    /* renamed from: c, reason: collision with root package name */
    private final fx0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f23691c;

    public c(ti loadController, a8<String> adResponse, vy0 mediationData) {
        l.f(loadController, "loadController");
        l.f(adResponse, "adResponse");
        l.f(mediationData, "mediationData");
        this.f23689a = adResponse;
        C4072a3 c4072a3F = loadController.f();
        yx0 yx0Var = new yx0(c4072a3F);
        ux0 ux0Var = new ux0(c4072a3F, adResponse);
        wx0 wx0Var = new wx0(new nx0(mediationData.c(), yx0Var, ux0Var));
        C4198s4 c4198s4I = loadController.i();
        fx0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> fx0Var = new fx0<>(c4072a3F, c4198s4I, new b(), ux0Var, wx0Var, new cg1(loadController, mediationData, c4198s4I));
        this.f23691c = fx0Var;
        this.f23690b = new a(loadController, fx0Var, new d(loadController.C(), loadController.f().r()));
    }

    @Override // com.yandex.mobile.ads.impl.xi
    public final void a(Context context, a8<String> adResponse) {
        l.f(context, "context");
        l.f(adResponse, "adResponse");
        Activity activityA = C4146l0.a();
        if (activityA != null) {
            fp0.a(new Object[0]);
        }
        if (activityA != null) {
            context = activityA;
        }
        this.f23691c.a(context, (Context) this.f23690b);
    }

    @Override // com.yandex.mobile.ads.impl.xi
    public final String getAdInfo() {
        return this.f23689a.e();
    }

    @Override // com.yandex.mobile.ads.impl.xi
    public final void a(Context context) {
        l.f(context, "context");
        this.f23691c.a(context);
    }
}
