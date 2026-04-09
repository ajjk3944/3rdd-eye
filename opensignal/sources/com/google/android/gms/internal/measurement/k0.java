package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes.dex */
public interface k0 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(m0 m0Var);

    void getAppInstanceId(m0 m0Var);

    void getCachedAppInstanceId(m0 m0Var);

    void getConditionalUserProperties(String str, String str2, m0 m0Var);

    void getCurrentScreenClass(m0 m0Var);

    void getCurrentScreenName(m0 m0Var);

    void getGmpAppId(m0 m0Var);

    void getMaxUserProperties(String str, m0 m0Var);

    void getSessionId(m0 m0Var);

    void getTestFlag(m0 m0Var, int i10);

    void getUserProperties(String str, String str2, boolean z10, m0 m0Var);

    void initForTests(Map map);

    void initialize(jc.b bVar, zzdd zzddVar, long j);

    void isDataCollectionEnabled(m0 m0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, m0 m0Var, long j);

    void logHealthData(int i10, String str, jc.b bVar, jc.b bVar2, jc.b bVar3);

    void onActivityCreated(jc.b bVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j);

    void onActivityDestroyed(jc.b bVar, long j);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityPaused(jc.b bVar, long j);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityResumed(jc.b bVar, long j);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivitySaveInstanceState(jc.b bVar, m0 m0Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, m0 m0Var, long j);

    void onActivityStarted(jc.b bVar, long j);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityStopped(jc.b bVar, long j);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j);

    void performAction(Bundle bundle, m0 m0Var, long j);

    void registerOnMeasurementEventListener(r0 r0Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(o0 o0Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(jc.b bVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(r0 r0Var);

    void setInstanceIdProvider(t0 t0Var);

    void setMeasurementEnabled(boolean z10, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, jc.b bVar, boolean z10, long j);

    void unregisterOnMeasurementEventListener(r0 r0Var);
}
