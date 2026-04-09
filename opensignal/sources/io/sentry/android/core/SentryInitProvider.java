package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.z4;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class SentryInitProvider extends j0 {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Bundle bundle;
        io.sentry.android.core.performance.f.c(this);
        r rVar = new r(3);
        Context context = getContext();
        boolean z10 = false;
        if (context == null) {
            rVar.m(b5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            io.sentry.android.core.performance.f.d(this);
            return false;
        }
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) e0.f11565d.b(context) : (ApplicationInfo) e0.f11566e.b(context);
            bundle = applicationInfo != null ? applicationInfo.metaData : null;
        } catch (Throwable th2) {
            rVar.g(b5.ERROR, "Failed to read auto-init from android manifest metadata.", th2);
        }
        boolean zJ = bundle != null ? e0.j(bundle, rVar, "io.sentry.auto-init", true) : true;
        if (zJ) {
            if (context.getPackageName().endsWith(".test")) {
                try {
                    Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                        if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                            z10 = true;
                            break;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (!z10) {
                v0.b(context, rVar, new u0(0));
                z4.d().a("AutoInit");
            }
        }
        io.sentry.android.core.performance.f.d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        c4.b();
    }
}
