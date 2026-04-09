package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* loaded from: classes.dex */
public final class b3 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f12072d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final x5 f12073a;

    public b3(x5 x5Var) {
        this.f12073a = x5Var;
    }

    public final Date a(File file) throws IOException {
        x5 x5Var = this.f12073a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f12072d));
            try {
                String line = bufferedReader.readLine();
                x5Var.getLogger().m(b5.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateS = dr.a.s(line);
                bufferedReader.close();
                return dateS;
            } finally {
            }
        } catch (IOException e4) {
            x5Var.getLogger().g(b5.ERROR, "Error reading the crash marker file.", e4);
            return null;
        } catch (IllegalArgumentException e10) {
            x5Var.getLogger().f(b5.ERROR, e10, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Date dateA;
        x5 x5Var = this.f12073a;
        String cacheDirPath = x5Var.getCacheDirPath();
        if (cacheDirPath == null) {
            x5Var.getLogger().m(b5.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!x5Var.isEnableAutoSessionTracking()) {
            x5Var.getLogger().m(b5.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.c envelopeDiskCache = x5Var.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.b) && !((io.sentry.cache.b) envelopeDiskCache).g()) {
            x5Var.getLogger().m(b5.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = io.sentry.cache.b.E;
        File file = new File(cacheDirPath, "previous_session.json");
        g1 serializer = x5Var.getSerializer();
        if (file.exists()) {
            x5Var.getLogger().m(b5.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f12072d));
                try {
                    i6 i6Var = (i6) serializer.b(bufferedReader, i6.class);
                    if (i6Var == null) {
                        x5Var.getLogger().m(b5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(x5Var.getCacheDirPath(), ".sentry-native/last_crash");
                        if (file2.exists()) {
                            x5Var.getLogger().m(b5.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            dateA = a(file2);
                            if (!file2.delete()) {
                                x5Var.getLogger().m(b5.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                            }
                            i6Var.c(h6.Crashed, null, true, null);
                        } else {
                            dateA = null;
                        }
                        if (i6Var.J == null) {
                            i6Var.b(dateA);
                        }
                        c4.c().j(new i4.b(null, x5Var.getSdkVersion(), r4.d(serializer, i6Var)), new h0());
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th2) {
                x5Var.getLogger().g(b5.ERROR, "Error processing previous session.", th2);
            }
            if (file.delete()) {
                return;
            }
            x5Var.getLogger().m(b5.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
