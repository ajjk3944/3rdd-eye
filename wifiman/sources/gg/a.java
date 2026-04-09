package Gg;

import gg.y;
import java.util.concurrent.Executor;
import kg.q;
import wg.o;
import wg.p;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    static final y f7434a = Eg.a.j(new h());

    /* renamed from: b, reason: collision with root package name */
    static final y f7435b = Eg.a.g(new b());

    /* renamed from: c, reason: collision with root package name */
    static final y f7436c = Eg.a.h(new c());

    /* renamed from: d, reason: collision with root package name */
    static final y f7437d = p.i();

    /* renamed from: e, reason: collision with root package name */
    static final y f7438e = Eg.a.i(new f());

    /* renamed from: Gg.a$a, reason: collision with other inner class name */
    static final class C0300a {

        /* renamed from: a, reason: collision with root package name */
        static final y f7439a = new wg.b();
    }

    static final class b implements q {
        b() {
        }

        @Override // kg.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y get() {
            return C0300a.f7439a;
        }
    }

    static final class c implements q {
        c() {
        }

        @Override // kg.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y get() {
            return d.f7440a;
        }
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        static final y f7440a = new wg.f();
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        static final y f7441a = new wg.g();
    }

    static final class f implements q {
        f() {
        }

        @Override // kg.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y get() {
            return e.f7441a;
        }
    }

    static final class g {

        /* renamed from: a, reason: collision with root package name */
        static final y f7442a = new o();
    }

    static final class h implements q {
        h() {
        }

        @Override // kg.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y get() {
            return g.f7442a;
        }
    }

    public static y a() {
        return Eg.a.u(f7435b);
    }

    public static y b(Executor executor) {
        return c(executor, false, false);
    }

    public static y c(Executor executor, boolean z10, boolean z11) {
        return Eg.a.e(executor, z10, z11);
    }

    public static y d() {
        return Eg.a.w(f7436c);
    }

    public static y e() {
        return Eg.a.y(f7434a);
    }

    public static y f() {
        return f7437d;
    }
}
