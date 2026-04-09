package s0;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.ui.platform.AbstractC3932k0;
import l0.AbstractC6538n;
import l0.C6537m;
import m0.AbstractC6735w0;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public abstract class q {
    public static final p a(p pVar, long j10, long j11, String str, AbstractC6735w0 abstractC6735w0, boolean z10) {
        pVar.y(j10);
        pVar.u(z10);
        pVar.v(abstractC6735w0);
        pVar.z(j11);
        pVar.x(str);
        return pVar;
    }

    private static final AbstractC6735w0 b(long j10, int i10) {
        if (j10 != 16) {
            return AbstractC6735w0.f52966b.a(j10, i10);
        }
        return null;
    }

    public static final C7867c c(C7867c c7867c, m mVar) {
        int iU = mVar.u();
        for (int i10 = 0; i10 < iU; i10++) {
            o oVarE = mVar.e(i10);
            if (oVarE instanceof r) {
                C7870f c7870f = new C7870f();
                r rVar = (r) oVarE;
                c7870f.k(rVar.g());
                c7870f.l(rVar.i());
                c7870f.j(rVar.f());
                c7870f.h(rVar.b());
                c7870f.i(rVar.e());
                c7870f.m(rVar.j());
                c7870f.n(rVar.k());
                c7870f.r(rVar.v());
                c7870f.o(rVar.q());
                c7870f.p(rVar.s());
                c7870f.q(rVar.u());
                c7870f.u(rVar.y());
                c7870f.s(rVar.w());
                c7870f.t(rVar.x());
                c7867c.i(i10, c7870f);
            } else if (oVarE instanceof m) {
                C7867c c7867c2 = new C7867c();
                m mVar2 = (m) oVarE;
                c7867c2.p(mVar2.g());
                c7867c2.s(mVar2.k());
                c7867c2.t(mVar2.q());
                c7867c2.u(mVar2.s());
                c7867c2.v(mVar2.v());
                c7867c2.w(mVar2.w());
                c7867c2.q(mVar2.i());
                c7867c2.r(mVar2.j());
                c7867c2.o(mVar2.f());
                c(c7867c2, mVar2);
                c7867c.i(i10, c7867c2);
            }
        }
        return c7867c;
    }

    public static final p d(Y0.d dVar, C7868d c7868d, C7867c c7867c) {
        long jE = e(dVar, c7868d.e(), c7868d.d());
        return a(new p(c7867c), jE, f(jE, c7868d.l(), c7868d.k()), c7868d.g(), b(c7868d.j(), c7868d.i()), c7868d.c());
    }

    private static final long e(Y0.d dVar, float f10, float f11) {
        return AbstractC6538n.a(dVar.d1(f10), dVar.d1(f11));
    }

    private static final long f(long j10, float f10, float f11) {
        if (Float.isNaN(f10)) {
            f10 = C6537m.i(j10);
        }
        if (Float.isNaN(f11)) {
            f11 = C6537m.g(j10);
        }
        return AbstractC6538n.a(f10, f11);
    }

    public static final p g(C7868d c7868d, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)");
        }
        Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
        float f10 = c7868d.f();
        float density = dVar.getDensity();
        boolean zJ = interfaceC3540l.j((Float.floatToRawIntBits(density) & Counter32.MAX_COUNTER32_VALUE) | (Float.floatToRawIntBits(f10) << 32));
        Object objF = interfaceC3540l.f();
        if (zJ || objF == InterfaceC3540l.f21100a.a()) {
            C7867c c7867c = new C7867c();
            c(c7867c, c7868d.h());
            J j10 = J.f24997a;
            objF = d(dVar, c7868d, c7867c);
            interfaceC3540l.K(objF);
        }
        p pVar = (p) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return pVar;
    }
}
