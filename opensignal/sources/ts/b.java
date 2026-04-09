package ts;

import com.google.android.gms.internal.measurement.h4;
import ht.m0;
import java.util.Collection;
import rr.f0;
import rr.o0;
import rr.r0;
import rr.x;
import ur.c0;

/* loaded from: classes.dex */
public final class b implements jt.c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22960a = new b();

    public static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static o0 e(rr.b bVar) {
        while (bVar instanceof rr.d) {
            rr.d dVar = (rr.d) bVar;
            if (dVar.f() != rr.c.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionP = dVar.p();
            br.l.d(collectionP, "overriddenDescriptors");
            bVar = (rr.d) mq.o.J0(collectionP);
            if (bVar == null) {
                return null;
            }
        }
        return bVar.h();
    }

    @Override // jt.c
    public boolean a(m0 m0Var, m0 m0Var2) {
        if (m0Var == null) {
            b(0);
            throw null;
        }
        if (m0Var2 != null) {
            return m0Var.equals(m0Var2);
        }
        b(1);
        throw null;
    }

    public boolean c(rr.l lVar, rr.l lVar2, boolean z10) {
        if ((lVar instanceof rr.f) && (lVar2 instanceof rr.f)) {
            return br.l.a(((rr.f) lVar).v(), ((rr.f) lVar2).v());
        }
        if ((lVar instanceof r0) && (lVar2 instanceof r0)) {
            return d((r0) lVar, (r0) lVar2, z10, a.f22959d);
        }
        if (!(lVar instanceof rr.b) || !(lVar2 instanceof rr.b)) {
            return ((lVar instanceof f0) && (lVar2 instanceof f0)) ? br.l.a(((c0) ((f0) lVar)).f23629y, ((c0) ((f0) lVar2)).f23629y) : br.l.a(lVar, lVar2);
        }
        rr.b bVar = (rr.b) lVar;
        rr.b bVar2 = (rr.b) lVar2;
        if (!bVar.equals(bVar2)) {
            if (br.l.a(bVar.getName(), bVar2.getName()) && ((!(bVar instanceof x) || !(bVar2 instanceof x) || ((x) bVar).M() == ((x) bVar2).M()) && ((!br.l.a(bVar.o(), bVar2.o()) || (z10 && br.l.a(e(bVar), e(bVar2)))) && !d.o(bVar) && !d.o(bVar2)))) {
                rr.l lVarO = bVar.o();
                rr.l lVarO2 = bVar2.o();
                if (((lVarO instanceof rr.d) || (lVarO2 instanceof rr.d)) ? false : c(lVarO, lVarO2, z10)) {
                    h4 h4Var = new h4();
                    h4Var.f5055a = z10;
                    h4Var.f5056d = bVar;
                    h4Var.f5057g = bVar2;
                    n nVar = new n(h4Var);
                    l lVarC = nVar.m(bVar, bVar2, null, true).c();
                    l lVar3 = l.OVERRIDABLE;
                    if (lVarC != lVar3 || nVar.m(bVar2, bVar, null, true).c() != lVar3) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean d(r0 r0Var, r0 r0Var2, boolean z10, ar.n nVar) {
        br.l.e(r0Var, "a");
        br.l.e(r0Var2, "b");
        if (r0Var.equals(r0Var2)) {
            return true;
        }
        if (br.l.a(r0Var.o(), r0Var2.o())) {
            return false;
        }
        rr.l lVarO = r0Var.o();
        rr.l lVarO2 = r0Var2.o();
        return (((lVarO instanceof rr.d) || (lVarO2 instanceof rr.d)) ? ((Boolean) nVar.w(lVarO, lVarO2)).booleanValue() : c(lVarO, lVarO2, z10)) && r0Var.getIndex() == r0Var2.getIndex();
    }
}
