package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Lj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f39793a;

    public Lj(PluginErrorDetails pluginErrorDetails) {
        this.f39793a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.getPluginExtension().reportUnhandledException(this.f39793a);
    }
}
