package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC4885q1;
import io.appmetrica.analytics.impl.C4859p1;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AppMetrica {
    public static void activate(Context context, AppMetricaConfig appMetricaConfig) {
        AbstractC4885q1.f41448a.a(context, appMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        AbstractC4885q1.f41448a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC4885q1.f41448a.a();
    }

    public static void enableActivityAutoTracking(Application application) {
        AbstractC4885q1.f41448a.a(application);
    }

    public static String getDeviceId(Context context) {
        return AbstractC4885q1.f41448a.b();
    }

    public static int getLibraryApiLevel() {
        return 115;
    }

    public static String getLibraryVersion() {
        return "7.9.0";
    }

    public static AppMetricaPlugins getPluginExtension() {
        return F0.f39394a;
    }

    public static IReporter getReporter(Context context, String str) {
        return AbstractC4885q1.f41448a.a(context, str);
    }

    public static String getUuid(Context context) {
        return AbstractC4885q1.f41448a.a(context).id;
    }

    public static void initWebViewReporting(WebView webView) {
        AbstractC4885q1.f41448a.a(webView);
    }

    public static void pauseSession(Activity activity) {
        AbstractC4885q1.f41448a.a(activity);
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        AbstractC4885q1.f41448a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        AbstractC4885q1.f41448a.b(str, str2);
    }

    public static void registerAnrListener(AnrListener anrListener) {
        AbstractC4885q1.f41448a.a(anrListener);
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        AbstractC4885q1.f41448a.a(adRevenue);
    }

    public static void reportAnr(Map<Thread, StackTraceElement[]> map) {
        AbstractC4885q1.f41448a.a(map);
    }

    public static void reportAppOpen(Activity activity) {
        AbstractC4885q1.f41448a.b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        AbstractC4885q1.f41448a.a(eCommerceEvent);
    }

    public static void reportError(String str, String str2) {
        AbstractC4885q1.f41448a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(String str) {
        AbstractC4885q1.f41448a.b(str);
    }

    public static void reportExternalAdRevenue(Object... objArr) {
        AbstractC4885q1.f41448a.b(objArr);
    }

    public static void reportExternalAttribution(ExternalAttribution externalAttribution) {
        AbstractC4885q1.f41448a.a(externalAttribution);
    }

    public static void reportReferralUrl(String str) {
        AbstractC4885q1.f41448a.d(str);
    }

    public static void reportRevenue(Revenue revenue) {
        AbstractC4885q1.f41448a.a(revenue);
    }

    public static void reportUnhandledException(Throwable th) {
        AbstractC4885q1.f41448a.a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        AbstractC4885q1.f41448a.a(userProfile);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC4885q1.f41448a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC4885q1.f41448a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        C4859p1 c4859p1 = AbstractC4885q1.f41448a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c4859p1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        AbstractC4885q1.f41448a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC4885q1.f41448a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        AbstractC4885q1.f41448a.a(z10);
    }

    public static void setDataSendingEnabled(boolean z10) {
        AbstractC4885q1.f41448a.b(z10);
    }

    public static void setLocation(Location location) {
        AbstractC4885q1.f41448a.a(location);
    }

    public static void setLocationTracking(boolean z10) {
        AbstractC4885q1.f41448a.c(z10);
    }

    public static void setUserProfileID(String str) {
        AbstractC4885q1.f41448a.e(str);
    }

    public static void reportAppOpen(Intent intent) {
        AbstractC4885q1.f41448a.a(intent);
    }

    public static void reportError(String str, String str2, Throwable th) {
        AbstractC4885q1.f41448a.a(str, str2, th);
    }

    public static void reportEvent(String str, String str2) {
        AbstractC4885q1.f41448a.c(str, str2);
    }

    public static void reportAppOpen(String str) {
        AbstractC4885q1.f41448a.a(str);
    }

    public static void reportError(String str, Throwable th) {
        AbstractC4885q1.f41448a.a(str, th);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        AbstractC4885q1.f41448a.a(str, map);
    }
}
