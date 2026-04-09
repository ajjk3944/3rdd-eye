package r3;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class q {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void b(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void c(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void d(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void e(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void f(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void g(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
