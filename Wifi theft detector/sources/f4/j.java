package f4;

/* loaded from: classes2.dex */
public final class j implements z3.b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f21078a = new j();
    }

    public static j a() {
        return a.f21078a;
    }

    public static e c() {
        return (e) z3.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
