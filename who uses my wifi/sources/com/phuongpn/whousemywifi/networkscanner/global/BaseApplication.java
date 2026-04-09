package com.phuongpn.whousemywifi.networkscanner.global;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import defpackage.cf0;
import defpackage.gm0;
import defpackage.u5;
import java.io.File;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class BaseApplication extends Application {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (cf0.b) {
            return;
        }
        try {
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException unused) {
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                return;
            }
            cf0.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
        } catch (Exception e) {
            Log.e("MultiDex", "MultiDex installation failure", e);
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        String string = getSharedPreferences(gm0.a(this), 0).getString("key_theme", "default");
        if (string != null) {
            if (string.equals("light")) {
                u5.k(1);
                return;
            }
            if (string.equals("dark")) {
                u5.k(2);
                return;
            }
            try {
                u5.k(-1);
            } catch (Exception unused) {
                if (Build.VERSION.SDK_INT >= 28) {
                    u5.k(-1);
                } else {
                    u5.k(3);
                }
            }
        }
    }
}
