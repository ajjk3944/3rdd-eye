package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5137c implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5138d f42541a;

    public C5137c(C5138d c5138d) {
        this.f42541a = c5138d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = AbstractC5136b.f42539a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                activity.unregisterScreenCaptureCallback(C5138d.d(this.f42541a));
            } else {
                C5143i c5143i = this.f42541a.f42545c;
                if (c5143i == null || !c5143i.f42563a) {
                    return;
                }
                activity.registerScreenCaptureCallback(this.f42541a.f42543a.getContext().getMainExecutor(), C5138d.d(this.f42541a));
            }
        } catch (Throwable unused) {
        }
    }
}
