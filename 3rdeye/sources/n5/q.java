package n5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.applovin.impl.Z;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* compiled from: ProxyNotificationInitializer.java */
/* loaded from: classes2.dex */
public final class q {
    public static void a(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (r.a(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z10 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (!PlatformVersion.isAtLeastQ()) {
            Tasks.forResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new Z(context, z10, taskCompletionSource).run();
        taskCompletionSource.getTask();
    }
}
