package G;

import android.app.Notification;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class d {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z6) {
        builder.setAllowSystemGeneratedContextualActions(z6);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
