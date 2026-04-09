package A9;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes3.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<AbstractC0566a0> f198a = new ThreadLocal<>();

    public static AbstractC0566a0 a() {
        ThreadLocal<AbstractC0566a0> threadLocal = f198a;
        AbstractC0566a0 abstractC0566a0 = threadLocal.get();
        if (abstractC0566a0 != null) {
            return abstractC0566a0;
        }
        C0573e c0573e = new C0573e(Thread.currentThread());
        threadLocal.set(c0573e);
        return c0573e;
    }
}
