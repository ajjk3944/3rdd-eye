package M;

import M.C3243l;
import M.r;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12223a = a.f12224a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f12224a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final r f12225b = new r() { // from class: M.m
            @Override // M.r
            public final C3243l a(x xVar) {
                return r.a.h(xVar);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        private static final r f12226c = new r() { // from class: M.n
            @Override // M.r
            public final C3243l a(x xVar) {
                return r.a.f(xVar);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        private static final r f12227d = new r() { // from class: M.o
            @Override // M.r
            public final C3243l a(x xVar) {
                return r.a.j(xVar);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        private static final r f12228e = new r() { // from class: M.p
            @Override // M.r
            public final C3243l a(x xVar) {
                return r.a.i(xVar);
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private static final r f12229f = new r() { // from class: M.q
            @Override // M.r
            public final C3243l a(x xVar) {
                return r.a.g(xVar);
            }
        };

        /* renamed from: M.r$a$a, reason: collision with other inner class name */
        static final class C0489a implements InterfaceC3234c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0489a f12230a = new C0489a();

            C0489a() {
            }

            @Override // M.InterfaceC3234c
            public final long a(C3242k c3242k, int i10) {
                return F.M.c(c3242k.c(), i10);
            }
        }

        static final class b implements InterfaceC3234c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f12231a = new b();

            b() {
            }

            @Override // M.InterfaceC3234c
            public final long a(C3242k c3242k, int i10) {
                return c3242k.k().C(i10);
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3243l f(x xVar) {
            return s.h(f12225b.a(xVar), xVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3243l g(x xVar) {
            C3243l.a aVarC;
            C3243l.a aVarL;
            C3243l.a aVarE;
            C3243l.a aVarC2;
            C3243l c3243lD = xVar.d();
            if (c3243lD == null) {
                return f12227d.a(xVar);
            }
            if (xVar.b()) {
                aVarC = c3243lD.e();
                aVarL = s.l(xVar, xVar.k(), aVarC);
                aVarC2 = c3243lD.c();
                aVarE = aVarL;
            } else {
                aVarC = c3243lD.c();
                aVarL = s.l(xVar, xVar.h(), aVarC);
                aVarE = c3243lD.e();
                aVarC2 = aVarL;
            }
            if (AbstractC6492s.d(aVarL, aVarC)) {
                return c3243lD;
            }
            return s.h(new C3243l(aVarE, aVarC2, xVar.i() == EnumC3236e.CROSSED || (xVar.i() == EnumC3236e.COLLAPSED && aVarE.c() > aVarC2.c())), xVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3243l h(x xVar) {
            return new C3243l(xVar.k().a(xVar.k().g()), xVar.h().a(xVar.h().e()), xVar.i() == EnumC3236e.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3243l i(x xVar) {
            return s.e(xVar, C0489a.f12230a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C3243l j(x xVar) {
            return s.e(xVar, b.f12231a);
        }

        public final r k() {
            return f12226c;
        }

        public final r l() {
            return f12229f;
        }

        public final r m() {
            return f12225b;
        }

        public final r n() {
            return f12228e;
        }

        public final r o() {
            return f12227d;
        }
    }

    C3243l a(x xVar);
}
