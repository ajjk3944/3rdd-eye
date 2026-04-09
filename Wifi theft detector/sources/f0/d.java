package f0;

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
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f20996a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f20997b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f20998c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f20999d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f21000e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f21001f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f21002g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0391d f21003a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f21004b;

        public a(C0391d c0391d, Object obj) {
            this.f21003a = c0391d;
            this.f21004b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21003a.f21009a = this.f21004b;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f21005a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0391d f21006b;

        public b(Application application, C0391d c0391d) {
            this.f21005a = application;
            this.f21006b = c0391d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21005a.unregisterActivityLifecycleCallbacks(this.f21006b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f21007a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f21008b;

        public c(Object obj, Object obj2) {
            this.f21007a = obj;
            this.f21008b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f20999d;
                if (method != null) {
                    method.invoke(this.f21007a, this.f21008b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f21000e.invoke(this.f21007a, this.f21008b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class clsA = a();
        f20996a = clsA;
        f20997b = b();
        f20998c = f();
        f20999d = d(clsA);
        f21000e = c(clsA);
        f21001f = e(clsA);
    }

    public static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class cls) {
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

    public static Method d(Class cls) {
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

    public static Method e(Class cls) {
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

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    public static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f20998c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f21002g.postAtFrontOfQueue(new c(f20997b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f21001f == null) {
            return false;
        }
        if (f21000e == null && f20999d == null) {
            return false;
        }
        try {
            Object obj2 = f20998c.get(activity);
            if (obj2 == null || (obj = f20997b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0391d c0391d = new C0391d(activity);
            application.registerActivityLifecycleCallbacks(c0391d);
            Handler handler = f21002g;
            handler.post(new a(c0391d, obj2));
            try {
                if (g()) {
                    Method method = f21001f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0391d));
                return true;
            } catch (Throwable th) {
                f21002g.post(new b(application, c0391d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f0.d$d, reason: collision with other inner class name */
    public static final class C0391d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public Object f21009a;

        /* renamed from: b, reason: collision with root package name */
        public Activity f21010b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21011c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f21012d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f21013e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f21014f = false;

        public C0391d(Activity activity) {
            this.f21010b = activity;
            this.f21011c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f21010b == activity) {
                this.f21010b = null;
                this.f21013e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f21013e || this.f21014f || this.f21012d || !d.h(this.f21009a, this.f21011c, activity)) {
                return;
            }
            this.f21014f = true;
            this.f21009a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f21010b == activity) {
                this.f21012d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
