package r3;

import android.app.Notification;
import android.app.NotificationManager;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class p {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static void b(Notification.Action.Builder builder, boolean z3) {
        builder.setAllowGeneratedReplies(z3);
    }

    public static void c(Notification.Builder builder, RemoteViews remoteViews) {
        builder.setCustomBigContentView(remoteViews);
    }

    public static void d(Notification.Builder builder, RemoteViews remoteViews) {
        builder.setCustomContentView(remoteViews);
    }

    public static void e(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
