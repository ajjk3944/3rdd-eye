package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public interface P0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(U0 u02);

    void getAppInstanceId(U0 u02);

    void getCachedAppInstanceId(U0 u02);

    void getConditionalUserProperties(String str, String str2, U0 u02);

    void getCurrentScreenClass(U0 u02);

    void getCurrentScreenName(U0 u02);

    void getGmpAppId(U0 u02);

    void getMaxUserProperties(String str, U0 u02);

    void getSessionId(U0 u02);

    void getTestFlag(U0 u02, int i10);

    void getUserProperties(String str, String str2, boolean z10, U0 u02);

    void initForTests(Map map);

    void initialize(InterfaceC8420a interfaceC8420a, C4326d1 c4326d1, long j10);

    void isDataCollectionEnabled(U0 u02);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, U0 u02, long j10);

    void logHealthData(int i10, String str, InterfaceC8420a interfaceC8420a, InterfaceC8420a interfaceC8420a2, InterfaceC8420a interfaceC8420a3);

    void onActivityCreated(InterfaceC8420a interfaceC8420a, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(C4353g1 c4353g1, Bundle bundle, long j10);

    void onActivityDestroyed(InterfaceC8420a interfaceC8420a, long j10);

    void onActivityDestroyedByScionActivityInfo(C4353g1 c4353g1, long j10);

    void onActivityPaused(InterfaceC8420a interfaceC8420a, long j10);

    void onActivityPausedByScionActivityInfo(C4353g1 c4353g1, long j10);

    void onActivityResumed(InterfaceC8420a interfaceC8420a, long j10);

    void onActivityResumedByScionActivityInfo(C4353g1 c4353g1, long j10);

    void onActivitySaveInstanceState(InterfaceC8420a interfaceC8420a, U0 u02, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(C4353g1 c4353g1, U0 u02, long j10);

    void onActivityStarted(InterfaceC8420a interfaceC8420a, long j10);

    void onActivityStartedByScionActivityInfo(C4353g1 c4353g1, long j10);

    void onActivityStopped(InterfaceC8420a interfaceC8420a, long j10);

    void onActivityStoppedByScionActivityInfo(C4353g1 c4353g1, long j10);

    void performAction(Bundle bundle, U0 u02, long j10);

    void registerOnMeasurementEventListener(InterfaceC4299a1 interfaceC4299a1);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(V0 v02);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(InterfaceC8420a interfaceC8420a, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(C4353g1 c4353g1, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC4299a1 interfaceC4299a1);

    void setInstanceIdProvider(InterfaceC4308b1 interfaceC4308b1);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, InterfaceC8420a interfaceC8420a, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(InterfaceC4299a1 interfaceC4299a1);
}
