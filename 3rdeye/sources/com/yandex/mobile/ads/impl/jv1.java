package com.yandex.mobile.ads.impl;

import A9.InterfaceC0594o0;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.k50;
import f9.InterfaceC4347e;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class jv1 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f29323a;

    /* renamed from: b, reason: collision with root package name */
    private final A9.E f29324b;

    /* renamed from: c, reason: collision with root package name */
    private final C4198s4 f29325c;

    /* renamed from: d, reason: collision with root package name */
    private final k50 f29326d;

    /* renamed from: e, reason: collision with root package name */
    private final cc f29327e;

    /* renamed from: f, reason: collision with root package name */
    private final ew1 f29328f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f29329g;

    /* renamed from: h, reason: collision with root package name */
    private final ki0 f29330h;
    private final ic i;

    /* renamed from: j, reason: collision with root package name */
    private final iu1 f29331j;

    /* renamed from: k, reason: collision with root package name */
    private final uf f29332k;

    /* renamed from: l, reason: collision with root package name */
    private final C4100e3 f29333l;

    /* renamed from: m, reason: collision with root package name */
    private final nw1 f29334m;

    /* renamed from: n, reason: collision with root package name */
    private final lv1 f29335n;

    /* renamed from: o, reason: collision with root package name */
    private final nd f29336o;

    /* renamed from: p, reason: collision with root package name */
    private final m30 f29337p;

    /* renamed from: q, reason: collision with root package name */
    private final zc f29338q;

    /* renamed from: r, reason: collision with root package name */
    private final ji0 f29339r;

    @h9.e(c = "com.monetization.ads.core.initializer.SdkInitializer", f = "SdkInitializer.kt", l = {90, 92, 93}, m = "initialize")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        jv1 f29340b;

        /* renamed from: c, reason: collision with root package name */
        tk0 f29341c;

        /* renamed from: d, reason: collision with root package name */
        C4198s4 f29342d;

        /* renamed from: e, reason: collision with root package name */
        EnumC4191r4 f29343e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC0594o0 f29344f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f29345g;
        int i;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f29345g = obj;
            this.i |= RecyclerView.UNDEFINED_DURATION;
            return jv1.this.a((tk0) null, this);
        }
    }

    @h9.e(c = "com.monetization.ads.core.initializer.SdkInitializer$initialize$sdkConfigurationResult$1$prefetchDnsJob$1", f = "SdkInitializer.kt", l = {85}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f29347b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29348c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ jv1 f29349d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, jv1 jv1Var, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f29348c = z10;
            this.f29349d = jv1Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f29348c, this.f29349d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return new b(this.f29348c, this.f29349d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f29347b;
            if (i == 0) {
                b9.n.b(obj);
                if (this.f29348c) {
                    m30 m30Var = this.f29349d.f29337p;
                    this.f29347b = 1;
                    if (m30Var.a(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    @h9.e(c = "com.monetization.ads.core.initializer.SdkInitializer", f = "SdkInitializer.kt", l = {169}, m = "loadSdkConfiguration")
    public static final class c extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        C4198s4 f29350b;

        /* renamed from: c, reason: collision with root package name */
        EnumC4191r4 f29351c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f29352d;

        /* renamed from: f, reason: collision with root package name */
        int f29354f;

        public c(InterfaceC4347e<? super c> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f29352d = obj;
            this.f29354f |= RecyclerView.UNDEFINED_DURATION;
            return jv1.a(jv1.this, this);
        }
    }

    @h9.e(c = "com.monetization.ads.core.initializer.SdkInitializer", f = "SdkInitializer.kt", l = {152}, m = "requestAdvertisingInfo")
    public static final class d extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        jv1 f29355b;

        /* renamed from: c, reason: collision with root package name */
        C4198s4 f29356c;

        /* renamed from: d, reason: collision with root package name */
        EnumC4191r4 f29357d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f29358e;

        /* renamed from: g, reason: collision with root package name */
        int f29360g;

        public d(InterfaceC4347e<? super d> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f29358e = obj;
            this.f29360g |= RecyclerView.UNDEFINED_DURATION;
            return jv1.this.a(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ jv1(Context context, vu1 vu1Var, A9.E e4, C4198s4 c4198s4, k50 k50Var, cc ccVar, int i) {
        k50 k50VarA = (i & 16) != 0 ? k50.a.a(context) : k50Var;
        cc ccVar2 = (i & 32) != 0 ? new cc() : ccVar;
        ew1 ew1VarA = ew1.a.a();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, vu1Var, e4, c4198s4, k50VarA, ccVar2, ew1VarA, applicationContext, new ki0(k50VarA), new ic(), new iu1(applicationContext, vu1Var, k50VarA, ccVar2, c4198s4), new uf(applicationContext, vu1Var), new C4100e3(), new nw1(applicationContext), new at0(), new lv1(vu1Var.c(), at0.g(context), c4198s4), new nd(), new m30(context, c4198s4), new zc());
    }

    public static final /* synthetic */ Object a(jv1 jv1Var, InterfaceC4347e interfaceC4347e) {
        return jv1Var.b((tk0) null, (InterfaceC4347e<? super su1>) interfaceC4347e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b(com.yandex.mobile.ads.impl.tk0 r7, f9.InterfaceC4347e<? super com.yandex.mobile.ads.impl.su1> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.yandex.mobile.ads.impl.jv1.c
            if (r0 == 0) goto L13
            r0 = r8
            com.yandex.mobile.ads.impl.jv1$c r0 = (com.yandex.mobile.ads.impl.jv1.c) r0
            int r1 = r0.f29354f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29354f = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.jv1$c r0 = new com.yandex.mobile.ads.impl.jv1$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29352d
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f29354f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.yandex.mobile.ads.impl.r4 r7 = r0.f29351c
            com.yandex.mobile.ads.impl.s4 r0 = r0.f29350b
            b9.n.b(r8)
            goto L52
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            b9.n.b(r8)
            com.yandex.mobile.ads.impl.s4 r8 = r6.f29325c
            com.yandex.mobile.ads.impl.r4 r2 = com.yandex.mobile.ads.impl.EnumC4191r4.f32462l
            java.lang.String r4 = "adLoadingPhaseType"
            r5 = 0
            com.yandex.mobile.ads.impl.uj.a(r8, r2, r4, r2, r5)
            com.yandex.mobile.ads.impl.iu1 r4 = r6.f29331j
            r0.f29350b = r8
            r0.f29351c = r2
            r0.f29354f = r3
            java.lang.Object r7 = r4.a(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r0 = r8
            r8 = r7
            r7 = r2
        L52:
            com.yandex.mobile.ads.impl.su1 r8 = (com.yandex.mobile.ads.impl.su1) r8
            r0.a(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jv1.b(com.yandex.mobile.ads.impl.tk0, f9.e):java.lang.Object");
    }

    public final void a() {
        InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) this.f29324b.k0().get(InterfaceC0594o0.a.f263b);
        if (interfaceC0594o0 == null) {
            return;
        }
        Iterator it = interfaceC0594o0.a().iterator();
        while (true) {
            x9.h hVar = (x9.h) it;
            if (!hVar.hasNext()) {
                return;
            } else {
                ((InterfaceC0594o0) hVar.next()).c(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.yandex.mobile.ads.impl.tk0 r14, f9.InterfaceC4347e<? super com.yandex.mobile.ads.impl.gv1> r15) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jv1.a(com.yandex.mobile.ads.impl.tk0, f9.e):java.lang.Object");
    }

    public jv1(Context context, vu1 sdkEnvironmentModule, A9.E coroutineScope, C4198s4 adLoadingPhasesManager, k50 environmentController, cc advertisingConfiguration, ew1 sdkSettings, Context applicationContext, ki0 identifiersLoader, ic advertisingInfoLoader, iu1 sdkConfigurationLoaderHolder, uf appStartFalseClickTracker, C4100e3 adFetchErrorProvider, nw1 sdkVersionValidator, at0 manifestAnalyzer, lv1 sdkInitializerReporter, nd androidSdkApiChecker, m30 dnsPrefetcher, zc analyticsEasyIntegrationInitializer) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(environmentController, "environmentController");
        kotlin.jvm.internal.l.f(advertisingConfiguration, "advertisingConfiguration");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.l.f(identifiersLoader, "identifiersLoader");
        kotlin.jvm.internal.l.f(advertisingInfoLoader, "advertisingInfoLoader");
        kotlin.jvm.internal.l.f(sdkConfigurationLoaderHolder, "sdkConfigurationLoaderHolder");
        kotlin.jvm.internal.l.f(appStartFalseClickTracker, "appStartFalseClickTracker");
        kotlin.jvm.internal.l.f(adFetchErrorProvider, "adFetchErrorProvider");
        kotlin.jvm.internal.l.f(sdkVersionValidator, "sdkVersionValidator");
        kotlin.jvm.internal.l.f(manifestAnalyzer, "manifestAnalyzer");
        kotlin.jvm.internal.l.f(sdkInitializerReporter, "sdkInitializerReporter");
        kotlin.jvm.internal.l.f(androidSdkApiChecker, "androidSdkApiChecker");
        kotlin.jvm.internal.l.f(dnsPrefetcher, "dnsPrefetcher");
        kotlin.jvm.internal.l.f(analyticsEasyIntegrationInitializer, "analyticsEasyIntegrationInitializer");
        this.f29323a = sdkEnvironmentModule;
        this.f29324b = coroutineScope;
        this.f29325c = adLoadingPhasesManager;
        this.f29326d = environmentController;
        this.f29327e = advertisingConfiguration;
        this.f29328f = sdkSettings;
        this.f29329g = applicationContext;
        this.f29330h = identifiersLoader;
        this.i = advertisingInfoLoader;
        this.f29331j = sdkConfigurationLoaderHolder;
        this.f29332k = appStartFalseClickTracker;
        this.f29333l = adFetchErrorProvider;
        this.f29334m = sdkVersionValidator;
        this.f29335n = sdkInitializerReporter;
        this.f29336o = androidSdkApiChecker;
        this.f29337p = dnsPrefetcher;
        this.f29338q = analyticsEasyIntegrationInitializer;
        this.f29339r = new ji0(environmentController.c(), new C4245z3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(f9.InterfaceC4347e<? super b9.C1992A> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.yandex.mobile.ads.impl.jv1.d
            if (r0 == 0) goto L13
            r0 = r7
            com.yandex.mobile.ads.impl.jv1$d r0 = (com.yandex.mobile.ads.impl.jv1.d) r0
            int r1 = r0.f29360g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29360g = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.jv1$d r0 = new com.yandex.mobile.ads.impl.jv1$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29358e
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f29360g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.yandex.mobile.ads.impl.r4 r1 = r0.f29357d
            com.yandex.mobile.ads.impl.s4 r2 = r0.f29356c
            com.yandex.mobile.ads.impl.jv1 r0 = r0.f29355b
            b9.n.b(r7)
            goto L58
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            b9.n.b(r7)
            com.yandex.mobile.ads.impl.s4 r2 = r6.f29325c
            com.yandex.mobile.ads.impl.r4 r7 = com.yandex.mobile.ads.impl.EnumC4191r4.f32455d
            java.lang.String r4 = "adLoadingPhaseType"
            r5 = 0
            com.yandex.mobile.ads.impl.uj.a(r2, r7, r4, r7, r5)
            com.yandex.mobile.ads.impl.ic r4 = r6.i
            android.content.Context r5 = r6.f29329g
            r0.f29355b = r6
            r0.f29356c = r2
            r0.f29357d = r7
            r0.f29360g = r3
            java.lang.Object r0 = r4.a(r5, r0)
            if (r0 != r1) goto L55
            return r1
        L55:
            r1 = r7
            r7 = r0
            r0 = r6
        L58:
            com.yandex.mobile.ads.impl.gc r7 = (com.yandex.mobile.ads.impl.gc) r7
            if (r7 == 0) goto L86
            com.yandex.mobile.ads.impl.cc r3 = r0.f29327e
            com.yandex.mobile.ads.impl.ec r4 = r7.a()
            r3.a(r4)
            com.yandex.mobile.ads.impl.cc r3 = r0.f29327e
            com.yandex.mobile.ads.impl.ec r4 = r7.c()
            r3.b(r4)
            com.yandex.mobile.ads.impl.cc r3 = r0.f29327e
            boolean r4 = r7.b()
            r3.a(r4)
            com.yandex.mobile.ads.impl.ec r7 = r7.a()
            if (r7 == 0) goto L86
            com.yandex.mobile.ads.impl.k50 r7 = r0.f29326d
            com.yandex.mobile.ads.impl.j50 r7 = r7.c()
            r7.h()
        L86:
            b9.A r7 = b9.C1992A.f18074a
            r2.a(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jv1.a(f9.e):java.lang.Object");
    }
}
