package io.sentry.android.core.cache;

import android.os.SystemClock;
import androidx.media3.exoplayer.trackselection.h;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.d;
import io.sentry.android.core.performance.f;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.x;
import io.sentry.b5;
import io.sentry.cache.b;
import io.sentry.h0;
import io.sentry.u0;
import io.sentry.u6;
import io.sentry.x5;
import ir.f0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends b {
    public static final /* synthetic */ int G = 0;
    public final d F;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        f0.T(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.F = d.f11646a;
    }

    @Override // io.sentry.cache.b, io.sentry.cache.c
    public final boolean R(i4.b bVar, h0 h0Var) throws IOException {
        boolean zR = super.R(bVar, h0Var);
        x5 x5Var = this.f12122a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) x5Var;
        g gVar = f.b().f11729r;
        if (u6.class.isInstance(dr.a.y(h0Var)) && gVar.b()) {
            this.F.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - gVar.f11734g;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                u0 logger = sentryAndroidOptions.getLogger();
                b5 b5Var = b5.DEBUG;
                logger.m(b5Var, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = x5Var.getOutboxPath();
                if (outboxPath == null) {
                    x5Var.getLogger().m(b5Var, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th2) {
                        x5Var.getLogger().g(b5.ERROR, "Error writing the startup crash marker file to the disk", th2);
                    }
                }
            }
        }
        h hVar = new h(this, 21, sentryAndroidOptions);
        Object objY = dr.a.y(h0Var);
        if (x.class.isInstance(dr.a.y(h0Var)) && objY != null) {
            a aVar = (a) hVar.f1895d;
            SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) hVar.f1896g;
            Long lValueOf = Long.valueOf(((x) objY).f11791r);
            u0 logger2 = sentryAndroidOptions2.getLogger();
            b5 b5Var2 = b5.DEBUG;
            logger2.m(b5Var2, "Writing last reported ANR marker with timestamp %d", lValueOf);
            x5 x5Var2 = aVar.f12122a;
            String cacheDirPath = x5Var2.getCacheDirPath();
            if (cacheDirPath == null) {
                x5Var2.getLogger().m(b5Var2, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            } else {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
                    try {
                        fileOutputStream.write(String.valueOf(lValueOf).getBytes(b.E));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Throwable th3) {
                    x5Var2.getLogger().g(b5.ERROR, "Error writing the ANR marker to the disk", th3);
                }
            }
        }
        return zR;
    }
}
