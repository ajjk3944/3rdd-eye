package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Xe implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f40386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4485af f40387b;

    public Xe(C4485af c4485af, PluginErrorDetails pluginErrorDetails) {
        this.f40387b = c4485af;
        this.f40386a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC4739kb) this.f40387b.f40519d.get()).getPluginExtension().reportUnhandledException(this.f40386a);
    }
}
