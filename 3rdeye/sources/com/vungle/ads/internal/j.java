package com.vungle.ads.internal;

import C.T;
import E.u;
import T1.E;
import a6.C1658g;
import android.content.Context;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.vungle.ads.B;
import com.vungle.ads.C4055m;
import com.vungle.ads.H;
import com.vungle.ads.Q;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.V;
import com.vungle.ads.d0;
import com.vungle.ads.internal.task.a;
import com.vungle.ads.k0;
import d6.C4277a;
import e6.C4321c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import y9.q;

/* compiled from: VungleInitializer.kt */
/* loaded from: classes2.dex */
public final class j {
    public static final a Companion = new a(null);
    private static final String TAG = "VungleInitializer";
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final CopyOnWriteArrayList<B> initializationCallbackArray = new CopyOnWriteArrayList<>();

    /* compiled from: VungleInitializer.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class b extends m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.network.g invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.g.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class c extends m implements InterfaceC5480a<C4277a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [d6.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final C4277a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(C4277a.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class d extends m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class e extends m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class f extends m implements InterfaceC5480a<com.vungle.ads.internal.task.f> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.f, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.task.f invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.task.f.class);
        }
    }

    /* compiled from: VungleInitializer.kt */
    public static final class g extends m implements p9.l<Boolean, C1992A> {
        final /* synthetic */ Context $context;
        final /* synthetic */ InterfaceC2000g<com.vungle.ads.internal.executor.a> $sdkExecutors$delegate;

