package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface j0 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(l0 l0Var);

    void getAppInstanceId(l0 l0Var);

    void getCachedAppInstanceId(l0 l0Var);

    void getConditionalUserProperties(String str, String str2, l0 l0Var);

    void getCurrentScreenClass(l0 l0Var);

    void getCurrentScreenName(l0 l0Var);

    void getGmpAppId(l0 l0Var);

    void getMaxUserProperties(String str, l0 l0Var);

    void getSessionId(l0 l0Var);

    void getTestFlag(l0 l0Var, int i4);

    void getUserProperties(String str, String str2, boolean z3, l0 l0Var);

    void initForTests(Map map);

    void initialize(vb.a aVar, t0 t0Var, long j);

    void isDataCollectionEnabled(l0 l0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z10, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, l0 l0Var, long j);

    void logHealthData(int i4, String str, vb.a aVar, vb.a aVar2, vb.a aVar3);

    void onActivityCreated(vb.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(v0 v0Var, Bundle bundle, long j);

    void onActivityDestroyed(vb.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(v0 v0Var, long j);

    void onActivityPaused(vb.a aVar, long j);

    void onActivityPausedByScionActivityInfo(v0 v0Var, long j);

    void onActivityResumed(vb.a aVar, long j);

    void onActivityResumedByScionActivityInfo(v0 v0Var, long j);

    void onActivitySaveInstanceState(vb.a aVar, l0 l0Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(v0 v0Var, l0 l0Var, long j);

    void onActivityStarted(vb.a aVar, long j);

    void onActivityStartedByScionActivityInfo(v0 v0Var, long j);

    void onActivityStopped(vb.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(v0 v0Var, long j);

    void performAction(Bundle bundle, l0 l0Var, long j);

    void registerOnMeasurementEventListener(q0 q0Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(n0 n0Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(vb.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(v0 v0Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z3);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(q0 q0Var);

    void setInstanceIdProvider(s0 s0Var);

    void setMeasurementEnabled(boolean z3, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, vb.a aVar, boolean z3, long j);

    void unregisterOnMeasurementEventListener(q0 q0Var);
}
