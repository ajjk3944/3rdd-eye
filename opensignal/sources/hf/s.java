package hf;

import android.util.Log;
import h7.h0;
import io.sentry.android.core.e0;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class s implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f10712a;

    /* renamed from: d, reason: collision with root package name */
    public final al.b f10713d;

    /* renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f10714g;

    /* renamed from: r, reason: collision with root package name */
    public final ef.a f10715r;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f10716x = new AtomicBoolean(false);

    public s(h0 h0Var, al.b bVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ef.a aVar) {
        this.f10712a = h0Var;
        this.f10713d = bVar;
        this.f10714g = uncaughtExceptionHandler;
        this.f10715r = aVar;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            e0.c("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th2 == null) {
            e0.c("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f10715r.b()) {
            return true;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10714g;
        AtomicBoolean atomicBoolean = this.f10716x;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th2)) {
                    this.f10712a.S(this.f10713d, thread, th2);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                }
                if (uncaughtExceptionHandler != null) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e4) {
                e0.c("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e4);
                if (uncaughtExceptionHandler != null) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th3) {
            if (uncaughtExceptionHandler != null) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                Log.isLoggable("FirebaseCrashlytics", 3);
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th3;
        }
    }
}
