package u0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final b4.b f34932a = new b4.b(13);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f34933b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f34934c = new g0();

    public static final c1.l A(p.r[] rVarArr, i1 i1Var, i1 i1Var2) {
        c1.l lVar = c1.l.f2565d;
        c1.k kVar = new c1.k(lVar);
        kVar.g = lVar;
        for (p.r rVar : rVarArr) {
            k1 k1Var = (k1) rVar.f30840f;
            if (rVar.f30839e || !((c1.l) i1Var).containsKey(k1Var)) {
                kVar.put(k1Var, k1Var.c(rVar, (q2) ((c1.l) i1Var2).get(k1Var)));
            }
        }
        return kVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(p.r r11, mk.e r12, u0.p r13, int r14) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.X(r0)
            com.google.android.gms.internal.ads.lb r0 = r13.f34919x
            u0.i1 r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            u0.x0 r3 = u0.r.f34948b
            r13.U(r2, r3)
            java.lang.Object r2 = r13.L()
            u0.e r3 = u0.l.f34851a
            boolean r3 = nk.k.a(r2, r3)
            r4 = 0
            if (r3 == 0) goto L22
            r2 = r4
            goto L29
        L22:
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"
            nk.k.c(r2, r3)
            u0.q2 r2 = (u0.q2) r2
        L29:
            java.lang.Object r3 = r11.f30840f
            u0.k1 r3 = (u0.k1) r3
            u0.q2 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3a
            r13.g0(r5)
        L3a:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L57
            boolean r2 = r11.f30839e
            if (r2 != 0) goto L4d
            r2 = r1
            c1.l r2 = (c1.l) r2
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L53
        L4d:
            c1.l r1 = (c1.l) r1
            c1.l r1 = r1.c(r3, r5)
        L53:
            r13.J = r7
        L55:
            r2 = r8
            goto L99
        L57:
            u0.a2 r6 = r13.G
            int r9 = r6.g
            int[] r10 = r6.f34729b
            java.lang.Object r6 = r6.b(r9, r10)
            java.lang.String r9 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            nk.k.c(r6, r9)
            u0.i1 r6 = (u0.i1) r6
            boolean r9 = r13.A()
            if (r9 == 0) goto L70
            if (r2 != 0) goto L7e
        L70:
            boolean r9 = r11.f30839e
            if (r9 != 0) goto L8c
            r9 = r1
            c1.l r9 = (c1.l) r9
            boolean r9 = r9.containsKey(r3)
            if (r9 != 0) goto L7e
            goto L8c
        L7e:
            if (r2 == 0) goto L85
            boolean r2 = r13.f34918w
            if (r2 != 0) goto L85
            goto L8a
        L85:
            boolean r2 = r13.f34918w
            if (r2 == 0) goto L8a
            goto L92
        L8a:
            r1 = r6
            goto L92
        L8c:
            c1.l r1 = (c1.l) r1
            c1.l r1 = r1.c(r3, r5)
        L92:
            boolean r2 = r13.f34920y
            if (r2 != 0) goto L98
            if (r6 == r1) goto L55
        L98:
            r2 = r7
        L99:
            if (r2 == 0) goto La2
            boolean r3 = r13.S
            if (r3 != 0) goto La2
            r13.J(r1)
        La2:
            boolean r3 = r13.f34918w
            r0.c(r3)
            r13.f34918w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            u0.x0 r3 = u0.r.f34949c
            r13.S(r2, r3, r8, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lca
            goto Lcb
        Lca:
            r7 = r8
        Lcb:
            r13.f34918w = r7
            r13.K = r4
            u0.m1 r13 = r13.r()
            if (r13 == 0) goto Ldd
            c1.f r0 = new c1.f
            r1 = 1
            r0.<init>(r11, r12, r14, r1)
            r13.f34870d = r0
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.q.a(p.r, mk.e, u0.p, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, u0.i1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(p.r[] r8, mk.e r9, u0.p r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.X(r0)
            com.google.android.gms.internal.ads.lb r0 = r10.f34919x
            u0.i1 r1 = r10.l()
            r2 = 201(0xc9, float:2.82E-43)
            u0.x0 r3 = u0.r.f34948b
            r10.U(r2, r3)
            boolean r2 = r10.S
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            c1.l r2 = c1.l.f2565d
            c1.l r2 = A(r8, r1, r2)
            c1.l r1 = r10.f0(r1, r2)
            r10.J = r3
        L25:
            r2 = r4
            goto L74
        L27:
            u0.a2 r2 = r10.G
            int r5 = r2.g
            java.lang.Object r2 = r2.h(r5, r4)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            nk.k.c(r2, r5)
            u0.i1 r2 = (u0.i1) r2
            u0.a2 r6 = r10.G
            int r7 = r6.g
            java.lang.Object r6 = r6.h(r7, r3)
            nk.k.c(r6, r5)
            u0.i1 r6 = (u0.i1) r6
            c1.l r5 = A(r8, r1, r6)
            boolean r7 = r10.A()
            if (r7 == 0) goto L65
            boolean r7 = r10.f34920y
            if (r7 != 0) goto L65
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L58
            goto L65
        L58:
            int r1 = r10.f34907l
            u0.a2 r5 = r10.G
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.f34907l = r5
            r1 = r2
            goto L25
        L65:
            c1.l r1 = r10.f0(r1, r5)
            boolean r5 = r10.f34920y
            if (r5 != 0) goto L73
            boolean r2 = nk.k.a(r1, r2)
            if (r2 != 0) goto L25
        L73:
            r2 = r3
        L74:
            if (r2 == 0) goto L7d
            boolean r5 = r10.S
            if (r5 != 0) goto L7d
            r10.J(r1)
        L7d:
            boolean r5 = r10.f34918w
            r0.c(r5)
            r10.f34918w = r2
            r10.K = r1
            r2 = 202(0xca, float:2.83E-43)
            u0.x0 r5 = u0.r.f34949c
            r10.S(r2, r5, r4, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r10, r1)
            r10.p(r4)
            r10.p(r4)
            int r0 = r0.b()
            if (r0 == 0) goto La5
            goto La6
        La5:
            r3 = r4
        La6:
            r10.f34918w = r3
            r0 = 0
            r10.K = r0
            u0.m1 r10 = r10.r()
            if (r10 == 0) goto Lb9
            c1.f r0 = new c1.f
            r1 = 2
            r0.<init>(r8, r9, r11, r1)
            r10.f34870d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.q.b(p.r[], mk.e, u0.p, int):void");
    }

    public static final void c(Object obj, mk.c cVar, p pVar) {
        boolean zF = pVar.f(obj);
        Object objL = pVar.L();
        if (zF || objL == l.f34851a) {
            objL = new e0(cVar);
            pVar.g0(objL);
        }
    }

    public static final void d(Serializable serializable, Boolean bool, mk.e eVar, p pVar) {
        ck.h hVar = pVar.R;
        boolean zF = pVar.f(serializable) | pVar.f(bool);
        Object objL = pVar.L();
        if (zF || objL == l.f34851a) {
            objL = new q0(hVar, eVar);
            pVar.g0(objL);
        }
    }

    public static final void e(Object obj, mk.e eVar, p pVar) {
        ck.h hVar = pVar.R;
        boolean zF = pVar.f(obj);
        Object objL = pVar.L();
        if (zF || objL == l.f34851a) {
            objL = new q0(hVar, eVar);
            pVar.g0(objL);
        }
    }

    public static final void f(int i4, int i10, List list) {
        int iM = m(i4, list);
        if (iM < 0) {
            iM = -(iM + 1);
        }
        while (iM < list.size() && ((m0) list.get(iM)).f34865b < i10) {
        }
    }

    public static final void g(x.t tVar, int i4) {
        if (tVar.f36945b == 0 || !(tVar.b(0) == i4 || tVar.b(tVar.f36945b - 1) == i4)) {
            int i10 = tVar.f36945b;
            tVar.a(i4);
            while (i10 > 0) {
                int i11 = ((i10 + 1) >>> 1) - 1;
                int iB = tVar.b(i11);
                if (i4 <= iB) {
                    break;
                }
                tVar.d(i10, iB);
                i10 = i11;
            }
            tVar.d(i10, i4);
        }
    }

    public static void h(e2 e2Var, List list, w wVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iC = e2Var.c((a) list.get(i4));
            int iN = e2Var.N(e2Var.r(iC), e2Var.f34780b);
            Object obj = iN < e2Var.g(e2Var.r(iC + 1), e2Var.f34780b) ? e2Var.f34781c[e2Var.h(iN)] : l.f34851a;
            m1 m1Var = obj instanceof m1 ? (m1) obj : null;
            if (m1Var != null) {
                m1Var.f34867a = wVar;
            }
        }
    }

    public static final void i(a2 a2Var, ArrayList arrayList, int i4) {
        boolean zL = a2Var.l(i4);
        int[] iArr = a2Var.f34729b;
        if (zL) {
            arrayList.add(a2Var.n(i4));
            return;
        }
        int i10 = iArr[(i4 * 5) + 3] + i4;
        for (int i11 = i4 + 1; i11 < i10; i11 += iArr[(i11 * 5) + 3]) {
            i(a2Var, arrayList, i11);
        }
    }

    public static final xk.v j(p pVar) {
        return new x1(pVar.R);
    }

    public static final w0.e k() {
        yb.e eVar = k2.f34850b;
        w0.e eVar2 = (w0.e) eVar.get();
        if (eVar2 != null) {
            return eVar2;
        }
        w0.e eVar3 = new w0.e(new g1.s[0]);
        eVar.u(eVar3);
        return eVar3;
    }

    public static final d0 l(mk.a aVar) {
        yb.e eVar = k2.f34849a;
        return new d0(aVar, null);
    }

    public static final int m(int i4, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iF = nk.k.f(((m0) list.get(i11)).f34865b, i4);
            if (iF < 0) {
                i10 = i11 + 1;
            } else {
                if (iF <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int n(p pVar) {
        long j = pVar.T;
        return (int) (j ^ (j >>> 32));
    }

    public static final j2.l0 o(ck.h hVar) {
        j2.l0 l0Var = (j2.l0) hVar.O(e.f34768c);
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void p(p pVar, Integer num, mk.e eVar) {
        if (pVar.S) {
            pVar.b(num, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List q(e2 e2Var, int i4, e2 e2Var2, boolean z3, boolean z10, boolean z11) {
        zj.s sVar;
        boolean z12;
        int i10;
        int i11;
        int iU = e2Var.u(i4);
        int i12 = i4 + iU;
        int iF = e2Var.f(i4);
        int iF2 = e2Var.f(i12);
        int i13 = iF2 - iF;
        boolean z13 = i4 >= 0 && (e2Var.f34780b[(e2Var.r(i4) * 5) + 1] & 201326592) != 0;
        e2Var2.w(iU);
        e2Var2.x(i13, e2Var2.f34796t);
        if (e2Var.g < i12) {
            e2Var.B(i12);
        }
        if (e2Var.f34787k < iF2) {
            e2Var.C(iF2, i12);
        }
        int[] iArr = e2Var2.f34780b;
        int i14 = e2Var2.f34796t;
        int i15 = i14 * 5;
        zj.m.M(i15, i4 * 5, i12 * 5, e2Var.f34780b, iArr);
        Object[] objArr = e2Var2.f34781c;
        int i16 = e2Var2.f34786i;
        System.arraycopy(e2Var.f34781c, iF, objArr, i16, i13);
        int i17 = e2Var2.f34798v;
        iArr[i15 + 2] = i17;
        int i18 = i14 - i4;
        int i19 = i14 + iU;
        int iG = i16 - e2Var2.g(i14, iArr);
        int i20 = e2Var2.f34789m;
        int i21 = e2Var2.f34788l;
        int length = objArr.length;
        boolean z14 = z13;
        int i22 = i20;
        int i23 = i14;
        while (i23 < i19) {
            if (i23 != i14) {
                int i24 = (i23 * 5) + 2;
                iArr[i24] = iArr[i24] + i18;
            }
            int[] iArr2 = iArr;
            int iG2 = e2Var2.g(i23, iArr) + iG;
            if (i22 < i23) {
                i10 = i14;
                i11 = 0;
            } else {
                i10 = i14;
                i11 = e2Var2.f34787k;
            }
            iArr2[(i23 * 5) + 4] = e2.i(iG2, i11, i21, length);
            if (i23 == i22) {
                i22++;
            }
            i23++;
            i14 = i10;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        e2Var2.f34789m = i22;
        int iB = d2.b(e2Var.f34782d, i4, e2Var.p());
        int iB2 = d2.b(e2Var.f34782d, i12, e2Var.p());
        if (iB < iB2) {
            ArrayList arrayList = e2Var.f34782d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i25 = iB; i25 < iB2; i25++) {
                a aVar = (a) arrayList.get(i25);
                aVar.f34724a += i18;
                arrayList2.add(aVar);
            }
            e2Var2.f34782d.addAll(d2.b(e2Var2.f34782d, e2Var2.f34796t, e2Var2.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            sVar = arrayList2;
        } else {
            sVar = zj.s.f38317a;
        }
        if (!sVar.isEmpty()) {
            HashMap map = e2Var.f34783e;
            HashMap map2 = e2Var2.f34783e;
            if (map != null && map2 != null) {
                int size = sVar.size();
                for (int i26 = 0; i26 < size; i26++) {
                }
            }
        }
        int i27 = e2Var2.f34798v;
        e2Var2.O(i17);
        int iE = e2Var.E(i4, e2Var.f34780b);
        if (!z11) {
            z12 = false;
        } else if (z3) {
            boolean z15 = iE >= 0;
            if (z15) {
                e2Var.P();
                e2Var.a(iE - e2Var.f34796t);
                e2Var.P();
            }
            e2Var.a(i4 - e2Var.f34796t);
            boolean zH = e2Var.H();
            if (z15) {
                e2Var.M();
                e2Var.j();
                e2Var.M();
                e2Var.j();
            }
            z12 = zH;
        } else {
            boolean zI = e2Var.I(i4, iU);
            e2Var.J(iF, i13, i4 - 1);
            z12 = zI;
        }
        if (z12) {
            r.a("Unexpectedly removed anchors");
        }
        int i28 = e2Var2.f34791o;
        int i29 = iArr3[i15 + 1];
        e2Var2.f34791o = i28 + ((1073741824 & i29) != 0 ? 1 : i29 & 67108863);
        if (z10) {
            e2Var2.f34796t = i19;
            e2Var2.f34786i = i16 + i13;
        }
        if (z14) {
            e2Var2.T(i17);
        }
        return sVar;
    }

    public static d1 r(Object obj) {
        return new d1(obj, e.g);
    }

    public static final Object s(i1 i1Var, k1 k1Var) {
        nk.k.c(k1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        c1.l lVar = (c1.l) i1Var;
        Object objB = lVar.get(k1Var);
        if (objB == null) {
            objB = k1Var.b();
        }
        return ((q2) objB).a(lVar);
    }

    public static final void t(p pVar, mk.c cVar) {
        pVar.b(yj.u.f37649a, new bl.z(11, cVar));
    }

    public static final o u(p pVar) {
        p pVar2;
        pVar.U(206, r.f34951e);
        if (pVar.S) {
            e2.z(pVar.I);
        }
        Object objD = pVar.D();
        v1 y1Var = objD instanceof v1 ? (v1) objD : null;
        if (y1Var == null) {
            pVar2 = pVar;
            y1Var = new y1(new n(new o(pVar2, pVar.T, pVar.f34912q, pVar.C, pVar.f34904h.f35009t)), -1);
            pVar2.h0(y1Var);
        } else {
            pVar2 = pVar;
        }
        u1 u1Var = y1Var.f34990a;
        nk.k.c(u1Var, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl.CompositionContextHolder");
        o oVar = ((n) u1Var).f34876a;
        oVar.f34889f.setValue(pVar2.l());
        pVar2.p(false);
        return oVar;
    }

    public static final u0 v(Object obj, p pVar) {
        Object objL = pVar.L();
        if (objL == l.f34851a) {
            objL = r(obj);
            pVar.g0(objL);
        }
        u0 u0Var = (u0) objL;
        u0Var.setValue(obj);
        return u0Var;
    }

    public static final void w(e2 e2Var, int i4, Object obj) {
        int iH = e2Var.h(i4);
        Object[] objArr = e2Var.f34781c;
        Object obj2 = objArr[iH];
        objArr[iH] = l.f34851a;
        if (obj == obj2) {
            return;
        }
        r.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void x(Object obj, mk.e eVar, p pVar) {
        if (pVar.S || !nk.k.a(pVar.L(), obj)) {
            pVar.g0(obj);
            pVar.b(obj, eVar);
        }
    }

    public static final int y(x.t tVar) {
        int iB;
        int i4 = tVar.f36945b;
        int iB2 = tVar.b(0);
        while (tVar.f36945b != 0 && tVar.b(0) == iB2) {
            int i10 = tVar.f36945b;
            if (i10 == 0) {
                y.a.e("IntList is empty.");
                throw null;
            }
            tVar.d(0, tVar.f36944a[i10 - 1]);
            tVar.c(tVar.f36945b - 1);
            int i11 = tVar.f36945b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iB3 = tVar.b(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iB4 = tVar.b(i15);
                if (i14 >= i11 || (iB = tVar.b(i14)) <= iB4) {
                    if (iB4 > iB3) {
                        tVar.d(i13, iB4);
                        tVar.d(i15, iB3);
                        i13 = i15;
                    }
                } else if (iB > iB3) {
                    tVar.d(i13, iB);
                    tVar.d(i14, iB3);
                    i13 = i14;
                }
            }
        }
        return iB2;
    }

    public static final int z(int i4) {
        int i10 = 306783378 & i4;
        int i11 = 613566756 & i4;
        return (i4 & (-920350135)) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }
}
