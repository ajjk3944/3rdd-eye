package com.vungle.ads.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InvalidEndpointError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.y;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s9.r;
import y8.s;

/* loaded from: classes3.dex */
public final class ConfigManager {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;

    @NotNull
    public static final String TAG = "ConfigManager";
    private static String applicationId;

    @Nullable
    private static ConfigPayload config;

    @Nullable
    private static String configExt;

    @Nullable
    private static ConfigPayload.f endpoints;

    @Nullable
    private static List<q7.h> placements;

    @NotNull
    public static final ConfigManager INSTANCE = new ConfigManager();

    @NotNull
    private static final y8.h json$delegate = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.ConfigManager$json$2
        @Override // l9.a
        @NotNull
        public final z9.a invoke() {
            return z9.k.b(null, new l() { // from class: com.vungle.ads.internal.ConfigManager$json$2.1
                @Override // l9.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((z9.c) obj);
                    return s.f25199a;
                }

                public final void invoke(@NotNull z9.c Json) {
                    p.e(Json, "$this$Json");
                    Json.f(true);
                    Json.d(true);
                    Json.e(false);
                }
            }, 1, null);
        }
    });

    public static final class a implements com.vungle.ads.internal.network.b {
        final /* synthetic */ Context $context;
        final /* synthetic */ l $onComplete;

        public a(l lVar, Context context) {
            this.$onComplete = lVar;
            this.$context = context;
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error while fetching config: ");
            sb.append(th != null ? th.getMessage() : null);
            new NetworkUnreachable(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
            this.$onComplete.invoke(Boolean.FALSE);
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable com.vungle.ads.internal.network.e eVar) {
            if (eVar != null && eVar.isSuccessful() && eVar.body() != null) {
                ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(this.$context, (ConfigPayload) eVar.body(), false, new y(Sdk$SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
                this.$onComplete.invoke(Boolean.TRUE);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("config API: ");
            sb.append(eVar != null ? Integer.valueOf(eVar.code()) : null);
            new APIFailedStatusCodeError(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
            this.$onComplete.invoke(Boolean.FALSE);
        }
    }

    private ConfigManager() {
    }

    /* renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final VungleApiClient m290fetchConfigAsync$lambda0(y8.h hVar) {
        return (VungleApiClient) hVar.getValue();
    }

    private final z9.a getJson() {
        return (z9.a) json$delegate.getValue();
    }

    /* renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final t7.b m291initWithConfig$lambda2(y8.h hVar) {
        return (t7.b) hVar.getValue();
    }

    /* renamed from: initWithConfig$lambda-4, reason: not valid java name */
    private static final VungleApiClient m292initWithConfig$lambda4(y8.h hVar) {
        return (VungleApiClient) hVar.getValue();
    }

    /* renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m293initWithConfig$lambda5(y8.h hVar) {
        return (com.vungle.ads.internal.executor.a) hVar.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(ConfigManager configManager, Context context, ConfigPayload configPayload, boolean z10, y yVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            yVar = null;
        }
        configManager.initWithConfig$vungle_ads_release(context, configPayload, z10, yVar);
    }

    /* renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final t7.b m294updateConfigExtension$lambda1(y8.h hVar) {
        return (t7.b) hVar.getValue();
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(ConfigManager configManager, ConfigPayload.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = endpoints;
        }
        return configManager.validateEndpoints$vungle_ads_release(fVar);
    }

    public final long afterClickDuration() {
        ConfigPayload.b autoRedirect;
        Long afterClickDuration;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (afterClickDuration = autoRedirect.getAfterClickDuration()) == null) {
            return Long.MAX_VALUE;
        }
        return afterClickDuration.longValue();
    }

    public final boolean allowAutoRedirects() {
        ConfigPayload.b autoRedirect;
        Boolean allowAutoRedirect;
        ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (allowAutoRedirect = autoRedirect.getAllowAutoRedirect()) == null) {
            return false;
        }
        return allowAutoRedirect.booleanValue();
    }

    @VisibleForTesting
    public final int checkConfigPayload$vungle_ads_release(@Nullable ConfigPayload configPayload) {
        Long configLastValidatedTimestamp;
        if (configPayload == null || configPayload.getConfigLastValidatedTimestamp() == null || ((configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) != null && configLastValidatedTimestamp.longValue() == -1)) {
            return 0;
        }
        return configPayload.getEndpoints() == null ? 1 : 2;
    }

    @VisibleForTesting
    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }

    public final long configLastValidatedTimestamp() {
        Long configLastValidatedTimestamp;
        ConfigPayload configPayload = config;
        if (configPayload == null || (configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(@NotNull final Context context, @NotNull l onComplete) {
        p.e(context, "context");
        p.e(onComplete, "onComplete");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        try {
            com.vungle.ads.internal.network.a aVarConfig = m290fetchConfigAsync$lambda0(kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$$inlined$inject$1
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
            })).config();
            if (aVarConfig != null) {
                aVarConfig.enqueue(new a(onComplete, context));
            }
        } catch (Throwable th) {
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                new NetworkUnreachable("Config unknown: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable("Config: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(Boolean.FALSE);
        }
    }

    public final boolean fpdEnabled() {
        Boolean fpdEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (fpdEnabled = configPayload.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    @NotNull
    public final String getAdsEndpoint() {
        ConfigPayload.f fVar = endpoints;
        String str = null;
        String adsEndpoint = fVar != null ? fVar.getAdsEndpoint() : null;
        if (adsEndpoint != null && adsEndpoint.length() != 0) {
            str = adsEndpoint;
        }
        return str == null ? b.DEFAULT_ADS_ENDPOINT : str;
    }

    @Nullable
    public final ConfigPayload getCachedConfig(@NotNull t7.b filePreferences, @NotNull String appId) {
        Long refreshTime;
        p.e(filePreferences, "filePreferences");
        p.e(appId, "appId");
        try {
            String string = filePreferences.getString("config_app_id");
            if (string != null && string.length() != 0 && r.x(string, appId, true)) {
                String string2 = filePreferences.getString("config_response");
                if (string2 == null) {
                    return null;
                }
                long j10 = filePreferences.getLong("config_update_time", 0L);
                z9.a json = INSTANCE.getJson();
                kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(json.a(), t.m(ConfigPayload.class));
                p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                ConfigPayload configPayload = (ConfigPayload) json.b(bVarB, string2);
                ConfigPayload.e configSettings = configPayload.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j10 < System.currentTimeMillis()) {
                    com.vungle.ads.internal.util.p.Companion.w(TAG, "cache config expired. re-config");
                    return null;
                }
                com.vungle.ads.internal.util.p.Companion.w(TAG, "use cache config.");
                return configPayload;
            }
            com.vungle.ads.internal.util.p.Companion.w(TAG, "app id mismatch, re-config");
            return null;
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Error while parsing cached config: " + e10.getMessage());
            return null;
        }
    }

    public final int getCleverCacheDiskPercentage() {
        ConfigPayload.c cleverCache;
        Integer diskPercentage;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        ConfigPayload.c cleverCache;
        Long diskSize;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j10 = 1024;
        return diskSize.longValue() * j10 * j10;
    }

    @NotNull
    public final String getConfigExtension() {
        String str = configExt;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getErrorLoggingEndpoint() {
        ConfigPayload.f fVar = endpoints;
        String str = null;
        String errorLogsEndpoint = fVar != null ? fVar.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            str = errorLogsEndpoint;
        }
        return str == null ? b.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    @Nullable
    public final String getGDPRButtonAccept() {
        ConfigPayload.i userPrivacy;
        ConfigPayload.g gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    @Nullable
    public final String getGDPRButtonDeny() {
        ConfigPayload.i userPrivacy;
        ConfigPayload.g gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    @Nullable
    public final String getGDPRConsentMessage() {
        ConfigPayload.i userPrivacy;
        ConfigPayload.g gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    @NotNull
    public final String getGDPRConsentMessageVersion() {
        ConfigPayload.i userPrivacy;
        ConfigPayload.g gdpr;
        String consentMessageVersion;
        ConfigPayload configPayload = config;
        return (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    @Nullable
    public final String getGDPRConsentTitle() {
        ConfigPayload.i userPrivacy;
        ConfigPayload.g gdpr;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        ConfigPayload.i userPrivacy;
        ConfigPayload.g gdpr;
        Boolean boolIsCountryDataProtected;
        ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (boolIsCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return boolIsCountryDataProtected.booleanValue();
    }

    public final int getLogLevel() {
        ConfigPayload.h logMetricsSettings;
        Integer errorLogLevel;
        ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final boolean getMetricsEnabled() {
        ConfigPayload.h logMetricsSettings;
        Boolean metricsEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    @NotNull
    public final String getMetricsEndpoint() {
        ConfigPayload.f fVar = endpoints;
        String str = null;
        String metricsEndpoint = fVar != null ? fVar.getMetricsEndpoint() : null;
        if (metricsEndpoint != null && metricsEndpoint.length() != 0) {
            str = metricsEndpoint;
        }
        return str == null ? b.DEFAULT_METRICS_ENDPOINT : str;
    }

    @Nullable
    public final q7.h getPlacement(@Nullable String str) {
        List<q7.h> list = placements;
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
            if (p.a(((q7.h) next).getReferenceId(), str)) {
                obj = next;
                break;
            }
        }
        return (q7.h) obj;
    }

    @Nullable
    public final String getRiEndpoint() {
        ConfigPayload.f fVar = endpoints;
        if (fVar != null) {
            return fVar.getRiEndpoint();
        }
        return null;
    }

    public final long getSessionTimeout() {
        Integer sessionTimeout;
        ConfigPayload configPayload = config;
        return ((configPayload == null || (sessionTimeout = configPayload.getSessionTimeout()) == null) ? DEFAULT_SESSION_TIMEOUT_SECONDS : sessionTimeout.intValue()) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        Integer signalSessionTimeout;
        ConfigPayload configPayload = config;
        return ((configPayload == null || (signalSessionTimeout = configPayload.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue()) * 1000;
    }

    @Nullable
    public final ConfigPayload.IABSettings.TcfStatus getTcfStatus() {
        ConfigPayload.i userPrivacy;
        ConfigPayload.IABSettings iab;
        ConfigPayload.IABSettings.TcfStatus.Companion aVar = ConfigPayload.IABSettings.TcfStatus.INSTANCE;
        ConfigPayload configPayload = config;
        return aVar.fromRawValue((configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final synchronized void initWithConfig$vungle_ads_release(@NotNull final Context context, @Nullable ConfigPayload configPayload, boolean z10, @Nullable y yVar) {
        try {
            p.e(context, "context");
            try {
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
                y8.h hVarA = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$1
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
                int iCheckConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(configPayload);
                if (iCheckConfigPayload$vungle_ads_release == 0) {
                    com.vungle.ads.internal.util.p.Companion.e(TAG, "Config is not available.");
                    return;
                }
                if (iCheckConfigPayload$vungle_ads_release == 1) {
                    if (!z10 && configPayload != null) {
                        Long configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp();
                        long jLongValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                        ConfigPayload configPayload2 = config;
                        if (configPayload2 != null) {
                            configPayload2.setConfigLastValidatedTimestamp(Long.valueOf(jLongValue));
                        }
                        ConfigPayload configPayload3 = config;
                        if (configPayload3 != null) {
                            INSTANCE.updateCachedConfig(configPayload3, m291initWithConfig$lambda2(hVarA));
                        }
                    }
                    return;
                }
                config = configPayload;
                endpoints = configPayload != null ? configPayload.getEndpoints() : null;
                placements = configPayload != null ? configPayload.getPlacements() : null;
                int logLevel = getLogLevel();
                boolean metricsEnabled = getMetricsEnabled();
                y8.h hVarA2 = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$2
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
                y8.h hVarA3 = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$3
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
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                analyticsClient.initOrUpdate$vungle_ads_release(m292initWithConfig$lambda4(hVarA2), m293initWithConfig$lambda5(hVarA3).getLoggerExecutor(), logLevel, metricsEnabled);
                if (!z10 && configPayload != null) {
                    updateCachedConfig(configPayload, m291initWithConfig$lambda2(hVarA));
                    String configExtension = configPayload.getConfigExtension();
                    if (configExtension != null) {
                        INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                    }
                }
                if (yVar != null) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, yVar, (o) null, (String) null, 6, (Object) null);
                }
                PrivacyManager.INSTANCE.updateDisableAdId(shouldDisableAdId());
            } catch (Exception e10) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "Error while validating config: " + e10.getMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean isCleverCacheEnabled() {
        ConfigPayload.c cleverCache;
        Boolean enabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (enabled = cleverCache.getEnabled()) == null) {
            return false;
        }
        return enabled.booleanValue();
    }

    public final boolean isReportIncentivizedEnabled() {
        Boolean boolIsReportIncentivizedEnabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (boolIsReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return boolIsReportIncentivizedEnabled.booleanValue();
    }

    public final boolean otEnabled() {
        Boolean enableOT;
        ConfigPayload configPayload = config;
        if (configPayload == null || (enableOT = configPayload.getEnableOT()) == null) {
            return true;
        }
        return enableOT.booleanValue();
    }

    @Nullable
    public final List<q7.h> placements() {
        return placements;
    }

    public final boolean retryPriorityTPATs() {
        Boolean retryPriorityTPATs;
        ConfigPayload configPayload = config;
        if (configPayload == null || (retryPriorityTPATs = configPayload.getRetryPriorityTPATs()) == null) {
            return false;
        }
        return retryPriorityTPATs.booleanValue();
    }

    public final boolean rtaDebuggingEnabled() {
        Boolean rtaDebugging;
        ConfigPayload configPayload = config;
        if (configPayload == null || (rtaDebugging = configPayload.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final void setAppId$vungle_ads_release(@NotNull String applicationId2) {
        p.e(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        ConfigPayload configPayload = config;
        if (configPayload == null || (disableAdId = configPayload.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean signalsDisabled() {
        Boolean signalsDisabled;
        ConfigPayload configPayload = config;
        if (configPayload == null || (signalsDisabled = configPayload.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final void updateCachedConfig(@NotNull ConfigPayload config2, @NotNull t7.b filePreferences) {
        p.e(config2, "config");
        p.e(filePreferences, "filePreferences");
        try {
            String str = applicationId;
            if (str == null) {
                p.t("applicationId");
                str = null;
            }
            filePreferences.put("config_app_id", str);
            filePreferences.put("config_update_time", System.currentTimeMillis());
            z9.a json = getJson();
            kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(json.a(), t.m(ConfigPayload.class));
            p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put("config_response", json.c(bVarB, config2));
            filePreferences.apply();
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Exception: " + e10.getMessage() + " for updating cached config");
        }
    }

    @VisibleForTesting
    public final void updateConfigExtension$vungle_ads_release(@NotNull final Context context, @NotNull String ext) {
        p.e(context, "context");
        p.e(ext, "ext");
        configExt = ext;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m294updateConfigExtension$lambda1(kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.ConfigManager$updateConfigExtension$$inlined$inject$1
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
        })).put("config_extension", ext).apply();
    }

    @VisibleForTesting
    public final boolean validateConfig$vungle_ads_release(@Nullable ConfigPayload configPayload) {
        return ((configPayload != null ? configPayload.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(configPayload.getEndpoints()) || configPayload.getPlacements() == null) ? false : true;
    }

    @VisibleForTesting
    public final boolean validateEndpoints$vungle_ads_release(@Nullable ConfigPayload.f fVar) {
        boolean z10;
        String adsEndpoint = fVar != null ? fVar.getAdsEndpoint() : null;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk$SDKError.Reason.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z10 = false;
        } else {
            z10 = true;
        }
        String riEndpoint = fVar != null ? fVar.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk$SDKError.Reason.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String metricsEndpoint = fVar != null ? fVar.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            new InvalidEndpointError(Sdk$SDKError.Reason.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        String errorLogsEndpoint = fVar != null ? fVar.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint != null && errorLogsEndpoint.length() != 0) {
            return z10;
        }
        com.vungle.ads.internal.util.p.Companion.e(TAG, "The error logging endpoint was not provided in the config.");
        return z10;
    }
}
