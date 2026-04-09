package s1;

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

/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC7876d {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class f61014a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f61015b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f61016c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f61017d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f61018e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f61019f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f61020g = new Handler(Looper.getMainLooper());

    /* renamed from: s1.d$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2131d f61021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f61022b;

        a(C2131d c2131d, Object obj) {
            this.f61021a = c2131d;
            this.f61022b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61021a.f61027a = this.f61022b;
        }
    }

    /* renamed from: s1.d$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f61023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2131d f61024b;

        b(Application application, C2131d c2131d) {
            this.f61023a = application;
            this.f61024b = c2131d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61023a.unregisterActivityLifecycleCallbacks(this.f61024b);
        }
    }

    /* renamed from: s1.d$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f61025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f61026b;

        c(Object obj, Object obj2) {
            this.f61025a = obj;
            this.f61026b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC7876d.f61017d;
                if (method != null) {
                    method.invoke(this.f61025a, this.f61026b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC7876d.f61018e.invoke(this.f61025a, this.f61026b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* renamed from: s1.d$d, reason: collision with other inner class name */
    private static final class C2131d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f61027a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f61028b;

        /* renamed from: c, reason: collision with root package name */
        private final int f61029c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f61030d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f61031e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f61032f = false;

        C2131d(Activity activity) {
            this.f61028b = activity;
            this.f61029c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f61028b == activity) {
                this.f61028b = null;
                this.f61031e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f61031e || this.f61032f || this.f61030d || !AbstractC7876d.h(this.f61027a, this.f61029c, activity)) {
                return;
            }
            this.f61032f = true;
            this.f61027a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f61028b == activity) {
                this.f61030d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsA = a();
        f61014a = clsA;
        f61015b = b();
        f61016c = f();
        f61017d = d(clsA);
        f61018e = c(clsA);
        f61019f = e(clsA);
    }

    private static Class a() {
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

    private static Method c(Class cls) {
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

    private static Method d(Class cls) {
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

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
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
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f61016c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f61020g.postAtFrontOfQueue(new c(f61015b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f61019f == null) {
            return false;
        }
        if (f61018e == null && f61017d == null) {
            return false;
        }
        try {
            Object obj2 = f61016c.get(activity);
            if (obj2 == null || (obj = f61015b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C2131d c2131d = new C2131d(activity);
            application.registerActivityLifecycleCallbacks(c2131d);
            Handler handler = f61020g;
            handler.post(new a(c2131d, obj2));
            try {
                if (g()) {
                    Method method = f61019f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c2131d));
                return true;
            } catch (Throwable th2) {
                f61020g.post(new b(application, c2131d));
                throw th2;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
