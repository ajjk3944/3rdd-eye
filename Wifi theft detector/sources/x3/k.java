package x3;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class k implements z3.b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f24948a = new k();
    }

    public static k a() {
        return a.f24948a;
    }

    public static Executor b() {
        return (Executor) z3.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
