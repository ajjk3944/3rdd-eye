package io.appmetrica.analytics.coreapi.internal.control;

/* loaded from: classes3.dex */
public interface Toggle {
    boolean getActualState();

    void registerObserver(ToggleObserver toggleObserver, boolean z10);

    void removeObserver(ToggleObserver toggleObserver);
}
