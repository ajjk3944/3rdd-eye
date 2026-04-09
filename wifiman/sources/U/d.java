package U;

import T.AbstractC3546o;
import T.AbstractC3550q;
import T.C3516b1;
import T.C3520d;
import T.C3525e1;
import T.C3541l0;
import T.C3554s0;
import T.InterfaceC3526f;
import T.InterfaceC3538k;
import T.InterfaceC3548p;
import T.K0;
import T.R0;
import T.S0;
import T.T0;
import Yg.J;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f22067a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22068b;

    public static final class A extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final A f22069c = new A();

        /* JADX WARN: Illegal instructions before constructor call */
        private A() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            c3525e1.W0();
        }
    }

    public static final class B extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final B f22070c = new B();

        private B() {
            super(1, 0, 2, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            int iB = eVar.b(q.a(0));
            int iE0 = c3525e1.e0();
            int iC0 = c3525e1.c0();
            int iD1 = c3525e1.d1(iC0);
            int iC1 = c3525e1.c1(iC0);
            for (int iMax = Math.max(iD1, iC1 - iB); iMax < iC1; iMax++) {
                Object obj = c3525e1.f21054c[c3525e1.R(iMax)];
                if (obj instanceof T0) {
                    r02.c(((T0) obj).b(), iE0 - iMax, -1, -1);
                } else if (obj instanceof K0) {
                    ((K0) obj).x();
                }
            }
            c3525e1.k1(iB);
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "count" : super.e(i10);
        }
    }

    public static final class C extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C f22071c = new C();

        private C() {
            super(1, 2, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            int iF;
            int iE0;
            Object objA = eVar.a(t.a(0));
            C3520d c3520d = (C3520d) eVar.a(t.a(1));
            int iB = eVar.b(q.a(0));
            if (objA instanceof T0) {
                r02.e(((T0) objA).b());
            }
            int iF2 = c3525e1.F(c3520d);
            Object objR0 = c3525e1.R0(iF2, iB, objA);
            if (!(objR0 instanceof T0)) {
                if (objR0 instanceof K0) {
                    ((K0) objR0).x();
                    return;
                }
                return;
            }
            int iE02 = c3525e1.e0() - c3525e1.a1(iF2, iB);
            T0 t02 = (T0) objR0;
            C3520d c3520dA = t02.a();
            if (c3520dA == null || !c3520dA.b()) {
                iF = -1;
                iE0 = -1;
            } else {
                iF = c3525e1.F(c3520dA);
                iE0 = c3525e1.e0() - c3525e1.b1(iF);
            }
            r02.c(t02.b(), iE02, iF, iE0);
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "groupSlotIndex" : super.e(i10);
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "value" : t.b(i10, t.a(1)) ? "anchor" : super.f(i10);
        }
    }

    public static final class D extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final D f22072c = new D();

        /* JADX WARN: Illegal instructions before constructor call */
        private D() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            c3525e1.o1(eVar.a(t.a(0)));
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "data" : super.f(i10);
        }
    }

    public static final class E extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final E f22073c = new E();

        private E() {
            super(0, 2, 1, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            ((InterfaceC6839p) eVar.a(t.a(1))).invoke(interfaceC3526f.b(), eVar.a(t.a(0)));
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "value" : t.b(i10, t.a(1)) ? "block" : super.f(i10);
        }
    }

    public static final class F extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final F f22074c = new F();

        /* JADX WARN: Illegal instructions before constructor call */
        private F() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            Object objA = eVar.a(t.a(0));
            int iB = eVar.b(q.a(0));
            if (objA instanceof T0) {
                r02.e(((T0) objA).b());
            }
            Object objS0 = c3525e1.S0(iB, objA);
            if (objS0 instanceof T0) {
                r02.c(((T0) objS0).b(), c3525e1.e0() - c3525e1.a1(c3525e1.a0(), iB), -1, -1);
            } else if (objS0 instanceof K0) {
                ((K0) objS0).x();
            }
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "groupSlotIndex" : super.e(i10);
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "value" : super.f(i10);
        }
    }

    public static final class G extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final G f22075c = new G();

        private G() {
            super(1, 0, 2, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            int iB = eVar.b(q.a(0));
            for (int i10 = 0; i10 < iB; i10++) {
                interfaceC3526f.g();
            }
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "count" : super.e(i10);
        }
    }

    public static final class H extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final H f22076c = new H();

        /* JADX WARN: Illegal instructions before constructor call */
        private H() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            Object objB = interfaceC3526f.b();
            AbstractC6492s.g(objB, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((InterfaceC3538k) objB).p();
        }
    }

    /* renamed from: U.d$a, reason: case insensitive filesystem */
    public static final class C3607a extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C3607a f22077c = new C3607a();

        private C3607a() {
            super(1, 0, 2, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            c3525e1.D(eVar.b(q.a(0)));
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "distance" : super.e(i10);
        }
    }

    /* renamed from: U.d$b, reason: case insensitive filesystem */
    public static final class C3608b extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C3608b f22078c = new C3608b();

        private C3608b() {
            super(0, 2, 1, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            C3520d c3520d = (C3520d) eVar.a(t.a(0));
            Object objA = eVar.a(t.a(1));
            if (objA instanceof T0) {
                r02.e(((T0) objA).b());
            }
            c3525e1.G(c3520d, objA);
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "anchor" : t.b(i10, t.a(1)) ? "value" : super.f(i10);
        }
    }

    /* renamed from: U.d$c, reason: case insensitive filesystem */
    public static final class C3609c extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C3609c f22079c = new C3609c();

        private C3609c() {
            super(0, 2, 1, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            b0.d dVar = (b0.d) eVar.a(t.a(1));
            int iA = dVar != null ? dVar.a() : 0;
            a aVar = (a) eVar.a(t.a(0));
            if (iA > 0) {
                interfaceC3526f = new C3554s0(interfaceC3526f, iA);
            }
            aVar.b(interfaceC3526f, c3525e1, r02);
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "changes" : t.b(i10, t.a(1)) ? "effectiveNodeIndex" : super.f(i10);
        }
    }

    /* renamed from: U.d$d, reason: collision with other inner class name */
    public static final class C0812d extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C0812d f22080c = new C0812d();

        private C0812d() {
            super(0, 2, 1, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            int iA = ((b0.d) eVar.a(t.a(0))).a();
            List list = (List) eVar.a(t.a(1));
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                AbstractC6492s.g(interfaceC3526f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i11 = iA + i10;
                interfaceC3526f.c(i11, obj);
                interfaceC3526f.h(i11, obj);
            }
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "effectiveNodeIndex" : t.b(i10, t.a(1)) ? "nodes" : super.f(i10);
        }
    }

    /* renamed from: U.d$e, reason: case insensitive filesystem */
    public static final class C3610e extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C3610e f22081c = new C3610e();

        private C3610e() {
            super(0, 4, 1, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            C3541l0 c3541l0 = (C3541l0) eVar.a(t.a(2));
            AbstractC3550q abstractC3550q = (AbstractC3550q) eVar.a(t.a(1));
            abstractC3550q.l(c3541l0);
            AbstractC3546o.s("Could not resolve state for movable content");
            throw new KotlinNothingValueException();
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "resolvedState" : t.b(i10, t.a(1)) ? "resolvedCompositionContext" : t.b(i10, t.a(2)) ? "from" : t.b(i10, t.a(3)) ? "to" : super.f(i10);
        }
    }

    /* renamed from: U.d$f, reason: case insensitive filesystem */
    public static final class C3611f extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C3611f f22082c = new C3611f();

        /* JADX WARN: Illegal instructions before constructor call */
        private C3611f() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            AbstractC3546o.t(c3525e1, r02);
        }
    }

    /* renamed from: U.d$g, reason: case insensitive filesystem */
    public static final class C3612g extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C3612g f22083c = new C3612g();

        private C3612g() {
            super(0, 2, 1, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            b0.d dVar = (b0.d) eVar.a(t.a(0));
            C3520d c3520d = (C3520d) eVar.a(t.a(1));
            AbstractC6492s.g(interfaceC3526f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            dVar.b(f.d(c3525e1, c3520d, interfaceC3526f));
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "effectiveNodeIndexOut" : t.b(i10, t.a(1)) ? "anchor" : super.f(i10);
        }
    }

    /* renamed from: U.d$h, reason: case insensitive filesystem */
    public static final class C3613h extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final C3613h f22084c = new C3613h();

        /* JADX WARN: Illegal instructions before constructor call */
        private C3613h() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            AbstractC6492s.g(interfaceC3526f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) eVar.a(t.a(0))) {
                interfaceC3526f.d(obj);
            }
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "nodes" : super.f(i10);
        }
    }

    public static final class i extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final i f22085c = new i();

        private i() {
            super(0, 2, 1, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            ((InterfaceC6835l) eVar.a(t.a(0))).invoke((InterfaceC3548p) eVar.a(t.a(1)));
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "anchor" : t.b(i10, t.a(1)) ? "composition" : super.f(i10);
        }
    }

    public static final class j extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final j f22086c = new j();

        /* JADX WARN: Illegal instructions before constructor call */
        private j() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            c3525e1.T();
        }
    }

    public static final class k extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final k f22087c = new k();

        /* JADX WARN: Illegal instructions before constructor call */
        private k() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            AbstractC6492s.g(interfaceC3526f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            f.e(c3525e1, interfaceC3526f, 0);
            c3525e1.T();
        }
    }

    public static final class l extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final l f22088c = new l();

        /* JADX WARN: Illegal instructions before constructor call */
        private l() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            c3525e1.W((C3520d) eVar.a(t.a(0)));
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "anchor" : super.f(i10);
        }
    }

    public static final class m extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final m f22089c = new m();

        /* JADX WARN: Illegal instructions before constructor call */
        private m() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            c3525e1.V(0);
        }
    }

    public static final class n extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final n f22090c = new n();

        private n() {
            super(1, 2, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            Object objInvoke = ((InterfaceC6824a) eVar.a(t.a(0))).invoke();
            C3520d c3520d = (C3520d) eVar.a(t.a(1));
            int iB = eVar.b(q.a(0));
            AbstractC6492s.g(interfaceC3526f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            c3525e1.s1(c3520d, objInvoke);
            interfaceC3526f.h(iB, objInvoke);
            interfaceC3526f.d(objInvoke);
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "insertIndex" : super.e(i10);
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "factory" : t.b(i10, t.a(1)) ? "groupAnchor" : super.f(i10);
        }
    }

    public static final class o extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final o f22091c = new o();

        private o() {
            super(0, 2, 1, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            C3516b1 c3516b1 = (C3516b1) eVar.a(t.a(1));
            C3520d c3520d = (C3520d) eVar.a(t.a(0));
            c3525e1.I();
            c3525e1.v0(c3516b1, c3520d.d(c3516b1), false);
            c3525e1.U();
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "anchor" : t.b(i10, t.a(1)) ? "from" : super.f(i10);
        }
    }

    public static final class p extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final p f22092c = new p();

        private p() {
            super(0, 3, 1, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            C3516b1 c3516b1 = (C3516b1) eVar.a(t.a(1));
            C3520d c3520d = (C3520d) eVar.a(t.a(0));
            c cVar = (c) eVar.a(t.a(2));
            C3525e1 c3525e1G = c3516b1.G();
            try {
                cVar.d(interfaceC3526f, c3525e1G, r02);
                J j10 = J.f24997a;
                c3525e1G.L(true);
                c3525e1.I();
                c3525e1.v0(c3516b1, c3520d.d(c3516b1), false);
                c3525e1.U();
            } catch (Throwable th2) {
                c3525e1G.L(false);
                throw th2;
            }
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "anchor" : t.b(i10, t.a(1)) ? "from" : t.b(i10, t.a(2)) ? "fixups" : super.f(i10);
        }
    }

    public static final class q {
        public static int a(int i10) {
            return i10;
        }

        public static final boolean b(int i10, int i11) {
            return i10 == i11;
        }
    }

    public static final class r extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final r f22093c = new r();

        private r() {
            super(1, 0, 2, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            c3525e1.w0(eVar.b(q.a(0)));
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "offset" : super.e(i10);
        }
    }

    public static final class s extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final s f22094c = new s();

        private s() {
            super(3, 0, 2, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            interfaceC3526f.f(eVar.b(q.a(0)), eVar.b(q.a(1)), eVar.b(q.a(2)));
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "from" : q.b(i10, q.a(1)) ? "to" : q.b(i10, q.a(2)) ? "count" : super.e(i10);
        }
    }

    public static final class t {
        public static int a(int i10) {
            return i10;
        }

        public static final boolean b(int i10, int i11) {
            return i10 == i11;
        }
    }

    public static final class u extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final u f22095c = new u();

        /* JADX WARN: Illegal instructions before constructor call */
        private u() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            C3520d c3520d = (C3520d) eVar.a(t.a(0));
            int iB = eVar.b(q.a(0));
            interfaceC3526f.g();
            AbstractC6492s.g(interfaceC3526f, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            interfaceC3526f.c(iB, c3525e1.B0(c3520d));
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "insertIndex" : super.e(i10);
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "groupAnchor" : super.f(i10);
        }
    }

    public static final class v extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final v f22096c = new v();

        /* JADX WARN: Illegal instructions before constructor call */
        private v() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            r02.e((S0) eVar.a(t.a(0)));
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "value" : super.f(i10);
        }
    }

    public static final class w extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final w f22097c = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        private w() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            AbstractC3546o.K(c3525e1, r02);
        }
    }

    public static final class x extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final x f22098c = new x();

        /* JADX WARN: Illegal instructions before constructor call */
        private x() {
            int i10 = 2;
            super(i10, 0, i10, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            interfaceC3526f.a(eVar.b(q.a(0)), eVar.b(q.a(1)));
        }

        @Override // U.d
        public String e(int i10) {
            return q.b(i10, q.a(0)) ? "removeIndex" : q.b(i10, q.a(1)) ? "count" : super.e(i10);
        }
    }

    public static final class y extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final y f22099c = new y();

        /* JADX WARN: Illegal instructions before constructor call */
        private y() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            c3525e1.O0();
        }
    }

    public static final class z extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final z f22100c = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        private z() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // U.d
        public void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
            r02.d((InterfaceC6824a) eVar.a(t.a(0)));
        }

        @Override // U.d
        public String f(int i10) {
            return t.b(i10, t.a(0)) ? "effect" : super.f(i10);
        }
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    public abstract void a(e eVar, InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02);

    public final int b() {
        return this.f22067a;
    }

    public final String c() {
        String strV = O.b(getClass()).v();
        return strV == null ? "" : strV;
    }

    public final int d() {
        return this.f22068b;
    }

    public String e(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    public String f(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public String toString() {
        return c();
    }

    private d(int i10, int i11) {
        this.f22067a = i10;
        this.f22068b = i11;
    }

    public /* synthetic */ d(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, null);
    }
}
