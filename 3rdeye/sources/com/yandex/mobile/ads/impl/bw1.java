package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import b9.m;
import com.yandex.mobile.ads.impl.C4236y0;
import com.yandex.mobile.ads.impl.o91;
import com.yandex.mobile.ads.impl.td0;

/* loaded from: classes3.dex */
public final class bw1<T extends td0<T>> implements wc0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final dd0<T> f25441a;

    /* renamed from: b, reason: collision with root package name */
    private final u51 f25442b;

    /* renamed from: c, reason: collision with root package name */
    private final rt1 f25443c;

    /* renamed from: d, reason: collision with root package name */
    private final o91 f25444d;

    /* renamed from: e, reason: collision with root package name */
    private final C4072a3 f25445e;

    /* renamed from: f, reason: collision with root package name */
    private final k71 f25446f;

    /* renamed from: g, reason: collision with root package name */
    private final md0 f25447g;

    /* renamed from: h, reason: collision with root package name */
    private a8<String> f25448h;
    private h61 i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25449j;

    public /* synthetic */ bw1(dd0 dd0Var, vu1 vu1Var) {
        this(dd0Var, vu1Var, new u51());
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final String getAdInfo() {
        return this.f25442b.a(this.i);
    }

    public final class a implements xq1 {

        /* renamed from: a, reason: collision with root package name */
        private final a8<String> f25450a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f25451b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ bw1<T> f25452c;

        public a(bw1 bw1Var, Context context, a8<String> adResponse) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            this.f25452c = bw1Var;
            this.f25450a = adResponse;
            this.f25451b = context.getApplicationContext();
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            rt1 rt1Var = ((bw1) this.f25452c).f25443c;
            Context context = this.f25451b;
            kotlin.jvm.internal.l.e(context, "context");
            rt1Var.a(context, this.f25450a, ((bw1) this.f25452c).f25446f);
            rt1 rt1Var2 = ((bw1) this.f25452c).f25443c;
            Context context2 = this.f25451b;
            kotlin.jvm.internal.l.e(context2, "context");
            rt1Var2.a(context2, this.f25450a, (l71) null);
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(p61 nativeAdResponse) {
            kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
            l71 l71Var = new l71(this.f25450a, nativeAdResponse, ((bw1) this.f25452c).f25445e);
            rt1 rt1Var = ((bw1) this.f25452c).f25443c;
            Context context = this.f25451b;
            kotlin.jvm.internal.l.e(context, "context");
            rt1Var.a(context, this.f25450a, ((bw1) this.f25452c).f25446f);
            rt1 rt1Var2 = ((bw1) this.f25452c).f25443c;
            Context context2 = this.f25451b;
            kotlin.jvm.internal.l.e(context2, "context");
            rt1Var2.a(context2, this.f25450a, l71Var);
        }
    }

    public bw1(dd0<T> screenLoadController, vu1 sdkEnvironmentModule, u51 infoProvider) {
        kotlin.jvm.internal.l.f(screenLoadController, "screenLoadController");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(infoProvider, "infoProvider");
        this.f25441a = screenLoadController;
        this.f25442b = infoProvider;
        Context contextL = screenLoadController.l();
        C4072a3 c4072a3F = screenLoadController.f();
        this.f25445e = c4072a3F;
        this.f25446f = new k71(c4072a3F);
        C4198s4 c4198s4I = screenLoadController.i();
        this.f25443c = new rt1(c4072a3F);
        this.f25444d = new o91(contextL, sdkEnvironmentModule, c4072a3F, c4198s4I);
        this.f25447g = new md0(sdkEnvironmentModule);
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f25449j = true;
        this.f25448h = null;
        this.i = null;
        this.f25444d.a();
        fp0.d(new Object[0]);
    }

    public final class b implements o91.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.o91.b
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            if (((bw1) bw1.this).f25449j) {
                return;
            }
            ((bw1) bw1.this).i = null;
            ((bw1) bw1.this).f25441a.b(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.o91.b
        public final void a(h61 nativeAdPrivate) {
            kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
            if (((bw1) bw1.this).f25449j) {
                return;
            }
            ((bw1) bw1.this).i = nativeAdPrivate;
            ((bw1) bw1.this).f25441a.u();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context, a8<String> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        if (this.f25449j) {
            return;
        }
        this.f25448h = adResponse;
        C4198s4 c4198s4I = this.f25441a.i();
        EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32454c;
        c4198s4I.getClass();
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        c4198s4I.a(adLoadingPhaseType, null);
        this.f25444d.a(adResponse, new b(), new a(this, context, adResponse));
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final Object a(T contentController, Activity activity) {
        kotlin.jvm.internal.l.f(contentController, "contentController");
        kotlin.jvm.internal.l.f(activity, "activity");
        m.a aVarA = b9.n.a(d6.a());
        a8<String> a8Var = this.f25448h;
        h61 h61Var = this.i;
        if (a8Var == null || h61Var == null) {
            return aVarA;
        }
        Object objA = this.f25447g.a(activity, new C4236y0(new C4236y0.a(a8Var, this.f25445e, contentController.i()).a(this.f25445e.o()).a(h61Var)));
        this.f25448h = null;
        this.i = null;
        return objA;
    }
}
