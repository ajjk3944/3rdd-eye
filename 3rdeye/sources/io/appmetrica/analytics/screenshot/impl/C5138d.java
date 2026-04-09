package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import b9.C2001h;
import b9.InterfaceC2000g;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5138d implements P {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f42543a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f42544b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C5143i f42545c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2000g f42546d = C2001h.b(new C5135a(this));

    public C5138d(ClientContext clientContext, Q q10) {
        this.f42543a = clientContext;
        this.f42544b = q10;
    }

    public static final Activity.ScreenCaptureCallback d(C5138d c5138d) {
        return O8.c.f(c5138d.f42546d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(C5146l c5146l) {
        this.f42545c = c5146l != null ? c5146l.f42571a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f42543a.getActivityLifecycleRegistry().registerListener(new C5137c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
