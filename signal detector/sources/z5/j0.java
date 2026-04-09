package z5;

/* loaded from: classes3.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f24536a = new ThreadLocal();

    public static K a() {
        ThreadLocal threadLocal = f24536a;
        K k6 = (K) threadLocal.get();
        if (k6 != null) {
            return k6;
        }
        C3027c c3027c = new C3027c(Thread.currentThread());
        threadLocal.set(c3027c);
        return c3027c;
    }
}
