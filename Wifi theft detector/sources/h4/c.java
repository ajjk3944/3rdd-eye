package h4;

/* loaded from: classes2.dex */
public final class c implements z3.b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f21399a = new c();
    }

    public static c a() {
        return a.f21399a;
    }

    public static h4.a b() {
        return (h4.a) z3.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h4.a get() {
        return b();
    }
}
