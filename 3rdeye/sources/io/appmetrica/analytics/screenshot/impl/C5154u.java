package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5154u implements P {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f42584a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f42585b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C5144j f42586c;

    /* renamed from: d, reason: collision with root package name */
    public final W f42587d;

    public C5154u(ClientContext clientContext, Q q10) {
        this.f42584a = clientContext;
        this.f42585b = q10;
        this.f42587d = new W(clientContext, new r(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(C5146l c5146l) {
        this.f42586c = c5146l != null ? c5146l.f42573c : null;
        this.f42587d.f42534c = this.f42586c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        this.f42584a.getActivityLifecycleRegistry().registerListener(new C5153t(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
