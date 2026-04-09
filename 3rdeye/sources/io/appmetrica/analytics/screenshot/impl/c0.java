package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes3.dex */
public final class c0 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f42542a;

    public c0(d0 d0Var) {
        this.f42542a = d0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = b0.f42540a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.f42542a.f42550d = true;
                return;
            }
            C5147m c5147m = this.f42542a.f42551e;
            if (c5147m == null || !c5147m.f42574a) {
                return;
            }
            this.f42542a.f42550d = false;
            d0 d0Var = this.f42542a;
            d0Var.f42549c.postDelayed(d0Var.f42552f, 0L);
        } catch (Throwable unused) {
        }
    }
}
