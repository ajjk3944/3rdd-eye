package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C4274c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C4274c f34809e = new ComponentCallbacks2C4274c();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f34810a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f34811b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f34812c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f34813d = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface a {
        void a(boolean z10);
    }

    private ComponentCallbacks2C4274c() {
    }

    public static ComponentCallbacks2C4274c b() {
        return f34809e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C4274c componentCallbacks2C4274c = f34809e;
        synchronized (componentCallbacks2C4274c) {
            try {
                if (!componentCallbacks2C4274c.f34813d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C4274c);
                    application.registerComponentCallbacks(componentCallbacks2C4274c);
                    componentCallbacks2C4274c.f34813d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f34809e) {
            try {
                Iterator it = this.f34812c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f34809e) {
            this.f34812c.add(aVar);
        }
    }

    public boolean d() {
        return this.f34810a.get();
    }

    public boolean e(boolean z10) {
        if (!this.f34811b.get()) {
            if (com.google.android.gms.common.util.n.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f34811b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f34810a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f34811b;
        boolean zCompareAndSet = this.f34810a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f34811b;
        boolean zCompareAndSet = this.f34810a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f34810a.compareAndSet(false, true)) {
            this.f34811b.set(true);
            f(true);
        }
    }
}
