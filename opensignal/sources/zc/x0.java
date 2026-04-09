package zc;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class x0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f27261a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f27262d;

    public x0(a1 a1Var, String str) {
        this.f27262d = a1Var;
        this.f27261a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        j0 j0Var = ((c1) this.f27262d.f1504d).f26889y;
        c1.g(j0Var);
        j0Var.B.c(th2, this.f27261a);
    }
}
