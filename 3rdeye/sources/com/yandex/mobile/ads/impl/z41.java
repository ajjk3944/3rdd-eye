package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.k91;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class z41 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f36182a;

    /* renamed from: b, reason: collision with root package name */
    private final C4198s4 f36183b;

    /* renamed from: c, reason: collision with root package name */
    private final A9.E f36184c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f36185d;

    /* renamed from: e, reason: collision with root package name */
    private final b51 f36186e;

    /* renamed from: f, reason: collision with root package name */
    private final k91 f36187f;

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final a8<?> f36188b;

        /* renamed from: c, reason: collision with root package name */
        private final p61 f36189c;

        /* renamed from: d, reason: collision with root package name */
        private final j51 f36190d;

        /* renamed from: e, reason: collision with root package name */
        private final x41 f36191e;

        /* renamed from: f, reason: collision with root package name */
        private final zv f36192f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z41 f36193g;

        /* renamed from: com.yandex.mobile.ads.impl.z41$a$a, reason: collision with other inner class name */
        public final class C0427a implements k91.a {

            /* renamed from: a, reason: collision with root package name */
            private final x41 f36194a;

            /* renamed from: b, reason: collision with root package name */
            private final C4198s4 f36195b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f36196c;

            public C0427a(a aVar, x41 nativeAdCreationListener, C4198s4 adLoadingPhasesManager) {
                kotlin.jvm.internal.l.f(nativeAdCreationListener, "nativeAdCreationListener");
                kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
                this.f36196c = aVar;
                this.f36194a = nativeAdCreationListener;
                this.f36195b = adLoadingPhasesManager;
            }

            @Override // com.yandex.mobile.ads.impl.k91.a
            public final void a(sk1 imageProvider, j41 nativeAdBlock) {
                kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
                kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
                this.f36195b.a(EnumC4191r4.f32465o);
                A9.E e4 = this.f36196c.f36193g.f36184c;
                a aVar = this.f36196c;
                C0575f.e(e4, null, null, new y41(aVar.f36193g, nativeAdBlock, imageProvider, aVar, this, null), 3);
            }
        }

        public a(z41 z41Var, a8<?> adResponse, p61 p61Var, j51 nativeAdFactoriesProvider, x41 nativeAdCreationListener) {
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
            kotlin.jvm.internal.l.f(nativeAdCreationListener, "nativeAdCreationListener");
            this.f36193g = z41Var;
            this.f36188b = adResponse;
            this.f36189c = p61Var;
            this.f36190d = nativeAdFactoriesProvider;
            this.f36191e = nativeAdCreationListener;
            this.f36192f = new aw(z41Var.f36185d, z41Var.f36182a, new yq1().b(adResponse, z41Var.f36182a)).a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                p61 p61Var = this.f36189c;
                if (p61Var == null) {
                    this.f36191e.a(i7.k());
                    return;
                }
                if (p61Var.e().isEmpty()) {
                    this.f36191e.a(i7.q());
                    return;
                }
                j41 j41Var = new j41(this.f36188b, this.f36193g.f36182a, this.f36189c);
                C0427a c0427a = new C0427a(this, this.f36191e, this.f36193g.f36183b);
                C4198s4 c4198s4 = this.f36193g.f36183b;
                EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32465o;
                c4198s4.getClass();
                kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
                c4198s4.a(adLoadingPhaseType, null);
                this.f36193g.f36187f.a(this.f36193g.f36185d, this.f36193g.f36182a, j41Var, c0427a, this.f36192f, this.f36191e);
            } catch (Exception unused) {
                fp0.c(new Object[0]);
                this.f36191e.a(i7.k());
            }
        }
    }

    @h9.e(c = "com.monetization.ads.nativeads.creator.NativeAdCreationManager$createNativeAd$1", f = "NativeAdCreationManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a8<?> f36198c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p61 f36199d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j51 f36200e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x41 f36201f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a8<?> a8Var, p61 p61Var, j51 j51Var, x41 x41Var, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f36198c = a8Var;
            this.f36199d = p61Var;
            this.f36200e = j51Var;
            this.f36201f = x41Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return z41.this.new b(this.f36198c, this.f36199d, this.f36200e, this.f36201f, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            new a(z41.this, this.f36198c, this.f36199d, this.f36200e, this.f36201f).run();
            return C1992A.f18074a;
        }
    }

    public /* synthetic */ z41(Context context, vu1 vu1Var, C4072a3 c4072a3, C4198s4 c4198s4, A9.E e4) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        ua1 ua1Var = new ua1(c4072a3, context, c4198s4);
        v41 v41Var = new v41(ua1Var);
        this(context, vu1Var, c4072a3, c4198s4, e4, applicationContext, ua1Var, v41Var, new b51(c4072a3, vu1Var, v41Var), new k91(context, vu1Var, c4198s4, v41Var, e4));
    }

    public final void a(a8<?> adResponse, p61 p61Var, j51 nativeAdFactoriesProvider, x41 nativeAdCreationListener) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(nativeAdCreationListener, "nativeAdCreationListener");
        C0575f.e(this.f36184c, null, null, new b(adResponse, p61Var, nativeAdFactoriesProvider, nativeAdCreationListener, null), 3);
    }

    public final void a() {
        this.f36187f.a();
    }

    public z41(Context context, vu1 sdkEnvironmentModule, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, A9.E coroutineScope, Context appContext, ua1 nativeVideoLoadController, v41 nativeAdControllers, b51 nativeAdCreator, k91 nativeResourcesLoader) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(nativeVideoLoadController, "nativeVideoLoadController");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(nativeAdCreator, "nativeAdCreator");
        kotlin.jvm.internal.l.f(nativeResourcesLoader, "nativeResourcesLoader");
        this.f36182a = adConfiguration;
        this.f36183b = adLoadingPhasesManager;
        this.f36184c = coroutineScope;
        this.f36185d = appContext;
        this.f36186e = nativeAdCreator;
        this.f36187f = nativeResourcesLoader;
    }
}
