package y6;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.sentry.android.core.e0;
import java.io.File;

/* loaded from: classes.dex */
public abstract class b extends Application {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        try {
            if (a.f25871b) {
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e4) {
                e0.q("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e4);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                return;
            }
            a.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
        } catch (Exception e10) {
            e0.c("MultiDex", "MultiDex installation failure", e10);
            throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
        }
    }
}
