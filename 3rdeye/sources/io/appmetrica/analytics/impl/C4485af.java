package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4485af implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final C4563df f40516a = new C4563df();

    /* renamed from: b, reason: collision with root package name */
    public final C4588ef f40517b = new C4588ef();

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f40518c = C5065x4.l().g().a();

    /* renamed from: d, reason: collision with root package name */
    public final Provider f40519d;

    public C4485af(Provider<InterfaceC4739kb> provider) {
        this.f40519d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C4563df c4563df = this.f40516a;
        c4563df.f40743a.a(pluginErrorDetails);
        if (c4563df.f40745c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f41158a) {
            this.f40517b.getClass();
            this.f40518c.execute(new Ye(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f40516a.f40743a.a(pluginErrorDetails);
        this.f40517b.getClass();
        this.f40518c.execute(new Xe(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f40516a.f40744b.a(str);
        this.f40517b.getClass();
        this.f40518c.execute(new Ze(this, str, str2, pluginErrorDetails));
    }
}
