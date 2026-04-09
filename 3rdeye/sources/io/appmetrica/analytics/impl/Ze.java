package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Ze implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f40477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4485af f40478d;

    public Ze(C4485af c4485af, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f40478d = c4485af;
        this.f40475a = str;
        this.f40476b = str2;
        this.f40477c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC4739kb) this.f40478d.f40519d.get()).getPluginExtension().reportError(this.f40475a, this.f40476b, this.f40477c);
    }
}
