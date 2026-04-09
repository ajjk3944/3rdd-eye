package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import t2.C2911G;
import t2.HandlerC2908D;

/* loaded from: classes.dex */
public final class S7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Activity f11130a;

    /* renamed from: b, reason: collision with root package name */
    public Application f11131b;

    /* renamed from: h, reason: collision with root package name */
    public RunnableC1883t f11137h;

    /* renamed from: j, reason: collision with root package name */
    public long f11138j;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11132c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f11133d = new AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public boolean f11134e = false;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11135f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f11136g = new ArrayList();
    public boolean i = false;

    public final void a(T7 t7) {
        synchronized (this.f11132c) {
            this.f11135f.add(t7);
        }
    }

    public final void b(T7 t7) {
        synchronized (this.f11132c) {
            this.f11135f.remove(t7);
        }
    }

    public final void c(C0495En c0495En) {
        synchronized (this.f11132c) {
            this.f11136g.add(c0495En);
        }
    }

    public final void d(Activity activity) {
        synchronized (this.f11132c) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f11130a = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f11132c) {
            try {
                Activity activity2 = this.f11130a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f11130a = null;
                }
                ArrayList arrayList = this.f11136g;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        ((C0495En) obj).d();
                    } catch (Exception e6) {
                        p2.j.f22785C.f22795h.f("AppActivityTracker.ActivityListener.onActivityDestroyed", e6);
                        u2.k.f("", e6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        d(activity);
        synchronized (this.f11132c) {
            ArrayList arrayList = this.f11136g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                try {
                    ((C0495En) obj).c();
                } catch (Exception e6) {
                    p2.j.f22785C.f22795h.f("AppActivityTracker.ActivityListener.onActivityPaused", e6);
                    u2.k.f("", e6);
                }
            }
        }
        this.f11134e = true;
        RunnableC1883t runnableC1883t = this.f11137h;
        if (runnableC1883t != null) {
            C2911G.f23576l.removeCallbacks(runnableC1883t);
        }
        HandlerC2908D handlerC2908D = C2911G.f23576l;
        RunnableC1883t runnableC1883t2 = new RunnableC1883t(9, this);
        this.f11137h = runnableC1883t2;
        handlerC2908D.postDelayed(runnableC1883t2, this.f11138j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(activity);
        int i = 0;
        this.f11134e = false;
        boolean andSet = this.f11133d.getAndSet(true);
        RunnableC1883t runnableC1883t = this.f11137h;
        if (runnableC1883t != null) {
            C2911G.f23576l.removeCallbacks(runnableC1883t);
        }
        synchronized (this.f11132c) {
            ArrayList arrayList = this.f11136g;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                try {
                    ((C0495En) obj).b();
                } catch (Exception e6) {
                    p2.j.f22785C.f22795h.f("AppActivityTracker.ActivityListener.onActivityResumed", e6);
                    u2.k.f("", e6);
                }
            }
            if (andSet) {
                u2.k.c("App is still foreground.");
            } else {
                ArrayList arrayList2 = this.f11135f;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    try {
                        ((T7) obj2).g0(true);
                    } catch (Exception e7) {
                        u2.k.f("", e7);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
