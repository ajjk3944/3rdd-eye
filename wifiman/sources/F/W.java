package F;

import C0.AbstractC2538s;
import L0.C3174d;
import R0.C3458k;
import R0.C3465s;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.AbstractC6534j;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6533i;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.O0;
import m0.S0;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4951a = new a(null);

    public static final class a {

        /* renamed from: F.W$a$a, reason: collision with other inner class name */
        static final class C0206a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3458k f4952a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f4953b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f4954c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0206a(C3458k c3458k, InterfaceC6835l interfaceC6835l, kotlin.jvm.internal.N n10) {
                super(1);
                this.f4952a = c3458k;
                this.f4953b = interfaceC6835l;
                this.f4954c = n10;
            }

            public final void a(List list) {
                W.f4951a.g(list, this.f4952a, this.f4953b, (R0.Z) this.f4954c.f51689a);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((List) obj);
                return Yg.J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0.r f4955a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C0.r rVar) {
                super(1);
                this.f4955a = rVar;
            }

            public final void a(float[] fArr) {
                if (this.f4955a.M()) {
                    AbstractC2538s.d(this.f4955a).z(this.f4955a, fArr);
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((O0) obj).r());
                return Yg.J.f24997a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void c(InterfaceC6717n0 interfaceC6717n0, long j10, R0.H h10, L0.M m10, S0 s02) {
            int iB = h10.b(L0.S.l(j10));
            int iB2 = h10.b(L0.S.k(j10));
            if (iB != iB2) {
                interfaceC6717n0.m(m10.z(iB, iB2), s02);
            }
        }

        public final R0.a0 a(long j10, R0.a0 a0Var) {
            int iB = a0Var.a().b(L0.S.n(j10));
            int iB2 = a0Var.a().b(L0.S.i(j10));
            int iMin = Math.min(iB, iB2);
            int iMax = Math.max(iB, iB2);
            C3174d.a aVar = new C3174d.a(a0Var.b());
            aVar.c(new L0.D(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, W0.k.f23532b.d(), null, null, null, 61439, null), iMin, iMax);
            return new R0.a0(aVar.p(), a0Var.a());
        }

        public final void b(InterfaceC6717n0 interfaceC6717n0, R0.Q q10, long j10, long j11, R0.H h10, L0.M m10, S0 s02, long j12) {
            if (!L0.S.h(j10)) {
                s02.I(j12);
                c(interfaceC6717n0, j10, h10, m10, s02);
            } else if (!L0.S.h(j11)) {
                C6733v0 c6733v0G = C6733v0.g(m10.l().i().h());
                if (c6733v0G.u() == 16) {
                    c6733v0G = null;
                }
                long jU = c6733v0G != null ? c6733v0G.u() : C6733v0.f52951b.a();
                s02.I(C6733v0.k(jU, C6733v0.n(jU) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                c(interfaceC6717n0, j11, h10, m10, s02);
            } else if (!L0.S.h(q10.h())) {
                s02.I(j12);
                c(interfaceC6717n0, q10.h(), h10, m10, s02);
            }
            L0.Q.f11102a.a(interfaceC6717n0, m10);
        }

        public final Yg.y d(S s10, long j10, Y0.t tVar, L0.M m10) {
            L0.M mL = s10.l(j10, tVar, m10);
            return new Yg.y(Integer.valueOf(Y0.r.g(mL.B())), Integer.valueOf(Y0.r.f(mL.B())), mL);
        }

        public final void e(R0.Q q10, S s10, L0.M m10, C0.r rVar, R0.Z z10, boolean z11, R0.H h10) {
            if (z11) {
                int iB = h10.b(L0.S.k(q10.h()));
                C6533i c6533iD = iB < m10.l().j().length() ? m10.d(iB) : iB != 0 ? m10.d(iB - 1) : new C6533i(0.0f, 0.0f, 1.0f, Y0.r.f(X.b(s10.j(), s10.a(), s10.b(), null, 0, 24, null)));
                long jO0 = rVar.o0(AbstractC6532h.a(c6533iD.k(), c6533iD.n()));
                z10.c(AbstractC6534j.b(AbstractC6532h.a(C6531g.m(jO0), C6531g.n(jO0)), AbstractC6538n.a(c6533iD.r(), c6533iD.j())));
            }
        }

        public final void f(R0.Z z10, C3458k c3458k, InterfaceC6835l interfaceC6835l) {
            interfaceC6835l.invoke(R0.Q.d(c3458k.f(), null, 0L, null, 3, null));
            z10.a();
        }

        public final void g(List list, C3458k c3458k, InterfaceC6835l interfaceC6835l, R0.Z z10) {
            R0.Q qB = c3458k.b(list);
            if (z10 != null) {
                z10.d(null, qB);
            }
            interfaceC6835l.invoke(qB);
        }

        public final R0.Z h(R0.T t10, R0.Q q10, C3458k c3458k, C3465s c3465s, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            return i(t10, q10, c3458k, c3465s, interfaceC6835l, interfaceC6835l2);
        }

        public final R0.Z i(R0.T t10, R0.Q q10, C3458k c3458k, C3465s c3465s, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
            R0.Z zD = t10.d(q10, c3465s, new C0206a(c3458k, interfaceC6835l, n10), interfaceC6835l2);
            n10.f51689a = zD;
            return zD;
        }

        public final void j(long j10, j0 j0Var, C3458k c3458k, R0.H h10, InterfaceC6835l interfaceC6835l) {
            interfaceC6835l.invoke(R0.Q.d(c3458k.f(), null, L0.T.a(h10.a(j0.e(j0Var, j10, false, 2, null))), null, 5, null));
        }

        public final void k(R0.Z z10, R0.Q q10, R0.H h10, j0 j0Var) {
            C0.r rVarB;
            C0.r rVarC = j0Var.c();
            if (rVarC == null || !rVarC.M() || (rVarB = j0Var.b()) == null) {
                return;
            }
            z10.e(q10, h10, j0Var.f(), new b(rVarC), M.A.b(rVarC), rVarC.J(rVarB, false));
        }

        private a() {
        }
    }
}
