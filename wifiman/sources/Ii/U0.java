package Ii;

/* loaded from: classes4.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public static final U0 f9286a = new U0();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f9287b = Ni.K.a(new Ni.C("ThreadLocalEventLoop"));

    private U0() {
    }

    public final AbstractC3060i0 a() {
        return (AbstractC3060i0) f9287b.get();
    }

    public final AbstractC3060i0 b() {
        ThreadLocal threadLocal = f9287b;
        AbstractC3060i0 abstractC3060i0 = (AbstractC3060i0) threadLocal.get();
        if (abstractC3060i0 != null) {
            return abstractC3060i0;
        }
        AbstractC3060i0 abstractC3060i0A = AbstractC3066l0.a();
        threadLocal.set(abstractC3060i0A);
        return abstractC3060i0A;
    }

    public final void c() {
        f9287b.set(null);
    }

    public final void d(AbstractC3060i0 abstractC3060i0) {
        f9287b.set(abstractC3060i0);
    }
}
