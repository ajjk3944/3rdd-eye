package io.appmetrica.analytics.coreapi.internal.cache;

/* loaded from: classes3.dex */
public interface CacheUpdateScheduler {
    void onStateUpdated();

    void scheduleUpdateIfNeededNow();
}
