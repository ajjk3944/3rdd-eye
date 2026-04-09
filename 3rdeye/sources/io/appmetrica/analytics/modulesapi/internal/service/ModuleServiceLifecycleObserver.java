package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes3.dex */
public interface ModuleServiceLifecycleObserver {
    void onAllClientsDisconnected();

    void onFirstClientConnected();
}
