package r3;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static String f32790d;
    public static x g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f32793a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f32794b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f32789c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f32791e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f32792f = new Object();

    public y(Context context) {
        this.f32793a = context;
        this.f32794b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return p.a(this.f32794b);
        }
        Context context = this.f32793a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i4 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i4), packageName)).intValue() == 0;
    }

    public final void b(int i4, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.f32794b.notify(null, i4, notification);
            return;
        }
        u uVar = new u(this.f32793a.getPackageName(), i4, notification);
        synchronized (f32792f) {
            try {
                if (g == null) {
                    g = new x(this.f32793a.getApplicationContext());
                }
                g.f32786b.obtainMessage(0, uVar).sendToTarget();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f32794b.cancel(null, i4);
    }
}
