package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* loaded from: classes3.dex */
public final class d0 implements P {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f42547a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f42548b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f42549c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f42550d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C5147m f42551e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f42552f = new a0(this);

    public d0(ClientContext clientContext, Q q10) {
        this.f42547a = clientContext;
        this.f42548b = q10;
        this.f42549c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(C5146l c5146l) {
        this.f42551e = c5146l != null ? c5146l.f42572b : null;
    }

    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        this.f42547a.getActivityLifecycleRegistry().registerListener(new c0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
