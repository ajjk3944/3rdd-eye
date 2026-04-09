package r2;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7560c {

    /* renamed from: a, reason: collision with root package name */
    public static final C7560c f60050a = new C7560c();

    private C7560c() {
    }

    public static final Uri a(Cursor cursor) {
        AbstractC6492s.i(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        AbstractC6492s.h(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        AbstractC6492s.i(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
