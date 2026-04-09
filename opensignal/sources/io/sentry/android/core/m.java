package io.sentry.android.core;

import io.sentry.a4;
import io.sentry.b5;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements io.sentry.util.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SentryAndroidOptions f11702a;

    @Override // io.sentry.util.d
    public Object e() {
        int i10 = io.sentry.android.core.cache.a.G;
        SentryAndroidOptions sentryAndroidOptions = this.f11702a;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        boolean z10 = false;
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().m(b5.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean zBooleanValue = ((Boolean) sentryAndroidOptions.getRuntimeManager().c(new a4(file, 3))).booleanValue();
                if (zBooleanValue && !((Boolean) sentryAndroidOptions.getRuntimeManager().c(new a4(file, 4))).booleanValue()) {
                    sentryAndroidOptions.getLogger().m(b5.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z10 = zBooleanValue;
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().g(b5.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            }
        }
        return Boolean.valueOf(z10);
    }
}
