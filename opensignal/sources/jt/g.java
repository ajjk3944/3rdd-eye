package jt;

import br.x;
import bu.t;
import ht.a1;
import ht.b0;
import ht.c1;
import ht.d1;
import ht.e0;
import ht.g0;
import ht.i0;
import ht.l0;
import ht.m0;
import ht.n0;
import ht.p0;
import ht.r;
import ht.w;
import ht.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import rr.r0;
import rr.v;
import rr.z;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final t f13844a = new t("KotlinTypeRefiner", 6);

    public static boolean A(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            return ((m0) gVar).r();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static boolean B(lt.d dVar) {
        br.l.e(dVar, "$receiver");
        if (dVar instanceof ht.x) {
            return ht.c.i((ht.x) dVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, dVar.getClass(), sb2).toString());
    }

    public static boolean C(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            rr.i iVarP = ((m0) gVar).p();
            rr.f fVar = iVarP instanceof rr.f ? (rr.f) iVarP : null;
            return (fVar != null ? fVar.B0() : null) instanceof v;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static boolean D(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            return gVar instanceof vs.p;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static boolean E(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            return gVar instanceof w;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static boolean F(lt.e eVar) {
        br.l.e(eVar, "$receiver");
        if (eVar instanceof b0) {
            return ((b0) eVar).c0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static boolean G(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            return or.h.H((m0) gVar, or.n.f19688b);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static boolean H(lt.d dVar) {
        br.l.e(dVar, "$receiver");
        if (dVar instanceof ht.x) {
            return a1.e((ht.x) dVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, dVar.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean I(lt.e eVar) {
        if (eVar instanceof ht.x) {
            return or.h.F((ht.x) eVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static boolean J(lt.c cVar) {
        if (cVar instanceof h) {
            return ((h) cVar).B;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, cVar.getClass(), sb2).toString());
    }

    public static boolean K(p0 p0Var) {
        br.l.e(p0Var, "$receiver");
        if (p0Var instanceof p0) {
            return p0Var.c();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(p0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, p0Var.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(lt.e eVar) {
        br.l.e(eVar, "$receiver");
        if (eVar instanceof b0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(lt.e eVar) {
        br.l.e(eVar, "$receiver");
        if (eVar instanceof b0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static b0 N(r rVar) {
        if (rVar instanceof r) {
            return rVar.f10938d;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(rVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, rVar.getClass(), sb2).toString());
    }

    public static c1 O(lt.c cVar) {
        if (cVar instanceof h) {
            return ((h) cVar).f13847r;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, cVar.getClass(), sb2).toString());
    }

    public static c1 P(lt.d dVar) {
        if (dVar instanceof c1) {
            return ht.c.l((c1) dVar, false);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, dVar.getClass(), sb2).toString());
    }

    public static b0 Q(ht.n nVar) {
        if (nVar instanceof ht.n) {
            return nVar.f10930d;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(nVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, nVar.getClass(), sb2).toString());
    }

    public static int R(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            return ((m0) gVar).o().size();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static Collection S(b bVar, lt.e eVar) {
        br.l.e(eVar, "$receiver");
        m0 m0VarB = bVar.B(eVar);
        if (m0VarB instanceof vs.p) {
            return ((vs.p) m0VarB).f23963a;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static p0 T(us.b bVar) {
        br.l.e(bVar, "$receiver");
        if (bVar instanceof i) {
            return ((i) bVar).f13850a;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, bVar.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a U(b bVar, lt.e eVar) {
        if (eVar instanceof b0) {
            ht.x xVar = (ht.x) eVar;
            return new a(bVar, new x0(n0.f10932b.f(xVar.Z(), xVar.L())));
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static Collection V(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            Collection collectionQ = ((m0) gVar).q();
            br.l.d(collectionQ, "this.supertypes");
            return collectionQ;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static m0 W(lt.e eVar) {
        br.l.e(eVar, "$receiver");
        if (eVar instanceof b0) {
            return ((b0) eVar).Z();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static i X(lt.c cVar) {
        br.l.e(cVar, "$receiver");
        if (cVar instanceof h) {
            return ((h) cVar).f13846g;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, cVar.getClass(), sb2).toString());
    }

    public static b0 Y(r rVar) {
        if (rVar instanceof r) {
            return rVar.f10939g;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(rVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, rVar.getClass(), sb2).toString());
    }

    public static b0 Z(lt.e eVar, boolean z10) {
        br.l.e(eVar, "$receiver");
        if (eVar instanceof b0) {
            return ((b0) eVar).p0(z10);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case 10:
                objArr[0] = "subtype";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
                objArr[0] = "supertype";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "assertSubtype";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static lt.d a0(b bVar, lt.d dVar) {
        if (dVar instanceof lt.e) {
            return bVar.V((lt.e) dVar, true);
        }
        if (!(dVar instanceof r)) {
            throw new IllegalStateException("sealed");
        }
        r rVar = (r) dVar;
        return bVar.n(bVar.V(bVar.b0(rVar), true), bVar.V(bVar.k(rVar), true));
    }

    public static boolean b(lt.g gVar, lt.g gVar2) {
        br.l.e(gVar, "c1");
        br.l.e(gVar2, "c2");
        if (!(gVar instanceof m0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(gVar);
            sb2.append(", ");
            throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
        }
        if (gVar2 instanceof m0) {
            return gVar.equals(gVar2);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(gVar2);
        sb3.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar2.getClass(), sb3).toString());
    }

    public static int c(lt.d dVar) {
        br.l.e(dVar, "$receiver");
        if (dVar instanceof ht.x) {
            return ((ht.x) dVar).L().size();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, dVar.getClass(), sb2).toString());
    }

    public static lt.f d(lt.e eVar) {
        br.l.e(eVar, "$receiver");
        if (eVar instanceof b0) {
            return (lt.f) eVar;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static lt.c e(b bVar, lt.e eVar) {
        br.l.e(eVar, "$receiver");
        if (eVar instanceof b0) {
            if (eVar instanceof e0) {
                return bVar.L(((e0) eVar).f10895d);
            }
            if (eVar instanceof h) {
                return (h) eVar;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static ht.n f(lt.e eVar) {
        br.l.e(eVar, "$receiver");
        if (eVar instanceof b0) {
            if (eVar instanceof ht.n) {
                return (ht.n) eVar;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(eVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
    }

    public static r g(lt.d dVar) {
        br.l.e(dVar, "$receiver");
        if (dVar instanceof ht.x) {
            c1 c1VarK0 = ((ht.x) dVar).k0();
            if (c1VarK0 instanceof r) {
                return (r) c1VarK0;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, dVar.getClass(), sb2).toString());
    }

    public static b0 h(lt.d dVar) {
        br.l.e(dVar, "$receiver");
        if (dVar instanceof ht.x) {
            c1 c1VarK0 = ((ht.x) dVar).k0();
            if (c1VarK0 instanceof b0) {
                return (b0) c1VarK0;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, dVar.getClass(), sb2).toString());
    }

    public static g0 i(lt.d dVar) {
        br.l.e(dVar, "$receiver");
        if (dVar instanceof ht.x) {
            return se.b.i((ht.x) dVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, dVar.getClass(), sb2).toString());
    }

    public static b0 j(lt.e eVar, lt.b bVar) {
        List listL;
        ArrayList arrayList;
        br.l.e(bVar, "status");
        if (!(eVar instanceof b0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(eVar);
            sb2.append(", ");
            throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
        }
        b0 b0Var = (b0) eVar;
        e eVar2 = e.f13841a;
        ft.d dVar = null;
        if (b0Var.L().size() == b0Var.Z().o().size() && ((listL = b0Var.L()) == null || !listL.isEmpty())) {
            Iterator it = listL.iterator();
            while (it.hasNext()) {
                if (((p0) it.next()).a() != d1.INVARIANT) {
                    List listO = b0Var.Z().o();
                    br.l.d(listO, "type.constructor.parameters");
                    ArrayList arrayListW0 = mq.o.W0(listL, listO);
                    arrayList = new ArrayList(mq.p.a0(arrayListW0, 10));
                    Iterator it2 = arrayListW0.iterator();
                    while (it2.hasNext()) {
                        lq.l lVar = (lq.l) it2.next();
                        p0 p0VarI = (p0) lVar.f15571a;
                        r0 r0Var = (r0) lVar.f15572d;
                        if (p0VarI.a() != d1.INVARIANT) {
                            c1 c1VarK0 = (p0VarI.c() || p0VarI.a() != d1.IN_VARIANCE) ? null : p0VarI.b().k0();
                            br.l.d(r0Var, "parameter");
                            p0VarI = se.b.i(new h(bVar, new i(p0VarI, dVar, r0Var, 6), c1VarK0, (i0) null, false, 56));
                        }
                        arrayList.add(p0VarI);
                    }
                    x0 x0Var = new x0(n0.f10932b.f(b0Var.Z(), arrayList));
                    int size = listL.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        p0 p0Var = (p0) listL.get(i10);
                        p0 p0Var2 = (p0) arrayList.get(i10);
                        if (p0Var.a() != d1.INVARIANT) {
                            List upperBounds = ((r0) b0Var.Z().o().get(i10)).getUpperBounds();
                            br.l.d(upperBounds, "type.constructor.parameters[index].upperBounds");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = upperBounds.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(eVar2.z(x0Var.g((ht.x) it3.next(), d1.INVARIANT).k0()));
                            }
                            if (!p0Var.c() && p0Var.a() == d1.OUT_VARIANCE) {
                                arrayList2.add(eVar2.z(p0Var.b().k0()));
                            }
                            ht.x xVarB = p0Var2.b();
                            br.l.c(xVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            i iVar = ((h) xVarB).f13846g;
                            iVar.getClass();
                            iVar.f13851b = new ft.d(2, arrayList2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return ht.e.r(b0Var.X(), b0Var.Z(), arrayList, b0Var.c0());
        }
        return null;
    }

    public static lt.b k(lt.c cVar) {
        if (cVar instanceof h) {
            return ((h) cVar).f13845d;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, cVar.getClass(), sb2).toString());
    }

    public static l0 l(boolean z10, e eVar, int i10) {
        e eVar2 = e.f13842d;
        if ((i10 & 8) != 0) {
            eVar = e.f13841a;
        }
        return new l0(z10, true, eVar2, eVar, f.f13843a);
    }

    public static c1 m(b bVar, lt.e eVar, lt.e eVar2) {
        br.l.e(eVar, "lowerBound");
        br.l.e(eVar2, "upperBound");
        if (!(eVar instanceof b0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(bVar);
            sb2.append(", ");
            throw new IllegalArgumentException(h0.b.k(x.f2918a, bVar.getClass(), sb2).toString());
        }
        if (eVar2 instanceof b0) {
            return ht.e.j((b0) eVar, (b0) eVar2);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(bVar);
        sb3.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, bVar.getClass(), sb3).toString());
    }

    public static final String n(m0 m0Var) {
        StringBuilder sb2 = new StringBuilder();
        o("type: " + m0Var, sb2);
        o("hashCode: " + m0Var.hashCode(), sb2);
        o("javaClass: " + m0Var.getClass().getCanonicalName(), sb2);
        for (rr.l lVarP = m0Var.p(); lVarP != null; lVarP = lVarP.o()) {
            o("fqName: ".concat(ss.j.f22243c.w(lVarP)), sb2);
            o("javaClass: " + lVarP.getClass().getCanonicalName(), sb2);
        }
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void o(String str, StringBuilder sb2) {
        br.l.e(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
    }

    public static p0 p(lt.d dVar, int i10) {
        br.l.e(dVar, "$receiver");
        if (dVar instanceof ht.x) {
            return (p0) ((ht.x) dVar).L().get(i10);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, dVar.getClass(), sb2).toString());
    }

    public static r0 q(lt.g gVar, int i10) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            Object obj = ((m0) gVar).o().get(i10);
            br.l.d(obj, "this.parameters[index]");
            return (r0) obj;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static c1 r(p0 p0Var) {
        br.l.e(p0Var, "$receiver");
        if (p0Var instanceof p0) {
            return p0Var.b().k0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(p0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, p0Var.getClass(), sb2).toString());
    }

    public static r0 s(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            rr.i iVarP = ((m0) gVar).p();
            if (iVarP instanceof r0) {
                return (r0) iVarP;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static lt.i t(p0 p0Var) {
        br.l.e(p0Var, "$receiver");
        if (p0Var instanceof p0) {
            d1 d1VarA = p0Var.a();
            br.l.d(d1VarA, "this.projectionKind");
            return vc.e.k(d1VarA);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(p0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, p0Var.getClass(), sb2).toString());
    }

    public static boolean u(lt.d dVar, qs.c cVar) {
        br.l.e(dVar, "$receiver");
        br.l.e(cVar, "fqName");
        if (dVar instanceof ht.x) {
            return ((ht.x) dVar).getAnnotations().G(cVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, dVar.getClass(), sb2).toString());
    }

    public static boolean v(r0 r0Var, lt.g gVar) {
        if (gVar == null ? true : gVar instanceof m0) {
            return se.b.E(r0Var, (m0) gVar, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(r0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, r0Var.getClass(), sb2).toString());
    }

    public static boolean w(lt.e eVar, lt.e eVar2) {
        br.l.e(eVar, "a");
        br.l.e(eVar2, "b");
        if (!(eVar instanceof b0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(eVar);
            sb2.append(", ");
            throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar.getClass(), sb2).toString());
        }
        if (eVar2 instanceof b0) {
            return ((b0) eVar).L() == ((b0) eVar2).L();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(eVar2);
        sb3.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, eVar2.getClass(), sb3).toString());
    }

    public static boolean x(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            return or.h.H((m0) gVar, or.n.f19686a);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static boolean y(lt.g gVar) {
        br.l.e(gVar, "$receiver");
        if (gVar instanceof m0) {
            return ((m0) gVar).p() instanceof rr.f;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }

    public static boolean z(lt.g gVar) {
        if (gVar instanceof m0) {
            rr.i iVarP = ((m0) gVar).p();
            rr.f fVar = iVarP instanceof rr.f ? (rr.f) iVarP : null;
            return (fVar == null || fVar.j() != z.FINAL || fVar.f() == rr.g.ENUM_CLASS || fVar.f() == rr.g.ENUM_ENTRY || fVar.f() == rr.g.ANNOTATION_CLASS) ? false : true;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(gVar);
        sb2.append(", ");
        throw new IllegalArgumentException(h0.b.k(x.f2918a, gVar.getClass(), sb2).toString());
    }
}
