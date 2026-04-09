package n5;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: ProxyNotificationPreferences.java */
/* loaded from: classes2.dex */
public final class r {
    public static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
}
