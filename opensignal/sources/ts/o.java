package ts;

import as.p;
import bu.t;
import ft.u;
import ht.b0;
import ht.d1;
import ht.g0;
import ht.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import rr.m0;
import rr.o0;
import rr.w;
import rr.z;
import ur.h0;
import ur.i0;
import ur.j0;
import ur.k0;
import ur.q0;
import ur.v;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final t f22974a = new t("ResolutionAnchorProvider", 6);

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void c(rr.f fVar, LinkedHashSet linkedHashSet, at.n nVar, boolean z10) {
        for (rr.l lVar : i3.g.q(nVar, at.f.f2282o, 2)) {
            if (lVar instanceof rr.f) {
                rr.f fVarV1 = (rr.f) lVar;
                if (fVarV1.M()) {
                    qs.g name = fVarV1.getName();
                    br.l.d(name, "descriptor.name");
                    rr.i iVarC = nVar.c(name, zr.d.WHEN_GET_ALL_DESCRIPTORS);
                    fVarV1 = iVarC instanceof rr.f ? (rr.f) iVarC : iVarC instanceof u ? ((u) iVarC).v1() : null;
                }
                if (fVarV1 != null) {
                    int i10 = d.f22961a;
                    Iterator it = fVarV1.v().q().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (d.p((x) it.next(), fVar.u1())) {
                                linkedHashSet.add(fVarV1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        at.n nVarZ0 = fVarV1.z0();
                        br.l.d(nVarZ0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        c(fVar, linkedHashSet, nVarZ0, z10);
                    }
                }
            }
        }
    }

    public static v e(rr.b bVar, x xVar, qs.g gVar, sr.h hVar, int i10) {
        if (hVar == null) {
            a(33);
            throw null;
        }
        if (xVar == null) {
            return null;
        }
        bt.a aVar = new bt.a(bVar, xVar, gVar);
        tt.k kVar = qs.h.f21037a;
        return new v(bVar, aVar, hVar, qs.g.e("_context_receiver_" + i10));
    }

    public static i0 f(m0 m0Var, sr.h hVar) {
        return l(m0Var, hVar, true, m0Var.h());
    }

    public static j0 g(m0 m0Var, sr.h hVar) {
        o0 o0VarH = m0Var.h();
        if (o0VarH != null) {
            return m(m0Var, hVar, sr.g.f22217a, true, m0Var.c(), o0VarH);
        }
        a(6);
        throw null;
    }

    public static h0 h(ur.b bVar) {
        if (bVar == null) {
            a(26);
            throw null;
        }
        rr.f fVarD = w.d(d.d(bVar), qs.j.f21062t);
        if (fVarD == null) {
            return null;
        }
        z zVar = z.FINAL;
        p pVar = rr.p.f21701e;
        qs.g gVar = or.o.f19714b;
        rr.c cVar = rr.c.SYNTHESIZED;
        h0 h0VarW1 = h0.w1(bVar, zVar, pVar, false, gVar, cVar, bVar.h());
        i0 i0Var = new i0(h0VarW1, sr.g.f22217a, zVar, pVar, false, false, false, cVar, null, bVar.h());
        h0VarW1.z1(i0Var, null, null, null);
        ht.i0.f10910d.getClass();
        ht.i0 i0Var2 = ht.i0.f10911g;
        ht.m0 m0VarV = fVarD.v();
        List listSingletonList = Collections.singletonList(new g0(bVar.q()));
        br.l.e(i0Var2, "attributes");
        br.l.e(m0VarV, "constructor");
        br.l.e(listSingletonList, "arguments");
        b0 b0VarR = ht.e.r(i0Var2, m0VarV, listSingletonList, false);
        List list = Collections.EMPTY_LIST;
        h0VarW1.C1(b0VarR, list, null, null, list);
        i0Var.y1(h0VarW1.i());
        return h0VarW1;
    }

    public static k0 i(ur.b bVar) {
        if (bVar == null) {
            a(24);
            throw null;
        }
        k0 k0VarG1 = k0.G1(bVar, or.o.f19715c, rr.c.SYNTHESIZED, bVar.h());
        q0 q0Var = new q0(k0VarG1, null, 0, sr.g.f22217a, qs.g.e("value"), xs.d.e(bVar).u(), false, false, false, null, bVar.h());
        List list = Collections.EMPTY_LIST;
        return k0VarG1.A1(null, null, list, list, Collections.singletonList(q0Var), bVar.q(), z.FINAL, rr.p.f21701e);
    }

    public static k0 j(ur.b bVar) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        k0 k0VarG1 = k0.G1(bVar, or.o.f19713a, rr.c.SYNTHESIZED, bVar.h());
        List list = Collections.EMPTY_LIST;
        return k0VarG1.A1(null, null, list, list, list, xs.d.e(bVar).h(d1.INVARIANT, bVar.q()), z.FINAL, rr.p.f21701e);
    }

    public static v k(rr.b bVar, x xVar, sr.h hVar) {
        if (xVar == null) {
            return null;
        }
        return new v(bVar, new bt.b(bVar, xVar), hVar);
    }

    public static i0 l(m0 m0Var, sr.h hVar, boolean z10, o0 o0Var) {
        if (hVar == null) {
            a(18);
            throw null;
        }
        if (o0Var != null) {
            return new i0(m0Var, hVar, m0Var.j(), m0Var.c(), z10, false, false, rr.c.DECLARATION, null, o0Var);
        }
        a(19);
        throw null;
    }

    public static j0 m(m0 m0Var, sr.h hVar, sr.h hVar2, boolean z10, p pVar, o0 o0Var) {
        if (hVar == null) {
            a(8);
            throw null;
        }
        if (hVar2 == null) {
            a(9);
            throw null;
        }
        if (pVar == null) {
            a(10);
            throw null;
        }
        if (o0Var == null) {
            a(11);
            throw null;
        }
        j0 j0Var = new j0(m0Var, hVar, m0Var.j(), pVar, z10, false, false, rr.c.DECLARATION, null, o0Var);
        j0Var.J = j0.x1(j0Var, m0Var.getType(), hVar2);
        return j0Var;
    }

    public static boolean n(rr.u uVar) {
        if (uVar.f() != rr.c.SYNTHESIZED) {
            return false;
        }
        rr.l lVarO = uVar.o();
        int i10 = d.f22961a;
        return d.n(lVarO, rr.g.ENUM_CLASS);
    }

    public static final Collection o(Collection collection, ar.k kVar) {
        br.l.e(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        rt.h hVar = new rt.h();
        while (!linkedList.isEmpty()) {
            Object objR0 = mq.o.r0(linkedList);
            rt.h hVar2 = new rt.h();
            ArrayList arrayListG = n.g(objR0, linkedList, kVar, new j1.a(10, hVar2));
            if (arrayListG.size() == 1 && hVar2.isEmpty()) {
                Object objH0 = mq.o.H0(arrayListG);
                br.l.d(objH0, "overridableGroup.single()");
                hVar.add(objH0);
            } else {
                Object objS = n.s(arrayListG, kVar);
                rr.b bVar = (rr.b) kVar.a(objS);
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    br.l.d(next, "it");
                    if (!n.k(bVar, (rr.b) kVar.a(next))) {
                        hVar2.add(next);
                    }
                }
                if (!hVar2.isEmpty()) {
                    hVar.addAll(hVar2);
                }
                hVar.add(objS);
            }
        }
        return hVar;
    }

    public abstract void b(rr.d dVar);

    public abstract void d(rr.d dVar, rr.d dVar2);

    public void p(rr.d dVar, Collection collection) {
        br.l.e(dVar, "member");
        dVar.y0(collection);
    }
}
