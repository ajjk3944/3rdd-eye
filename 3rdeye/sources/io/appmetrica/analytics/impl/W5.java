package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes3.dex */
public final class W5 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X5 f40316a;

    public W5(X5 x52) {
        this.f40316a = x52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = V5.f40279a[activityEvent.ordinal()];
        if (i == 1) {
            this.f40316a.f40373b.resumeSession();
        } else {
            if (i != 2) {
                return;
            }
            this.f40316a.f40373b.pauseSession();
        }
    }
}
