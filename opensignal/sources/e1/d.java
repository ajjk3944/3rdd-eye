package e1;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.measurement.e5;
import x1.f0;
import x1.f1;
import x1.v1;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7640a = new int[2];

    public static final b A(int i10) {
        if (i10 == 1) {
            return new b(2);
        }
        if (i10 == 2) {
            return new b(1);
        }
        if (i10 == 17) {
            return new b(3);
        }
        if (i10 == 33) {
            return new b(5);
        }
        if (i10 == 66) {
            return new b(4);
        }
        if (i10 != 130) {
            return null;
        }
        return new b(6);
    }

    public static final Boolean B(int i10, c1.d dVar, p pVar, f1.c cVar) {
        n nVarE0 = pVar.e0();
        int[] iArr = u.f7676a;
        int i11 = iArr[nVarE0.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(i(pVar, i10, dVar));
            }
            if (i11 == 4) {
                return pVar.d0().f7651a ? (Boolean) dVar.a(pVar) : cVar == null ? Boolean.valueOf(i(pVar, i10, dVar)) : Boolean.valueOf(z(i10, dVar, pVar, cVar));
            }
            throw new bf.n();
        }
        p pVarN = n(pVar);
        if (pVarN == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i12 = iArr[pVarN.e0().ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                if (cVar == null) {
                    cVar = j(pVarN);
                }
                return Boolean.valueOf(l(i10, dVar, pVar, cVar));
            }
            if (i12 != 4) {
                throw new bf.n();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        Boolean boolB = B(i10, dVar, pVarN, cVar);
        if (!br.l.a(boolB, Boolean.FALSE)) {
            return boolB;
        }
        if (cVar == null) {
            if (pVarN.e0() != n.ActiveParent) {
                throw new IllegalStateException("Searching for active node in inactive hierarchy");
            }
            p pVarG = g(pVarN);
            if (pVarG == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            cVar = j(pVarG);
        }
        return Boolean.valueOf(l(i10, dVar, pVar, cVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(e1.p r9, c1.d r10) {
        /*
            e1.n r0 = r9.e0()
            int[] r1 = e1.t.f7675a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == r6) goto L41
            if (r0 == r5) goto L3c
            if (r0 == r3) goto L3c
            if (r0 != r2) goto L36
            boolean r0 = w(r9, r10)
            if (r0 != 0) goto L8e
            e1.j r0 = r9.d0()
            boolean r0 = r0.f7651a
            if (r0 == 0) goto L32
            java.lang.Object r9 = r10.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L33
        L32:
            r9 = r4
        L33:
            if (r9 == 0) goto L8d
            goto L8e
        L36:
            bf.n r9 = new bf.n
            r9.<init>()
            throw r9
        L3c:
            boolean r9 = w(r9, r10)
            return r9
        L41:
            e1.p r0 = n(r9)
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L8f
            e1.n r8 = r0.e0()
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r6) goto L6c
            if (r1 == r5) goto L67
            if (r1 == r3) goto L67
            if (r1 == r2) goto L61
            bf.n r9 = new bf.n
            r9.<init>()
            throw r9
        L61:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r7)
            throw r9
        L67:
            boolean r9 = m(r9, r0, r5, r10)
            return r9
        L6c:
            boolean r1 = a(r0, r10)
            if (r1 != 0) goto L8e
            boolean r9 = m(r9, r0, r5, r10)
            if (r9 != 0) goto L8e
            e1.j r9 = r0.d0()
            boolean r9 = r9.f7651a
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r10.a(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            goto L8e
        L8d:
            return r4
        L8e:
            return r6
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d.a(e1.p, c1.d):boolean");
    }

    public static final boolean b(f1.c cVar, f1.c cVar2, f1.c cVar3, int i10) {
        float f10;
        float f11;
        boolean zC = c(i10, cVar3, cVar);
        float f12 = cVar3.f8405b;
        float f13 = cVar3.f8407d;
        float f14 = cVar3.f8404a;
        float f15 = cVar3.f8406c;
        float f16 = cVar.f8407d;
        float f17 = cVar.f8405b;
        float f18 = cVar.f8406c;
        float f19 = cVar.f8404a;
        if (zC || !c(i10, cVar2, cVar)) {
            return false;
        }
        if (i10 == 3) {
            if (f19 < f15) {
                return true;
            }
        } else if (i10 == 4) {
            if (f18 > f14) {
                return true;
            }
        } else if (i10 == 5) {
            if (f17 < f13) {
                return true;
            }
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f16 > f12) {
                return true;
            }
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        if (i10 == 3) {
            f10 = f19 - cVar2.f8406c;
        } else if (i10 == 4) {
            f10 = cVar2.f8404a - f18;
        } else if (i10 == 5) {
            f10 = f17 - cVar2.f8407d;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = cVar2.f8405b - f16;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (i10 == 3) {
            f11 = f19 - f14;
        } else if (i10 == 4) {
            f11 = f15 - f18;
        } else if (i10 == 5) {
            f11 = f17 - f12;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f11 = f13 - f16;
        }
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        return f10 < f11;
    }

    public static final boolean c(int i10, f1.c cVar, f1.c cVar2) {
        if (i10 == 3 || i10 == 4) {
            return cVar.f8407d > cVar2.f8405b && cVar.f8405b < cVar2.f8407d;
        }
        if (i10 == 5 || i10 == 6) {
            return cVar.f8406c > cVar2.f8404a && cVar.f8404a < cVar2.f8406c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final f1.c d(View view, AndroidComposeView androidComposeView) {
        int[] iArr = f7640a;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f10 = i10 - iArr[0];
        float f11 = i11 - iArr[1];
        return new f1.c(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final boolean e(p pVar, boolean z10) {
        int i10 = q.f7671a[pVar.e0().ordinal()];
        if (i10 == 1) {
            ((a8.f) x1.k.s(pVar).getFocusOwner()).B(null);
            pVar.c0(n.Active, n.Inactive);
            return true;
        }
        if (i10 == 2) {
            if (z10) {
                ((a8.f) x1.k.s(pVar).getFocusOwner()).B(null);
                pVar.c0(n.Captured, n.Inactive);
            }
            return z10;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return true;
            }
            throw new bf.n();
        }
        p pVarN = n(pVar);
        if (!(pVarN != null ? e(pVarN, z10) : true)) {
            return false;
        }
        pVar.c0(n.ActiveParent, n.Inactive);
        return true;
    }

    public static final void f(p pVar, p0.e eVar) {
        if (!pVar.f26495b.f26506o) {
            u1.a.b("visitChildren called on an unattached node");
        }
        p0.e eVar2 = new p0.e(new z0.l[16]);
        z0.l lVar = pVar.f26495b;
        z0.l lVar2 = lVar.f26500g;
        if (lVar2 == null) {
            x1.k.b(eVar2, lVar);
        } else {
            eVar2.b(lVar2);
        }
        while (true) {
            int i10 = eVar2.f20232g;
            if (i10 == 0) {
                return;
            }
            z0.l lVarE = (z0.l) eVar2.k(i10 - 1);
            if ((lVarE.f26498e & 1024) == 0) {
                x1.k.b(eVar2, lVarE);
            } else {
                while (true) {
                    if (lVarE == null) {
                        break;
                    }
                    if ((lVarE.f26497d & 1024) != 0) {
                        p0.e eVar3 = null;
                        while (lVarE != null) {
                            if (lVarE instanceof p) {
                                p pVar2 = (p) lVarE;
                                if (pVar2.f26506o && !x1.k.r(pVar2).K) {
                                    if (pVar2.d0().f7651a) {
                                        eVar.b(pVar2);
                                    } else {
                                        f(pVar2, eVar);
                                    }
                                }
                            } else if ((lVarE.f26497d & 1024) != 0 && (lVarE instanceof x1.j)) {
                                int i11 = 0;
                                for (z0.l lVar3 = ((x1.j) lVarE).f24863q; lVar3 != null; lVar3 = lVar3.f26500g) {
                                    if ((lVar3.f26497d & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new p0.e(new z0.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar3.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar3.b(lVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            lVarE = x1.k.e(eVar3);
                        }
                    } else {
                        lVarE = lVarE.f26500g;
                    }
                }
            }
        }
    }

    public static final p g(p pVar) {
        p pVar2 = (p) ((a8.f) x1.k.s(pVar).getFocusOwner()).f202h;
        if (pVar2 == null || !pVar2.f26506o) {
            return null;
        }
        return pVar2;
    }

    public static final p h(p0.e eVar, f1.c cVar, int i10) {
        f1.c cVarB;
        if (i10 == 3) {
            cVarB = cVar.b((cVar.f8406c - cVar.f8404a) + 1, 0.0f);
        } else if (i10 == 4) {
            cVarB = cVar.b(-((cVar.f8406c - cVar.f8404a) + 1), 0.0f);
        } else if (i10 == 5) {
            cVarB = cVar.b(0.0f, (cVar.f8407d - cVar.f8405b) + 1);
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            cVarB = cVar.b(0.0f, -((cVar.f8407d - cVar.f8405b) + 1));
        }
        Object[] objArr = eVar.f20230a;
        int i11 = eVar.f20232g;
        p pVar = null;
        for (int i12 = 0; i12 < i11; i12++) {
            p pVar2 = (p) objArr[i12];
            if (r(pVar2)) {
                f1.c cVarJ = j(pVar2);
                if (o(cVarJ, cVarB, cVar, i10)) {
                    pVar = pVar2;
                    cVarB = cVarJ;
                }
            }
        }
        return pVar;
    }

    public static final boolean i(p pVar, int i10, ar.k kVar) {
        f1.c cVar;
        p0.e eVar = new p0.e(new p[16]);
        f(pVar, eVar);
        int i11 = eVar.f20232g;
        if (i11 <= 1) {
            p pVar2 = (p) (i11 == 0 ? null : eVar.f20230a[0]);
            if (pVar2 != null) {
                return ((Boolean) kVar.a(pVar2)).booleanValue();
            }
        } else {
            if (i10 == 7) {
                i10 = 4;
            }
            if (i10 == 4 || i10 == 6) {
                f1.c cVarJ = j(pVar);
                float f10 = cVarJ.f8404a;
                float f11 = cVarJ.f8405b;
                cVar = new f1.c(f10, f11, f10, f11);
            } else {
                if (i10 != 3 && i10 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                f1.c cVarJ2 = j(pVar);
                float f12 = cVarJ2.f8406c;
                float f13 = cVarJ2.f8407d;
                cVar = new f1.c(f12, f13, f12, f13);
            }
            p pVarH = h(eVar, cVar, i10);
            if (pVarH != null) {
                return ((Boolean) kVar.a(pVarH)).booleanValue();
            }
        }
        return false;
    }

    public static final f1.c j(p pVar) {
        f1 f1Var = pVar.f26502i;
        return f1Var != null ? e5.s(f1Var).B(f1Var, false) : f1.c.f8403e;
    }

    public static final boolean k(p pVar, c1.d dVar) {
        int i10 = t.f7675a[pVar.e0().ordinal()];
        if (i10 == 1) {
            p pVarN = n(pVar);
            if (pVarN != null) {
                return k(pVarN, dVar) || m(pVar, pVarN, 1, dVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i10 == 2 || i10 == 3) {
            return x(pVar, dVar);
        }
        if (i10 == 4) {
            return pVar.d0().f7651a ? ((Boolean) dVar.a(pVar)).booleanValue() : x(pVar, dVar);
        }
        throw new bf.n();
    }

    public static final boolean l(int i10, c1.d dVar, p pVar, f1.c cVar) {
        if (z(i10, dVar, pVar, cVar)) {
            return true;
        }
        Object obj = ((a8.f) x1.k.s(pVar).getFocusOwner()).f202h;
        y(pVar);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x019d A[EDGE_INSN: B:160:0x019d->B:127:0x019d BREAK  A[LOOP:5: B:89:0x012e->B:165:0x012e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m(e1.p r12, e1.p r13, int r14, c1.d r15) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d.m(e1.p, e1.p, int, c1.d):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final e1.p n(e1.p r8) {
        /*
            z0.l r0 = r8.f26495b
            boolean r0 = r0.f26506o
            r1 = 0
            if (r0 != 0) goto L9
            goto Lb1
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            u1.a.b(r0)
        L10:
            p0.e r0 = new p0.e
            r2 = 16
            z0.l[] r3 = new z0.l[r2]
            r0.<init>(r3)
            z0.l r8 = r8.f26495b
            z0.l r3 = r8.f26500g
            if (r3 != 0) goto L23
            x1.k.b(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.f20232g
            if (r8 == 0) goto Lb1
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            z0.l r8 = (z0.l) r8
            int r3 = r8.f26498e
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            x1.k.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f26497d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Lae
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof e1.p
            r5 = 1
            if (r4 == 0) goto L73
            e1.p r8 = (e1.p) r8
            z0.l r4 = r8.f26495b
            boolean r4 = r4.f26506o
            if (r4 == 0) goto La9
            e1.n r4 = r8.e0()
            int[] r6 = e1.r.f7673b
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r5) goto L72
            r5 = 2
            if (r4 == r5) goto L72
            r5 = 3
            if (r4 == r5) goto L72
            r8 = 4
            if (r4 != r8) goto L6c
            goto La9
        L6c:
            bf.n r8 = new bf.n
            r8.<init>()
            throw r8
        L72:
            return r8
        L73:
            int r4 = r8.f26497d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La9
            boolean r4 = r8 instanceof x1.j
            if (r4 == 0) goto La9
            r4 = r8
            x1.j r4 = (x1.j) r4
            z0.l r4 = r4.f24863q
            r6 = 0
        L83:
            if (r4 == 0) goto La6
            int r7 = r4.f26497d
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto La3
            int r6 = r6 + 1
            if (r6 != r5) goto L91
            r8 = r4
            goto La3
        L91:
            if (r3 != 0) goto L9a
            p0.e r3 = new p0.e
            z0.l[] r7 = new z0.l[r2]
            r3.<init>(r7)
        L9a:
            if (r8 == 0) goto La0
            r3.b(r8)
            r8 = r1
        La0:
            r3.b(r4)
        La3:
            z0.l r4 = r4.f26500g
            goto L83
        La6:
            if (r6 != r5) goto La9
            goto L45
        La9:
            z0.l r8 = x1.k.e(r3)
            goto L45
        Lae:
            z0.l r8 = r8.f26500g
            goto L3c
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d.n(e1.p):e1.p");
    }

    public static final boolean o(f1.c cVar, f1.c cVar2, f1.c cVar3, int i10) {
        if (!p(i10, cVar, cVar3)) {
            return false;
        }
        if (p(i10, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i10)) {
            return !b(cVar3, cVar2, cVar, i10) && q(i10, cVar3, cVar) < q(i10, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean p(int i10, f1.c cVar, f1.c cVar2) {
        float f10 = cVar.f8405b;
        float f11 = cVar.f8407d;
        float f12 = cVar.f8404a;
        float f13 = cVar.f8406c;
        if (i10 == 3) {
            float f14 = cVar2.f8406c;
            float f15 = cVar2.f8404a;
            return (f14 > f13 || f15 >= f13) && f15 > f12;
        }
        if (i10 == 4) {
            float f16 = cVar2.f8404a;
            float f17 = cVar2.f8406c;
            return (f16 < f12 || f17 <= f12) && f17 < f13;
        }
        if (i10 == 5) {
            float f18 = cVar2.f8407d;
            float f19 = cVar2.f8405b;
            return (f18 > f11 || f19 >= f11) && f19 > f10;
        }
        if (i10 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f20 = cVar2.f8405b;
        float f21 = cVar2.f8407d;
        return (f20 < f10 || f21 <= f10) && f21 < f11;
    }

    public static final long q(int i10, f1.c cVar, f1.c cVar2) {
        float f10;
        float f11;
        float f12 = cVar2.f8405b;
        float f13 = cVar2.f8407d;
        float f14 = cVar2.f8404a;
        float f15 = cVar2.f8406c;
        if (i10 == 3) {
            f10 = cVar.f8404a - f15;
        } else if (i10 == 4) {
            f10 = f14 - cVar.f8406c;
        } else if (i10 == 5) {
            f10 = cVar.f8405b - f13;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = f12 - cVar.f8407d;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        long j = (long) f10;
        if (i10 == 3 || i10 == 4) {
            float f16 = cVar.f8405b;
            float f17 = 2;
            f11 = (((cVar.f8407d - f16) / f17) + f16) - (((f13 - f12) / f17) + f12);
        } else {
            if (i10 != 5 && i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = cVar.f8404a;
            float f19 = 2;
            f11 = (((cVar.f8406c - f18) / f19) + f18) - (((f15 - f14) / f19) + f14);
        }
        long j7 = (long) f11;
        return (j7 * j7) + (13 * j * j);
    }

    public static final boolean r(p pVar) {
        f0 f0Var;
        f1 f1Var;
        f0 f0Var2;
        f1 f1Var2 = pVar.f26502i;
        return (f1Var2 == null || (f0Var = f1Var2.f24821o) == null || !f0Var.T() || (f1Var = pVar.f26502i) == null || (f0Var2 = f1Var.f24821o) == null || !f0Var2.S()) ? false : true;
    }

    public static final a s(p pVar) {
        int i10 = q.f7671a[pVar.e0().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return a.Cancelled;
            }
            if (i10 == 3) {
                p pVarN = n(pVar);
                if (pVarN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                a aVarS = s(pVarN);
                a aVar = a.None;
                if (aVarS == aVar) {
                    aVarS = null;
                }
                if (aVarS != null) {
                    return aVarS;
                }
                if (pVar.f7668q) {
                    return aVar;
                }
                pVar.f7668q = true;
                try {
                    j jVarD0 = pVar.d0();
                    g focusOwner = x1.k.s(pVar).getFocusOwner();
                    p pVar2 = (p) ((a8.f) focusOwner).f202h;
                    jVarD0.k.getClass();
                    p pVar3 = (p) ((a8.f) focusOwner).f202h;
                    return (pVar2 == pVar3 || pVar3 == null) ? aVar : k.f7662d == k.f7661c ? a.Cancelled : a.Redirected;
                } finally {
                    pVar.f7668q = false;
                }
            }
            if (i10 != 4) {
                throw new bf.n();
            }
        }
        return a.None;
    }

    public static final a t(p pVar) {
        if (!pVar.f7669r) {
            pVar.f7669r = true;
            try {
                j jVarD0 = pVar.d0();
                g focusOwner = x1.k.s(pVar).getFocusOwner();
                p pVar2 = (p) ((a8.f) focusOwner).f202h;
                jVarD0.j.getClass();
                p pVar3 = (p) ((a8.f) focusOwner).f202h;
                if (pVar2 != pVar3 && pVar3 != null) {
                    return k.f7662d == k.f7661c ? a.Cancelled : a.Redirected;
                }
            } finally {
                pVar.f7669r = false;
            }
        }
        return a.None;
    }

    public static final a u(p pVar) {
        z0.l lVarE;
        al.c cVar;
        int i10 = q.f7671a[pVar.e0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return a.None;
        }
        if (i10 == 3) {
            p pVarN = n(pVar);
            if (pVarN != null) {
                return s(pVarN);
            }
            throw new IllegalArgumentException("ActiveParent with no focused child");
        }
        if (i10 != 4) {
            throw new bf.n();
        }
        if (!pVar.f26495b.f26506o) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        z0.l lVar = pVar.f26495b.f26499f;
        f0 f0VarR = x1.k.r(pVar);
        loop0: while (true) {
            if (f0VarR == null) {
                lVarE = null;
                break;
            }
            if ((((z0.l) f0VarR.D.f825g).f26498e & 1024) != 0) {
                while (lVar != null) {
                    if ((lVar.f26497d & 1024) != 0) {
                        lVarE = lVar;
                        p0.e eVar = null;
                        while (lVarE != null) {
                            if (lVarE instanceof p) {
                                break loop0;
                            }
                            if ((lVarE.f26497d & 1024) != 0 && (lVarE instanceof x1.j)) {
                                int i11 = 0;
                                for (z0.l lVar2 = ((x1.j) lVarE).f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
                                    if ((lVar2.f26497d & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            lVarE = lVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new p0.e(new z0.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar.b(lVar2);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            lVarE = x1.k.e(eVar);
                        }
                    }
                    lVar = lVar.f26499f;
                }
            }
            f0VarR = f0VarR.C();
            lVar = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
        }
        p pVar2 = (p) lVarE;
        if (pVar2 == null) {
            return a.None;
        }
        int i12 = q.f7671a[pVar2.e0().ordinal()];
        if (i12 == 1) {
            return t(pVar2);
        }
        if (i12 == 2) {
            return a.Cancelled;
        }
        if (i12 == 3) {
            return u(pVar2);
        }
        if (i12 != 4) {
            throw new bf.n();
        }
        a aVarU = u(pVar2);
        a aVar = aVarU != a.None ? aVarU : null;
        return aVar == null ? t(pVar2) : aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0207 A[ADDED_TO_REGION, LOOP:9: B:143:0x0207->B:150:0x021b, LOOP_START, PHI: r12
  0x0207: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:142:0x0205, B:150:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022b  */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean v(e1.p r18) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d.v(e1.p):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean w(p pVar, c1.d dVar) {
        p[] pVarArr = new p[16];
        if (!pVar.f26495b.f26506o) {
            u1.a.b("visitChildren called on an unattached node");
        }
        p0.e eVar = new p0.e(new z0.l[16]);
        z0.l lVar = pVar.f26495b;
        z0.l lVar2 = lVar.f26500g;
        if (lVar2 == null) {
            x1.k.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f20232g;
            if (i11 == 0) {
                break;
            }
            z0.l lVarE = (z0.l) eVar.k(i11 - 1);
            if ((lVarE.f26498e & 1024) == 0) {
                x1.k.b(eVar, lVarE);
            } else {
                while (true) {
                    if (lVarE == null) {
                        break;
                    }
                    if ((lVarE.f26497d & 1024) != 0) {
                        p0.e eVar2 = null;
                        while (lVarE != null) {
                            if (lVarE instanceof p) {
                                p pVar2 = (p) lVarE;
                                int i12 = i10 + 1;
                                if (pVarArr.length < i12) {
                                    int length = pVarArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(pVarArr, 0, r10, 0, length);
                                    pVarArr = r10;
                                }
                                pVarArr[i10] = pVar2;
                                i10 = i12;
                            } else if ((lVarE.f26497d & 1024) != 0 && (lVarE instanceof x1.j)) {
                                int i13 = 0;
                                for (z0.l lVar3 = ((x1.j) lVarE).f24863q; lVar3 != null; lVar3 = lVar3.f26500g) {
                                    if ((lVar3.f26497d & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new p0.e(new z0.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar2.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar2.b(lVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            lVarE = x1.k.e(eVar2);
                        }
                    } else {
                        lVarE = lVarE.f26500g;
                    }
                }
            }
        }
        mq.l.z0(pVarArr, s.f7674a, 0, i10);
        int i14 = i10 - 1;
        if (i14 < pVarArr.length) {
            while (i14 >= 0) {
                p pVar3 = pVarArr[i14];
                if (r(pVar3) && a(pVar3, dVar)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean x(p pVar, c1.d dVar) {
        p[] pVarArr = new p[16];
        if (!pVar.f26495b.f26506o) {
            u1.a.b("visitChildren called on an unattached node");
        }
        p0.e eVar = new p0.e(new z0.l[16]);
        z0.l lVar = pVar.f26495b;
        z0.l lVar2 = lVar.f26500g;
        if (lVar2 == null) {
            x1.k.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f20232g;
            if (i11 == 0) {
                break;
            }
            z0.l lVarE = (z0.l) eVar.k(i11 - 1);
            if ((lVarE.f26498e & 1024) == 0) {
                x1.k.b(eVar, lVarE);
            } else {
                while (true) {
                    if (lVarE == null) {
                        break;
                    }
                    if ((lVarE.f26497d & 1024) != 0) {
                        p0.e eVar2 = null;
                        while (lVarE != null) {
                            if (lVarE instanceof p) {
                                p pVar2 = (p) lVarE;
                                int i12 = i10 + 1;
                                if (pVarArr.length < i12) {
                                    int length = pVarArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(pVarArr, 0, r10, 0, length);
                                    pVarArr = r10;
                                }
                                pVarArr[i10] = pVar2;
                                i10 = i12;
                            } else if ((lVarE.f26497d & 1024) != 0 && (lVarE instanceof x1.j)) {
                                int i13 = 0;
                                for (z0.l lVar3 = ((x1.j) lVarE).f24863q; lVar3 != null; lVar3 = lVar3.f26500g) {
                                    if ((lVar3.f26497d & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new p0.e(new z0.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar2.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar2.b(lVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            lVarE = x1.k.e(eVar2);
                        }
                    } else {
                        lVarE = lVarE.f26500g;
                    }
                }
            }
        }
        mq.l.z0(pVarArr, s.f7674a, 0, i10);
        for (int i14 = 0; i14 < i10; i14++) {
            p pVar3 = pVarArr[i14];
            if (r(pVar3) && k(pVar3, dVar)) {
                return true;
            }
        }
        return false;
    }

    public static final void y(p pVar) {
        z0.l lVar;
        al.c cVar;
        if (!pVar.f26495b.f26506o) {
            u1.a.b("visitAncestors called on an unattached node");
        }
        z0.l lVar2 = pVar.f26495b.f26499f;
        f0 f0VarR = x1.k.r(pVar);
        loop0: while (true) {
            lVar = null;
            if (f0VarR == null) {
                break;
            }
            if ((((z0.l) f0VarR.D.f825g).f26498e & 1024) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f26497d & 1024) != 0) {
                        z0.l lVarE = lVar2;
                        p0.e eVar = null;
                        while (lVarE != null) {
                            if (lVarE instanceof p) {
                                lVar = lVarE;
                                break loop0;
                            }
                            if ((lVarE.f26497d & 1024) != 0 && (lVarE instanceof x1.j)) {
                                int i10 = 0;
                                for (z0.l lVar3 = ((x1.j) lVarE).f24863q; lVar3 != null; lVar3 = lVar3.f26500g) {
                                    if ((lVar3.f26497d & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new p0.e(new z0.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar.b(lVar3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            lVarE = x1.k.e(eVar);
                        }
                    }
                    lVar2 = lVar2.f26499f;
                }
            }
            f0VarR = f0VarR.C();
            lVar2 = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
        }
        p pVar2 = (p) lVar;
        if (pVar2 == null) {
            if (pVar.B(v1.e.f23773a) != null) {
                throw new ClassCastException();
            }
            return;
        }
        oh.p pVar3 = v1.e.f23773a;
        if (pVar2.B(pVar3) != null) {
            throw new ClassCastException();
        }
        if (pVar.B(pVar3) != null) {
            throw new ClassCastException();
        }
    }

    public static final boolean z(int i10, c1.d dVar, p pVar, f1.c cVar) {
        p pVarH;
        p0.e eVar = new p0.e(new p[16]);
        if (!pVar.f26495b.f26506o) {
            u1.a.b("visitChildren called on an unattached node");
        }
        p0.e eVar2 = new p0.e(new z0.l[16]);
        z0.l lVar = pVar.f26495b;
        z0.l lVar2 = lVar.f26500g;
        if (lVar2 == null) {
            x1.k.b(eVar2, lVar);
        } else {
            eVar2.b(lVar2);
        }
        while (true) {
            int i11 = eVar2.f20232g;
            if (i11 == 0) {
                break;
            }
            z0.l lVarE = (z0.l) eVar2.k(i11 - 1);
            if ((lVarE.f26498e & 1024) == 0) {
                x1.k.b(eVar2, lVarE);
            } else {
                while (true) {
                    if (lVarE == null) {
                        break;
                    }
                    if ((lVarE.f26497d & 1024) != 0) {
                        p0.e eVar3 = null;
                        while (lVarE != null) {
                            if (lVarE instanceof p) {
                                p pVar2 = (p) lVarE;
                                if (pVar2.f26506o) {
                                    eVar.b(pVar2);
                                }
                            } else if ((lVarE.f26497d & 1024) != 0 && (lVarE instanceof x1.j)) {
                                int i12 = 0;
                                for (z0.l lVar3 = ((x1.j) lVarE).f24863q; lVar3 != null; lVar3 = lVar3.f26500g) {
                                    if ((lVar3.f26497d & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            lVarE = lVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new p0.e(new z0.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar3.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar3.b(lVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            lVarE = x1.k.e(eVar3);
                        }
                    } else {
                        lVarE = lVarE.f26500g;
                    }
                }
            }
        }
        while (eVar.f20232g != 0 && (pVarH = h(eVar, cVar, i10)) != null) {
            if (pVarH.d0().f7651a) {
                return ((Boolean) dVar.a(pVarH)).booleanValue();
            }
            if (l(i10, dVar, pVarH, cVar)) {
                return true;
            }
            eVar.j(pVarH);
        }
        return false;
    }
}
