package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2445c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static Set f2446d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2447e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2448a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f2449b;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface InterruptionFilter {
    }

    public static class a {
        @DoNotInline
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        @DoNotInline
        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public NotificationManagerCompat(Context context) {
        this.f2448a = context;
        this.f2449b = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat b(Context context) {
        return new NotificationManagerCompat(context);
    }

    public boolean a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f2449b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2448a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2448a.getApplicationInfo();
        String packageName = this.f2448a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
