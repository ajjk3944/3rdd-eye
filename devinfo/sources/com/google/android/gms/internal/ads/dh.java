package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dh implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Activity f10473a;

    /* renamed from: b, reason: collision with root package name */
    public Application f10474b;

    /* renamed from: h, reason: collision with root package name */
    public s f10479h;
    public long j;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10475c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10476d = new AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public boolean f10477e = false;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10478f = new ArrayList();
    public final ArrayList g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f10480i = false;

    public final void a(eh ehVar) {
        synchronized (this.f10475c) {
            this.f10478f.add(ehVar);
        }
    }

    public final void b(eh ehVar) {
        synchronized (this.f10475c) {
            this.f10478f.remove(ehVar);
        }
    }

    public final void c(ad0 ad0Var) {
        synchronized (this.f10475c) {
            this.g.add(ad0Var);
        }
    }

    public final void d(Activity activity) {
        synchronized (this.f10475c) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f10473a = activity;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f10475c) {
            try {
                Activity activity2 = this.f10473a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f10473a = null;
                }
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    try {
                        ((ad0) obj).d();
                    } catch (Exception e2) {
                        ua.j.C.f35265h.f("AppActivityTracker.ActivityListener.onActivityDestroyed", e2);
                        za.i.f("", e2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        d(activity);
        synchronized (this.f10475c) {
            ArrayList arrayList = this.g;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                try {
                    ((ad0) obj).c();
                } catch (Exception e2) {
                    ua.j.C.f35265h.f("AppActivityTracker.ActivityListener.onActivityPaused", e2);
                    za.i.f("", e2);
                }
            }
        }
        this.f10477e = true;
        s sVar = this.f10479h;
        if (sVar != null) {
            ya.f0.f37440l.removeCallbacks(sVar);
        }
        ya.b0 b0Var = ya.f0.f37440l;
        s sVar2 = new s(8, this);
        this.f10479h = sVar2;
        b0Var.postDelayed(sVar2, this.j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(activity);
        int i4 = 0;
        this.f10477e = false;
        boolean andSet = this.f10476d.getAndSet(true);
        s sVar = this.f10479h;
        if (sVar != null) {
            ya.f0.f37440l.removeCallbacks(sVar);
        }
        synchronized (this.f10475c) {
            ArrayList arrayList = this.g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    ((ad0) obj).b();
                } catch (Exception e2) {
                    ua.j.C.f35265h.f("AppActivityTracker.ActivityListener.onActivityResumed", e2);
                    za.i.f("", e2);
                }
            }
            if (andSet) {
                za.i.c("App is still foreground.");
            } else {
                ArrayList arrayList2 = this.f10478f;
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    try {
                        ((eh) obj2).S(true);
                    } catch (Exception e10) {
                        za.i.f("", e10);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
