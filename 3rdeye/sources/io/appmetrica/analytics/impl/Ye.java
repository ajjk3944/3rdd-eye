package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Ye implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f40420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4485af f40422c;

    public Ye(C4485af c4485af, PluginErrorDetails pluginErrorDetails, String str) {
        this.f40422c = c4485af;
        this.f40420a = pluginErrorDetails;
        this.f40421b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC4739kb) this.f40422c.f40519d.get()).getPluginExtension().reportError(this.f40420a, this.f40421b);
    }
}
