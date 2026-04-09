package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.o91;

/* loaded from: classes3.dex */
public final class wv1 implements xi {

    /* renamed from: a, reason: collision with root package name */
    private final ti f35068a;

    /* renamed from: b, reason: collision with root package name */
    private final o91 f35069b;

    /* renamed from: c, reason: collision with root package name */
    private final gj f35070c;

    /* renamed from: d, reason: collision with root package name */
    private final k71 f35071d;

    /* renamed from: e, reason: collision with root package name */
    private final rt1 f35072e;

    /* renamed from: f, reason: collision with root package name */
    private final r71 f35073f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f35074g;

    /* renamed from: h, reason: collision with root package name */
    private final ew1 f35075h;
    private final vi i;

    /* renamed from: j, reason: collision with root package name */
    private final u51 f35076j;

    /* renamed from: k, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f35077k;

    /* renamed from: l, reason: collision with root package name */
    private a8<String> f35078l;

    /* renamed from: m, reason: collision with root package name */
    private h61 f35079m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f35080n;

    /* renamed from: o, reason: collision with root package name */
    private fj f35081o;

    public static final class c implements wi {
        public c() {
        }

        @Override // com.yandex.mobile.ads.impl.wi
        public final void a() {
            wv1.this.f35068a.u();
        }

        @Override // com.yandex.mobile.ads.impl.wi
        public final void a(C4128i3 error) {
            kotlin.jvm.internal.l.f(error, "error");
            wv1.this.f35068a.b(error);
        }
    }

    public wv1(ti loadController, vu1 sdkEnvironmentModule, o91 nativeResponseCreator, gj contentControllerCreator, k71 requestParameterManager, rt1 sdkAdapterReporter, r71 adEventListener, Handler handler, ew1 sdkSettings, vi sizeValidator, u51 infoProvider) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(nativeResponseCreator, "nativeResponseCreator");
        kotlin.jvm.internal.l.f(contentControllerCreator, "contentControllerCreator");
        kotlin.jvm.internal.l.f(requestParameterManager, "requestParameterManager");
        kotlin.jvm.internal.l.f(sdkAdapterReporter, "sdkAdapterReporter");
        kotlin.jvm.internal.l.f(adEventListener, "adEventListener");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(sizeValidator, "sizeValidator");
        kotlin.jvm.internal.l.f(infoProvider, "infoProvider");
        this.f35068a = loadController;
        this.f35069b = nativeResponseCreator;
        this.f35070c = contentControllerCreator;
        this.f35071d = requestParameterManager;
        this.f35072e = sdkAdapterReporter;
        this.f35073f = adEventListener;
        this.f35074g = handler;
        this.f35075h = sdkSettings;
        this.i = sizeValidator;
        this.f35076j = infoProvider;
        this.f35077k = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.mobile.ads.impl.W3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return wv1.g(this.f24303b);
            }
        };
    }

    public static final void f(wv1 wv1Var) {
        wv1Var.f35078l = null;
        wv1Var.f35079m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(wv1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f35074g.postDelayed(new J2(this$0, 11), 50L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(wv1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        mg2.a(this$0.f35068a.C(), false);
    }

    @Override // com.yandex.mobile.ads.impl.xi
    public final String getAdInfo() {
        return this.f35076j.a(this.f35079m);
    }

    public final class a implements xq1 {

        /* renamed from: a, reason: collision with root package name */
        private final Context f35082a;

        /* renamed from: b, reason: collision with root package name */
        private final a8<?> f35083b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ wv1 f35084c;

        public a(wv1 wv1Var, Context context, a8<?> adResponse) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            this.f35084c = wv1Var;
            this.f35082a = context;
            this.f35083b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            this.f35084c.f35072e.a(this.f35082a, this.f35083b, this.f35084c.f35071d);
            this.f35084c.f35072e.a(this.f35082a, this.f35083b, (l71) null);
        }

        @Override // com.yandex.mobile.ads.impl.xq1
        public final void a(p61 nativeAdResponse) {
            kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
            l71 l71Var = new l71(this.f35083b, nativeAdResponse, this.f35084c.f35068a.f());
            this.f35084c.f35072e.a(this.f35082a, this.f35083b, this.f35084c.f35071d);
            this.f35084c.f35072e.a(this.f35082a, this.f35083b, l71Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xi
    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        fj fjVar = this.f35081o;
        if (fjVar != null) {
            fjVar.a();
        }
        this.f35069b.a();
        this.f35078l = null;
        this.f35079m = null;
        this.f35080n = true;
    }

    public final class b implements o91.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.o91.b
        public final void a(C4128i3 adRequestError) {
            kotlin.jvm.internal.l.f(adRequestError, "adRequestError");
            if (wv1.this.f35080n) {
                return;
            }
            wv1.f(wv1.this);
            wv1.this.f35068a.b(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.o91.b
        public final void a(h61 createdNativeAd) {
            kotlin.jvm.internal.l.f(createdNativeAd, "createdNativeAd");
            if (wv1.this.f35080n) {
                return;
            }
            wv1.this.f35079m = createdNativeAd;
            wv1.this.f35074g.post(new P0(wv1.this, 13));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(wv1 this$0) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            this$0.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.xi
    public final void a(Context context, a8<String> response) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(response, "response");
        C4198s4 c4198s4I = this.f35068a.i();
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32454c;
        uj.a(c4198s4I, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        du1 du1VarA = this.f35075h.a(context);
        if (du1VarA != null && du1VarA.v0()) {
            if (this.f35080n) {
                return;
            }
            vy1 vy1VarQ = this.f35068a.q();
            vy1 vy1VarM = response.M();
            this.f35078l = response;
            if (vy1VarQ != null && xy1.a(context, response, vy1VarM, this.i, vy1VarQ)) {
                this.f35069b.a(response, new b(), new a(this, context, response));
                return;
            }
            C4128i3 c4128i3A = i7.a(vy1VarQ != null ? vy1VarQ.c(context) : 0, vy1VarQ != null ? vy1VarQ.a(context) : 0, vy1VarM.getWidth(), vy1VarM.getHeight(), jh2.d(context), jh2.b(context));
            uo0.a(c4128i3A.d(), new Object[0]);
            this.f35068a.b(c4128i3A);
            return;
        }
        this.f35068a.b(i7.x());
    }

    public final void a() {
        h61 h61Var;
        if (!this.f35080n) {
            a8<String> a8Var = this.f35078l;
            ap0 ap0VarC = this.f35068a.C();
            if (a8Var == null || (h61Var = this.f35079m) == null) {
                return;
            }
            fj fjVarA = this.f35070c.a(this.f35068a.l(), a8Var, h61Var, ap0VarC, this.f35073f, this.f35077k, this.f35068a.D());
            this.f35081o = fjVarA;
            fjVarA.a(a8Var.M(), new c());
            return;
        }
        this.f35068a.b(i7.i());
    }
}
