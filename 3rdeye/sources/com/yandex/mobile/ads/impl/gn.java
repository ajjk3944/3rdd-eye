package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class gn implements zr1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27826a;

    /* renamed from: b, reason: collision with root package name */
    private final zs0 f27827b;

    /* renamed from: c, reason: collision with root package name */
    private final vs0 f27828c;

    /* renamed from: d, reason: collision with root package name */
    private final yr1 f27829d;

    /* renamed from: e, reason: collision with root package name */
    private final ls1 f27830e;

    /* renamed from: f, reason: collision with root package name */
    private final qk1 f27831f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<xr1> f27832g;

    /* renamed from: h, reason: collision with root package name */
    private bu f27833h;

    public final class a implements bu {

        /* renamed from: a, reason: collision with root package name */
        private final h7 f27834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ gn f27835b;

        public a(gn gnVar, h7 adRequestData) {
            kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
            this.f27835b = gnVar;
            this.f27834a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.bu
        public final void a(C4128i3 error) {
            kotlin.jvm.internal.l.f(error, "error");
        }

        @Override // com.yandex.mobile.ads.impl.bu
        public final void a(zt rewardedAd) {
            kotlin.jvm.internal.l.f(rewardedAd, "rewardedAd");
            this.f27835b.f27830e.a(this.f27834a, rewardedAd);
        }
    }

    public final class c implements gd0 {

        /* renamed from: a, reason: collision with root package name */
        private final h7 f27837a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ gn f27838b;

        public c(gn gnVar, h7 adRequestData) {
            kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
            this.f27838b = gnVar;
            this.f27837a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.gd0
        public final void onAdShown() {
            this.f27838b.b(this.f27837a);
        }
    }

    public gn(Context context, rm2 sdkEnvironmentModule, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor, yr1 adItemLoadControllerFactory, ls1 preloadingCache, qk1 preloadingAvailabilityValidator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        kotlin.jvm.internal.l.f(adItemLoadControllerFactory, "adItemLoadControllerFactory");
        kotlin.jvm.internal.l.f(preloadingCache, "preloadingCache");
        kotlin.jvm.internal.l.f(preloadingAvailabilityValidator, "preloadingAvailabilityValidator");
        this.f27826a = context;
        this.f27827b = mainThreadUsageValidator;
        this.f27828c = mainThreadExecutor;
        this.f27829d = adItemLoadControllerFactory;
        this.f27830e = preloadingCache;
        this.f27831f = preloadingAvailabilityValidator;
        this.f27832g = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(gn this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        this$0.f27831f.getClass();
        if (qk1.a(adRequestData) && this$0.f27830e.c()) {
            this$0.a(adRequestData, new a(this$0, adRequestData), "render");
        }
    }

    public final class b implements bu {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.bu
        public final void a(C4128i3 error) {
            kotlin.jvm.internal.l.f(error, "error");
            bu buVar = gn.this.f27833h;
            if (buVar != null) {
                buVar.a(error);
            }
        }

        @Override // com.yandex.mobile.ads.impl.bu
        public final void a(zt rewardedAd) {
            kotlin.jvm.internal.l.f(rewardedAd, "rewardedAd");
            bu buVar = gn.this.f27833h;
            if (buVar != null) {
                buVar.a(rewardedAd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(gn this$0, h7 adRequestData) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(adRequestData, "$adRequestData");
        this$0.f27831f.getClass();
        if (!qk1.a(adRequestData)) {
            this$0.a(adRequestData, this$0.new b(), "default");
            return;
        }
        zt ztVarA = this$0.f27830e.a(adRequestData);
        if (ztVarA == null) {
            this$0.a(adRequestData, this$0.new b(), "default");
            return;
        }
        bu buVar = this$0.f27833h;
        if (buVar != null) {
            buVar.a(ztVarA);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zr1
    public final void a() {
        this.f27827b.a();
        this.f27828c.a();
        Iterator<xr1> it = this.f27832g.iterator();
        while (it.hasNext()) {
            xr1 next = it.next();
            next.a((bu) null);
            next.e();
        }
        this.f27832g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(h7 h7Var) {
        this.f27828c.a(new L4(6, this, h7Var));
    }

    @Override // com.yandex.mobile.ads.impl.zr1
    public final void a(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        this.f27827b.a();
        if (this.f27833h == null) {
            uo0.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f27828c.a(new L(4, this, adRequestData));
    }

    private final void a(h7 h7Var, bu buVar, String str) {
        h7 h7VarA = h7.a(h7Var, null, str, 2047);
        xr1 xr1VarA = this.f27829d.a(this.f27826a, this, h7VarA, new c(this, h7VarA));
        this.f27832g.add(xr1VarA);
        xr1VarA.a(h7VarA.a());
        xr1VarA.a(buVar);
        xr1VarA.b(h7VarA);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4164n4
    public final void a(dd0 dd0Var) {
        xr1 loadController = (xr1) dd0Var;
        kotlin.jvm.internal.l.f(loadController, "loadController");
        if (this.f27833h == null) {
            uo0.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((bu) null);
        this.f27832g.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.zr1
    public final void a(qm2 qm2Var) {
        this.f27827b.a();
        this.f27833h = qm2Var;
    }
}
