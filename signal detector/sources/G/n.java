package G;

import android.app.Notification;
import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class n {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static void b(Notification.Action.Builder builder, boolean z6) {
        builder.setAllowGeneratedReplies(z6);
    }

    public static void c(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
