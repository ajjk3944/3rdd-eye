package ht;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final c1 A(c1 c1Var, x xVar) {
        br.l.e(c1Var, "<this>");
        if (c1Var instanceof b1) {
            return A(((b1) c1Var).K(), xVar);
        }
        if (xVar == null || xVar.equals(c1Var)) {
            return c1Var;
        }
        if (c1Var instanceof b0) {
            return new e0((b0) c1Var, xVar);
        }
        if (c1Var instanceof r) {
            return new t((r) c1Var, xVar);
        }
        throw new bf.n();
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final b0 b(x xVar) {
        br.l.e(xVar, "<this>");
        c1 c1VarK0 = xVar.k0();
        b0 b0Var = c1VarK0 instanceof b0 ? (b0) c1VarK0 : null;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + xVar).toString());
    }

    public static final x c(ArrayList arrayList, List list, or.h hVar) {
        x xVarI = new x0(new h0(0, arrayList)).i((x) mq.o.r0(list), d1.OUT_VARIANCE);
        return xVarI == null ? hVar.m() : xVarI;
    }

    public static final lt.d d(lt.d dVar, HashSet hashSet) {
        lt.d dVarD;
        jt.e eVar = jt.e.f13842d;
        m0 m0VarP = eVar.p(dVar);
        if (!hashSet.add(m0VarP)) {
            return null;
        }
        rr.r0 r0VarS = jt.g.s(m0VarP);
        if (r0VarS != null) {
            lt.d dVarD2 = se.b.D(r0VarS);
            lt.d dVarD3 = d(dVarD2, hashSet);
            if (dVarD3 != null) {
                return ((dVarD3 instanceof lt.e) && jt.g.I((lt.e) dVarD3) && jt.g.H(dVar) && (jt.g.C(eVar.p(dVarD2)) || ((dVarD2 instanceof lt.e) && jt.g.I((lt.e) dVarD2)))) ? eVar.r(dVarD2) : (!jt.g.H(dVarD3) && (dVar instanceof lt.e) && jt.g.F((lt.e) dVar)) ? eVar.r(dVarD3) : dVarD3;
            }
            return null;
        }
        if (jt.g.C(m0VarP)) {
            br.l.e(dVar, "$receiver");
            if (!(dVar instanceof x)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(dVar);
                sb2.append(", ");
                throw new IllegalArgumentException(h0.b.k(br.x.f2918a, dVar.getClass(), sb2).toString());
            }
            b0 b0VarF = ts.h.f((x) dVar);
            if (b0VarF == null || (dVarD = d(b0VarF, hashSet)) == null) {
                return null;
            }
            if (!jt.g.H(dVar)) {
                return dVarD;
            }
            if (!jt.g.H(dVarD) && (!(dVarD instanceof lt.e) || !jt.g.I((lt.e) dVarD))) {
                return eVar.r(dVarD);
            }
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final x e(x xVar) {
        br.l.e(xVar, "<this>");
        if (xVar instanceof b1) {
            return ((b1) xVar).x();
        }
        return null;
    }

    public static boolean f(l0 l0Var, lt.e eVar, c cVar) {
        k0 k0Var = k0.f10918c;
        br.l.e(eVar, "type");
        jt.b bVar = l0Var.f10923c;
        if ((bVar.k0(eVar) && !bVar.u(eVar)) || bVar.o(eVar)) {
            return true;
        }
        l0Var.b();
        ArrayDeque arrayDeque = l0Var.f10927g;
        br.l.b(arrayDeque);
        rt.h hVar = l0Var.f10928h;
        br.l.b(hVar);
        arrayDeque.push(eVar);
        while (!arrayDeque.isEmpty()) {
            if (hVar.f21797d > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + eVar + ". Supertypes = " + mq.o.x0(hVar, null, null, null, null, 63)).toString());
            }
            lt.e eVar2 = (lt.e) arrayDeque.pop();
            br.l.d(eVar2, "current");
            if (hVar.add(eVar2)) {
                c cVar2 = bVar.u(eVar2) ? k0Var : cVar;
                if (cVar2.equals(k0Var)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    Iterator it = bVar.G(bVar.B(eVar2)).iterator();
                    while (it.hasNext()) {
                        lt.e eVarX = cVar2.x(l0Var, (lt.d) it.next());
                        if ((bVar.k0(eVarX) && !bVar.u(eVarX)) || bVar.o(eVarX)) {
                            l0Var.a();
                            return true;
                        }
                        arrayDeque.add(eVarX);
                    }
                }
            }
        }
        l0Var.a();
        return false;
    }

    public static final c1 g(c1 c1Var, x xVar) {
        br.l.e(c1Var, "<this>");
        br.l.e(xVar, "origin");
        return A(c1Var, e(xVar));
    }

    public static boolean h(l0 l0Var, lt.e eVar, lt.g gVar) {
        jt.b bVar = l0Var.f10923c;
        if (bVar.K(eVar)) {
            return true;
        }
        if (bVar.u(eVar)) {
            return false;
        }
        if (l0Var.f10922b) {
            bVar.d0(eVar);
        }
        return bVar.H(bVar.B(eVar), gVar);
    }

    public static final boolean i(x xVar) {
        br.l.e(xVar, "<this>");
        c1 c1VarK0 = xVar.k0();
        if (c1VarK0 instanceof kt.h) {
            return true;
        }
        return (c1VarK0 instanceof r) && (((r) c1VarK0).u0() instanceof kt.h);
    }

    public static final boolean j(x xVar) {
        br.l.e(xVar, "<this>");
        return xVar.k0() instanceof r;
    }

    public static final b0 k(x xVar) {
        br.l.e(xVar, "<this>");
        c1 c1VarK0 = xVar.k0();
        if (c1VarK0 instanceof r) {
            return ((r) c1VarK0).f10938d;
        }
        if (c1VarK0 instanceof b0) {
            return (b0) c1VarK0;
        }
        throw new bf.n();
    }

    public static final c1 l(c1 c1Var, boolean z10) {
        br.l.e(c1Var, "<this>");
        n nVarP = e.p(c1Var, z10);
        if (nVarP != null) {
            return nVarP;
        }
        b0 b0VarM = m(c1Var);
        return b0VarM != null ? b0VarM : c1Var.p0(false);
    }

    public static final b0 m(c1 c1Var) {
        w wVar;
        m0 m0VarZ = c1Var.Z();
        w wVar2 = m0VarZ instanceof w ? (w) m0VarZ : null;
        if (wVar2 != null) {
            LinkedHashSet<x> linkedHashSet = wVar2.f10951b;
            ArrayList arrayList = new ArrayList(mq.p.a0(linkedHashSet, 10));
            boolean z10 = false;
            for (x xVarL : linkedHashSet) {
                if (a1.e(xVarL)) {
                    xVarL = l(xVarL.k0(), false);
                    z10 = true;
                }
                arrayList.add(xVarL);
            }
            if (z10) {
                x xVarL2 = wVar2.f10950a;
                if (xVarL2 == null) {
                    xVarL2 = null;
                } else if (a1.e(xVarL2)) {
                    xVarL2 = l(xVarL2.k0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                wVar = new w(linkedHashSet2);
                wVar.f10950a = xVarL2;
            } else {
                wVar = null;
            }
            if (wVar != null) {
                return wVar.b();
            }
        }
        return null;
    }

    public static final b0 n(b0 b0Var, List list, i0 i0Var) {
        br.l.e(b0Var, "<this>");
        br.l.e(list, "newArguments");
        br.l.e(i0Var, "newAttributes");
        if (list.isEmpty() && i0Var == b0Var.X()) {
            return b0Var;
        }
        if (list.isEmpty()) {
            return b0Var.r0(i0Var);
        }
        if (!(b0Var instanceof kt.h)) {
            return e.r(i0Var, b0Var.Z(), list, b0Var.c0());
        }
        kt.h hVar = (kt.h) b0Var;
        m0 m0Var = hVar.f14512d;
        kt.f fVar = hVar.f14513g;
        kt.j jVar = hVar.f14514r;
        boolean z10 = hVar.f14516y;
        String[] strArr = hVar.B;
        return new kt.h(m0Var, fVar, jVar, list, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static x o(x xVar, List list, sr.h hVar, int i10) {
        if ((i10 & 2) != 0) {
            hVar = xVar.getAnnotations();
        }
        br.l.e(xVar, "<this>");
        if ((list.isEmpty() || list == xVar.L()) && hVar == xVar.getAnnotations()) {
            return xVar;
        }
        i0 i0VarX = xVar.X();
        if ((hVar instanceof sr.l) && hVar.isEmpty()) {
            hVar = sr.g.f22217a;
        }
        i0 i0VarQ = q(i0VarX, hVar);
        c1 c1VarK0 = xVar.k0();
        if (c1VarK0 instanceof r) {
            r rVar = (r) c1VarK0;
            return e.j(n(rVar.f10938d, list, i0VarQ), n(rVar.f10939g, list, i0VarQ));
        }
        if (c1VarK0 instanceof b0) {
            return n((b0) c1VarK0, list, i0VarQ);
        }
        throw new bf.n();
    }

    public static /* synthetic */ b0 p(b0 b0Var, List list, i0 i0Var, int i10) {
        if ((i10 & 1) != 0) {
            list = b0Var.L();
        }
        if ((i10 & 2) != 0) {
            i0Var = b0Var.X();
        }
        return n(b0Var, list, i0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ht.i0 q(ht.i0 r5, sr.h r6) {
        /*
            java.lang.String r0 = "<this>"
            br.l.e(r5, r0)
            sr.h r0 = ht.j.a(r5)
            if (r0 != r6) goto Lc
            return r5
        Lc:
            c9.l r0 = ht.j.f10913b
            ir.v[] r1 = ht.j.f10912a
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.b(r1, r5)
            ht.i r0 = (ht.i) r0
            if (r0 == 0) goto L5f
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L22
            goto L50
        L22:
            ot.a r1 = r5.f19796a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r1.next()
            r4 = r3
            ht.i r4 = (ht.i) r4
            boolean r4 = br.l.a(r4, r0)
            if (r4 != 0) goto L2d
            r2.add(r3)
            goto L2d
        L44:
            int r0 = r2.size()
            ot.a r1 = r5.f19796a
            int r1 = r1.a()
            if (r0 != r1) goto L52
        L50:
            r0 = r5
            goto L5b
        L52:
            bm.e r0 = ht.i0.f10910d
            r0.getClass()
            ht.i0 r0 = bm.e.m(r2)
        L5b:
            if (r0 != 0) goto L5e
            goto L5f
        L5e:
            r5 = r0
        L5f:
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L70
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L70
            goto L8b
        L70:
            ht.i r0 = new ht.i
            r0.<init>(r6)
            bm.e r6 = ht.i0.f10910d
            java.lang.Class<ht.i> r1 = ht.i.class
            br.y r2 = br.x.f2918a
            ir.d r1 = r2.b(r1)
            int r6 = r6.z(r1)
            ot.a r1 = r5.f19796a
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L8c
        L8b:
            return r5
        L8c:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L9c
            ht.i0 r5 = new ht.i0
            java.util.List r6 = com.google.android.gms.internal.measurement.e5.H(r0)
            r5.<init>(r6)
            return r5
        L9c:
            java.util.List r5 = mq.o.Q0(r5)
            java.util.ArrayList r5 = mq.o.F0(r5, r0)
            ht.i0 r5 = bm.e.m(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ht.c.q(ht.i0, sr.h):ht.i0");
    }

    public static final x r(rr.r0 r0Var) {
        br.l.e(r0Var, "<this>");
        rr.l lVarO = r0Var.o();
        br.l.d(lVarO, "this.containingDeclaration");
        if (lVarO instanceof rr.j) {
            List listO = ((rr.j) lVarO).v().o();
            br.l.d(listO, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(mq.p.a0(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                m0 m0VarV = ((rr.r0) it.next()).v();
                br.l.d(m0VarV, "it.typeConstructor");
                arrayList.add(m0VarV);
            }
            List upperBounds = r0Var.getUpperBounds();
            br.l.d(upperBounds, "upperBounds");
            return c(arrayList, upperBounds, xs.d.e(r0Var));
        }
        if (!(lVarO instanceof rr.u)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((rr.u) lVarO).getTypeParameters();
        br.l.d(typeParameters, "descriptor.typeParameters");
        ArrayList arrayList2 = new ArrayList(mq.p.a0(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            m0 m0VarV2 = ((rr.r0) it2.next()).v();
            br.l.d(m0VarV2, "it.typeConstructor");
            arrayList2.add(m0VarV2);
        }
        List upperBounds2 = r0Var.getUpperBounds();
        br.l.d(upperBounds2, "upperBounds");
        return c(arrayList2, upperBounds2, xs.d.e(r0Var));
    }

    public static boolean s(jt.b bVar, lt.e eVar, lt.e eVar2) {
        if (bVar.g(eVar) == bVar.g(eVar2) && bVar.u(eVar) == bVar.u(eVar2)) {
            if ((bVar.i(eVar) == null) == (bVar.i(eVar2) == null) && bVar.H(bVar.B(eVar), bVar.B(eVar2))) {
                if (!bVar.T(eVar, eVar2)) {
                    int iG = bVar.g(eVar);
                    for (int i10 = 0; i10 < iG; i10++) {
                        p0 p0VarZ = bVar.Z(eVar, i10);
                        p0 p0VarZ2 = bVar.Z(eVar2, i10);
                        if (bVar.g0(p0VarZ) == bVar.g0(p0VarZ2) && (bVar.g0(p0VarZ) || (bVar.I(p0VarZ) == bVar.I(p0VarZ2) && t(bVar, bVar.m(p0VarZ), bVar.m(p0VarZ2))))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean t(jt.b bVar, lt.d dVar, lt.d dVar2) {
        if (dVar == dVar2) {
            return true;
        }
        b0 b0VarX = bVar.x(dVar);
        b0 b0VarX2 = bVar.x(dVar2);
        if (b0VarX != null && b0VarX2 != null) {
            return s(bVar, b0VarX, b0VarX2);
        }
        r rVarS = bVar.s(dVar);
        r rVarS2 = bVar.s(dVar2);
        return rVarS != null && rVarS2 != null && s(bVar, bVar.b0(rVarS), bVar.b0(rVarS2)) && s(bVar, bVar.k(rVarS), bVar.k(rVarS2));
    }

    public static x0 u(List list, s0 s0Var, rr.l lVar, ArrayList arrayList) {
        if (s0Var == null) {
            a(1);
            throw null;
        }
        if (lVar == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        x0 x0VarV = v(list, s0Var, lVar, arrayList, null);
        if (x0VarV != null) {
            return x0VarV;
        }
        throw new AssertionError("Substitution failed");
    }

    public static x0 v(List list, s0 s0Var, rr.l lVar, List list2, boolean[] zArr) {
        if (s0Var == null) {
            a(6);
            throw null;
        }
        if (lVar == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            rr.r0 r0Var = (rr.r0) it.next();
            ur.o0 o0VarX1 = ur.o0.x1(lVar, r0Var.getAnnotations(), r0Var.F(), r0Var.N(), r0Var.getName(), i10, r0Var.g0());
            map.put(r0Var.v(), new g0(o0VarX1.q()));
            map2.put(r0Var, o0VarX1);
            list2.add(o0VarX1);
            i10++;
        }
        h0 h0Var = new h0(1, map);
        x0 x0VarE = x0.e(s0Var, h0Var);
        x0 x0VarE2 = x0.e(new r0(s0Var, 0), h0Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            rr.r0 r0Var2 = (rr.r0) it2.next();
            ur.o0 o0Var = (ur.o0) map2.get(r0Var2);
            for (x xVar : r0Var2.getUpperBounds()) {
                rr.i iVarP = xVar.Z().p();
                x xVarI = (((iVarP instanceof rr.r0) && se.b.E((rr.r0) iVarP, null, null)) ? x0VarE : x0VarE2).i(xVar, d1.OUT_VARIANCE);
                if (xVarI == null) {
                    return null;
                }
                if (xVarI != xVar && zArr != null) {
                    zArr[0] = true;
                }
                if (o0Var.I) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + o0Var.z1());
                }
                if (!i(xVarI)) {
                    o0Var.H.add(xVarI);
                }
            }
            if (o0Var.I) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + o0Var.z1());
            }
            o0Var.I = true;
        }
        return x0VarE;
    }

    public static final i0 w(sr.h hVar) {
        br.l.e(hVar, "<this>");
        if (hVar.isEmpty()) {
            i0.f10910d.getClass();
            return i0.f10911g;
        }
        bm.e eVar = i0.f10910d;
        List listH = e5.H(new i(hVar));
        eVar.getClass();
        return bm.e.m(listH);
    }

    public static final b0 y(x xVar) {
        br.l.e(xVar, "<this>");
        c1 c1VarK0 = xVar.k0();
        if (c1VarK0 instanceof r) {
            return ((r) c1VarK0).f10939g;
        }
        if (c1VarK0 instanceof b0) {
            return (b0) c1VarK0;
        }
        throw new bf.n();
    }

    public static final b0 z(b0 b0Var, b0 b0Var2) {
        br.l.e(b0Var, "<this>");
        br.l.e(b0Var2, "abbreviatedType");
        return i(b0Var) ? b0Var : new a(b0Var, b0Var2);
    }

    public abstract lt.e x(l0 l0Var, lt.d dVar);
}
