package defpackage;

import java.lang.Thread;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q92 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;
    public final /* synthetic */ r92 c;

    public /* synthetic */ q92(r92 r92Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.a = i;
        this.b = uncaughtExceptionHandler;
        this.c = r92Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.a) {
            case 0:
                uncaughtExceptionHandler = this.b;
                try {
                    try {
                        this.c.f(th);
                    } catch (Throwable unused) {
                        gi2.Z("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                }
            default:
                uncaughtExceptionHandler = this.b;
                try {
                    try {
                        this.c.f(th);
                    } catch (Throwable unused2) {
                        gi2.Z("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                }
        }
    }
}
