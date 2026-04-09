package Fh;

import Bh.G;
import Sh.k;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.C6636n;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6679c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C6636n f6680a;

    /* renamed from: b, reason: collision with root package name */
    private final Fh.a f6681b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            AbstractC6492s.i(classLoader, "classLoader");
            g gVar = new g(classLoader);
            k.a aVar = Sh.k.f20772b;
            ClassLoader classLoader2 = J.class.getClassLoader();
            AbstractC6492s.h(classLoader2, "getClassLoader(...)");
            k.a.C0765a c0765aA = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f6678b, l.f6682a);
            return new k(c0765aA.a().a(), new Fh.a(c0765aA.b(), gVar), null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(C6636n c6636n, Fh.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6636n, aVar);
    }

    public final C6636n a() {
        return this.f6680a;
    }

    public final G b() {
        return this.f6680a.q();
    }

    public final Fh.a c() {
        return this.f6681b;
    }

    private k(C6636n c6636n, Fh.a aVar) {
        this.f6680a = c6636n;
        this.f6681b = aVar;
    }
}
