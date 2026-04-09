package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p2 f22589a = new p2();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f22590b = kotlinx.coroutines.internal.g0.a(new kotlinx.coroutines.internal.c0("ThreadLocalEventLoop"));

    public final c1 a() {
        return (c1) f22590b.get();
    }

    public final c1 b() {
        ThreadLocal threadLocal = f22590b;
        c1 c1Var = (c1) threadLocal.get();
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1VarA = f1.a();
        threadLocal.set(c1VarA);
        return c1VarA;
    }

    public final void c() {
        f22590b.set(null);
    }

    public final void d(c1 c1Var) {
        f22590b.set(c1Var);
    }
}
