package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f39464a = C5065x4.l().g().a();

    /* renamed from: b, reason: collision with root package name */
    public final C4986u0 f39465b;

    /* renamed from: c, reason: collision with root package name */
    public final C4537cf f39466c;

    /* renamed from: d, reason: collision with root package name */
    public final C4614ff f39467d;

    public G0() {
        C4986u0 c4986u0 = new C4986u0();
        this.f39465b = c4986u0;
        this.f39466c = new C4537cf(c4986u0);
        this.f39467d = new C4614ff();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        C4537cf c4537cf = this.f39466c;
        c4537cf.f40628a.a(null);
        c4537cf.f40629b.a(pluginErrorDetails);
        C4614ff c4614ff = this.f39467d;
        kotlin.jvm.internal.l.c(pluginErrorDetails);
        c4614ff.getClass();
        this.f39464a.execute(new B.a(24, this, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        C4537cf c4537cf = this.f39466c;
        c4537cf.f40628a.a(null);
        c4537cf.f40629b.a(pluginErrorDetails);
        if (c4537cf.f40631d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f41158a) {
            C4614ff c4614ff = this.f39467d;
            kotlin.jvm.internal.l.c(pluginErrorDetails);
            c4614ff.getClass();
            this.f39464a.execute(new J4.h(this, pluginErrorDetails, str, 19));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C4537cf c4537cf = this.f39466c;
        c4537cf.f40628a.a(null);
        c4537cf.f40630c.a(str);
        C4614ff c4614ff = this.f39467d;
        kotlin.jvm.internal.l.c(str);
        c4614ff.getClass();
        this.f39464a.execute(new D3.a(this, str, str2, pluginErrorDetails, 8));
    }

    public static final void a(G0 g02, PluginErrorDetails pluginErrorDetails, String str) {
        g02.f39465b.getClass();
        C4961t0 c4961t0 = C4961t0.f41657e;
        kotlin.jvm.internal.l.c(c4961t0);
        Cc ccI = c4961t0.f().i();
        kotlin.jvm.internal.l.c(ccI);
        ccI.f39254a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(G0 g02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        g02.f39465b.getClass();
        C4961t0 c4961t0 = C4961t0.f41657e;
        kotlin.jvm.internal.l.c(c4961t0);
        Cc ccI = c4961t0.f().i();
        kotlin.jvm.internal.l.c(ccI);
        ccI.f39254a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(G0 g02, PluginErrorDetails pluginErrorDetails) {
        g02.f39465b.getClass();
        C4961t0 c4961t0 = C4961t0.f41657e;
        kotlin.jvm.internal.l.c(c4961t0);
        Cc ccI = c4961t0.f().i();
        kotlin.jvm.internal.l.c(ccI);
        ccI.f39254a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
