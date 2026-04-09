package y0;

import A9.J0;
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

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f47858a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f47859b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f47860c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f47861d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f47862e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f47863f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f47864g;

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Class<?> cls2 = Boolean.TYPE;
        f47864g = new Handler(Looper.getMainLooper());
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f47858a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f47859b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f47860c = declaredField2;
        Class<?> cls3 = f47858a;
        if (cls3 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls3.getDeclaredMethod("performStopActivity", IBinder.class, cls2, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
        }
        f47861d = declaredMethod;
        Class<?> cls4 = f47858a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls2);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
            }
        }
        f47862e = declaredMethod2;
        Class<?> cls5 = f47858a;
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && cls5 != null) {
            try {
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f47863f = method;
    }

    /* compiled from: ActivityRecreator.java */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b, reason: collision with root package name */
        public Object f47865b;

        /* renamed from: c, reason: collision with root package name */
        public Activity f47866c;

        /* renamed from: d, reason: collision with root package name */
        public final int f47867d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f47868e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f47869f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f47870g = false;

        public a(Activity activity) {
            this.f47866c = activity;
            this.f47867d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f47866c == activity) {
                this.f47866c = null;
                this.f47869f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f47869f || this.f47870g || this.f47868e) {
                return;
            }
            Object obj = this.f47865b;
            try {
                Object obj2 = d.f47860c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f47867d) {
                    d.f47864g.postAtFrontOfQueue(new J0(2, d.f47859b.get(activity), obj2));
                    this.f47870g = true;
                    this.f47865b = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f47866c == activity) {
                this.f47868e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
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
}
