package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import b9.C1992A;

/* renamed from: com.yandex.mobile.ads.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4146l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4146l0 f29836a = new C4146l0();

    /* renamed from: b, reason: collision with root package name */
    private static C4153m0 f29837b;

    private C4146l0() {
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        synchronized (f29836a) {
            try {
                if (f29837b == null) {
                    Context applicationContext = context.getApplicationContext();
                    Activity activity = null;
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        Activity activity2 = context instanceof Activity ? (Activity) context : null;
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            activity = activity2;
                        }
                        C4153m0 c4153m0 = new C4153m0(new C4167o0(activity));
                        f29837b = c4153m0;
                        application.registerActivityLifecycleCallbacks(c4153m0);
                    }
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Activity b() {
        Activity activityB;
        synchronized (f29836a) {
            C4153m0 c4153m0 = f29837b;
            activityB = c4153m0 != null ? c4153m0.b() : null;
        }
        return activityB;
    }

    public static final Activity a() {
        Activity activityA;
        synchronized (f29836a) {
            C4153m0 c4153m0 = f29837b;
            activityA = c4153m0 != null ? c4153m0.a() : null;
        }
        return activityA;
    }
}
