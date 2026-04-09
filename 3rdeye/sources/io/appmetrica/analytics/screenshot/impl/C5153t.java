package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5153t implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5154u f42583a;

    public C5153t(C5154u c5154u) {
        this.f42583a = c5154u;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i = AbstractC5152s.f42582a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.f42583a.f42584a.getContext().getContentResolver().unregisterContentObserver(this.f42583a.f42587d);
            } else {
                C5144j c5144j = this.f42583a.f42586c;
                if (c5144j == null || !c5144j.f42566a) {
                    return;
                }
                this.f42583a.f42584a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f42583a.f42587d);
            }
        } catch (Throwable unused) {
        }
    }
}
