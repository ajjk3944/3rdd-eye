package io.appmetrica.analytics;

import android.location.Location;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC4526c4;
import io.appmetrica.analytics.impl.AbstractC4623fo;
import io.appmetrica.analytics.impl.AbstractC5122zb;
import io.appmetrica.analytics.impl.C4599f0;
import io.appmetrica.analytics.impl.C5109yn;
import io.appmetrica.analytics.impl.G5;
import io.appmetrica.analytics.impl.V7;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AppMetricaConfig {
    public final Map<String, Object> additionalConfig;
    public final Boolean advIdentifiersTracking;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;
    public final String apiKey;
    public final Integer appBuildNumber;
    public final Map<String, String> appEnvironment;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final ICrashTransformer crashTransformer;
    public final List<String> customHosts;
    public final Boolean dataSendingEnabled;
    public final String deviceType;
    public final Integer dispatchPeriodSeconds;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: D, reason: collision with root package name */
        private static final C5109yn f38711D = new C5109yn(new C4599f0());

        /* renamed from: A, reason: collision with root package name */
        private Integer f38712A;

        /* renamed from: B, reason: collision with root package name */
        private List f38713B;

        /* renamed from: C, reason: collision with root package name */
        private final HashMap f38714C;

        /* renamed from: a, reason: collision with root package name */
        private final G5 f38715a;

        /* renamed from: b, reason: collision with root package name */
        private final String f38716b;

        /* renamed from: c, reason: collision with root package name */
        private String f38717c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f38718d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f38719e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f38720f;

        /* renamed from: g, reason: collision with root package name */
        private Location f38721g;

        /* renamed from: h, reason: collision with root package name */
        private Boolean f38722h;
        private Boolean i;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f38723j;

        /* renamed from: k, reason: collision with root package name */
        private PreloadInfo f38724k;

        /* renamed from: l, reason: collision with root package name */
        private Boolean f38725l;

        /* renamed from: m, reason: collision with root package name */
        private Boolean f38726m;

        /* renamed from: n, reason: collision with root package name */
        private Integer f38727n;

        /* renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f38728o;

        /* renamed from: p, reason: collision with root package name */
        private String f38729p;

        /* renamed from: q, reason: collision with root package name */
        private Boolean f38730q;

        /* renamed from: r, reason: collision with root package name */
        private Boolean f38731r;

        /* renamed from: s, reason: collision with root package name */
        private Boolean f38732s;

        /* renamed from: t, reason: collision with root package name */
        private String f38733t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f38734u;

        /* renamed from: v, reason: collision with root package name */
        private Integer f38735v;

        /* renamed from: w, reason: collision with root package name */
        private Integer f38736w;

        /* renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f38737x;

        /* renamed from: y, reason: collision with root package name */
        private ICrashTransformer f38738y;

        /* renamed from: z, reason: collision with root package name */
        private Boolean f38739z;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        public Builder handleFirstActivationAsUpdate(boolean z10) {
            this.f38725l = Boolean.valueOf(z10);
            return this;
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f38714C.put(str, obj);
            return this;
        }

        public Builder withAdvIdentifiersTracking(boolean z10) {
            this.i = Boolean.valueOf(z10);
            return this;
        }

        public Builder withAnrMonitoring(boolean z10) {
            this.f38739z = Boolean.valueOf(z10);
            return this;
        }

        public Builder withAnrMonitoringTimeout(int i) {
            this.f38712A = Integer.valueOf(i);
            return this;
        }

        public Builder withAppBuildNumber(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f38734u = Integer.valueOf(i);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f38737x.put(str, str2);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z10) {
            this.f38732s = Boolean.valueOf(z10);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f38717c = str;
            return this;
        }

        public Builder withCrashReporting(boolean z10) {
            this.f38719e = Boolean.valueOf(z10);
            return this;
        }

        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.f38738y = iCrashTransformer;
            return this;
        }

        public Builder withCustomHosts(List<String> list) {
            this.f38713B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z10) {
            this.f38726m = Boolean.valueOf(z10);
            return this;
        }

        public Builder withDeviceType(String str) {
            this.f38733t = str;
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i) {
            this.f38735v = Integer.valueOf(i);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f38728o.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f38721g = location;
            return this;
        }

        public Builder withLocationTracking(boolean z10) {
            this.f38722h = Boolean.valueOf(z10);
            return this;
        }

        public Builder withLogs() {
            this.f38723j = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i) {
            this.f38736w = Integer.valueOf(i);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f38727n = Integer.valueOf(this.f38715a.a(i));
            return this;
        }

        public Builder withNativeCrashReporting(boolean z10) {
            this.f38720f = Boolean.valueOf(z10);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f38724k = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z10) {
            this.f38730q = Boolean.valueOf(z10);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f38718d = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z10) {
            this.f38731r = Boolean.valueOf(z10);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f38729p = str;
            return this;
        }

        private Builder(String str) {
            this.f38728o = new LinkedHashMap();
            this.f38737x = new LinkedHashMap();
            this.f38714C = new HashMap();
            f38711D.a(str);
            this.f38715a = new G5(str);
            this.f38716b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        HashMap mapC;
        HashMap mapC2;
        new V7();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Builder builderNewConfigBuilder = newConfigBuilder(jSONObject.getString("apikey"));
            if (jSONObject.has("app_version")) {
                builderNewConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
            }
            if (jSONObject.has("session_timeout")) {
                builderNewConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
            }
            builderNewConfigBuilder.withLocation(AbstractC4526c4.a(jSONObject.optString("location")));
            builderNewConfigBuilder.withPreloadInfo(AbstractC4526c4.b(jSONObject.optString("preload_info")));
            if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                builderNewConfigBuilder.withLogs();
            }
            if (jSONObject.has("crash_enabled")) {
                builderNewConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
            }
            if (jSONObject.has("crash_native_enabled")) {
                builderNewConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
            }
            if (jSONObject.has("location_enabled")) {
                builderNewConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
            }
            if (jSONObject.has("adv_identifiers_tracking")) {
                builderNewConfigBuilder.withAdvIdentifiersTracking(jSONObject.optBoolean("adv_identifiers_tracking", true));
            }
            if (jSONObject.has("max_reports_in_db_count")) {
                builderNewConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
            }
            if (jSONObject.has("error_environment") && (mapC2 = AbstractC5122zb.c(jSONObject.optString("error_environment"))) != null) {
                for (Map.Entry entry : mapC2.entrySet()) {
                    builderNewConfigBuilder.withErrorEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (jSONObject.has("first_activation_as_update")) {
                builderNewConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
            }
            if (jSONObject.has("data_sending_enabled")) {
                builderNewConfigBuilder.withDataSendingEnabled(jSONObject.optBoolean("data_sending_enabled"));
            }
            if (jSONObject.has("user_profile_id")) {
                builderNewConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", null));
            }
            if (jSONObject.has("revenue_auto_tracking_enabled")) {
                builderNewConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
            }
            if (jSONObject.has("sessions_auto_tracking_enabled")) {
                builderNewConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
            }
            if (jSONObject.has("app_open_tracking_enabled")) {
                builderNewConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean("app_open_tracking_enabled"));
            }
            if (jSONObject.has(CommonUrlParts.DEVICE_TYPE)) {
                builderNewConfigBuilder.withDeviceType(jSONObject.optString(CommonUrlParts.DEVICE_TYPE));
            }
            if (jSONObject.has(CommonUrlParts.APP_VERSION_CODE)) {
                builderNewConfigBuilder.withAppBuildNumber(jSONObject.optInt(CommonUrlParts.APP_VERSION_CODE));
            }
            if (jSONObject.has("dispatch_period_seconds")) {
                builderNewConfigBuilder.withDispatchPeriodSeconds(jSONObject.optInt("dispatch_period_seconds"));
            }
            if (jSONObject.has("max_reports_count")) {
                builderNewConfigBuilder.withMaxReportsCount(jSONObject.optInt("max_reports_count"));
            }
            if (jSONObject.has("app_environment") && (mapC = AbstractC5122zb.c(jSONObject.optString("app_environment"))) != null) {
                for (Map.Entry entry2 : mapC.entrySet()) {
                    builderNewConfigBuilder.withAppEnvironmentValue((String) entry2.getKey(), (String) entry2.getValue());
                }
            }
            if (jSONObject.has("anr_monitoring")) {
                builderNewConfigBuilder.withAnrMonitoring(jSONObject.optBoolean("anr_monitoring"));
            }
            if (jSONObject.has("anr_monitoring_timeout")) {
                builderNewConfigBuilder.withAnrMonitoringTimeout(jSONObject.optInt("anr_monitoring_timeout"));
            }
            if (jSONObject.has("customHosts")) {
                builderNewConfigBuilder.withCustomHosts(AbstractC5122zb.a(jSONObject.optJSONArray("customHosts")));
            }
            if (jSONObject.has("additional_config")) {
                jSONObject.optJSONObject("additional_config");
            }
            return builderNewConfigBuilder.build();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    public String toJson() {
        String string;
        new V7();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", this.apiKey);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("session_timeout", this.sessionTimeout);
            jSONObject.put("location", AbstractC4526c4.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo == null) {
                string = null;
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject2.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    string = jSONObject2.toString();
                } catch (Throwable unused) {
                }
            }
            jSONObject.put("preload_info", string);
            jSONObject.put("logs", this.logs);
            jSONObject.put("crash_enabled", this.crashReporting);
            jSONObject.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject.put("location_enabled", this.locationTracking);
            jSONObject.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map = this.errorEnvironment;
            jSONObject.put("error_environment", map == null ? null : new JSONObject(map));
            jSONObject.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject.put("user_profile_id", this.userProfileID);
            jSONObject.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map2 = this.appEnvironment;
            jSONObject.put("app_environment", map2 == null ? null : new JSONObject(map2));
            jSONObject.put("anr_monitoring", this.anrMonitoring);
            jSONObject.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            List<String> list = this.customHosts;
            if (list != null) {
                if (!AbstractC4623fo.a((Collection) list)) {
                    jSONArray = new JSONArray((Collection) list);
                }
                jSONObject.put("customHosts", jSONArray);
            }
            jSONObject.put("additional_config", new JSONObject());
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f38716b;
        this.appVersion = builder.f38717c;
        this.sessionTimeout = builder.f38718d;
        this.crashReporting = builder.f38719e;
        this.nativeCrashReporting = builder.f38720f;
        this.location = builder.f38721g;
        this.locationTracking = builder.f38722h;
        this.advIdentifiersTracking = builder.i;
        this.logs = builder.f38723j;
        this.preloadInfo = builder.f38724k;
        this.firstActivationAsUpdate = builder.f38725l;
        this.dataSendingEnabled = builder.f38726m;
        this.maxReportsInDatabaseCount = builder.f38727n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f38728o);
        this.userProfileID = builder.f38729p;
        this.revenueAutoTrackingEnabled = builder.f38730q;
        this.sessionsAutoTrackingEnabled = builder.f38731r;
        this.appOpenTrackingEnabled = builder.f38732s;
        this.deviceType = builder.f38733t;
        this.appBuildNumber = builder.f38734u;
        this.dispatchPeriodSeconds = builder.f38735v;
        this.maxReportsCount = builder.f38736w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f38737x);
        this.crashTransformer = builder.f38738y;
        this.anrMonitoring = builder.f38739z;
        this.anrMonitoringTimeout = builder.f38712A;
        this.customHosts = builder.f38713B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f38714C);
    }

    public AppMetricaConfig(AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
