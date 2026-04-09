package f4;

/* loaded from: classes2.dex */
public final class g implements z3.b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f21072a = new g();
    }

    public static g a() {
        return a.f21072a;
    }

    public static String b() {
        return (String) z3.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
