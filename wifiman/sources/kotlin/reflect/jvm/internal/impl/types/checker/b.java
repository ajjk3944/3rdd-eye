package kotlin.reflect.jvm.internal.impl.types.checker;

import Bh.E;
import Bh.EnumC2496f;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.k0;
import Bh.l0;
import ci.C4264a;
import fi.AbstractC5833e;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import pi.AbstractC7346d0;
import pi.B0;
import pi.C7352g0;
import pi.C7377y;
import pi.G0;
import pi.H0;
import pi.I;
import pi.InterfaceC7340a0;
import pi.InterfaceC7344c0;
import pi.J0;
import pi.M0;
import pi.N0;
import pi.Q;
import pi.S;
import pi.V;
import pi.W;
import pi.u0;
import pi.v0;
import pi.w0;
import ri.EnumC7611b;
import ri.InterfaceC7612c;
import ri.InterfaceC7613d;
import ri.InterfaceC7614e;
import ri.InterfaceC7615f;
import ri.InterfaceC7616g;
import ri.InterfaceC7618i;
import ri.InterfaceC7619j;
import ri.InterfaceC7620k;
import ri.InterfaceC7621l;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public interface b extends H0, ri.q {

    public static final class a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b$a$a, reason: collision with other inner class name */
        public static final class C1928a extends u0.c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f52142a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G0 f52143b;

            C1928a(b bVar, G0 g02) {
                this.f52142a = bVar;
                this.f52143b = g02;
            }

            @Override // pi.u0.c
            public InterfaceC7619j a(u0 state, InterfaceC7618i type) {
                AbstractC6492s.i(state, "state");
                AbstractC6492s.i(type, "type");
                b bVar = this.f52142a;
                G0 g02 = this.f52143b;
                InterfaceC7618i interfaceC7618iB0 = bVar.b0(type);
                AbstractC6492s.g(interfaceC7618iB0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                S sN = g02.n((S) interfaceC7618iB0, N0.INVARIANT);
                AbstractC6492s.h(sN, "safeSubstitute(...)");
                InterfaceC7619j interfaceC7619jC = bVar.c(sN);
                AbstractC6492s.f(interfaceC7619jC);
                return interfaceC7619jC;
            }
        }

        public static boolean A(b bVar, InterfaceC7618i receiver, Zh.c fqName) {
            AbstractC6492s.i(receiver, "$receiver");
            AbstractC6492s.i(fqName, "fqName");
            if (receiver instanceof S) {
                return ((S) receiver).getAnnotations().P(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean B(b bVar, ri.n receiver, ri.m mVar) {
            AbstractC6492s.i(receiver, "$receiver");
            if (!(receiver instanceof l0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
            }
            l0 l0Var = (l0) receiver;
            if (mVar == null ? true : mVar instanceof v0) {
                return AbstractC7984d.r(l0Var, (v0) mVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + l0Var + ", " + O.b(l0Var.getClass())).toString());
        }

        public static boolean C(b bVar, InterfaceC7619j a10, InterfaceC7619j b10) {
            AbstractC6492s.i(a10, "a");
            AbstractC6492s.i(b10, "b");
            if (!(a10 instanceof AbstractC7346d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + O.b(a10.getClass())).toString());
            }
            if (b10 instanceof AbstractC7346d0) {
                return ((AbstractC7346d0) a10).L0() == ((AbstractC7346d0) b10).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + O.b(b10.getClass())).toString());
        }

        public static InterfaceC7618i D(b bVar, Collection types) {
            AbstractC6492s.i(types, "types");
            return d.a(types);
        }

        public static boolean E(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                return kotlin.reflect.jvm.internal.impl.builtins.i.w0((v0) receiver, o.a.f51846b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean F(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ((v0) receiver).c() instanceof InterfaceC2495e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean G(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC2498h interfaceC2498hC = ((v0) receiver).c();
                InterfaceC2495e interfaceC2495e = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
                return (interfaceC2495e == null || !E.a(interfaceC2495e) || interfaceC2495e.h() == EnumC2496f.ENUM_ENTRY || interfaceC2495e.h() == EnumC2496f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean H(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ((v0) receiver).d();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean I(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                return W.a((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean J(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC2498h interfaceC2498hC = ((v0) receiver).c();
                InterfaceC2495e interfaceC2495e = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
                return (interfaceC2495e != null ? interfaceC2495e.z0() : null) instanceof Bh.A;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean K(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                return receiver instanceof di.q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean L(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                return receiver instanceof Q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean M(b bVar) {
            return false;
        }

        public static boolean N(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof AbstractC7346d0) {
                return ((AbstractC7346d0) receiver).O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean O(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            return receiver instanceof InterfaceC7340a0;
        }

        public static boolean P(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                return kotlin.reflect.jvm.internal.impl.builtins.i.w0((v0) receiver, o.a.f51848c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean Q(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                return J0.l((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean R(b bVar, InterfaceC7613d receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            return receiver instanceof C4264a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean S(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                return kotlin.reflect.jvm.internal.impl.builtins.i.s0((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean T(b bVar, InterfaceC7613d receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean U(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                return receiver instanceof InterfaceC7344c0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean V(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (!(receiver instanceof AbstractC7346d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
            }
            if (!W.a((S) receiver)) {
                AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) receiver;
                if (!(abstractC7346d0.N0().c() instanceof k0) && (abstractC7346d0.N0().c() != null || (receiver instanceof C4264a) || (receiver instanceof i) || (receiver instanceof C7377y) || (abstractC7346d0.N0() instanceof di.q) || W(bVar, receiver))) {
                    return true;
                }
            }
            return false;
        }

        private static boolean W(b bVar, InterfaceC7619j interfaceC7619j) {
            return (interfaceC7619j instanceof C7352g0) && bVar.f(((C7352g0) interfaceC7619j).G0());
        }

        public static boolean X(b bVar, InterfaceC7621l receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof B0) {
                return ((B0) receiver).c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof AbstractC7346d0) {
                return AbstractC7984d.u((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof AbstractC7346d0) {
                return AbstractC7984d.v((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean a(b bVar, ri.m c12, ri.m c22) {
            AbstractC6492s.i(c12, "c1");
            AbstractC6492s.i(c22, "c2");
            if (!(c12 instanceof v0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + O.b(c12.getClass())).toString());
            }
            if (c22 instanceof v0) {
                return AbstractC6492s.d(c12, c22);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + O.b(c22.getClass())).toString());
        }

        public static boolean a0(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (!(receiver instanceof M0)) {
                return false;
            }
            ((M0) receiver).N0();
            return false;
        }

        public static int b(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                return ((S) receiver).L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static boolean b0(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC2498h interfaceC2498hC = ((v0) receiver).c();
                return interfaceC2498hC != null && kotlin.reflect.jvm.internal.impl.builtins.i.B0(interfaceC2498hC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7620k c(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof AbstractC7346d0) {
                return (InterfaceC7620k) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7619j c0(b bVar, InterfaceC7616g receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof I) {
                return ((I) receiver).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7613d d(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof AbstractC7346d0) {
                if (receiver instanceof C7352g0) {
                    return bVar.a(((C7352g0) receiver).G0());
                }
                if (receiver instanceof i) {
                    return (i) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7618i d0(b bVar, InterfaceC7613d receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7614e e(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof AbstractC7346d0) {
                if (receiver instanceof C7377y) {
                    return (C7377y) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7618i e0(b bVar, InterfaceC7618i receiver, boolean z10) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof M0) {
                return c.b((M0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7615f f(b bVar, InterfaceC7616g receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof I) {
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static u0 f0(b bVar, boolean z10, boolean z11) {
            return AbstractC6506a.b(z10, z11, bVar, null, null, 24, null);
        }

        public static InterfaceC7616g g(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                M0 m0Q0 = ((S) receiver).Q0();
                if (m0Q0 instanceof I) {
                    return (I) m0Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7619j g0(b bVar, InterfaceC7614e receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof C7377y) {
                return ((C7377y) receiver).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7619j h(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                M0 m0Q0 = ((S) receiver).Q0();
                if (m0Q0 instanceof AbstractC7346d0) {
                    return (AbstractC7346d0) m0Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static int h0(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ((v0) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7621l i(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                return AbstractC7984d.d((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static Collection i0(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            ri.m mVarD = bVar.d(receiver);
            if (mVarD instanceof di.q) {
                return ((di.q) mVarD).j();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7619j j(b bVar, InterfaceC7619j type, EnumC7611b status) {
            AbstractC6492s.i(type, "type");
            AbstractC6492s.i(status, "status");
            if (type instanceof AbstractC7346d0) {
                return o.b((AbstractC7346d0) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + O.b(type.getClass())).toString());
        }

        public static InterfaceC7621l j0(b bVar, InterfaceC7612c receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof n) {
                return ((n) receiver).e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static EnumC7611b k(b bVar, InterfaceC7613d receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static u0.c k0(b bVar, InterfaceC7619j type) {
            AbstractC6492s.i(type, "type");
            if (type instanceof AbstractC7346d0) {
                return new C1928a(bVar, w0.f58185c.a((S) type).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + O.b(type.getClass())).toString());
        }

        public static InterfaceC7618i l(b bVar, InterfaceC7619j lowerBound, InterfaceC7619j upperBound) {
            AbstractC6492s.i(lowerBound, "lowerBound");
            AbstractC6492s.i(upperBound, "upperBound");
            if (!(lowerBound instanceof AbstractC7346d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + O.b(bVar.getClass())).toString());
            }
            if (upperBound instanceof AbstractC7346d0) {
                return V.e((AbstractC7346d0) lowerBound, (AbstractC7346d0) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + O.b(bVar.getClass())).toString());
        }

        public static Collection l0(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                Collection collectionA = ((v0) receiver).a();
                AbstractC6492s.h(collectionA, "getSupertypes(...)");
                return collectionA;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7621l m(b bVar, InterfaceC7618i receiver, int i10) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                return (InterfaceC7621l) ((S) receiver).L0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7612c m0(b bVar, InterfaceC7613d receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static List n(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                return ((S) receiver).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static ri.m n0(b bVar, InterfaceC7619j receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof AbstractC7346d0) {
                return ((AbstractC7346d0) receiver).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static Zh.d o(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC2498h interfaceC2498hC = ((v0) receiver).c();
                AbstractC6492s.g(interfaceC2498hC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC5833e.p((InterfaceC2495e) interfaceC2498hC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7619j o0(b bVar, InterfaceC7616g receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof I) {
                return ((I) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static ri.n p(b bVar, ri.m receiver, int i10) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                Object obj = ((v0) receiver).getParameters().get(i10);
                AbstractC6492s.h(obj, "get(...)");
                return (ri.n) obj;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7618i p0(b bVar, InterfaceC7618i receiver, boolean z10) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof InterfaceC7619j) {
                return bVar.b((InterfaceC7619j) receiver, z10);
            }
            if (!(receiver instanceof InterfaceC7616g)) {
                throw new IllegalStateException("sealed");
            }
            InterfaceC7616g interfaceC7616g = (InterfaceC7616g) receiver;
            return bVar.m(bVar.b(bVar.e(interfaceC7616g), z10), bVar.b(bVar.g(interfaceC7616g), z10));
        }

        public static List q(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                List parameters = ((v0) receiver).getParameters();
                AbstractC6492s.h(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7619j q0(b bVar, InterfaceC7619j receiver, boolean z10) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof AbstractC7346d0) {
                return ((AbstractC7346d0) receiver).R0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.l r(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC2498h interfaceC2498hC = ((v0) receiver).c();
                AbstractC6492s.g(interfaceC2498hC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return kotlin.reflect.jvm.internal.impl.builtins.i.P((InterfaceC2495e) interfaceC2498hC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.l s(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC2498h interfaceC2498hC = ((v0) receiver).c();
                AbstractC6492s.g(interfaceC2498hC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return kotlin.reflect.jvm.internal.impl.builtins.i.S((InterfaceC2495e) interfaceC2498hC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7618i t(b bVar, ri.n receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof l0) {
                return AbstractC7984d.o((l0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7618i u(b bVar, InterfaceC7621l receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof B0) {
                return ((B0) receiver).getType().Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static ri.n v(b bVar, ri.m receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC2498h interfaceC2498hC = ((v0) receiver).c();
                if (interfaceC2498hC instanceof l0) {
                    return (l0) interfaceC2498hC;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static InterfaceC7618i w(b bVar, InterfaceC7618i receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof S) {
                return bi.k.k((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static List x(b bVar, ri.n receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof l0) {
                List upperBounds = ((l0) receiver).getUpperBounds();
                AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static ri.s y(b bVar, InterfaceC7621l receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof B0) {
                N0 n0A = ((B0) receiver).a();
                AbstractC6492s.h(n0A, "getProjectionKind(...)");
                return ri.p.a(n0A);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }

        public static ri.s z(b bVar, ri.n receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof l0) {
                N0 n0P = ((l0) receiver).p();
                AbstractC6492s.h(n0P, "getVariance(...)");
                return ri.p.a(n0P);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + O.b(receiver.getClass())).toString());
        }
    }

    @Override // ri.o
    InterfaceC7613d a(InterfaceC7619j interfaceC7619j);

    @Override // ri.o
    InterfaceC7619j b(InterfaceC7619j interfaceC7619j, boolean z10);

    @Override // ri.o
    InterfaceC7619j c(InterfaceC7618i interfaceC7618i);

    @Override // ri.o
    ri.m d(InterfaceC7619j interfaceC7619j);

    @Override // ri.o
    InterfaceC7619j e(InterfaceC7616g interfaceC7616g);

    @Override // ri.o
    boolean f(InterfaceC7619j interfaceC7619j);

    @Override // ri.o
    InterfaceC7619j g(InterfaceC7616g interfaceC7616g);

    InterfaceC7618i m(InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2);
}
