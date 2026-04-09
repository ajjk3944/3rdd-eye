package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

/* loaded from: classes3.dex */
public interface ApplicationStateProvider {
    ApplicationState getCurrentState();

    ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver);
}
