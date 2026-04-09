package O4;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes2.dex */
public final class I implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C1470p f10256a;

    /* renamed from: b, reason: collision with root package name */
    public final V4.e f10257b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f10258c;

    /* renamed from: d, reason: collision with root package name */
    public final L4.b f10259d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10260e = new AtomicBoolean(false);

    public I(C1470p c1470p, V4.e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, L4.b bVar) {
        this.f10256a = c1470p;
        this.f10257b = eVar;
        this.f10258c = uncaughtExceptionHandler;
        this.f10259d = bVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f10259d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10258c;
        AtomicBoolean atomicBoolean = this.f10260e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.f10256a.a(this.f10257b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
                atomicBoolean.set(false);
            } catch (Exception e4) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e4);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
