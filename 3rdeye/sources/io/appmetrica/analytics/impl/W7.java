package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class W7 implements InterfaceC4483ad {

    /* renamed from: a, reason: collision with root package name */
    public Location f40321a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f40322b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f40323c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f40324d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f40325e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f40326f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f40327g;

    /* renamed from: h, reason: collision with root package name */
    public String f40328h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public Gi f40329j;

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void a(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f40322b = boolValueOf;
        Gi gi = this.f40329j;
        if (gi != null) {
            gi.a(boolValueOf, this.f40324d, this.f40323c);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void b(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f40323c = boolValueOf;
        Gi gi = this.f40329j;
        if (gi != null) {
            gi.a(this.f40322b, this.f40324d, boolValueOf);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void clearAppEnvironment() {
        this.f40327g = true;
        this.f40325e.clear();
    }

    public final Location j() {
        return this.f40321a;
    }

    public final Boolean k() {
        return this.f40323c;
    }

    public final Boolean l() {
        return this.f40324d;
    }

    public final Boolean m() {
        return this.f40322b;
    }

    public final boolean n() {
        return this.f40327g;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f40325e.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void setDataSendingEnabled(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f40324d = boolValueOf;
        Gi gi = this.f40329j;
        if (gi != null) {
            gi.a(this.f40322b, boolValueOf, this.f40323c);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void setUserProfileID(String str) {
        this.f40328h = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void a(Location location) {
        this.f40321a = location;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4483ad
    public final void a(String str, String str2) {
        this.f40326f.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.i) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        builderNewConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        builderNewConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        builderNewConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC4623fo.a(appMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC4623fo.a(appMetricaConfig.dispatchPeriodSeconds)) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.appBuildNumber)) {
            builderNewConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.maxReportsCount)) {
            builderNewConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (AbstractC4623fo.a(appMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.advIdentifiersTracking)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.dataSendingEnabled)) {
            builderNewConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.anrMonitoring)) {
            builderNewConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.anrMonitoringTimeout)) {
            builderNewConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.crashTransformer)) {
            builderNewConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC4623fo.a(appMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC4623fo.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC4623fo.a(appMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC4623fo.a((Object) appMetricaConfig.customHosts)) {
            builderNewConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f40325e;
        if (!AbstractC4623fo.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC4623fo.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f40326f;
        if (!AbstractC4623fo.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC4623fo.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC4623fo.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                builderNewConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f40322b;
        if (appMetricaConfig.locationTracking == null && AbstractC4623fo.a(bool)) {
            builderNewConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f40321a;
        if (appMetricaConfig.location == null && AbstractC4623fo.a(location)) {
            builderNewConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f40324d;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC4623fo.a(bool2)) {
            builderNewConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC4623fo.a(appMetricaConfig.userProfileID) && AbstractC4623fo.a(this.f40328h)) {
            builderNewConfigBuilder.withUserProfileID(this.f40328h);
        }
        Boolean bool3 = this.f40323c;
        if (appMetricaConfig.advIdentifiersTracking == null && AbstractC4623fo.a(bool3)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.i = true;
        this.f40321a = null;
        this.f40322b = null;
        this.f40323c = null;
        this.f40324d = null;
        this.f40325e.clear();
        this.f40326f.clear();
        this.f40327g = false;
        this.f40328h = null;
        return builderNewConfigBuilder.build();
    }

    public final void a(Gi gi) {
        this.f40329j = gi;
    }
}
