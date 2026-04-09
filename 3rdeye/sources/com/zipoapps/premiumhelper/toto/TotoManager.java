package com.zipoapps.premiumhelper.toto;

import A9.C0575f;
import A9.E;
import A9.U;
import B4.g;
import F9.q;
import G0.d;
import J8.E;
import J8.T;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.lifecycle.C1791y;
import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import b9.n;
import c9.C2089j;
import c9.C2099t;
import com.zipoapps.premiumhelper.c;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import com.zipoapps.premiumhelper.toto.TotoRegisterWorker;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import i8.C4461a;
import j8.InterfaceC5199a;
import java.util.List;
import java.util.Map;
import k8.t;
import kotlin.jvm.internal.l;
import l8.a;
import l8.b;
import p9.p;
import va.a;

/* compiled from: TotoManager.kt */
/* loaded from: classes3.dex */
public final class TotoManager {
    private final C4461a analytics;
    private final t billing;
    private final b configuration;
    private final Context context;
    private TotoApiResponse<Map<String, Map<String, Integer>>> lastGetConfigResponse;
    private final E phScope;
    private final c preferences;
    private final T totoConfigCapping;
    private final InterfaceC2000g totoServiceRepository$delegate;
    private final InterfaceC2000g userAgent$delegate;
    private final InterfaceC5199a utils;

    /* compiled from: TotoManager.kt */
    @e(c = "com.zipoapps.premiumhelper.toto.TotoManager$getConfig$2", f = "TotoManager.kt", l = {137}, m = "invokeSuspend")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoManager$getConfig$2, reason: invalid class name */
    public static final class AnonymousClass2 extends i implements p<E, InterfaceC4347e<? super TotoConfig>, Object> {
        int label;

