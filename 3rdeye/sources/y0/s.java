package y0;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47909a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f47910b;

    /* compiled from: NotificationManagerCompat.java */
    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static {
        new HashSet();
    }

    public s(Context context) {
        this.f47909a = context;
        this.f47910b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f47910b);
        }
        Context context = this.f47909a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
