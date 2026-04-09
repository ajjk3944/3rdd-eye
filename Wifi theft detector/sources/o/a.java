package o;

import android.app.NotificationManager;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a {
    public static Parcelable[] a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
