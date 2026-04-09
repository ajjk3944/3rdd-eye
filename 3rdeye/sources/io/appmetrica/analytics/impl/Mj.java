package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Mj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f39875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39876b;

    public Mj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f39875a = pluginErrorDetails;
        this.f39876b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.getPluginExtension().reportError(this.f39875a, this.f39876b);
    }
}
