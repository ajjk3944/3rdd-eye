package L0;

import W0.e;
import W0.f;
import W0.j;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: L0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3192w {

    /* renamed from: a, reason: collision with root package name */
    private static final long f11194a = Y0.v.f24549b.a();

    public static final C3191v a(C3191v c3191v, int i10, int i11, long j10, W0.q qVar, z zVar, W0.h hVar, int i12, int i13, W0.s sVar) {
        long j11;
        int iH = i10;
        W0.q qVarJ = qVar;
        j.a aVar = W0.j.f23523b;
        if (W0.j.k(iH, aVar.g()) || W0.j.k(iH, c3191v.h())) {
            if (Y0.w.h(j10)) {
                j11 = j10;
            } else {
                j11 = j10;
                if (Y0.v.e(j11, c3191v.e())) {
                }
            }
            if ((qVarJ == null || AbstractC6492s.d(qVarJ, c3191v.j())) && ((W0.l.j(i11, W0.l.f23537b.f()) || W0.l.j(i11, c3191v.i())) && ((zVar == null || AbstractC6492s.d(zVar, c3191v.g())) && ((hVar == null || AbstractC6492s.d(hVar, c3191v.f())) && ((W0.f.f(i12, W0.f.f23488b.b()) || W0.f.f(i12, c3191v.d())) && ((W0.e.g(i13, W0.e.f23483b.c()) || W0.e.g(i13, c3191v.c())) && (sVar == null || AbstractC6492s.d(sVar, c3191v.k())))))))) {
                return c3191v;
            }
        } else {
            j11 = j10;
        }
        long jE = Y0.w.h(j10) ? c3191v.e() : j11;
        if (qVarJ == null) {
            qVarJ = c3191v.j();
        }
        W0.q qVar2 = qVarJ;
        if (W0.j.k(iH, aVar.g())) {
            iH = c3191v.h();
        }
        return new C3191v(iH, !W0.l.j(i11, W0.l.f23537b.f()) ? i11 : c3191v.i(), jE, qVar2, d(c3191v, zVar), hVar == null ? c3191v.f() : hVar, !W0.f.f(i12, W0.f.f23488b.b()) ? i12 : c3191v.d(), !W0.e.g(i13, W0.e.f23483b.c()) ? i13 : c3191v.c(), sVar == null ? c3191v.k() : sVar, null);
    }

    public static final C3191v b(C3191v c3191v, C3191v c3191v2, float f10) {
        int iN = ((W0.j) E.d(W0.j.h(c3191v.h()), W0.j.h(c3191v2.h()), f10)).n();
        int iM = ((W0.l) E.d(W0.l.g(c3191v.i()), W0.l.g(c3191v2.i()), f10)).m();
        long jF = E.f(c3191v.e(), c3191v2.e(), f10);
        W0.q qVarJ = c3191v.j();
        if (qVarJ == null) {
            qVarJ = W0.q.f23554c.a();
        }
        W0.q qVarJ2 = c3191v2.j();
        if (qVarJ2 == null) {
            qVarJ2 = W0.q.f23554c.a();
        }
        return new C3191v(iN, iM, jF, W0.r.a(qVarJ, qVarJ2, f10), c(c3191v.g(), c3191v2.g(), f10), (W0.h) E.d(c3191v.f(), c3191v2.f(), f10), ((W0.f) E.d(W0.f.c(c3191v.d()), W0.f.c(c3191v2.d()), f10)).l(), ((W0.e) E.d(W0.e.d(c3191v.c()), W0.e.d(c3191v2.c()), f10)).j(), (W0.s) E.d(c3191v.k(), c3191v2.k(), f10), null);
    }

    private static final z c(z zVar, z zVar2, float f10) {
        if (zVar == null && zVar2 == null) {
            return null;
        }
        if (zVar == null) {
            zVar = z.f11206c.a();
        }
        if (zVar2 == null) {
            zVar2 = z.f11206c.a();
        }
        return AbstractC3173c.b(zVar, zVar2, f10);
    }

    private static final z d(C3191v c3191v, z zVar) {
        return c3191v.g() == null ? zVar : zVar == null ? c3191v.g() : c3191v.g().d(zVar);
    }

    public static final C3191v e(C3191v c3191v, Y0.t tVar) {
        int iH = c3191v.h();
        j.a aVar = W0.j.f23523b;
        int iF = W0.j.k(iH, aVar.g()) ? aVar.f() : c3191v.h();
        int iE = V.e(tVar, c3191v.i());
        long jE = Y0.w.h(c3191v.e()) ? f11194a : c3191v.e();
        W0.q qVarJ = c3191v.j();
        if (qVarJ == null) {
            qVarJ = W0.q.f23554c.a();
        }
        W0.q qVar = qVarJ;
        z zVarG = c3191v.g();
        W0.h hVarF = c3191v.f();
        int iD = c3191v.d();
        f.a aVar2 = W0.f.f23488b;
        int iA = W0.f.f(iD, aVar2.b()) ? aVar2.a() : c3191v.d();
        int iC = c3191v.c();
        e.a aVar3 = W0.e.f23483b;
        int iB = W0.e.g(iC, aVar3.c()) ? aVar3.b() : c3191v.c();
        W0.s sVarK = c3191v.k();
        if (sVarK == null) {
            sVarK = W0.s.f23558c.a();
        }
        return new C3191v(iF, iE, jE, qVar, zVarG, hVarF, iA, iB, sVarK, null);
    }
}
