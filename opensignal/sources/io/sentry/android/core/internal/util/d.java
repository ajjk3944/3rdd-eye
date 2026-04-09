package io.sentry.android.core.internal.util;

import android.os.StrictMode;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class d implements io.sentry.transport.f, io.sentry.util.runtime.b {

    /* renamed from: a, reason: collision with root package name */
    public static final d f11646a = new d();

    @Override // io.sentry.util.runtime.b
    public void a(a5.o oVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            oVar.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.util.runtime.b
    public Object c(io.sentry.util.runtime.a aVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            return aVar.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.transport.f
    public long d() {
        return SystemClock.uptimeMillis();
    }
}
