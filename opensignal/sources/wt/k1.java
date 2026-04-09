package wt;

/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f24632a = new ThreadLocal();

    public static k0 a() {
        ThreadLocal threadLocal = f24632a;
        k0 k0Var = (k0) threadLocal.get();
        if (k0Var != null) {
            return k0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