        /* compiled from: ServiceLocator.kt */
        public static final class a extends m implements InterfaceC5480a<com.vungle.ads.internal.util.l> {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.$context = context;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.l, java.lang.Object] */
            @Override // p9.InterfaceC5480a
            public final com.vungle.ads.internal.util.l invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.l.class);
            }
        }

        /* compiled from: ServiceLocator.kt */
        public static final class b extends m implements InterfaceC5480a<com.vungle.ads.internal.downloader.d> {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context) {
                super(0);
                this.$context = context;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.downloader.d, java.lang.Object] */
            @Override // p9.InterfaceC5480a
            public final com.vungle.ads.internal.downloader.d invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.downloader.d.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Context context, InterfaceC2000g<? extends com.vungle.ads.internal.executor.a> interfaceC2000g) {
            super(1);
            this.$context = context;
            this.$sdkExecutors$delegate = interfaceC2000g;
        }

        /* renamed from: invoke$lambda-0, reason: not valid java name */
        private static final com.vungle.ads.internal.util.l m66invoke$lambda0(InterfaceC2000g<com.vungle.ads.internal.util.l> interfaceC2000g) {
            return interfaceC2000g.getValue();
        }

        /* renamed from: invoke$lambda-1, reason: not valid java name */
        private static final com.vungle.ads.internal.downloader.d m67invoke$lambda1(InterfaceC2000g<? extends com.vungle.ads.internal.downloader.d> interfaceC2000g) {
            return interfaceC2000g.getValue();
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return C1992A.f18074a;
        }

        public final void invoke(boolean z10) {
            if (z10) {
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                Context context = this.$context;
                b9.i iVar = b9.i.SYNCHRONIZED;
                com.vungle.ads.internal.load.e.downloadJs$default(com.vungle.ads.internal.load.e.INSTANCE, m66invoke$lambda0(C2001h.a(iVar, new a(context))), m67invoke$lambda1(C2001h.a(iVar, new b(this.$context))), j.m56configure$lambda7(this.$sdkExecutors$delegate).getBackgroundExecutor(), null, 8, null);
            }
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class h extends m implements InterfaceC5480a<com.vungle.ads.internal.platform.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.platform.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.platform.b.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class i extends m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    /* renamed from: com.vungle.ads.internal.j$j, reason: collision with other inner class name */
    public static final class C0382j extends m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0382j(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.network.g invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.g.class);
        }
    }

    private final void configure(Context context, String str, B b10) {
        boolean z10;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        b9.i iVar = b9.i.SYNCHRONIZED;
        InterfaceC2000g interfaceC2000gA = C2001h.a(iVar, new b(context));
        try {
            InterfaceC2000g interfaceC2000gA2 = C2001h.a(iVar, new c(context));
            com.vungle.ads.internal.f fVar = com.vungle.ads.internal.f.INSTANCE;
            C1658g cachedConfig = fVar.getCachedConfig(m55configure$lambda6(interfaceC2000gA2), str);
            if (cachedConfig != null) {
                com.vungle.ads.internal.f.initWithConfig$vungle_ads_release$default(fVar, context, cachedConfig, true, null, 8, null);
                z10 = true;
            } else {
                z10 = false;
            }
            InterfaceC2000g interfaceC2000gA3 = C2001h.a(iVar, new d(context));
            C4055m.INSTANCE.init$vungle_ads_release(m54configure$lambda5(interfaceC2000gA), m56configure$lambda7(interfaceC2000gA3).getLoggerExecutor(), fVar.getLogLevel(), fVar.getMetricsEnabled(), m57configure$lambda8(C2001h.a(iVar, new e(context))));
            try {
                this.isInitialized.set(true);
                onInitSuccess();
                com.vungle.ads.internal.util.k.Companion.d(TAG, "Running cleanup and resend tpat jobs. " + Thread.currentThread().getId());
                InterfaceC2000g interfaceC2000gA4 = C2001h.a(iVar, new f(context));
                m58configure$lambda9(interfaceC2000gA4).execute(a.C0393a.makeJobInfo$default(com.vungle.ads.internal.task.a.Companion, null, 1, null));
                m58configure$lambda9(interfaceC2000gA4).execute(com.vungle.ads.internal.task.i.Companion.makeJobInfo());
                if (z10) {
                    return;
                }
                fVar.fetchConfigAsync$vungle_ads_release(context, new g(context, interfaceC2000gA3));
            } catch (Throwable th) {
                th = th;
                com.vungle.ads.internal.util.k.Companion.e(TAG, "Cannot get config", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: configure$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.network.g m54configure$lambda5(InterfaceC2000g<com.vungle.ads.internal.network.g> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: configure$lambda-6, reason: not valid java name */
    private static final C4277a m55configure$lambda6(InterfaceC2000g<C4277a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configure$lambda-7, reason: not valid java name */
    public static final com.vungle.ads.internal.executor.a m56configure$lambda7(InterfaceC2000g<? extends com.vungle.ads.internal.executor.a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: configure$lambda-8, reason: not valid java name */
    private static final com.vungle.ads.internal.signals.b m57configure$lambda8(InterfaceC2000g<com.vungle.ads.internal.signals.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: configure$lambda-9, reason: not valid java name */
    private static final com.vungle.ads.internal.task.f m58configure$lambda9(InterfaceC2000g<? extends com.vungle.ads.internal.task.f> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: init$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.b m59init$lambda0(InterfaceC2000g<? extends com.vungle.ads.internal.platform.b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: init$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m60init$lambda1(InterfaceC2000g<? extends com.vungle.ads.internal.executor.a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: init$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.network.g m61init$lambda2(InterfaceC2000g<com.vungle.ads.internal.network.g> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-3, reason: not valid java name */
    public static final void m62init$lambda3(Context context, String appId, j this$0, B initializationCallback, InterfaceC2000g vungleApiClient$delegate) throws Throwable {
        kotlin.jvm.internal.l.f(context, "$context");
        kotlin.jvm.internal.l.f(appId, "$appId");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(initializationCallback, "$initializationCallback");
        kotlin.jvm.internal.l.f(vungleApiClient$delegate, "$vungleApiClient$delegate");
        C4321c.INSTANCE.init(context);
        m61init$lambda2(vungleApiClient$delegate).initialize(appId);
        this$0.configure(context, appId, initializationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-4, reason: not valid java name */
    public static final void m63init$lambda4(j this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.onInitError(new V("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String str) {
        return q.i0(str);
    }

    private final void onInitError(k0 k0Var) {
        com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new T(27, this, k0Var));
        String localizedMessage = k0Var.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + k0Var.getCode();
        }
        com.vungle.ads.internal.util.k.Companion.e(TAG, localizedMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onInitError$lambda-11, reason: not valid java name */
    public static final void m64onInitError$lambda11(j this$0, k0 exception) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(exception, "$exception");
        com.vungle.ads.internal.util.k.Companion.e(TAG, "onError");
        Iterator<T> it = this$0.initializationCallbackArray.iterator();
        while (it.hasNext()) {
            ((B) it.next()).onError(exception);
        }
        this$0.initializationCallbackArray.clear();
    }

    private final void onInitSuccess() {
        com.vungle.ads.internal.util.k.Companion.d(TAG, "onSuccess " + Thread.currentThread().getId());
        com.vungle.ads.internal.util.q.INSTANCE.runOnUiThread(new C8.a(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onInitSuccess$lambda-13, reason: not valid java name */
    public static final void m65onInitSuccess$lambda13(j this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Iterator<T> it = this$0.initializationCallbackArray.iterator();
        while (it.hasNext()) {
            ((B) it.next()).onSuccess();
        }
        this$0.initializationCallbackArray.clear();
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.Companion.deInit();
        com.vungle.ads.internal.network.g.Companion.reset$vungle_ads_release();
        this.isInitialized.set(false);
    }

    public final void init(String appId, Context context, B initializationCallback) {
        kotlin.jvm.internal.l.f(appId, "appId");
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(initializationCallback, "initializationCallback");
        this.initializationCallbackArray.add(initializationCallback);
        com.vungle.ads.internal.util.b.Companion.init(context);
        if (isAppIdInvalid(appId)) {
            onInitError(new H().logError$vungle_ads_release());
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        b9.i iVar = b9.i.SYNCHRONIZED;
        if (!m59init$lambda0(C2001h.a(iVar, new h(context))).isAtLeastMinimumSDK()) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "SDK is supported only for API versions 21 and above");
            onInitError(new d0().logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.f.INSTANCE.setAppId$vungle_ads_release(appId);
        if (this.isInitialized.get()) {
            com.vungle.ads.internal.util.k.Companion.d(TAG, "init already complete");
            onInitSuccess();
        } else if (u.q(context, "android.permission.ACCESS_NETWORK_STATE") != 0 || u.q(context, "android.permission.INTERNET") != 0) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Network permissions not granted");
            onInitError(new Q());
        } else {
            m60init$lambda1(C2001h.a(iVar, new i(context))).getBackgroundExecutor().execute(new E(context, appId, this, initializationCallback, C2001h.a(iVar, new C0382j(context)), 1), new C2.h(this, 28));
        }
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    public final void setInitialized$vungle_ads_release(AtomicBoolean atomicBoolean) {
        kotlin.jvm.internal.l.f(atomicBoolean, "<set-?>");
        this.isInitialized = atomicBoolean;
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }
}
