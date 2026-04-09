package mg;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;

/* renamed from: mg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6822a {

    /* renamed from: a, reason: collision with root package name */
    static final kg.n f54014a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f54015b = new o();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC6464a f54016c = new l();

    /* renamed from: d, reason: collision with root package name */
    static final InterfaceC6469f f54017d = new m();

    /* renamed from: e, reason: collision with root package name */
    public static final InterfaceC6469f f54018e = new p();

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC6469f f54019f = new w();

    /* renamed from: g, reason: collision with root package name */
    public static final kg.o f54020g = new n();

    /* renamed from: h, reason: collision with root package name */
    static final kg.p f54021h = new x();

    /* renamed from: i, reason: collision with root package name */
    static final kg.p f54022i = new q();

    /* renamed from: j, reason: collision with root package name */
    static final kg.q f54023j = new v();

    /* renamed from: k, reason: collision with root package name */
    public static final InterfaceC6469f f54024k = new u();

    /* renamed from: mg.a$a, reason: collision with other inner class name */
    static final class C1960a implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6464a f54025a;

        C1960a(InterfaceC6464a interfaceC6464a) {
            this.f54025a = interfaceC6464a;
        }

        @Override // kg.InterfaceC6469f
        public void accept(Object obj) {
            this.f54025a.run();
        }
    }

    /* renamed from: mg.a$b */
    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6465b f54026a;

        b(InterfaceC6465b interfaceC6465b) {
            this.f54026a = interfaceC6465b;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f54026a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: mg.a$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final kg.g f54027a;

        c(kg.g gVar) {
            this.f54027a = gVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 3) {
                return this.f54027a.a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* renamed from: mg.a$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final kg.h f54028a;

        d(kg.h hVar) {
            this.f54028a = hVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 4) {
                return this.f54028a.a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
    }

    /* renamed from: mg.a$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        private final kg.i f54029a;

        e(kg.i iVar) {
            this.f54029a = iVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 5) {
                return this.f54029a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
        }
    }

    /* renamed from: mg.a$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final kg.j f54030a;

        f(kg.j jVar) {
            this.f54030a = jVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 6) {
                return this.f54030a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }
    }

    /* renamed from: mg.a$g */
    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final kg.k f54031a;

        g(kg.k kVar) {
            this.f54031a = kVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 7) {
                return this.f54031a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
            throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
        }
    }

    /* renamed from: mg.a$h */
    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final kg.l f54032a;

        h(kg.l lVar) {
            this.f54032a = lVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 8) {
                return this.f54032a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
        }
    }

    /* renamed from: mg.a$i */
    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final kg.m f54033a;

        i(kg.m mVar) {
            this.f54033a = mVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Object[] objArr) {
            if (objArr.length == 9) {
                return this.f54033a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
        }
    }

    /* renamed from: mg.a$j */
    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final Class f54034a;

        j(Class cls) {
            this.f54034a = cls;
        }

        @Override // kg.n
        public Object apply(Object obj) {
            return this.f54034a.cast(obj);
        }
    }

    /* renamed from: mg.a$k */
    static final class k implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        final Class f54035a;

        k(Class cls) {
            this.f54035a = cls;
        }

        @Override // kg.p
        public boolean test(Object obj) {
            return this.f54035a.isInstance(obj);
        }
    }

    /* renamed from: mg.a$l */
    static final class l implements InterfaceC6464a {
        l() {
        }

        @Override // kg.InterfaceC6464a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: mg.a$m */
    static final class m implements InterfaceC6469f {
        m() {
        }

        @Override // kg.InterfaceC6469f
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: mg.a$n */
    static final class n implements kg.o {
        n() {
        }

        @Override // kg.o
        public void a(long j10) {
        }
    }

    /* renamed from: mg.a$o */
    static final class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: mg.a$p */
    static final class p implements InterfaceC6469f {
        p() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            Eg.a.v(th2);
        }
    }

    /* renamed from: mg.a$q */
    static final class q implements kg.p {
        q() {
        }

        @Override // kg.p
        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: mg.a$r */
    enum r implements kg.q {
        INSTANCE;

        @Override // kg.q
        public Set<Object> get() {
            return new HashSet();
        }
    }

    /* renamed from: mg.a$s */
    static final class s implements kg.n {
        s() {
        }

        @Override // kg.n
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: mg.a$t */
    static final class t implements Callable, kg.q, kg.n {

        /* renamed from: a, reason: collision with root package name */
        final Object f54036a;

        t(Object obj) {
            this.f54036a = obj;
        }

        @Override // kg.n
        public Object apply(Object obj) {
            return this.f54036a;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return this.f54036a;
        }

        @Override // kg.q
        public Object get() {
            return this.f54036a;
        }
    }

    /* renamed from: mg.a$u */
    static final class u implements InterfaceC6469f {
        u() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Dj.c cVar) {
            cVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: mg.a$v */
    static final class v implements kg.q {
        v() {
        }

        @Override // kg.q
        public Object get() {
            return null;
        }
    }

    /* renamed from: mg.a$w */
    static final class w implements InterfaceC6469f {
        w() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            Eg.a.v(new OnErrorNotImplementedException(th2));
        }
    }

    /* renamed from: mg.a$x */
    static final class x implements kg.p {
        x() {
        }

        @Override // kg.p
        public boolean test(Object obj) {
            return true;
        }
    }

    public static InterfaceC6469f a(InterfaceC6464a interfaceC6464a) {
        return new C1960a(interfaceC6464a);
    }

    public static kg.p b() {
        return f54021h;
    }

    public static kg.n c(Class cls) {
        return new j(cls);
    }

    public static kg.q d() {
        return r.INSTANCE;
    }

    public static InterfaceC6469f e() {
        return f54017d;
    }

    public static kg.n f() {
        return f54014a;
    }

    public static kg.p g(Class cls) {
        return new k(cls);
    }

    public static kg.q h(Object obj) {
        return new t(obj);
    }

    public static kg.q i() {
        return f54023j;
    }

    public static kg.n j(InterfaceC6465b interfaceC6465b) {
        return new b(interfaceC6465b);
    }

    public static kg.n k(kg.g gVar) {
        return new c(gVar);
    }

    public static kg.n l(kg.h hVar) {
        return new d(hVar);
    }

    public static kg.n m(kg.i iVar) {
        return new e(iVar);
    }

    public static kg.n n(kg.j jVar) {
        return new f(jVar);
    }

    public static kg.n o(kg.k kVar) {
        return new g(kVar);
    }

    public static kg.n p(kg.l lVar) {
        return new h(lVar);
    }

    public static kg.n q(kg.m mVar) {
        return new i(mVar);
    }
}
