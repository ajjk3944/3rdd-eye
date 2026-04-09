package com.google.firebase.crashlytics.internal.common;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
class E implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f38714a;

    /* renamed from: b, reason: collision with root package name */
    private final S4.j f38715b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f38716c;

    /* renamed from: d, reason: collision with root package name */
    private final I4.a f38717d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f38718e = new AtomicBoolean(false);

    interface a {
        void a(S4.j jVar, Thread thread, Throwable th2);
    }

    public E(a aVar, S4.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, I4.a aVar2) {
        this.f38714a = aVar;
        this.f38715b = jVar;
        this.f38716c = uncaughtExceptionHandler;
        this.f38717d = aVar2;
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            I4.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            I4.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f38717d.b()) {
            return true;
        }
        I4.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f38718e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f38718e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f38714a.a(this.f38715b, thread, th2);
                } else {
                    I4.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                I4.g.f().e("An error occurred in the uncaught exception handler", e10);
                if (this.f38716c != null) {
                }
            }
            if (this.f38716c != null) {
                I4.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f38716c.uncaughtException(thread, th2);
            } else {
                I4.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f38718e.set(false);
        } catch (Throwable th3) {
            if (this.f38716c != null) {
                I4.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f38716c.uncaughtException(thread, th2);
            } else {
                I4.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f38718e.set(false);
            throw th3;
        }
    }
}
