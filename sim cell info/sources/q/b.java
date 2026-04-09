package q;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class<?> f3152a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f3153b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f3154c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f3155d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f3156e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f3157f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f3158g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f3159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3160c;

        a(d dVar, Object obj) {
            this.f3159b = dVar;
            this.f3160c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3159b.f3165a = this.f3160c;
        }
    }

    /* renamed from: q.b$b, reason: collision with other inner class name */
    class RunnableC0035b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f3161b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f3162c;

        RunnableC0035b(Application application, d dVar) {
            this.f3161b = application;
            this.f3162c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3161b.unregisterActivityLifecycleCallbacks(this.f3162c);
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f3163b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3164c;

        c(Object obj, Object obj2) {
            this.f3163b = obj;
            this.f3164c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = b.f3155d;
                if (method != null) {
                    method.invoke(this.f3163b, this.f3164c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    b.f3156e.invoke(this.f3163b, this.f3164c, Boolean.FALSE);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f3165a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f3166b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3167c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3168d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3169e = false;

        d(Activity activity) {
            this.f3166b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3166b == activity) {
                this.f3166b = null;
                this.f3168d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f3168d || this.f3169e || this.f3167c || !b.h(this.f3165a, activity)) {
                return;
            }
            this.f3169e = true;
            this.f3165a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3166b == activity) {
                this.f3167c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f3152a = clsA;
        f3153b = b();
        f3154c = f();
        f3155d = d(clsA);
        f3156e = c(clsA);
        f3157f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    protected static boolean h(Object obj, Activity activity) {
        try {
            Object obj2 = f3154c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f3158g.postAtFrontOfQueue(new c(f3153b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f3157f == null) {
            return false;
        }
        if (f3156e == null && f3155d == null) {
            return false;
        }
        try {
            Object obj2 = f3154c.get(activity);
            if (obj2 == null || (obj = f3153b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f3158g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f3157f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC0035b(application, dVar));
                return true;
            } catch (Throwable th) {
                f3158g.post(new RunnableC0035b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
