package com.vungle.ads.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.VungleWrapperFramework;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.w;
import com.vungle.ads.l;
import com.vungle.ads.y;
import com.vungle.ads.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import s9.u;
import y8.s;

/* loaded from: classes3.dex */
public final class VungleInitializer {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "VungleInitializer";

    @NotNull
    private AtomicBoolean isInitialized = new AtomicBoolean(false);

    @NotNull
    private AtomicBoolean isInitializing = new AtomicBoolean(false);

    @NotNull
    private final CopyOnWriteArrayList<l> initializationCallbackArray = new CopyOnWriteArrayList<>();

    @NotNull
    private final z initDurationMetric = new z(Sdk$SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    private final void configure(final Context context, String str) {
        final Context context2;
        boolean z10;
        try {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
            y8.h hVarA = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t7.b] */
                @Override // l9.a
                @NotNull
                public final t7.b invoke() {
                    return ServiceLocator.Companion.getInstance(context).getService(t7.b.class);
                }
            });
            ConfigManager configManager = ConfigManager.INSTANCE;
            ConfigPayload cachedConfig = configManager.getCachedConfig(m295configure$lambda4(hVarA), str);
            if (cachedConfig != null) {
                context2 = context;
                ConfigManager.initWithConfig$vungle_ads_release$default(configManager, context2, cachedConfig, true, null, 8, null);
                z10 = true;
            } else {
                context2 = context;
                z10 = false;
            }
            this.isInitialized.set(true);
            onInitSuccess();
            p.Companion.d(TAG, "Running cleanup jobs. " + Thread.currentThread().getId());
            m296configure$lambda5(kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.c, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.task.c invoke() {
                    return ServiceLocator.Companion.getInstance(context2).getService(com.vungle.ads.internal.task.c.class);
                }
            })).execute(CleanupJob.a.makeJobInfo$default(CleanupJob.Companion, null, 1, null));
            if (z10) {
                return;
            }
            configManager.fetchConfigAsync$vungle_ads_release(context2, new l9.l() { // from class: com.vungle.ads.internal.VungleInitializer.configure.1
                @Override // l9.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return s.f25199a;
                }

                public final void invoke(boolean z11) {
                    p.Companion.d(VungleInitializer.TAG, "Config fetch result: " + z11);
                }
            });
        } catch (Throwable th) {
            p.Companion.e(TAG, "Cannot get config", th);
        }
    }

    /* renamed from: configure$lambda-4, reason: not valid java name */
    private static final t7.b m295configure$lambda4(y8.h hVar) {
        return (t7.b) hVar.getValue();
    }

    /* renamed from: configure$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.task.c m296configure$lambda5(y8.h hVar) {
        return (com.vungle.ads.internal.task.c) hVar.getValue();
    }

    private final boolean hasInvalidChar(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '.') {
                return true;
            }
        }
        return false;
    }

    private final boolean hasRequiredNetworkPermissions(Context context) {
        return (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) && (ContextCompat.checkSelfPermission(context, "android.permission.INTERNET") == 0);
    }

    /* renamed from: init$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m297init$lambda0(y8.h hVar) {
        return (com.vungle.ads.internal.executor.a) hVar.getValue();
    }

    /* renamed from: init$lambda-1, reason: not valid java name */
    private static final VungleApiClient m298init$lambda1(y8.h hVar) {
        return (VungleApiClient) hVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-2, reason: not valid java name */
    public static final void m299init$lambda2(final VungleInitializer this$0, Context context, String appId, y8.h vungleApiClient$delegate) {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        kotlin.jvm.internal.p.e(context, "$context");
        kotlin.jvm.internal.p.e(appId, "$appId");
        kotlin.jvm.internal.p.e(vungleApiClient$delegate, "$vungleApiClient$delegate");
        if (!this$0.hasRequiredNetworkPermissions(context)) {
            p.Companion.e(TAG, "Network permissions not granted");
            v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.VungleInitializer$init$1$1
                {
                    super(0);
                }

                @Override // l9.a
                public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
                    m301invoke();
                    return s.f25199a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m301invoke() throws Throwable {
                    this.this$0.onInitError(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
                }
            });
        } else {
            PrivacyManager.INSTANCE.init(context);
            m298init$lambda1(vungleApiClient$delegate).initialize(appId);
            this$0.configure(context, appId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-3, reason: not valid java name */
    public static final void m300init$lambda3(VungleInitializer this$0) throws Throwable {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        this$0.onInitError(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String str) {
        return u.d0(str) || hasInvalidChar(str);
    }

    @VisibleForTesting
    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitError(final VungleError vungleError) throws Throwable {
        this.isInitializing.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + vungleError.getCode();
        }
        this.initDurationMetric.setMetricType(Sdk$SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.initDurationMetric, (o) null, localizedMessage);
        v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.VungleInitializer.onInitError.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m302invoke();
                return s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m302invoke() {
                p.Companion.e(VungleInitializer.TAG, "onError");
                CopyOnWriteArrayList copyOnWriteArrayList = VungleInitializer.this.initializationCallbackArray;
                VungleError vungleError2 = vungleError;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).onError(vungleError2);
                }
                VungleInitializer.this.initializationCallbackArray.clear();
            }
        });
        p.Companion.e(TAG, localizedMessage);
    }

    private final void onInitSuccess() throws Throwable {
        this.isInitializing.set(false);
        this.initDurationMetric.setMetricType(Sdk$SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.initDurationMetric, (o) null, (String) null, 6, (Object) null);
        p.Companion.d(TAG, "onSuccess " + Thread.currentThread().getId());
        v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.VungleInitializer.onInitSuccess.1
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m303invoke();
                return s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m303invoke() {
                Iterator it = VungleInitializer.this.initializationCallbackArray.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).onSuccess();
                }
                VungleInitializer.this.initializationCallbackArray.clear();
            }
        });
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.Companion.deInit();
        VungleApiClient.Companion.reset$vungle_ads_release();
        this.isInitialized.set(false);
        this.isInitializing.set(false);
        this.initializationCallbackArray.clear();
    }

    public final void init(@NotNull final String appId, @NotNull final Context context, @NotNull l initializationCallback) throws Throwable {
        kotlin.jvm.internal.p.e(appId, "appId");
        kotlin.jvm.internal.p.e(context, "context");
        kotlin.jvm.internal.p.e(initializationCallback, "initializationCallback");
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new y(Sdk$SDKMetric.SDKMetricType.SDK_INIT_API), (o) null, (String) null, 6, (Object) null);
        this.initDurationMetric.markStart();
        this.initializationCallbackArray.add(initializationCallback);
        if (isAppIdInvalid(appId)) {
            onInitError(new InvalidAppId("App id invalid: " + appId + ", package name: " + context.getPackageName()).logError$vungle_ads_release());
            return;
        }
        if (w.INSTANCE.isOSVersionInvalid()) {
            p.Companion.e(TAG, "Init: SDK is supported only for API versions 25 and above.");
            onInitError(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.setAppId$vungle_ads_release(appId);
        if (this.isInitialized.get()) {
            p.Companion.d(TAG, "init already complete");
            onInitSuccess();
        } else {
            if (this.isInitializing.getAndSet(true)) {
                p.Companion.d(TAG, "init already in progress");
                return;
            }
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
            y8.h hVarA = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.executor.a invoke() {
                    return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.executor.a.class);
                }
            });
            final y8.h hVarA2 = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final VungleApiClient invoke() {
                    return ServiceLocator.Companion.getInstance(context).getService(VungleApiClient.class);
                }
            });
            m297init$lambda0(hVarA).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.i
                @Override // java.lang.Runnable
                public final void run() {
                    VungleInitializer.m299init$lambda2(this.f20170a, context, appId, hVarA2);
                }
            }, new Runnable() { // from class: com.vungle.ads.internal.j
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    VungleInitializer.m300init$lambda3(this.f20174a);
                }
            });
        }
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    @NotNull
    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    @NotNull
    public final AtomicBoolean isInitializing$vungle_ads_release() {
        return this.isInitializing;
    }

    public final void setInitialized$vungle_ads_release(@NotNull AtomicBoolean atomicBoolean) {
        kotlin.jvm.internal.p.e(atomicBoolean, "<set-?>");
        this.isInitialized = atomicBoolean;
    }

    public final void setInitializing$vungle_ads_release(@NotNull AtomicBoolean atomicBoolean) {
        kotlin.jvm.internal.p.e(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }

    public final void setIntegrationName(@NotNull VungleWrapperFramework wrapperFramework, @NotNull String wrapperFrameworkVersion) {
        String str;
        kotlin.jvm.internal.p.e(wrapperFramework, "wrapperFramework");
        kotlin.jvm.internal.p.e(wrapperFrameworkVersion, "wrapperFrameworkVersion");
        if (wrapperFramework == VungleWrapperFramework.none) {
            p.Companion.e(TAG, "Wrapper is null or is none");
            return;
        }
        com.vungle.ads.internal.network.j jVar = com.vungle.ads.internal.network.j.INSTANCE;
        String headerUa = jVar.getHeaderUa();
        if (wrapperFrameworkVersion.length() > 0) {
            str = '/' + wrapperFrameworkVersion;
        } else {
            str = "";
        }
        String str2 = wrapperFramework.name() + str;
        if (u.P(headerUa, str2, false, 2, null)) {
            p.Companion.w(TAG, "Wrapper info already set");
            return;
        }
        jVar.setHeaderUa(headerUa + ';' + str2);
        if (isInitialized()) {
            p.Companion.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
