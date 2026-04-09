package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import b9.m;
import com.yandex.mobile.ads.impl.C4236y0;
import com.yandex.mobile.ads.impl.o91;

/* loaded from: classes3.dex */
public final class cw1 implements wc0<vr1> {

    /* renamed from: a, reason: collision with root package name */
    private final dd0<vr1> f25782a;

    /* renamed from: b, reason: collision with root package name */
    private final u51 f25783b;

    /* renamed from: c, reason: collision with root package name */
    private final rt1 f25784c;

    /* renamed from: d, reason: collision with root package name */
    private final o91 f25785d;

    /* renamed from: e, reason: collision with root package name */
    private final C4072a3 f25786e;

    /* renamed from: f, reason: collision with root package name */
    private final k71 f25787f;

    /* renamed from: g, reason: collision with root package name */
    private final md0 f25788g;

    /* renamed from: h, reason: collision with root package name */
    private a8<String> f25789h;
    private h61 i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25790j;

    public cw1(dd0<vr1> rewardedAdLoadController, vu1 sdkEnvironmentModule, u51 infoProvider) {
        kotlin.jvm.internal.l.f(rewardedAdLoadController, "rewardedAdLoadController");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(infoProvider, "infoProvider");
        this.f25782a = rewardedAdLoadController;
        this.f25783b = infoProvider;
        Context contextL = rewardedAdLoadController.l();
        C4072a3 c4072a3F = rewardedAdLoadController.f();
        this.f25786e = c4072a3F;
        this.f25787f = new k71(c4072a3F);
        C4198s4 c4198s4I = rewardedAdLoadController.i();
        this.f25784c = new rt1(c4072a3F);
        this.f25785d = new o91(contextL, sdkEnvironmentModule, c4072a3F, c4198s4I);
        this.f25788g = new md0(sdkEnvironmentModule);
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final String getAdInfo() {
        return this.f25783b.a(this.i);
    }

    public final class a implements xq1 {

        /* renamed from: a, reason: collision with root package name */
        private final a8<String> f25791a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f25792b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cw1 f25793c;

        public a(cw1 cw1Var, Context context, a8<String> adResponse) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            this.f25793c = cw1Var;
            this.f25791a = adResponse;
            this.f25792b = context.getApplicationContext();
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            rt1 rt1Var = this.f25793c.f25784c;
            Context context = this.f25792b;
            kotlin.jvm.internal.l.e(context, "context");
            rt1Var.a(context, this.f25791a, this.f25793c.f25787f);
            rt1 rt1Var2 = this.f25793c.f25784c;
            Context context2 = this.f25792b;
            kotlin.jvm.internal.l.e(context2, "context");
            rt1Var2.a(context2, this.f25791a, (l71) null);
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(p61 nativeAdResponse) {
            kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
            l71 l71Var = new l71(this.f25791a, nativeAdResponse, this.f25793c.f25786e);
            rt1 rt1Var = this.f25793c.f25784c;
            Context context = this.f25792b;
            kotlin.jvm.internal.l.e(context, "context");
            rt1Var.a(context, this.f25791a, this.f25793c.f25787f);
            rt1 rt1Var2 = this.f25793c.f25784c;
            Context context2 = this.f25792b;
            kotlin.jvm.internal.l.e(context2, "context");
            rt1Var2.a(context2, this.f25791a, l71Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f25790j = true;
        this.f25789h = null;
        this.i = null;
        this.f25785d.a();
        fp0.d(new Object[0]);
    }

    public final class b implements o91.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.o91.b
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            if (cw1.this.f25790j) {
                return;
            }
            cw1.this.i = null;
            cw1.this.f25782a.b(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.o91.b
        public final void a(h61 nativeAdPrivate) {
            kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
            if (cw1.this.f25790j) {
                return;
            }
            cw1.this.i = nativeAdPrivate;
            cw1.this.f25782a.u();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context, a8<String> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        if (this.f25790j) {
            return;
        }
        this.f25789h = adResponse;
        C4198s4 c4198s4I = this.f25782a.i();
        EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32454c;
        c4198s4I.getClass();
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        c4198s4I.a(adLoadingPhaseType, null);
        this.f25785d.a(adResponse, new b(), new a(this, context, adResponse));
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final Object a(td0 td0Var, Activity activity) {
        vr1 contentController = (vr1) td0Var;
        kotlin.jvm.internal.l.f(contentController, "contentController");
        kotlin.jvm.internal.l.f(activity, "activity");
        m.a aVarA = b9.n.a(d6.a());
        a8<String> a8Var = this.f25789h;
        h61 h61Var = this.i;
        if (a8Var == null || h61Var == null) {
            return aVarA;
        }
        Object objA = this.f25788g.a(activity, new C4236y0(new C4236y0.a(a8Var, this.f25786e, contentController.i()).a(this.f25786e.o()).a(h61Var)));
        this.f25789h = null;
        this.i = null;
        return objA;
    }
}
