package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class fn implements lp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27391a;

    /* renamed from: b, reason: collision with root package name */
    private final zs0 f27392b;

    /* renamed from: c, reason: collision with root package name */
    private final vs0 f27393c;

    /* renamed from: d, reason: collision with root package name */
    private final kp0 f27394d;

    /* renamed from: e, reason: collision with root package name */
    private final sp0 f27395e;

    /* renamed from: f, reason: collision with root package name */
    private final qk1 f27396f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<jp0> f27397g;

    /* renamed from: h, reason: collision with root package name */
    private ht f27398h;

    public final class a implements gd0 {

        /* renamed from: a, reason: collision with root package name */
        private final h7 f27399a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ fn f27400b;

        public a(fn fnVar, h7 adRequestData) {
            kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
            this.f27400b = fnVar;
            this.f27399a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.gd0
        public final void onAdShown() {
            this.f27400b.b(this.f27399a);
        }
    }

    public final class b implements ht {

        /* renamed from: a, reason: collision with root package name */
        private final h7 f27401a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ fn f27402b;

        public b(fn fnVar, h7 adRequestData) {
            kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
            this.f27402b = fnVar;
            this.f27401a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.ht
        public final void a(C4128i3 error) {
            kotlin.jvm.internal.l.f(error, "error");
        }

        @Override // com.yandex.mobile.ads.impl.ht
        public final void a(ft interstitialAd) {
            kotlin.jvm.internal.l.f(interstitialAd, "interstitialAd");
            this.f27402b.f27395e.a(this.f27401a, interstitialAd);
        }
    }

    public fn(Context context, rm2 sdkEnvironmentModule, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor, kp0 adItemLoadControllerFactory, sp0 preloadingCache, qk1 preloadingAvailabilityValidator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(adItemLoadControllerFactory, "adItemLoadControllerFactory");
        kotlin.jvm.internal.l.f(preloadingCache, "preloadingCache");
        kotlin.jvm.internal.l.f(preloadingAvailabilityValidator, "preloadingAvailabilityValidator");
        this.f27391a = context;
        this.f27392b = mainThreadUsageValidator;
        this.f27393c = mainThreadExecutor;
        this.f27394d = adItemLoadControllerFactory;
        this.f27395e = preloadingCache;
        this.f27396f = preloadingAvailabilityValidator;
        this.f27397g = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(fn this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        this$0.f27396f.getClass();
        if (qk1.a(adRequestData) && this$0.f27395e.c()) {
            this$0.a(adRequestData, new b(this$0, adRequestData), "render");
        }
    }

    public final class c implements ht {
        public c() {
        }

        @Override // com.yandex.mobile.ads.impl.ht
        public final void a(C4128i3 error) {
            kotlin.jvm.internal.l.f(error, "error");
            ht htVar = fn.this.f27398h;
            if (htVar != null) {
                htVar.a(error);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ht
        public final void a(ft interstitialAd) {
            kotlin.jvm.internal.l.f(interstitialAd, "interstitialAd");
            ht htVar = fn.this.f27398h;
            if (htVar != null) {
                htVar.a(interstitialAd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(fn this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        this$0.f27396f.getClass();
        if (!qk1.a(adRequestData)) {
            this$0.a(adRequestData, this$0.new c(), "default");
            return;
        }
        ft ftVarA = this$0.f27395e.a(adRequestData);
        if (ftVarA == null) {
            this$0.a(adRequestData, this$0.new c(), "default");
            return;
        }
        ht htVar = this$0.f27398h;
        if (htVar != null) {
            htVar.a(ftVarA);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lp0
    public final void a() {
        this.f27392b.a();
        this.f27393c.a();
        Iterator<jp0> it = this.f27397g.iterator();
        while (it.hasNext()) {
            jp0 next = it.next();
            next.a((ht) null);
            next.e();
        }
        this.f27397g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(h7 h7Var) {
        this.f27393c.a(new RunnableC0615b(23, this, h7Var));
    }

    @Override // com.yandex.mobile.ads.impl.lp0
    public final void a(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        this.f27392b.a();
        if (this.f27398h == null) {
            uo0.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f27393c.a(new L4(3, this, adRequestData));
    }

    private final void a(h7 h7Var, ht htVar, String str) {
        h7 h7VarA = h7.a(h7Var, null, str, 2047);
        jp0 jp0VarA = this.f27394d.a(this.f27391a, this, h7VarA, new a(this, h7VarA));
        this.f27397g.add(jp0VarA);
        jp0VarA.a(h7VarA.a());
        jp0VarA.a(htVar);
        jp0VarA.b(h7VarA);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4164n4
    public final void a(dd0 dd0Var) {
        jp0 loadController = (jp0) dd0Var;
        kotlin.jvm.internal.l.f(loadController, "loadController");
        if (this.f27398h == null) {
            uo0.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((ht) null);
        this.f27397g.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.lp0
    public final void a(bm2 bm2Var) {
        this.f27392b.a();
        this.f27398h = bm2Var;
    }
}
