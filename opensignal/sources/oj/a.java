package oj;

import android.os.Process;
import br.l;
import ch.n;
import i.g0;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f19528a;

    public a(g0 g0Var) {
        this.f19528a = g0Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        l.e(thread, "t");
        l.e(th2, "e");
        n.c("CrashCatcher", "uncaughtException pid: " + Process.myPid());
        n.e("CrashCatcher", th2);
        Object obj = this.f19528a.f11051a;
        cj.a.G(th2);
        System.exit(2);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
