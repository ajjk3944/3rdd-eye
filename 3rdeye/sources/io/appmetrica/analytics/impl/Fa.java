package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* loaded from: classes3.dex */
public final class Fa implements InterfaceC4878pk {
    @Override // io.appmetrica.analytics.impl.InterfaceC4878pk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4878pk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
