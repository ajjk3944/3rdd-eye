package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vv1 implements Application.ActivityLifecycleCallbacks {
    public Activity f;
    public Application g;
    public fu1 m;
    public long o;
    public final Object h = new Object();
    public final AtomicBoolean i = new AtomicBoolean(true);
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public boolean n = false;

    public final void a(Activity activity) {
        synchronized (this.h) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.h) {
            try {
                Activity activity2 = this.f;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f = null;
                }
                ArrayList arrayList = this.l;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        ((uu2) obj).d();
                    } catch (Exception e) {
                        hg4.C.h.d("AppActivityTracker.ActivityListener.onActivityDestroyed", e);
                        gi2.c0("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.h) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                try {
                    ((uu2) obj).c();
                } catch (Exception e) {
                    hg4.C.h.d("AppActivityTracker.ActivityListener.onActivityPaused", e);
                    gi2.c0("", e);
                }
            }
        }
        this.j = true;
        fu1 fu1Var = this.m;
        if (fu1Var != null) {
            lf4.l.removeCallbacks(fu1Var);
        }
        i63 i63Var = lf4.l;
        fu1 fu1Var2 = new fu1(2, this);
        this.m = fu1Var2;
        i63Var.postDelayed(fu1Var2, this.o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        int i = 0;
        this.j = false;
        boolean andSet = this.i.getAndSet(true);
        fu1 fu1Var = this.m;
        if (fu1Var != null) {
            lf4.l.removeCallbacks(fu1Var);
        }
        synchronized (this.h) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                try {
                    ((uu2) obj).b();
                } catch (Exception e) {
                    hg4.C.h.d("AppActivityTracker.ActivityListener.onActivityResumed", e);
                    gi2.c0("", e);
                }
            }
            if (andSet) {
                gi2.U("App is still foreground.");
            } else {
                ArrayList arrayList2 = this.k;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    try {
                        ((wv1) obj2).T(true);
                    } catch (Exception e2) {
                        gi2.c0("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
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
