package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class cn implements of {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25703a;

    /* renamed from: b, reason: collision with root package name */
    private final zs0 f25704b;

    /* renamed from: c, reason: collision with root package name */
    private final vs0 f25705c;

    /* renamed from: d, reason: collision with root package name */
    private final qf f25706d;

    /* renamed from: e, reason: collision with root package name */
    private final rf f25707e;

    /* renamed from: f, reason: collision with root package name */
    private final qk1 f25708f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<nf> f25709g;

    /* renamed from: h, reason: collision with root package name */
    private qs f25710h;

    public final class a implements gd0 {

        /* renamed from: a, reason: collision with root package name */
        private final h7 f25711a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn f25712b;

        public a(cn cnVar, h7 adRequestData) {
            kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
            this.f25712b = cnVar;
            this.f25711a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.gd0
        public final void onAdShown() {
            this.f25712b.b(this.f25711a);
        }
    }

    public final class b implements qs {

        /* renamed from: a, reason: collision with root package name */
        private final h7 f25713a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn f25714b;

        public b(cn cnVar, h7 adRequestData) {
            kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
            this.f25714b = cnVar;
            this.f25713a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.qs
        public final void a(C4128i3 error) {
            kotlin.jvm.internal.l.f(error, "error");
        }

        @Override // com.yandex.mobile.ads.impl.qs
        public final void a(os appOpenAd) {
            kotlin.jvm.internal.l.f(appOpenAd, "appOpenAd");
            this.f25714b.f25707e.a(this.f25713a, appOpenAd);
        }
    }

    public cn(Context context, rm2 sdkEnvironmentModule, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor, qf adLoadControllerFactory, rf preloadingCache, qk1 preloadingAvailabilityValidator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(adLoadControllerFactory, "adLoadControllerFactory");
        kotlin.jvm.internal.l.f(preloadingCache, "preloadingCache");
        kotlin.jvm.internal.l.f(preloadingAvailabilityValidator, "preloadingAvailabilityValidator");
        this.f25703a = context;
        this.f25704b = mainThreadUsageValidator;
        this.f25705c = mainThreadExecutor;
        this.f25706d = adLoadControllerFactory;
        this.f25707e = preloadingCache;
        this.f25708f = preloadingAvailabilityValidator;
        this.f25709g = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cn this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        this$0.f25708f.getClass();
        if (qk1.a(adRequestData) && this$0.f25707e.c()) {
            this$0.a(adRequestData, new b(this$0, adRequestData), "render");
        }
    }

    public final class c implements qs {
        public c() {
        }

        @Override // com.yandex.mobile.ads.impl.qs
        public final void a(C4128i3 error) {
            kotlin.jvm.internal.l.f(error, "error");
            qs qsVar = cn.this.f25710h;
            if (qsVar != null) {
                qsVar.a(error);
            }
        }

        @Override // com.yandex.mobile.ads.impl.qs
        public final void a(os appOpenAd) {
            kotlin.jvm.internal.l.f(appOpenAd, "appOpenAd");
            qs qsVar = cn.this.f25710h;
            if (qsVar != null) {
                qsVar.a(appOpenAd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cn this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        this$0.f25708f.getClass();
        if (!qk1.a(adRequestData)) {
            this$0.a(adRequestData, this$0.new c(), "default");
            return;
        }
        os osVarA = this$0.f25707e.a(adRequestData);
        if (osVarA == null) {
            this$0.a(adRequestData, this$0.new c(), "default");
            return;
        }
        qs qsVar = this$0.f25710h;
        if (qsVar != null) {
            qsVar.a(osVarA);
        }
    }

    @Override // com.yandex.mobile.ads.impl.of
    public final void a() {
        this.f25704b.a();
        this.f25705c.a();
        Iterator<nf> it = this.f25709g.iterator();
        while (it.hasNext()) {
            nf next = it.next();
            next.a((qs) null);
            next.e();
        }
        this.f25709g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(h7 h7Var) {
        this.f25705c.a(new L(1, this, h7Var));
    }

    @Override // com.yandex.mobile.ads.impl.of
    public final void a(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        this.f25704b.a();
        if (this.f25710h == null) {
            uo0.c("AppOpenAdLoader. AppOpenAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f25705c.a(new L4(2, this, adRequestData));
    }

    private final void a(h7 h7Var, qs qsVar, String str) {
        h7 h7VarA = h7.a(h7Var, null, str, 2047);
        nf nfVarA = this.f25706d.a(this.f25703a, this, h7VarA, new a(this, h7VarA));
        this.f25709g.add(nfVarA);
        nfVarA.a(h7VarA.a());
        nfVarA.a(qsVar);
        nfVarA.b(h7VarA);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4164n4
    public final void a(dd0 dd0Var) {
        nf loadController = (nf) dd0Var;
        kotlin.jvm.internal.l.f(loadController, "loadController");
        if (this.f25710h == null) {
            uo0.c("AppOpenAdLoader. AppOpenAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((qs) null);
        this.f25709g.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.of
    public final void a(el2 el2Var) {
        this.f25704b.a();
        this.f25710h = el2Var;
    }
}
