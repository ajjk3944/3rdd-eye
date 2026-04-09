package h4;

/* loaded from: classes2.dex */
public final class d implements z3.b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f21400a = new d();
    }

    public static d a() {
        return a.f21400a;
    }

    public static h4.a c() {
        return (h4.a) z3.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h4.a get() {
        return c();
    }
}
