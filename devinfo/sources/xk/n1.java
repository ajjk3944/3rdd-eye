package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f37210a = new ThreadLocal();

    public static q0 a() {
        ThreadLocal threadLocal = f37210a;
        q0 q0Var = (q0) threadLocal.get();
        if (q0Var != null) {
            return q0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
