package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import c9.C2099t;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f42538a;

    public a0(d0 d0Var) {
        this.f42538a = d0Var;
    }

    public static final Boolean a(d0 d0Var, a0 a0Var, C5147m c5147m, ActivityManager activityManager) throws SecurityException {
        Object next;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = C2099t.f18581b;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.b(((ActivityManager.RunningServiceInfo) next).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) next) != null) {
            ((C5155v) d0Var.f42548b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(d0Var.f42549c.postDelayed(a0Var, TimeUnit.SECONDS.toMillis(c5147m.f42575b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5147m c5147m = this.f42538a.f42551e;
        if (this.f42538a.f42550d || c5147m == null || !c5147m.f42574a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f42538a.f42547a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new D3.b(this.f42538a, this, c5147m, 4));
    }
}
