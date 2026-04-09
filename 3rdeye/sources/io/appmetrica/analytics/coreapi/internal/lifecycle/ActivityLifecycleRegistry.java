package io.appmetrica.analytics.coreapi.internal.lifecycle;

/* loaded from: classes3.dex */
public interface ActivityLifecycleRegistry {
    void registerListener(ActivityLifecycleListener activityLifecycleListener, ActivityEvent... activityEventArr);

    void unregisterListener(ActivityLifecycleListener activityLifecycleListener, ActivityEvent... activityEventArr);
}
