package ht;

import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10894a = new e();

    public static final boolean b(jt.b bVar, lt.e eVar) {
        if (bVar.P(eVar)) {
            return true;
        }
        if (!(eVar instanceof lt.c)) {
            return false;
        }
        p0 p0VarW = bVar.W(bVar.b((lt.c) eVar));
        return !bVar.g0(p0VarW) && bVar.P(bVar.C(bVar.m(p0VarW)));
    }

    public static final boolean c(jt.b bVar, l0 l0Var, lt.e eVar, lt.e eVar2, boolean z10) {
        Collection<lt.d> collectionF0 = bVar.f0(eVar);
        if ((collectionF0 instanceof Collection) && collectionF0.isEmpty()) {
            return false;
        }
        for (lt.d dVar : collectionF0) {
            if (br.l.a(bVar.p(dVar), bVar.B(eVar2))) {
                return true;
            }
            if (z10 && n(f10894a, l0Var, eVar2, dVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(l0 l0Var, lt.e eVar, lt.g gVar) {
        c cVarF;
        k0 k0Var = k0.f10918c;
        jt.b bVar = l0Var.f10923c;
        bVar.d(eVar, gVar);
        if (bVar.l(gVar) || !bVar.k0(eVar)) {
            if (!bVar.R(gVar)) {
                rt.f fVar = new rt.f();
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
                        b0 b0VarP0 = bVar.p0(eVar2, lt.b.FOR_SUBTYPING);
                        if (b0VarP0 == null) {
                            b0VarP0 = eVar2;
                        }
                        if (bVar.H(bVar.B(b0VarP0), gVar)) {
                            fVar.add(b0VarP0);
                            cVarF = k0Var;
                        } else {
                            cVarF = bVar.g(b0VarP0) == 0 ? k0.f10917b : bVar.f(b0VarP0);
                        }
                        if (cVarF.equals(k0Var)) {
                            cVarF = null;
                        }
                        if (cVarF != null) {
                            Iterator it = bVar.G(bVar.B(eVar2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(cVarF.x(l0Var, (lt.d) it.next()));
                            }
                        }
                    }
                }
                l0Var.a();
                return fVar;
            }
            if (bVar.H(bVar.B(eVar), gVar)) {
                b0 b0VarP02 = bVar.p0(eVar, lt.b.FOR_SUBTYPING);
                if (b0VarP02 != null) {
                    eVar = b0VarP02;
                }
                return e5.H(eVar);
            }
        }
        return mq.w.f16945a;
    }

    public static List e(l0 l0Var, lt.e eVar, lt.g gVar) {
        int i10;
        List listD = d(l0Var, eVar, gVar);
        jt.b bVar = l0Var.f10923c;
        if (listD.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                lt.f fVarC = bVar.c((lt.e) obj);
                int iO0 = bVar.o0(fVarC);
                while (true) {
                    if (i10 >= iO0) {
                        arrayList.add(obj);
                        break;
                    }
                    i10 = bVar.s(bVar.m(bVar.a0(fVarC, i10))) == null ? i10 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listD;
    }

    public static boolean g(l0 l0Var, lt.d dVar, lt.d dVar2) {
        br.l.e(dVar, "a");
        br.l.e(dVar2, "b");
        jt.b bVar = l0Var.f10923c;
        if (dVar == dVar2) {
            return true;
        }
        if (l(bVar, dVar) && l(bVar, dVar2)) {
            c1 c1VarC = l0Var.c(l0Var.d(dVar));
            c1 c1VarC2 = l0Var.c(l0Var.d(dVar2));
            b0 b0VarH0 = bVar.h0(c1VarC);
            if (!bVar.H(bVar.p(c1VarC), bVar.p(c1VarC2))) {
                return false;
            }
            if (bVar.g(b0VarH0) == 0) {
                return bVar.F(c1VarC) || bVar.F(c1VarC2) || bVar.u(b0VarH0) == bVar.u(bVar.h0(c1VarC2));
            }
        }
        e eVar = f10894a;
        return n(eVar, l0Var, dVar, dVar2) && n(eVar, l0Var, dVar2, dVar);
    }

    public static final c1 j(b0 b0Var, b0 b0Var2) {
        br.l.e(b0Var, "lowerBound");
        br.l.e(b0Var2, "upperBound");
        return b0Var.equals(b0Var2) ? b0Var : new s(b0Var, b0Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r6.i0(r6.p(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static rr.r0 k(jt.b r6, lt.d r7, lt.d r8) {
        /*
            int r0 = r6.g(r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            ht.p0 r4 = r6.Z(r7, r2)
            boolean r5 = r6.g0(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            ht.c1 r3 = r6.m(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            ht.b0 r4 = r6.h0(r3)
            lt.e r4 = r6.e(r4)
            boolean r4 = r6.n0(r4)
            if (r4 == 0) goto L3b
            ht.b0 r4 = r6.h0(r8)
            lt.e r4 = r6.e(r4)
            boolean r4 = r6.n0(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            ht.m0 r4 = r6.p(r3)
            ht.m0 r5 = r6.p(r8)
            boolean r4 = br.l.a(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            rr.r0 r3 = k(r6, r3, r8)
            if (r3 == 0) goto L63
            return r3
        L5a:
            ht.m0 r7 = r6.p(r7)
            rr.r0 r6 = r6.i0(r7, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ht.e.k(jt.b, lt.d, lt.d):rr.r0");
    }

    public static boolean l(jt.b bVar, lt.d dVar) {
        if (!bVar.D(bVar.p(dVar))) {
            return false;
        }
        bVar.a(dVar);
        return (bVar.o(dVar) || bVar.A(dVar) || !br.l.a(bVar.B(bVar.h0(dVar)), bVar.B(bVar.C(dVar)))) ? false : true;
    }

    public static boolean m(l0 l0Var, lt.f fVar, lt.e eVar) {
        boolean zG;
        br.l.e(fVar, "capturedSubArguments");
        jt.b bVar = l0Var.f10923c;
        m0 m0VarB = bVar.B(eVar);
        int iO0 = bVar.o0(fVar);
        int iE0 = bVar.e0(m0VarB);
        if (iO0 == iE0 && iO0 == bVar.g(eVar)) {
            for (int i10 = 0; i10 < iE0; i10++) {
                p0 p0VarZ = bVar.Z(eVar, i10);
                if (!bVar.g0(p0VarZ)) {
                    c1 c1VarM = bVar.m(p0VarZ);
                    p0 p0VarA0 = bVar.a0(fVar, i10);
                    bVar.I(p0VarA0);
                    lt.i iVar = lt.i.INV;
                    c1 c1VarM2 = bVar.m(p0VarA0);
                    lt.i iVarM = bVar.M(bVar.i0(m0VarB, i10));
                    lt.i iVarI = bVar.I(p0VarZ);
                    br.l.e(iVarM, "declared");
                    br.l.e(iVarI, "useSite");
                    if (iVarM == iVar) {
                        iVarM = iVarI;
                    } else if (iVarI != iVar && iVarM != iVarI) {
                        iVarM = null;
                    }
                    if (iVarM == null) {
                        return l0Var.f10921a;
                    }
                    if (iVarM == iVar) {
                        o(bVar, c1VarM2, c1VarM);
                        o(bVar, c1VarM, c1VarM2);
                    }
                    int i11 = l0Var.f10926f;
                    if (i11 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + c1VarM2).toString());
                    }
                    l0Var.f10926f = i11 + 1;
                    int i12 = d.f10891a[iVarM.ordinal()];
                    if (i12 != 1) {
                        e eVar2 = f10894a;
                        if (i12 == 2) {
                            zG = n(eVar2, l0Var, c1VarM2, c1VarM);
                        } else {
                            if (i12 != 3) {
                                throw new bf.n();
                            }
                            zG = n(eVar2, l0Var, c1VarM, c1VarM2);
                        }
                    } else {
                        zG = g(l0Var, c1VarM2, c1VarM);
                    }
                    l0Var.f10926f--;
                    if (!zG) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ec A[EDGE_INSN: B:357:0x02ec->B:175:0x02ec BREAK  A[LOOP:11: B:165:0x02c9->B:359:0x02c9]] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, jt.b] */
    /* JADX WARN: Type inference failed for: r8v32, types: [int] */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean n(ht.e r25, ht.l0 r26, lt.d r27, lt.d r28) {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ht.e.n(ht.e, ht.l0, lt.d, lt.d):boolean");
    }

    public static void o(jt.b bVar, lt.d dVar, lt.d dVar2) {
        lt.f fVarX = bVar.x(dVar);
        if (fVarX instanceof lt.c) {
            lt.c cVar = (lt.c) fVarX;
            if (!bVar.j0(cVar) && bVar.g0(bVar.W(bVar.b(cVar))) && bVar.j(cVar) == lt.b.FOR_SUBTYPING) {
                bVar.p(dVar2);
            }
        }
    }

    public static n p(c1 c1Var, boolean z10) {
        boolean zE;
        br.l.e(c1Var, "type");
        if (c1Var instanceof n) {
            return (n) c1Var;
        }
        c1Var.Z();
        if ((c1Var.Z().p() instanceof rr.r0) || (c1Var instanceof jt.h)) {
            rr.i iVarP = c1Var.Z().p();
            ur.o0 o0Var = iVarP instanceof ur.o0 ? (ur.o0) iVarP : null;
            zE = true;
            if (o0Var == null || o0Var.I) {
                zE = (z10 && (c1Var.Z().p() instanceof rr.r0)) ? a1.e(c1Var) : true ^ c.f(jt.g.l(false, null, 24), c.k(c1Var), k0.f10917b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (c1Var instanceof r) {
            r rVar = (r) c1Var;
            br.l.a(rVar.f10938d.Z(), rVar.f10939g.Z());
        }
        return new n(c.k(c1Var).p0(false), z10);
    }

    public static final b0 q(i0 i0Var, rr.f fVar, List list) {
        br.l.e(i0Var, "attributes");
        br.l.e(fVar, "descriptor");
        br.l.e(list, "arguments");
        m0 m0VarV = fVar.v();
        br.l.d(m0VarV, "descriptor.typeConstructor");
        return r(i0Var, m0VarV, list, false);
    }

    public static b0 r(i0 i0Var, m0 m0Var, List list, boolean z10) {
        at.n nVarJ;
        ur.z zVar;
        at.n nVarX;
        at.n nVar;
        at.n nVarH;
        br.l.e(i0Var, "attributes");
        br.l.e(m0Var, "constructor");
        br.l.e(list, "arguments");
        if (i0Var.isEmpty() && list.isEmpty() && !z10 && m0Var.p() != null) {
            rr.i iVarP = m0Var.p();
            br.l.b(iVarP);
            b0 b0VarQ = iVarP.q();
            br.l.d(b0VarQ, "constructor.declarationDescriptor!!.defaultType");
            return b0VarQ;
        }
        rr.i iVarP2 = m0Var.p();
        if (iVarP2 instanceof rr.r0) {
            nVarJ = ((rr.r0) iVarP2).q().W();
        } else {
            if (iVarP2 instanceof rr.f) {
                xs.d.i(xs.d.j(iVarP2));
                boolean zIsEmpty = list.isEmpty();
                jt.f fVar = jt.f.f13843a;
                if (zIsEmpty) {
                    rr.f fVar2 = (rr.f) iVarP2;
                    zVar = fVar2 instanceof ur.z ? (ur.z) fVar2 : null;
                    if (zVar == null || (nVarH = zVar.H(fVar)) == null) {
                        nVarJ = fVar2.H0();
                        br.l.d(nVarJ, "this.unsubstitutedMemberScope");
                    } else {
                        nVar = nVarH;
                    }
                } else {
                    rr.f fVar3 = (rr.f) iVarP2;
                    s0 s0VarF = n0.f10932b.f(m0Var, list);
                    zVar = fVar3 instanceof ur.z ? (ur.z) fVar3 : null;
                    if (zVar == null || (nVarX = zVar.x(s0VarF, fVar)) == null) {
                        nVarJ = fVar3.e0(s0VarF);
                        br.l.d(nVarJ, "this.getMemberScope(\n   …ubstitution\n            )");
                    } else {
                        nVar = nVarX;
                    }
                }
                return t(i0Var, m0Var, list, z10, nVar, new y(i0Var, m0Var, list, z10));
            }
            if (iVarP2 instanceof ft.u) {
                kt.g gVar = kt.g.SCOPE_FOR_ABBREVIATION_TYPE;
                String str = ((ft.u) iVarP2).getName().f21035a;
                br.l.d(str, "descriptor.name.toString()");
                nVarJ = kt.k.a(gVar, true, str);
            } else {
                if (!(m0Var instanceof w)) {
                    throw new IllegalStateException("Unsupported classifier: " + iVarP2 + " for constructor: " + m0Var);
                }
                nVarJ = ic.a.j("member scope for intersection type", ((w) m0Var).f10951b);
            }
        }
        nVar = nVarJ;
        return t(i0Var, m0Var, list, z10, nVar, new y(i0Var, m0Var, list, z10));
    }

    public static final b0 s(at.n nVar, i0 i0Var, m0 m0Var, List list, boolean z10) {
        br.l.e(i0Var, "attributes");
        br.l.e(m0Var, "constructor");
        br.l.e(list, "arguments");
        br.l.e(nVar, "memberScope");
        c0 c0Var = new c0(m0Var, list, z10, nVar, new y(nVar, i0Var, m0Var, list, z10));
        return i0Var.isEmpty() ? c0Var : new d0(c0Var, i0Var);
    }

    public static final b0 t(i0 i0Var, m0 m0Var, List list, boolean z10, at.n nVar, ar.k kVar) {
        br.l.e(i0Var, "attributes");
        br.l.e(m0Var, "constructor");
        br.l.e(list, "arguments");
        br.l.e(nVar, "memberScope");
        c0 c0Var = new c0(m0Var, list, z10, nVar, kVar);
        return i0Var.isEmpty() ? c0Var : new d0(c0Var, i0Var);
    }

    public void a(sr.h hVar, sr.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((sr.b) it.next()).a());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((sr.b) it2.next()).a());
        }
    }

    public s0 f(m0 m0Var, List list) {
        br.l.e(m0Var, "typeConstructor");
        br.l.e(list, "arguments");
        List listO = m0Var.o();
        br.l.d(listO, "typeConstructor.parameters");
        rr.r0 r0Var = (rr.r0) mq.o.A0(listO);
        if (r0Var == null || !r0Var.m0()) {
            return new u((rr.r0[]) listO.toArray(new rr.r0[0]), (p0[]) list.toArray(new p0[0]), false);
        }
        List listO2 = m0Var.o();
        br.l.d(listO2, "typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(mq.p.a0(listO2, 10));
        Iterator it = listO2.iterator();
        while (it.hasNext()) {
            arrayList.add(((rr.r0) it.next()).v());
        }
        return new h0(1, mq.b0.V(mq.o.W0(arrayList, list)));
    }

    public b0 h(kg.r rVar, i0 i0Var, boolean z10, int i10, boolean z11) {
        i0 i0VarM;
        d1 d1Var = d1.INVARIANT;
        ft.u uVar = (ft.u) rVar.f14396d;
        p0 p0VarI = i(new g0(uVar.x1(), d1Var), rVar, null, i10);
        x xVarB = p0VarI.b();
        br.l.d(xVarB, "expandedProjection.type");
        b0 b0VarB = c.b(xVarB);
        if (c.i(b0VarB)) {
            return b0VarB;
        }
        p0VarI.a();
        a(b0VarB.getAnnotations(), j.a(i0Var));
        if (!c.i(b0VarB)) {
            if (c.i(b0VarB)) {
                i0VarM = b0VarB.X();
            } else {
                i0 i0VarX = b0VarB.X();
                bm.e eVar = i0.f10910d;
                br.l.e(i0VarX, "other");
                if (i0Var.isEmpty() && i0VarX.isEmpty()) {
                    i0VarM = i0Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) eVar.f2830d).values();
                    br.l.d(collectionValues, "idPerType.values");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        i iVar = (i) i0Var.f19796a.get(iIntValue);
                        i iVar2 = (i) i0VarX.f19796a.get(iIntValue);
                        if (iVar != null) {
                            if (iVar2 != null) {
                                iVar = new i(y3.f(iVar.f10909a, iVar2.f10909a));
                            }
                            iVar2 = iVar;
                        } else if (iVar2 == null) {
                            iVar2 = null;
                        } else if (iVar != null) {
                            iVar2 = new i(y3.f(iVar2.f10909a, iVar.f10909a));
                        }
                        rt.k.a(arrayList, iVar2);
                    }
                    i0VarM = bm.e.m(arrayList);
                }
            }
            b0VarB = c.p(b0VarB, null, i0VarM, 1);
        }
        b0 b0VarI = a1.i(b0VarB, z10);
        if (!z11) {
            return b0VarI;
        }
        ur.e eVar2 = uVar.D;
        br.l.d(eVar2, "descriptor.typeConstructor");
        return c.z(b0VarI, s(at.m.f2303b, i0Var, eVar2, (List) rVar.f14397g, z10));
    }

    public p0 i(p0 p0Var, kg.r rVar, rr.r0 r0Var, int i10) {
        d1 d1VarN;
        d1 d1Var;
        d1 d1Var2;
        ft.u uVar = (ft.u) rVar.f14396d;
        if (i10 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + uVar.getName());
        }
        if (p0Var.c()) {
            br.l.b(r0Var);
            return a1.j(r0Var);
        }
        x xVarB = p0Var.b();
        br.l.d(xVarB, "underlyingProjection.type");
        m0 m0VarZ = xVarB.Z();
        br.l.e(m0VarZ, "constructor");
        rr.i iVarP = m0VarZ.p();
        p0 p0Var2 = iVarP instanceof rr.r0 ? (p0) ((Map) rVar.f14398r).get(iVarP) : null;
        if (p0Var2 != null) {
            if (p0Var2.c()) {
                br.l.b(r0Var);
                return a1.j(r0Var);
            }
            c1 c1VarK0 = p0Var2.b().k0();
            d1 d1VarA = p0Var2.a();
            br.l.d(d1VarA, "argument.projectionKind");
            d1 d1VarA2 = p0Var.a();
            br.l.d(d1VarA2, "underlyingProjection.projectionKind");
            if (d1VarA2 != d1VarA && d1VarA2 != (d1Var2 = d1.INVARIANT) && d1VarA == d1Var2) {
                d1VarA = d1VarA2;
            }
            if (r0Var == null || (d1VarN = r0Var.N()) == null) {
                d1VarN = d1.INVARIANT;
            }
            br.l.d(d1VarN, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
            if (d1VarN != d1VarA && d1VarN != (d1Var = d1.INVARIANT) && d1VarA == d1Var) {
                d1VarA = d1Var;
            }
            a(xVarB.getAnnotations(), c1VarK0.getAnnotations());
            b0 b0VarI = a1.i(c.b(c1VarK0), xVarB.c0());
            i0 i0VarX = xVarB.X();
            if (!c.i(b0VarI)) {
                if (c.i(b0VarI)) {
                    i0VarX = b0VarI.X();
                } else {
                    i0 i0VarX2 = b0VarI.X();
                    i0VarX.getClass();
                    bm.e eVar = i0.f10910d;
                    br.l.e(i0VarX2, "other");
                    if (!i0VarX.isEmpty() || !i0VarX2.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Collection collectionValues = ((ConcurrentHashMap) eVar.f2830d).values();
                        br.l.d(collectionValues, "idPerType.values");
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            i iVar = (i) i0VarX.f19796a.get(iIntValue);
                            i iVar2 = (i) i0VarX2.f19796a.get(iIntValue);
                            if (iVar != null) {
                                if (iVar2 != null) {
                                    iVar = new i(y3.f(iVar.f10909a, iVar2.f10909a));
                                }
                                iVar2 = iVar;
                            } else if (iVar2 == null) {
                                iVar2 = null;
                            } else if (iVar != null) {
                                iVar2 = new i(y3.f(iVar2.f10909a, iVar.f10909a));
                            }
                            rt.k.a(arrayList, iVar2);
                        }
                        i0VarX = bm.e.m(arrayList);
                    }
                }
                b0VarI = c.p(b0VarI, null, i0VarX, 1);
            }
            return new g0(b0VarI, d1VarA);
        }
        b0 b0VarB = c.b(p0Var.b().k0());
        if (!c.i(b0VarB) && a1.c(b0VarB, mt.a.f16999r, null)) {
            m0 m0VarZ2 = b0VarB.Z();
            rr.i iVarP2 = m0VarZ2.p();
            m0VarZ2.o().size();
            b0VarB.L().size();
            if (!(iVarP2 instanceof rr.r0)) {
                int i11 = 0;
                if (!(iVarP2 instanceof ft.u)) {
                    b0 b0VarU = u(b0VarB, rVar, i10);
                    x0.d(b0VarU);
                    for (Object obj : b0VarU.L()) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e5.Q();
                            throw null;
                        }
                        p0 p0Var3 = (p0) obj;
                        if (!p0Var3.c()) {
                            x xVarB2 = p0Var3.b();
                            br.l.d(xVarB2, "substitutedArgument.type");
                            if (!a1.c(xVarB2, mt.a.f16998g, null)) {
                            }
                        }
                        i11 = i12;
                    }
                    return new g0(b0VarU, p0Var.a());
                }
                ft.u uVar2 = (ft.u) iVarP2;
                if (rVar.p(uVar2)) {
                    d1 d1Var3 = d1.INVARIANT;
                    kt.j jVar = kt.j.RECURSIVE_TYPE_ALIAS;
                    String str = uVar2.getName().f21035a;
                    br.l.d(str, "typeDescriptor.name.toString()");
                    return new g0(kt.k.c(jVar, str), d1Var3);
                }
                List listL = b0VarB.L();
                ArrayList arrayList2 = new ArrayList(mq.p.a0(listL, 10));
                for (Object obj2 : listL) {
                    int i13 = i11 + 1;
                    if (i11 < 0) {
                        e5.Q();
                        throw null;
                    }
                    arrayList2.add(i((p0) obj2, rVar, (rr.r0) m0VarZ2.o().get(i11), i10 + 1));
                    i11 = i13;
                }
                List listO = uVar2.D.o();
                ArrayList arrayList3 = new ArrayList(mq.p.a0(listO, 10));
                Iterator it2 = listO.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((rr.r0) it2.next()).u1());
                }
                return new g0(c.z(h(new kg.r(rVar, uVar2, arrayList2, mq.b0.V(mq.o.W0(arrayList3, arrayList2))), b0VarB.X(), b0VarB.c0(), i10 + 1, false), u(b0VarB, rVar, i10)), p0Var.a());
            }
        }
        return p0Var;
    }

    public b0 u(b0 b0Var, kg.r rVar, int i10) {
        m0 m0VarZ = b0Var.Z();
        List listL = b0Var.L();
        ArrayList arrayList = new ArrayList(mq.p.a0(listL, 10));
        int i11 = 0;
        for (Object obj : listL) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                e5.Q();
                throw null;
            }
            p0 p0Var = (p0) obj;
            p0 p0VarI = i(p0Var, rVar, (rr.r0) m0VarZ.o().get(i11), i10 + 1);
            if (!p0VarI.c()) {
                p0VarI = new g0(a1.h(p0VarI.b(), p0Var.b().c0()), p0VarI.a());
            }
            arrayList.add(p0VarI);
            i11 = i12;
        }
        return c.p(b0Var, arrayList, null, 2);
    }
}
