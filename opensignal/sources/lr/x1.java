package lr;

import com.google.android.gms.internal.measurement.b4;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qs.b f15714a = qs.b.j(new qs.c("java.lang.Void"));

    /* JADX WARN: Multi-variable type inference failed */
    public static j a(rr.u uVar) {
        String strC = b4.C(uVar);
        if (strC == null) {
            if (uVar instanceof ur.i0) {
                String strB = xs.d.k(uVar).getName().b();
                br.l.d(strB, "descriptor.propertyIfAccessor.name.asString()");
                strC = as.z.a(strB);
            } else if (uVar instanceof ur.j0) {
                String strB2 = xs.d.k(uVar).getName().b();
                br.l.d(strB2, "descriptor.propertyIfAccessor.name.asString()");
                strC = as.z.b(strB2);
            } else {
                strC = ((ur.n) uVar).getName().b();
                br.l.d(strC, "descriptor.name.asString()");
            }
        }
        return new j(new ps.e(strC, i3.g.f(uVar, 1)));
    }

    public static t1 b(rr.m0 m0Var) {
        br.l.e(m0Var, "possiblyOverriddenProperty");
        rr.m0 m0VarU1 = ((rr.m0) ts.d.t(m0Var)).u1();
        br.l.d(m0VarU1, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (m0VarU1 instanceof ft.s) {
            ft.s sVar = (ft.s) m0VarU1;
            ls.g0 g0Var = sVar.X;
            rs.o oVar = os.k.f19781d;
            br.l.d(oVar, "propertySignature");
            os.e eVar = (os.e) a.a.o(g0Var, oVar);
            if (eVar != null) {
                return new m(m0VarU1, g0Var, eVar, sVar.Y, sVar.Z);
            }
        } else if (m0VarU1 instanceof cs.h) {
            rr.o0 o0VarH = ((cs.h) m0VarU1).h();
            wr.f fVar = o0VarH instanceof wr.f ? (wr.f) o0VarH : null;
            xr.s sVar2 = fVar != null ? fVar.f24595a : null;
            if (sVar2 instanceof xr.u) {
                return new k(((xr.u) sVar2).f25515a);
            }
            if (!(sVar2 instanceof xr.x)) {
                throw new lq.k("Incorrect resolution sequence for Java field " + m0VarU1 + " (source = " + sVar2 + ')', 1);
            }
            Method method = ((xr.x) sVar2).f25517a;
            ur.j0 j0VarD = m0VarU1.d();
            rr.o0 o0VarH2 = j0VarD != null ? j0VarD.h() : null;
            wr.f fVar2 = o0VarH2 instanceof wr.f ? (wr.f) o0VarH2 : null;
            xr.s sVar3 = fVar2 != null ? fVar2.f24595a : null;
            xr.x xVar = sVar3 instanceof xr.x ? (xr.x) sVar3 : null;
            return new l(method, xVar != null ? xVar.f25517a : null);
        }
        ur.i0 i0VarB = m0VarU1.b();
        br.l.b(i0VarB);
        j jVarA = a(i0VarB);
        ur.j0 j0VarD2 = m0VarU1.d();
        return new n(jVarA, j0VarD2 != null ? a(j0VarD2) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t1 c(rr.u uVar) {
        Method method;
        br.l.e(uVar, "possiblySubstitutedFunction");
        rr.u uVarU1 = ((rr.u) ts.d.t(uVar)).u1();
        br.l.d(uVarU1, "unwrapFakeOverride(possi…titutedFunction).original");
        if (uVarU1 instanceof ft.b) {
            ft.b bVar = (ft.b) uVarU1;
            rs.b bVarE = bVar.E();
            if (bVarE instanceof ls.y) {
                rs.g gVar = ps.i.f20642a;
                ps.e eVarC = ps.i.c((ls.y) bVarE, bVar.a0(), bVar.T());
                if (eVarC != null) {
                    return new j(eVarC);
                }
            }
            if (bVarE instanceof ls.l) {
                rs.g gVar2 = ps.i.f20642a;
                ps.e eVarA = ps.i.a((ls.l) bVarE, bVar.a0(), bVar.T());
                if (eVarA != null) {
                    rr.l lVarO = uVar.o();
                    br.l.d(lVarO, "possiblySubstitutedFunction.containingDeclaration");
                    return ts.h.b(lVarO) ? new j(eVarA) : new i(eVarA);
                }
            }
            return a(uVarU1);
        }
        if (uVarU1 instanceof cs.g) {
            rr.o0 o0VarH = ((cs.g) uVarU1).h();
            wr.f fVar = o0VarH instanceof wr.f ? (wr.f) o0VarH : null;
            xr.s sVar = fVar != null ? fVar.f24595a : null;
            xr.x xVar = sVar instanceof xr.x ? (xr.x) sVar : null;
            if (xVar != null && (method = xVar.f25517a) != null) {
                return new h(method);
            }
            throw new lq.k("Incorrect resolution sequence for Java method " + uVarU1, 1);
        }
        if (!(uVarU1 instanceof cs.b)) {
            ur.n nVar = (ur.n) uVarU1;
            if ((nVar.getName().equals(or.o.f19715c) && ts.o.n(uVarU1)) || ((nVar.getName().equals(or.o.f19713a) && ts.o.n(uVarU1)) || (br.l.a(nVar.getName(), qr.a.f20960e) && uVarU1.Y().isEmpty()))) {
                return a(uVarU1);
            }
            throw new lq.k("Unknown origin of " + uVarU1 + " (" + uVarU1.getClass() + ')', 1);
        }
        rr.o0 o0VarH2 = ((cs.b) uVarU1).h();
        wr.f fVar2 = o0VarH2 instanceof wr.f ? (wr.f) o0VarH2 : null;
        Object obj = fVar2 != null ? fVar2.f24595a : null;
        if (obj instanceof xr.r) {
            return new g(((xr.r) obj).f25513a);
        }
        if (obj instanceof xr.o) {
            Class cls = ((xr.o) obj).f25509a;
            if (cls.isAnnotation()) {
                return new f(cls);
            }
        }
        throw new lq.k("Incorrect resolution sequence for Java constructor " + uVarU1 + " (" + obj + ')', 1);
    }
}
