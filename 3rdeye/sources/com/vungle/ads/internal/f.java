package com.vungle.ads.internal;

import E.u;
import R9.AbstractC1564a;
import R9.C1568e;
import R9.t;
import a6.C1658g;
import a6.C1661j;
import android.content.Context;
import android.net.Uri;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import c6.C2069b;
import com.vungle.ads.C4055m;
import com.vungle.ads.C4064w;
import com.vungle.ads.J;
import com.vungle.ads.S;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.e0;
import com.vungle.ads.f0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.k;
import d6.C4277a;
import e6.C4321c;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import p9.InterfaceC5480a;

/* compiled from: ConfigManager.kt */
/* loaded from: classes2.dex */
public final class f {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final String TAG = "ConfigManager";
    private static String applicationId;
    private static C1658g config;
    private static String configExt;
    private static C1658g.e endpoints;
    private static List<C1661j> placements;
    public static final f INSTANCE = new f();
    private static final AbstractC1564a json = t.a(e.INSTANCE);

    /* compiled from: ServiceLocator.kt */
    public static final class a extends m implements InterfaceC5480a<com.vungle.ads.internal.network.g> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.network.g invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.g.class);
        }
    }

    /* compiled from: ConfigManager.kt */
    public static final class b implements com.vungle.ads.internal.network.b<C1658g> {
        final /* synthetic */ Context $context;
        final /* synthetic */ f0 $initRequestToResponseMetric;
        final /* synthetic */ p9.l<Boolean, C1992A> $onComplete;

        /* JADX WARN: Multi-variable type inference failed */
        public b(f0 f0Var, Context context, p9.l<? super Boolean, C1992A> lVar) {
            this.$initRequestToResponseMetric = f0Var;
            this.$context = context;
            this.$onComplete = lVar;
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a<C1658g> aVar, Throwable th) throws Throwable {
            this.$initRequestToResponseMetric.markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, (J) this.$initRequestToResponseMetric, (String) null, (String) null, (String) null, com.vungle.ads.internal.network.g.Companion.getBASE_URL$vungle_ads_release(), 14, (Object) null);
            new C4064w().logErrorNoReturnValue$vungle_ads_release();
            k.a aVar2 = com.vungle.ads.internal.util.k.Companion;
            StringBuilder sb = new StringBuilder("Error while fetching config: ");
            sb.append(th != null ? th.getMessage() : null);
            aVar2.e(f.TAG, sb.toString());
            this.$onComplete.invoke(Boolean.FALSE);
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a<C1658g> aVar, com.vungle.ads.internal.network.d<C1658g> dVar) throws Throwable {
            this.$initRequestToResponseMetric.markEnd();
            C4055m.logMetric$vungle_ads_release$default(C4055m.INSTANCE, (J) this.$initRequestToResponseMetric, (String) null, (String) null, (String) null, com.vungle.ads.internal.network.g.Companion.getBASE_URL$vungle_ads_release(), 14, (Object) null);
            if (dVar == null || !dVar.isSuccessful() || dVar.body() == null) {
                new C4064w().logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            f.INSTANCE.initWithConfig$vungle_ads_release(this.$context, dVar.body(), false, new e0(Sdk$SDKMetric.b.CONFIG_LOADED_FROM_INIT));
            this.$onComplete.invoke(Boolean.TRUE);
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
    public static final class d extends m implements InterfaceC5480a<C2069b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [c6.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final C2069b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(C2069b.class);
        }
    }

    /* compiled from: ConfigManager.kt */
    public static final class e extends m implements p9.l<C1568e, C1992A> {
        public static final e INSTANCE = new e();

        public e() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
        }
    }

    /* compiled from: ServiceLocator.kt */
    /* renamed from: com.vungle.ads.internal.f$f, reason: collision with other inner class name */
    public static final class C0381f extends m implements InterfaceC5480a<C4277a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0381f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [d6.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final C4277a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(C4277a.class);
        }
    }

    private f() {
    }

    /* renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.g m48fetchConfigAsync$lambda0(InterfaceC2000g<com.vungle.ads.internal.network.g> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final C4277a m49initWithConfig$lambda2(InterfaceC2000g<C4277a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final C2069b m50initWithConfig$lambda5(InterfaceC2000g<C2069b> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(f fVar, Context context, C1658g c1658g, boolean z10, e0 e0Var, int i, Object obj) {
        if ((i & 8) != 0) {
            e0Var = null;
        }
        fVar.initWithConfig$vungle_ads_release(context, c1658g, z10, e0Var);
    }

    /* renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final C4277a m51updateConfigExtension$lambda1(InterfaceC2000g<C4277a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(f fVar, C1658g.e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = endpoints;
        }
        return fVar.validateEndpoints$vungle_ads_release(eVar);
    }

    public final int checkConfigPayload$vungle_ads_release(C1658g c1658g) {
        Long configLastValidatedTimestamp;
        if (c1658g == null || c1658g.getConfigLastValidatedTimestamp() == null || ((configLastValidatedTimestamp = c1658g.getConfigLastValidatedTimestamp()) != null && configLastValidatedTimestamp.longValue() == -1)) {
            return 0;
        }
        return c1658g.getEndpoints() == null ? 1 : 2;
    }

    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }

    public final long configLastValidatedTimestamp() {
        Long configLastValidatedTimestamp;
        C1658g c1658g = config;
        if (c1658g == null || (configLastValidatedTimestamp = c1658g.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(Context context, p9.l<? super Boolean, C1992A> onComplete) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(onComplete, "onComplete");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        InterfaceC2000g interfaceC2000gA = C2001h.a(b9.i.SYNCHRONIZED, new a(context));
        try {
            f0 f0Var = new f0(Sdk$SDKMetric.b.INIT_REQUEST_TO_RESPONSE_DURATION_MS);
            f0Var.markStart();
            com.vungle.ads.internal.network.a<C1658g> aVarConfig = m48fetchConfigAsync$lambda0(interfaceC2000gA).config();
            if (aVarConfig != null) {
                aVarConfig.enqueue(new b(f0Var, context, onComplete));
            }
        } catch (Throwable th) {
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                new S().logErrorNoReturnValue$vungle_ads_release();
            } else {
                new C4064w().logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(Boolean.FALSE);
        }
    }

    public final boolean fpdEnabled() {
        Boolean fpdEnabled;
        C1658g c1658g = config;
        if (c1658g == null || (fpdEnabled = c1658g.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    public final String getAdsEndpoint() {
        C1658g.e eVar = endpoints;
        String str = null;
        String adsEndpoint = eVar != null ? eVar.getAdsEndpoint() : null;
        if (adsEndpoint != null && adsEndpoint.length() != 0) {
            str = adsEndpoint;
        }
        return str == null ? g.DEFAULT_ADS_ENDPOINT : str;
    }

    public final C1658g getCachedConfig(C4277a filePreferences, String appId) {
        Long refreshTime;
        kotlin.jvm.internal.l.f(filePreferences, "filePreferences");
        kotlin.jvm.internal.l.f(appId, "appId");
        try {
            String string = filePreferences.getString("config_app_id");
            if (string != null && string.length() != 0 && string.equalsIgnoreCase(appId)) {
                String string2 = filePreferences.getString("config_response");
                if (string2 == null) {
                    return null;
                }
                long j4 = filePreferences.getLong("config_update_time", 0L);
                AbstractC1564a abstractC1564a = json;
                C1658g c1658g = (C1658g) abstractC1564a.a(u.L(abstractC1564a.f11782b, x.b(C1658g.class)), string2);
                C1658g.d configSettings = c1658g.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j4 < System.currentTimeMillis()) {
                    com.vungle.ads.internal.util.k.Companion.w(TAG, "cache config expired. re-config");
                    return null;
                }
                com.vungle.ads.internal.util.k.Companion.w(TAG, "use cache config.");
                return c1658g;
            }
            com.vungle.ads.internal.util.k.Companion.w(TAG, "app id mismatch, re-config");
            return null;
        } catch (Exception e4) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Error while parsing cached config: " + e4.getMessage());
            return null;
        }
    }

    public final int getCleverCacheDiskPercentage() {
        C1658g.b cleverCache;
        Integer diskPercentage;
        C1658g c1658g = config;
        if (c1658g == null || (cleverCache = c1658g.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        C1658g.b cleverCache;
        Long diskSize;
        C1658g c1658g = config;
        if (c1658g == null || (cleverCache = c1658g.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j4 = 1024;
        return diskSize.longValue() * j4 * j4;
    }

    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    public final String getErrorLoggingEndpoint() {
        C1658g.e eVar = endpoints;
        String str = null;
        String errorLogsEndpoint = eVar != null ? eVar.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            str = errorLogsEndpoint;
        }
        return str == null ? g.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    public final String getGDPRButtonAccept() {
        C1658g.i userPrivacy;
        C1658g.f gdpr;
        C1658g c1658g = config;
        if (c1658g == null || (userPrivacy = c1658g.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        C1658g.i userPrivacy;
        C1658g.f gdpr;
        C1658g c1658g = config;
        if (c1658g == null || (userPrivacy = c1658g.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessage() {
        C1658g.i userPrivacy;
        C1658g.f gdpr;
        C1658g c1658g = config;
        if (c1658g == null || (userPrivacy = c1658g.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final String getGDPRConsentMessageVersion() {
        C1658g.i userPrivacy;
        C1658g.f gdpr;
        String consentMessageVersion;
        C1658g c1658g = config;
        return (c1658g == null || (userPrivacy = c1658g.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        C1658g.i userPrivacy;
        C1658g.f gdpr;
        C1658g c1658g = config;
        if (c1658g == null || (userPrivacy = c1658g.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        C1658g.i userPrivacy;
        C1658g.f gdpr;
        Boolean boolIsCountryDataProtected;
        C1658g c1658g = config;
        if (c1658g == null || (userPrivacy = c1658g.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (boolIsCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return boolIsCountryDataProtected.booleanValue();
    }

    public final int getLogLevel() {
        C1658g.h logMetricsSettings;
        Integer errorLogLevel;
        C1658g c1658g = config;
        return (c1658g == null || (logMetricsSettings = c1658g.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? C4055m.a.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final boolean getMetricsEnabled() {
        C1658g.h logMetricsSettings;
        Boolean metricsEnabled;
        C1658g c1658g = config;
        if (c1658g == null || (logMetricsSettings = c1658g.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    public final String getMetricsEndpoint() {
        C1658g.e eVar = endpoints;
        String str = null;
        String metricsEndpoint = eVar != null ? eVar.getMetricsEndpoint() : null;
        if (metricsEndpoint != null && metricsEndpoint.length() != 0) {
            str = metricsEndpoint;
        }
        return str == null ? g.DEFAULT_METRICS_ENDPOINT : str;
    }

    public final String getMraidEndpoint() {
        C1658g.e eVar = endpoints;
        if (eVar != null) {
            return eVar.getMraidEndpoint();
        }
        return null;
    }

    public final String getMraidJsVersion() {
        String mraidEndpoint = getMraidEndpoint();
        if (mraidEndpoint == null) {
            return "mraid_1";
        }
        String str = "mraid_" + Uri.parse(mraidEndpoint).getLastPathSegment();
        return str == null ? "mraid_1" : str;
    }

    public final C1661j getPlacement(String id) {
        kotlin.jvm.internal.l.f(id, "id");
        List<C1661j> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.l.b(((C1661j) next).getReferenceId(), id)) {
                obj = next;
                break;
            }
        }
        return (C1661j) obj;
    }

    public final String getRiEndpoint() {
        C1658g.e eVar = endpoints;
        if (eVar != null) {
            return eVar.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        Integer sessionTimeout;
        C1658g c1658g = config;
        return ((c1658g == null || (sessionTimeout = c1658g.getSessionTimeout()) == null) ? DEFAULT_SESSION_TIMEOUT_SECONDS : sessionTimeout.intValue()) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        C1658g c1658g = config;
        return ((c1658g == null || (signalSessionTimeout = c1658g.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue()) * 1000;
    }

    public final C1658g.C0223g.c getTcfStatus() {
        C1658g.i userPrivacy;
        C1658g.C0223g iab;
        C1658g.C0223g.c.a aVar = C1658g.C0223g.c.Companion;
        C1658g c1658g = config;
        return aVar.fromRawValue((c1658g == null || (userPrivacy = c1658g.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final synchronized void initWithConfig$vungle_ads_release(Context context, C1658g c1658g, boolean z10, e0 e0Var) {
        try {
            kotlin.jvm.internal.l.f(context, "context");
            try {
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                b9.i iVar = b9.i.SYNCHRONIZED;
                InterfaceC2000g interfaceC2000gA = C2001h.a(iVar, new c(context));
                int iCheckConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(c1658g);
                if (iCheckConfigPayload$vungle_ads_release == 0) {
                    com.vungle.ads.internal.util.k.Companion.e(TAG, "Config is not available.");
                    return;
                }
                if (iCheckConfigPayload$vungle_ads_release == 1) {
                    if (!z10 && c1658g != null) {
                        Long configLastValidatedTimestamp = c1658g.getConfigLastValidatedTimestamp();
                        long jLongValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                        C1658g c1658g2 = config;
                        if (c1658g2 != null) {
                            c1658g2.setConfigLastValidatedTimestamp(Long.valueOf(jLongValue));
                        }
                        C1658g c1658g3 = config;
                        if (c1658g3 != null) {
                            INSTANCE.updateCachedConfig(c1658g3, m49initWithConfig$lambda2(interfaceC2000gA));
                        }
                    }
                    return;
                }
                config = c1658g;
                endpoints = c1658g != null ? c1658g.getEndpoints() : null;
                placements = c1658g != null ? c1658g.getPlacements() : null;
                C4055m c4055m = C4055m.INSTANCE;
                c4055m.updateErrorLevelAndMetricEnabled$vungle_ads_release(getLogLevel(), getMetricsEnabled());
                if (!z10 && c1658g != null) {
                    updateCachedConfig(c1658g, m49initWithConfig$lambda2(interfaceC2000gA));
                    String configExtension = c1658g.getConfigExtension();
                    if (configExtension != null) {
                        INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                    }
                }
                if (omEnabled()) {
                    m50initWithConfig$lambda5(C2001h.a(iVar, new d(context))).init();
                }
                if (e0Var != null) {
                    C4055m.logMetric$vungle_ads_release$default(c4055m, e0Var, (String) null, (String) null, (String) null, (String) null, 30, (Object) null);
                }
                C4321c.INSTANCE.updateDisableAdId(shouldDisableAdId());
            } catch (Exception e4) {
                com.vungle.ads.internal.util.k.Companion.e(TAG, "Error while validating config: " + e4.getMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean isCacheableAssetsRequired() {
        Boolean boolIsCacheableAssetsRequired;
        C1658g c1658g = config;
        if (c1658g == null || (boolIsCacheableAssetsRequired = c1658g.isCacheableAssetsRequired()) == null) {
            return false;
        }
        return boolIsCacheableAssetsRequired.booleanValue();
    }

    public final boolean isCleverCacheEnabled() {
        C1658g.b cleverCache;
        Boolean enabled;
        C1658g c1658g = config;
        if (c1658g == null || (cleverCache = c1658g.getCleverCache()) == null || (enabled = cleverCache.getEnabled()) == null) {
            return false;
        }
        return enabled.booleanValue();
    }

    public final boolean isReportIncentivizedEnabled() {
        Boolean boolIsReportIncentivizedEnabled;
        C1658g c1658g = config;
        if (c1658g == null || (boolIsReportIncentivizedEnabled = c1658g.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return boolIsReportIncentivizedEnabled.booleanValue();
    }

    public final boolean omEnabled() {
        C1658g.j viewAbility;
        Boolean om;
        C1658g c1658g = config;
        if (c1658g == null || (viewAbility = c1658g.getViewAbility()) == null || (om = viewAbility.getOm()) == null) {
            return false;
        }
        return om.booleanValue();
    }

    public final List<C1661j> placements() {
        return placements;
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        C1658g c1658g = config;
        if (c1658g == null || (rtaDebugging = c1658g.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final void setAppId$vungle_ads_release(String applicationId2) {
        kotlin.jvm.internal.l.f(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        C1658g c1658g = config;
        if (c1658g == null || (disableAdId = c1658g.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        C1658g c1658g = config;
        if (c1658g == null || (signalsDisabled = c1658g.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateCachedConfig(C1658g config2, C4277a filePreferences) {
        kotlin.jvm.internal.l.f(config2, "config");
        kotlin.jvm.internal.l.f(filePreferences, "filePreferences");
        try {
            String str = applicationId;
            if (str == null) {
                kotlin.jvm.internal.l.l("applicationId");
                throw null;
            }
            filePreferences.put("config_app_id", str);
            filePreferences.put("config_update_time", System.currentTimeMillis());
            AbstractC1564a abstractC1564a = json;
            filePreferences.put("config_response", abstractC1564a.b(u.L(abstractC1564a.f11782b, x.b(C1658g.class)), config2));
            filePreferences.apply();
        } catch (Exception e4) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Exception: " + e4.getMessage() + " for updating cached config");
        }
    }

    public final void updateConfigExtension$vungle_ads_release(Context context, String ext) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(ext, "ext");
        configExt = ext;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m51updateConfigExtension$lambda1(C2001h.a(b9.i.SYNCHRONIZED, new C0381f(context))).put("config_extension", ext).apply();
    }

    public final boolean validateConfig$vungle_ads_release(C1658g c1658g) {
        return ((c1658g != null ? c1658g.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(c1658g.getEndpoints()) || c1658g.getPlacements() == null) ? false : true;
    }

    public final boolean validateEndpoints$vungle_ads_release(C1658g.e eVar) {
        boolean z10;
        String adsEndpoint = eVar != null ? eVar.getAdsEndpoint() : null;
        boolean z11 = false;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 122, "The ads endpoint was not provided in the config.", (String) null, (String) null, (String) null, 28, (Object) null);
            z10 = false;
        } else {
            z10 = true;
        }
        String riEndpoint = eVar != null ? eVar.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 123, "The ri endpoint was not provided in the config.", (String) null, (String) null, (String) null, 28, (Object) null);
        }
        String mraidEndpoint = eVar != null ? eVar.getMraidEndpoint() : null;
        if (mraidEndpoint == null || mraidEndpoint.length() == 0) {
            C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 130, "The mraid endpoint was not provided in the config.", (String) null, (String) null, (String) null, 28, (Object) null);
        } else {
            z11 = z10;
        }
        String metricsEndpoint = eVar != null ? eVar.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 125, "The metrics endpoint was not provided in the config.", (String) null, (String) null, (String) null, 28, (Object) null);
        }
        String errorLogsEndpoint = eVar != null ? eVar.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            return z11;
        }
        com.vungle.ads.internal.util.k.Companion.e(TAG, "The error logging endpoint was not provided in the config.");
        return z11;
    }
}
