package xs;

import br.l;
import br.w;
import com.google.android.gms.internal.measurement.e5;
import or.h;
import qr.q;
import qs.e;
import qs.g;
import rr.a0;
import rr.f;
import rr.f0;
import rr.i;
import rr.j;
import rr.l0;
import rr.m;
import rr.m0;
import rt.k;
import ur.c0;
import ur.g0;
import ur.q0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25523a = 0;

    static {
        g.e("value");
    }

    public static final boolean a(q0 q0Var) {
        Boolean boolG = k.g(e5.H(q0Var), a.f25520d, b.E);
        l.d(boolG, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolG.booleanValue();
    }

    public static rr.d b(rr.d dVar, ar.k kVar) {
        l.e(dVar, "<this>");
        return (rr.d) k.e(e5.H(dVar), new a(1), new q(new w(), kVar));
    }

    public static final qs.c c(m mVar) {
        l.e(mVar, "<this>");
        e eVarH = h(mVar);
        if (!eVarH.d()) {
            eVarH = null;
        }
        if (eVarH != null) {
            return eVarH.g();
        }
        return null;
    }

    public static final f d(sr.b bVar) {
        l.e(bVar, "<this>");
        i iVarP = bVar.getType().Z().p();
        if (iVarP instanceof f) {
            return (f) iVarP;
        }
        return null;
    }

    public static final h e(rr.l lVar) {
        l.e(lVar, "<this>");
        return j(lVar).n();
    }

    public static final qs.b f(i iVar) {
        rr.l lVarO;
        qs.b bVarF;
        if (iVar == null || (lVarO = iVar.o()) == null) {
            return null;
        }
        if (lVarO instanceof f0) {
            return new qs.b(((c0) ((f0) lVarO)).f23629y, iVar.getName());
        }
        if (!(lVarO instanceof j) || (bVarF = f((i) lVarO)) == null) {
            return null;
        }
        return bVarF.d(iVar.getName());
    }

    public static final qs.c g(rr.l lVar) {
        l.e(lVar, "<this>");
        qs.c cVarH = ts.d.h(lVar);
        return cVarH != null ? cVarH : ts.d.g(lVar.o()).b(lVar.getName()).g();
    }

    public static final e h(rr.l lVar) {
        l.e(lVar, "<this>");
        e eVarG = ts.d.g(lVar);
        l.d(eVarG, "getFqName(this)");
        return eVarG;
    }

    public static final void i(a0 a0Var) {
        l.e(a0Var, "<this>");
        if (a0Var.A0(jt.g.f13844a) != null) {
            throw new ClassCastException();
        }
    }

    public static final a0 j(rr.l lVar) {
        l.e(lVar, "<this>");
        a0 a0VarD = ts.d.d(lVar);
        l.d(a0VarD, "getContainingModule(this)");
        return a0VarD;
    }

    public static final rr.d k(rr.d dVar) {
        l.e(dVar, "<this>");
        if (!(dVar instanceof l0)) {
            return dVar;
        }
        m0 m0VarV1 = ((g0) ((l0) dVar)).v1();
        l.d(m0VarV1, "correspondingProperty");
        return m0VarV1;
    }
}
