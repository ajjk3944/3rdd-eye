package h5;

import h5.C5949a;
import h5.C5951c;

/* renamed from: h5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5952d {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC5952d f48427a = a().a();

    /* renamed from: h5.d$a */
    public static abstract class a {
        public abstract AbstractC5952d a();

        public abstract a b(String str);

        public abstract a c(long j10);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C5951c.a aVar);

        public abstract a h(long j10);
    }

    public static a a() {
        return new C5949a.b().h(0L).g(C5951c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C5951c.a g();

    public abstract long h();

    public boolean i() {
        return g() == C5951c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == C5951c.a.NOT_GENERATED || g() == C5951c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == C5951c.a.REGISTERED;
    }

    public boolean l() {
        return g() == C5951c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == C5951c.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public AbstractC5952d o(String str, long j10, long j11) {
        return n().b(str).c(j10).h(j11).a();
    }

    public AbstractC5952d p() {
        return n().b(null).a();
    }

    public AbstractC5952d q(String str) {
        return n().e(str).g(C5951c.a.REGISTER_ERROR).a();
    }

    public AbstractC5952d r() {
        return n().g(C5951c.a.NOT_GENERATED).a();
    }

    public AbstractC5952d s(String str, String str2, long j10, String str3, long j11) {
        return n().d(str).g(C5951c.a.REGISTERED).b(str3).f(str2).c(j11).h(j10).a();
    }

    public AbstractC5952d t(String str) {
        return n().d(str).g(C5951c.a.UNREGISTERED).a();
    }
}
