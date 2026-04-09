package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes3.dex */
public final class Nj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f39910c;

    public Nj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f39908a = str;
        this.f39909b = str2;
        this.f39910c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.getPluginExtension().reportError(this.f39908a, this.f39909b, this.f39910c);
    }
}