        public AnonymousClass2(InterfaceC4347e<? super AnonymousClass2> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return TotoManager.this.new AnonymousClass2(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super TotoConfig> interfaceC4347e) {
            return ((AnonymousClass2) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Exception {
            List listAsWeightedParamsList;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    n.b(obj);
                    va.a.f47104a.a("[TotoManager] getConfig()", new Object[0]);
                    TotoServiceRepository totoServiceRepository = TotoManager.this.getTotoServiceRepository();
                    String packageName = TotoManager.this.context.getPackageName();
                    l.e(packageName, "getPackageName(...)");
                    String userAgent = TotoManager.this.getUserAgent();
                    this.label = 1;
                    obj = totoServiceRepository.getConfig(packageName, userAgent, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                TotoApiResponse totoApiResponse = (TotoApiResponse) obj;
                TotoManager.this.lastGetConfigResponse = totoApiResponse;
                a.b bVar = va.a.f47104a;
                bVar.a("[TotoManager] GET CONFIG API CALL PASSED", new Object[0]);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                C4461a c4461a = e.a.a().f37021k;
                l.f(c4461a, "<this>");
                c4461a.u("First_toto_response", new Bundle[0]);
                StartupPerformanceTracker.f37057b.getClass();
                StartupPerformanceTracker.a.a().b(String.valueOf(totoApiResponse.getData().f46333a.f12565e));
                String strC = totoApiResponse.getData().f46333a.f12567g.c("x-country");
                if (strC == null) {
                    strC = "";
                }
                bVar.a("[TotoManager] xCountry = ".concat(strC), new Object[0]);
                Map map = (Map) totoApiResponse.getData().f46334b;
                if (map == null || (listAsWeightedParamsList = WeightedValueParameterKt.asWeightedParamsList(map)) == null) {
                    listAsWeightedParamsList = C2099t.f18581b;
                }
                if (TotoManager.this.configuration.m(strC, listAsWeightedParamsList)) {
                    bVar.a("[TotoManager] CONFIG was updated. Schedule POST config", new Object[0]);
                    PostConfigWorker.Companion.scheduleNow(TotoManager.this.context);
                } else {
                    c cVar = TotoManager.this.preferences;
                    cVar.getClass();
                    if (!a.C0491a.a(cVar, "post_config_sent", false)) {
                        bVar.a("[TotoManager] CONFIG wasn't sent before. Schedule POST config", new Object[0]);
                        PostConfigWorker.Companion.scheduleNow(TotoManager.this.context);
                    }
                }
                T t10 = TotoManager.this.totoConfigCapping;
                t10.getClass();
                t10.f2847b = System.currentTimeMillis();
                TotoManager.this.preferences.n(new Long(System.currentTimeMillis()), "toto_get_config_timestamp");
                C4461a c4461a2 = TotoManager.this.analytics;
                TotoApiResponseInfo info = totoApiResponse.getInfo();
                String strC2 = totoApiResponse.getData().f46333a.f12567g.c("x-cache");
                if (strC2 == null) {
                    strC2 = "";
                }
                c4461a2.j(info, strC2);
                return new TotoConfig(listAsWeightedParamsList, totoApiResponse.getInfo());
            } catch (Exception e4) {
                va.a.f47104a.e(e4, "[TotoManager] Error on GET TOTO CONFIG", new Object[0]);
                c cVar2 = TotoManager.this.preferences;
                cVar2.getClass();
                if (!a.C0491a.a(cVar2, "post_config_sent", false)) {
                    PostConfigWorker.Companion.scheduleNow(TotoManager.this.context);
                }
                C4461a c4461a3 = TotoManager.this.analytics;
                c4461a3.getClass();
                c4461a3.s("TotoGetConfig", d.a(new b9.l("splash_timeout", String.valueOf(c4461a3.f38489g)), new b9.l("toto_response_code", e4.getMessage()), new b9.l("x_cache", "")));
                throw e4;
            }
        }
    }

    /* compiled from: TotoManager.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.toto.TotoManager", f = "TotoManager.kt", l = {91, 98, 105, 105, 105}, m = "initToto")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoManager$initToto$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h9.c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC4347e<? super AnonymousClass1> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RecyclerView.UNDEFINED_DURATION;
            return TotoManager.this.initToto(this);
        }
    }

    /* compiled from: TotoManager.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.toto.TotoManager$listenForAppStart$2", f = "TotoManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoManager$listenForAppStart$2, reason: invalid class name and case insensitive filesystem */
    public static final class C42472 extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {
        int label;

        public C42472(InterfaceC4347e<? super C42472> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return TotoManager.this.new C42472(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((C42472) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            final kotlin.jvm.internal.t tVar = new kotlin.jvm.internal.t();
            tVar.f43657b = true;
            J j4 = J.f16049j;
            C1791y c1791y = J.f16049j.f16055g;
            final TotoManager totoManager = TotoManager.this;
            c1791y.addObserver(new InterfaceC1771d() { // from class: com.zipoapps.premiumhelper.toto.TotoManager.listenForAppStart.2.1
                @Override // androidx.lifecycle.InterfaceC1771d
                public void onCreate(InterfaceC1790x owner) {
                    l.f(owner, "owner");
                }

                @Override // androidx.lifecycle.InterfaceC1771d
                public void onDestroy(InterfaceC1790x owner) {
                    l.f(owner, "owner");
                }

                @Override // androidx.lifecycle.InterfaceC1771d
                public void onPause(InterfaceC1790x owner) {
                    l.f(owner, "owner");
                }

                @Override // androidx.lifecycle.InterfaceC1771d
                public void onResume(InterfaceC1790x owner) {
                    l.f(owner, "owner");
                }

                @Override // androidx.lifecycle.InterfaceC1771d
                public void onStart(InterfaceC1790x owner) {
                    l.f(owner, "owner");
                    kotlin.jvm.internal.t tVar2 = tVar;
                    if (tVar2.f43657b) {
                        tVar2.f43657b = false;
                        return;
                    }
                    va.a.f47104a.a("[TotoManager] onAppOpened", new Object[0]);
                    if (TotoManager.isConfigUpdateAllowed$default(totoManager, false, 1, null)) {
                        C0575f.e(totoManager.phScope, null, null, new TotoManager$listenForAppStart$2$1$onStart$1(totoManager, null), 3);
                    }
                }

                @Override // androidx.lifecycle.InterfaceC1771d
                public void onStop(InterfaceC1790x owner) {
                    l.f(owner, "owner");
                }
            });
            return C1992A.f18074a;
        }
    }

    /* compiled from: TotoManager.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.toto.TotoManager", f = "TotoManager.kt", l = {178, 188}, m = "postConfig")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoManager$postConfig$1, reason: invalid class name and case insensitive filesystem */
    public static final class C42481 extends h9.c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C42481(InterfaceC4347e<? super C42481> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RecyclerView.UNDEFINED_DURATION;
            return TotoManager.this.postConfig(this);
        }
    }

    /* compiled from: TotoManager.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.toto.TotoManager", f = "TotoManager.kt", l = {216, 222}, m = "registerFcmToken")
    /* renamed from: com.zipoapps.premiumhelper.toto.TotoManager$registerFcmToken$1, reason: invalid class name and case insensitive filesystem */
    public static final class C42491 extends h9.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C42491(InterfaceC4347e<? super C42491> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= RecyclerView.UNDEFINED_DURATION;
            return TotoManager.this.registerFcmToken(null, this);
        }
    }

    public TotoManager(Context context, E phScope, b configuration, c preferences, t billing, C4461a analytics, InterfaceC5199a utils) {
        l.f(context, "context");
        l.f(phScope, "phScope");
        l.f(configuration, "configuration");
        l.f(preferences, "preferences");
        l.f(billing, "billing");
        l.f(analytics, "analytics");
        l.f(utils, "utils");
        this.context = context;
        this.phScope = phScope;
        this.configuration = configuration;
        this.preferences = preferences;
        this.billing = billing;
        this.analytics = analytics;
        this.utils = utils;
        l8.d<Integer> PH_TOTO_CAPPING_HOURS = i8.d.f38565j0;
        l.e(PH_TOTO_CAPPING_HOURS, "PH_TOTO_CAPPING_HOURS");
        this.totoConfigCapping = new T(((Number) configuration.h(PH_TOTO_CAPPING_HOURS)).intValue() * 3600000, preferences.g("toto_get_config_timestamp"));
        this.userAgent$delegate = C2001h.b(new H8.e(this, 2));
        this.totoServiceRepository$delegate = C2001h.b(new C2089j(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TotoServiceRepository getTotoServiceRepository() {
        return (TotoServiceRepository) this.totoServiceRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserAgent() {
        return (String) this.userAgent$delegate.getValue();
    }

    private final boolean isConfigUpdateAllowed(boolean z10) throws NumberFormatException {
        a.b bVar = va.a.f47104a;
        bVar.a("[TotoManager] isConfigUpdateAllowed()", new Object[0]);
        if (this.configuration.l()) {
            T t10 = this.totoConfigCapping;
            t10.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j4 = t10.f2846a;
            if (j4 == 0 || jCurrentTimeMillis - t10.f2847b > j4) {
                return true;
            }
            bVar.a("[TotoManager] toto capping time not passed", new Object[0]);
            if (z10) {
                StartupPerformanceTracker.f37057b.getClass();
                StartupPerformanceTracker startupPerformanceTrackerA = StartupPerformanceTracker.a.a();
                StartupPerformanceTracker.StartupData startupData = startupPerformanceTrackerA.f37059a;
                if (startupData != null) {
                    startupData.setTotoConfigCapped(true);
                }
                startupPerformanceTrackerA.b("success");
            }
        } else {
            bVar.a("[TotoManager] toto disabled", new Object[0]);
            if (z10) {
                StartupPerformanceTracker.f37057b.getClass();
                StartupPerformanceTracker.a.a().b("disabled");
                return false;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean isConfigUpdateAllowed$default(TotoManager totoManager, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = false;
        }
        return totoManager.isConfigUpdateAllowed(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenForAppStart(InterfaceC4347e<? super C1992A> interfaceC4347e) throws Throwable {
        I9.c cVar = U.f211a;
        Object objH = C0575f.h(q.f1782a, new C42472(null), interfaceC4347e);
        return objH == g9.a.COROUTINE_SUSPENDED ? objH : C1992A.f18074a;
    }

    private static final C1992A postConfig$lambda$2(TotoManager totoManager, TotoApiResponse it) {
        l.f(it, "it");
        SharedPreferences.Editor editorEdit = totoManager.preferences.f37004a.edit();
        editorEdit.putBoolean("post_config_sent", true);
        editorEdit.apply();
        C4461a c4461a = totoManager.analytics;
        TotoApiResponseInfo responseInfo = it.getInfo();
        c4461a.getClass();
        l.f(responseInfo, "responseInfo");
        c4461a.s("TotoPostConfig", d.a(new b9.l("toto_response_code", String.valueOf(responseInfo.getResponseCode())), new b9.l("toto_latency", Long.valueOf(responseInfo.getResponseTime()))));
        return C1992A.f18074a;
    }

    private static final C1992A postConfig$lambda$4(TotoManager totoManager, E.b it) {
        l.f(it, "it");
        Exception exc = it.f2814b;
        if (exc != null) {
            C4461a c4461a = totoManager.analytics;
            c4461a.getClass();
            c4461a.s("TotoPostConfig", d.a(new b9.l("toto_response_code", exc.getMessage())));
        }
        return C1992A.f18074a;
    }

    public static /* synthetic */ void scheduleRegister$default(TotoManager totoManager, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = false;
        }
        totoManager.scheduleRegister(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.zipoapps.premiumhelper.toto.TotoServiceRepository totoServiceRepository_delegate$lambda$1(com.zipoapps.premiumhelper.toto.TotoManager r3) {
        /*
            l8.b r0 = r3.configuration
            com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r0 = r0.f43910b
            boolean r0 = r0.isDebugMode()
            if (r0 == 0) goto L22
            l8.b r0 = r3.configuration
            l8.d<java.lang.Boolean> r1 = i8.d.f38556e0
            java.lang.String r2 = "PH_STAGING_TOTO_ENABLED"
            kotlin.jvm.internal.l.e(r1, r2)
            java.lang.Object r0 = r0.h(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            com.zipoapps.premiumhelper.toto.TotoServiceConfig r0 = com.zipoapps.premiumhelper.toto.TotoServiceConfig.STAGING
            goto L24
        L22:
            com.zipoapps.premiumhelper.toto.TotoServiceConfig r0 = com.zipoapps.premiumhelper.toto.TotoServiceConfig.PRODUCTION
        L24:
            com.zipoapps.premiumhelper.toto.TotoServiceRepository r1 = new com.zipoapps.premiumhelper.toto.TotoServiceRepository
            l8.b r3 = r3.configuration
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoManager.totoServiceRepository_delegate$lambda$1(com.zipoapps.premiumhelper.toto.TotoManager):com.zipoapps.premiumhelper.toto.TotoServiceRepository");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userAgent_delegate$lambda$0(TotoManager totoManager) {
        return g.o(totoManager.context.getPackageName(), "_", totoManager.utils.b(totoManager.context));
    }

    public final Object getConfig(InterfaceC4347e<? super TotoConfig> interfaceC4347e) {
        return C0575f.h(U.f212b, new AnonymousClass2(null), interfaceC4347e);
    }

    public final TotoApiResponse<Map<String, Map<String, Integer>>> getLastGetConfigResponse() {
        return this.lastGetConfigResponse;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (listenForAppStart(r0) == r1) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initToto(f9.InterfaceC4347e<? super java.lang.Boolean> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoManager.initToto(f9.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object postConfig(f9.InterfaceC4347e<? super J8.E<com.zipoapps.premiumhelper.toto.TotoApiResponse<b9.C1992A>>> r22) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoManager.postConfig(f9.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object registerFcmToken(java.lang.String r27, f9.InterfaceC4347e<? super b9.C1992A> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoManager.registerFcmToken(java.lang.String, f9.e):java.lang.Object");
    }

    public final void scheduleRegister(boolean z10) {
        if (z10 || !this.preferences.f37004a.getBoolean("is_fcm_registered", false)) {
            TotoRegisterWorker.Companion.schedule$default(TotoRegisterWorker.Companion, this.context, null, 2, null);
        }
    }
}
