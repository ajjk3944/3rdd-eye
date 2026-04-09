package pi;

import Zg.AbstractC3689v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import pi.u0;
import ri.EnumC7611b;
import ri.InterfaceC7613d;
import ri.InterfaceC7614e;
import ri.InterfaceC7617h;
import ri.InterfaceC7618i;
import ri.InterfaceC7619j;
import ri.InterfaceC7620k;
import ri.InterfaceC7621l;
import xi.C8544k;

/* renamed from: pi.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7351g {

    /* renamed from: a, reason: collision with root package name */
    public static final C7351g f58125a = new C7351g();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f58126b;

    /* renamed from: pi.g$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58127a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f58128b;

        static {
            int[] iArr = new int[ri.s.values().length];
            try {
                iArr[ri.s.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ri.s.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ri.s.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58127a = iArr;
            int[] iArr2 = new int[u0.b.values().length];
            try {
                iArr2[u0.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[u0.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[u0.b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f58128b = iArr2;
        }
    }

    private C7351g() {
    }

    private final List A(u0 u0Var, List list) {
        int i10;
        ri.o oVarJ = u0Var.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC7620k interfaceC7620kL0 = oVarJ.l0((InterfaceC7619j) obj);
            int iL = oVarJ.l(interfaceC7620kL0);
            while (true) {
                if (i10 >= iL) {
                    arrayList.add(obj);
                    break;
                }
                i10 = oVarJ.u(oVarJ.j(oVarJ.U(interfaceC7620kL0, i10))) == null ? i10 + 1 : 0;
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    private final Boolean c(u0 u0Var, InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2) {
        ri.o oVarJ = u0Var.j();
        if (!oVarJ.i(interfaceC7619j) && !oVarJ.i(interfaceC7619j2)) {
            return null;
        }
        if (f(oVarJ, interfaceC7619j) && f(oVarJ, interfaceC7619j2)) {
            return Boolean.TRUE;
        }
        if (oVarJ.i(interfaceC7619j)) {
            if (g(oVarJ, u0Var, interfaceC7619j, interfaceC7619j2, false)) {
                return Boolean.TRUE;
            }
        } else if (oVarJ.i(interfaceC7619j2) && (e(oVarJ, interfaceC7619j) || g(oVarJ, u0Var, interfaceC7619j2, interfaceC7619j, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean d(ri.o oVar, InterfaceC7619j interfaceC7619j) {
        if (!(interfaceC7619j instanceof InterfaceC7613d)) {
            return false;
        }
        InterfaceC7621l interfaceC7621lP = oVar.P(oVar.A0((InterfaceC7613d) interfaceC7619j));
        return !oVar.p(interfaceC7621lP) && oVar.i(oVar.F0(oVar.j(interfaceC7621lP)));
    }

    private static final boolean e(ri.o oVar, InterfaceC7619j interfaceC7619j) {
        ri.m mVarD = oVar.d(interfaceC7619j);
        if (mVarD instanceof InterfaceC7617h) {
            Collection collectionX0 = oVar.x0(mVarD);
            if (!(collectionX0 instanceof Collection) || !collectionX0.isEmpty()) {
                Iterator it = collectionX0.iterator();
                while (it.hasNext()) {
                    InterfaceC7619j interfaceC7619jC = oVar.c((InterfaceC7618i) it.next());
                    if (interfaceC7619jC != null && oVar.i(interfaceC7619jC)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean f(ri.o oVar, InterfaceC7619j interfaceC7619j) {
        return oVar.i(interfaceC7619j) || d(oVar, interfaceC7619j);
    }

    private static final boolean g(ri.o oVar, u0 u0Var, InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2, boolean z10) {
        Collection<InterfaceC7618i> collectionA = oVar.A(interfaceC7619j);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return false;
        }
        for (InterfaceC7618i interfaceC7618i : collectionA) {
            if (AbstractC6492s.d(oVar.f0(interfaceC7618i), oVar.d(interfaceC7619j2)) || (z10 && v(f58125a, u0Var, interfaceC7619j2, interfaceC7618i, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean h(pi.u0 r15, ri.InterfaceC7619j r16, ri.InterfaceC7619j r17) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.C7351g.h(pi.u0, ri.j, ri.j):java.lang.Boolean");
    }

    private final List i(u0 u0Var, InterfaceC7619j interfaceC7619j, ri.m mVar) {
        u0.c cVarH0;
        InterfaceC7619j interfaceC7619j2 = interfaceC7619j;
        ri.o oVarJ = u0Var.j();
        List listF = oVarJ.F(interfaceC7619j2, mVar);
        if (listF != null) {
            return listF;
        }
        if (!oVarJ.Z(mVar) && oVarJ.q0(interfaceC7619j2)) {
            return AbstractC3689v.l();
        }
        if (oVarJ.X(mVar)) {
            if (!oVarJ.O(oVarJ.d(interfaceC7619j2), mVar)) {
                return AbstractC3689v.l();
            }
            InterfaceC7619j interfaceC7619jY = oVarJ.y(interfaceC7619j2, EnumC7611b.FOR_SUBTYPING);
            if (interfaceC7619jY != null) {
                interfaceC7619j2 = interfaceC7619jY;
            }
            return AbstractC3689v.e(interfaceC7619j2);
        }
        C8544k c8544k = new C8544k();
        u0Var.k();
        ArrayDeque arrayDequeH = u0Var.h();
        AbstractC6492s.f(arrayDequeH);
        Set setI = u0Var.i();
        AbstractC6492s.f(setI);
        arrayDequeH.push(interfaceC7619j2);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC7619j2 + ". Supertypes = " + AbstractC3689v.z0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC7619j interfaceC7619j3 = (InterfaceC7619j) arrayDequeH.pop();
            AbstractC6492s.f(interfaceC7619j3);
            if (setI.add(interfaceC7619j3)) {
                InterfaceC7619j interfaceC7619jY2 = oVarJ.y(interfaceC7619j3, EnumC7611b.FOR_SUBTYPING);
                if (interfaceC7619jY2 == null) {
                    interfaceC7619jY2 = interfaceC7619j3;
                }
                if (oVarJ.O(oVarJ.d(interfaceC7619jY2), mVar)) {
                    c8544k.add(interfaceC7619jY2);
                    cVarH0 = u0.c.C2046c.f58182a;
                } else {
                    cVarH0 = oVarJ.k0(interfaceC7619jY2) == 0 ? u0.c.b.f58181a : u0Var.j().h0(interfaceC7619jY2);
                }
                if (AbstractC6492s.d(cVarH0, u0.c.C2046c.f58182a)) {
                    cVarH0 = null;
                }
                if (cVarH0 != null) {
                    ri.o oVarJ2 = u0Var.j();
                    Iterator it = oVarJ2.x0(oVarJ2.d(interfaceC7619j3)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVarH0.a(u0Var, (InterfaceC7618i) it.next()));
                    }
                }
            }
        }
        u0Var.e();
        return c8544k;
    }

    private final List j(u0 u0Var, InterfaceC7619j interfaceC7619j, ri.m mVar) {
        return A(u0Var, i(u0Var, interfaceC7619j, mVar));
    }

    private final boolean k(u0 u0Var, InterfaceC7618i interfaceC7618i, InterfaceC7618i interfaceC7618i2, boolean z10) {
        ri.o oVarJ = u0Var.j();
        InterfaceC7618i interfaceC7618iO = u0Var.o(u0Var.p(interfaceC7618i));
        InterfaceC7618i interfaceC7618iO2 = u0Var.o(u0Var.p(interfaceC7618i2));
        C7351g c7351g = f58125a;
        Boolean boolH = c7351g.h(u0Var, oVarJ.b0(interfaceC7618iO), oVarJ.F0(interfaceC7618iO2));
        if (boolH == null) {
            Boolean boolC = u0Var.c(interfaceC7618iO, interfaceC7618iO2, z10);
            return boolC != null ? boolC.booleanValue() : c7351g.w(u0Var, oVarJ.b0(interfaceC7618iO), oVarJ.F0(interfaceC7618iO2));
        }
        boolean zBooleanValue = boolH.booleanValue();
        u0Var.c(interfaceC7618iO, interfaceC7618iO2, z10);
        return zBooleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r7.a0(r7.f0(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ri.n o(ri.o r7, ri.InterfaceC7618i r8, ri.InterfaceC7618i r9) {
        /*
            r6 = this;
            int r0 = r7.k0(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            ri.l r4 = r7.C(r8, r2)
            boolean r5 = r7.p(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            ri.i r3 = r7.j(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            ri.j r4 = r7.b0(r3)
            ri.j r4 = r7.o0(r4)
            boolean r4 = r7.g0(r4)
            if (r4 == 0) goto L3b
            ri.j r4 = r7.b0(r9)
            ri.j r4 = r7.o0(r4)
            boolean r4 = r7.g0(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = kotlin.jvm.internal.AbstractC6492s.d(r3, r9)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            ri.m r4 = r7.f0(r3)
            ri.m r5 = r7.f0(r9)
            boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            ri.n r3 = r6.o(r7, r3, r9)
            if (r3 == 0) goto L63
            return r3
        L5a:
            ri.m r8 = r7.f0(r8)
            ri.n r7 = r7.a0(r8, r2)
            return r7
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.C7351g.o(ri.o, ri.i, ri.i):ri.n");
    }

    private final boolean p(u0 u0Var, InterfaceC7619j interfaceC7619j) {
        ri.o oVarJ = u0Var.j();
        ri.m mVarD = oVarJ.d(interfaceC7619j);
        if (oVarJ.Z(mVarD)) {
            return oVarJ.B(mVarD);
        }
        if (oVarJ.B(oVarJ.d(interfaceC7619j))) {
            return true;
        }
        u0Var.k();
        ArrayDeque arrayDequeH = u0Var.h();
        AbstractC6492s.f(arrayDequeH);
        Set setI = u0Var.i();
        AbstractC6492s.f(setI);
        arrayDequeH.push(interfaceC7619j);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC7619j + ". Supertypes = " + AbstractC3689v.z0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC7619j interfaceC7619j2 = (InterfaceC7619j) arrayDequeH.pop();
            AbstractC6492s.f(interfaceC7619j2);
            if (setI.add(interfaceC7619j2)) {
                u0.c cVar = oVarJ.q0(interfaceC7619j2) ? u0.c.C2046c.f58182a : u0.c.b.f58181a;
                if (AbstractC6492s.d(cVar, u0.c.C2046c.f58182a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    ri.o oVarJ2 = u0Var.j();
                    Iterator it = oVarJ2.x0(oVarJ2.d(interfaceC7619j2)).iterator();
                    while (it.hasNext()) {
                        InterfaceC7619j interfaceC7619jA = cVar.a(u0Var, (InterfaceC7618i) it.next());
                        if (oVarJ.B(oVarJ.d(interfaceC7619jA))) {
                            u0Var.e();
                            return true;
                        }
                        arrayDequeH.add(interfaceC7619jA);
                    }
                }
            }
        }
        u0Var.e();
        return false;
    }

    private final boolean q(ri.o oVar, InterfaceC7618i interfaceC7618i) {
        return (!oVar.r0(oVar.f0(interfaceC7618i)) || oVar.c0(interfaceC7618i) || oVar.K(interfaceC7618i) || oVar.L(interfaceC7618i) || oVar.z(interfaceC7618i)) ? false : true;
    }

    private final boolean r(ri.o oVar, InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2) {
        InterfaceC7619j interfaceC7619jB0;
        InterfaceC7619j interfaceC7619jB02;
        InterfaceC7614e interfaceC7614eV = oVar.V(interfaceC7619j);
        if (interfaceC7614eV == null || (interfaceC7619jB0 = oVar.B0(interfaceC7614eV)) == null) {
            interfaceC7619jB0 = interfaceC7619j;
        }
        InterfaceC7614e interfaceC7614eV2 = oVar.V(interfaceC7619j2);
        if (interfaceC7614eV2 == null || (interfaceC7619jB02 = oVar.B0(interfaceC7614eV2)) == null) {
            interfaceC7619jB02 = interfaceC7619j2;
        }
        if (oVar.d(interfaceC7619jB0) != oVar.d(interfaceC7619jB02)) {
            return false;
        }
        if (oVar.K(interfaceC7619j) || !oVar.K(interfaceC7619j2)) {
            return !oVar.t(interfaceC7619j) || oVar.t(interfaceC7619j2);
        }
        return false;
    }

    public static /* synthetic */ boolean v(C7351g c7351g, u0 u0Var, InterfaceC7618i interfaceC7618i, InterfaceC7618i interfaceC7618i2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c7351g.u(u0Var, interfaceC7618i, interfaceC7618i2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean w(pi.u0 r18, ri.InterfaceC7619j r19, ri.InterfaceC7619j r20) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.C7351g.w(pi.u0, ri.j, ri.j):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J x(Collection collection, u0 u0Var, ri.o oVar, InterfaceC7619j interfaceC7619j, u0.a runForkingPoint) {
        AbstractC6492s.i(runForkingPoint, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            runForkingPoint.a(new C7349f(u0Var, oVar, (InterfaceC7619j) it.next(), interfaceC7619j));
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(u0 u0Var, ri.o oVar, InterfaceC7619j interfaceC7619j, InterfaceC7619j interfaceC7619j2) {
        return f58125a.s(u0Var, oVar.l0(interfaceC7619j), interfaceC7619j2);
    }

    private final boolean z(ri.o oVar, InterfaceC7618i interfaceC7618i, InterfaceC7618i interfaceC7618i2, ri.m mVar) {
        InterfaceC7619j interfaceC7619jC = oVar.c(interfaceC7618i);
        if (interfaceC7619jC instanceof InterfaceC7613d) {
            InterfaceC7613d interfaceC7613d = (InterfaceC7613d) interfaceC7619jC;
            if (oVar.k(interfaceC7613d) || !oVar.p(oVar.P(oVar.A0(interfaceC7613d))) || oVar.y0(interfaceC7613d) != EnumC7611b.FOR_SUBTYPING) {
                return false;
            }
            oVar.f0(interfaceC7618i2);
        }
        return false;
    }

    public final ri.s l(ri.s declared, ri.s useSite) {
        AbstractC6492s.i(declared, "declared");
        AbstractC6492s.i(useSite, "useSite");
        ri.s sVar = ri.s.INV;
        if (declared == sVar) {
            return useSite;
        }
        if (useSite == sVar || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean m(u0 state, InterfaceC7618i a10, InterfaceC7618i b10) {
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        ri.o oVarJ = state.j();
        if (a10 == b10) {
            return true;
        }
        C7351g c7351g = f58125a;
        if (c7351g.q(oVarJ, a10) && c7351g.q(oVarJ, b10)) {
            InterfaceC7618i interfaceC7618iO = state.o(state.p(a10));
            InterfaceC7618i interfaceC7618iO2 = state.o(state.p(b10));
            InterfaceC7619j interfaceC7619jB0 = oVarJ.b0(interfaceC7618iO);
            if (!oVarJ.O(oVarJ.f0(interfaceC7618iO), oVarJ.f0(interfaceC7618iO2))) {
                return false;
            }
            if (oVarJ.k0(interfaceC7619jB0) == 0) {
                return oVarJ.J(interfaceC7618iO) || oVarJ.J(interfaceC7618iO2) || oVarJ.t(interfaceC7619jB0) == oVarJ.t(oVarJ.b0(interfaceC7618iO2));
            }
        }
        return v(c7351g, state, a10, b10, false, 8, null) && v(c7351g, state, b10, a10, false, 8, null);
    }

    public final List n(u0 state, InterfaceC7619j subType, ri.m superConstructor) {
        u0.c cVar;
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(subType, "subType");
        AbstractC6492s.i(superConstructor, "superConstructor");
        ri.o oVarJ = state.j();
        if (oVarJ.q0(subType)) {
            return f58125a.j(state, subType, superConstructor);
        }
        if (!oVarJ.Z(superConstructor) && !oVarJ.D(superConstructor)) {
            return f58125a.i(state, subType, superConstructor);
        }
        C8544k<InterfaceC7619j> c8544k = new C8544k();
        state.k();
        ArrayDeque arrayDequeH = state.h();
        AbstractC6492s.f(arrayDequeH);
        Set setI = state.i();
        AbstractC6492s.f(setI);
        arrayDequeH.push(subType);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + AbstractC3689v.z0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC7619j interfaceC7619j = (InterfaceC7619j) arrayDequeH.pop();
            AbstractC6492s.f(interfaceC7619j);
            if (setI.add(interfaceC7619j)) {
                if (oVarJ.q0(interfaceC7619j)) {
                    c8544k.add(interfaceC7619j);
                    cVar = u0.c.C2046c.f58182a;
                } else {
                    cVar = u0.c.b.f58181a;
                }
                if (AbstractC6492s.d(cVar, u0.c.C2046c.f58182a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    ri.o oVarJ2 = state.j();
                    Iterator it = oVarJ2.x0(oVarJ2.d(interfaceC7619j)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVar.a(state, (InterfaceC7618i) it.next()));
                    }
                }
            }
        }
        state.e();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7619j interfaceC7619j2 : c8544k) {
            C7351g c7351g = f58125a;
            AbstractC6492s.f(interfaceC7619j2);
            AbstractC3689v.C(arrayList, c7351g.j(state, interfaceC7619j2, superConstructor));
        }
        return arrayList;
    }

    public final boolean s(u0 u0Var, InterfaceC7620k capturedSubArguments, InterfaceC7619j superType) {
        boolean zM;
        AbstractC6492s.i(u0Var, "<this>");
        AbstractC6492s.i(capturedSubArguments, "capturedSubArguments");
        AbstractC6492s.i(superType, "superType");
        ri.o oVarJ = u0Var.j();
        ri.m mVarD = oVarJ.d(superType);
        int iL = oVarJ.l(capturedSubArguments);
        int iQ = oVarJ.q(mVarD);
        if (iL != iQ || iL != oVarJ.k0(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iQ; i10++) {
            InterfaceC7621l interfaceC7621lC = oVarJ.C(superType, i10);
            if (!oVarJ.p(interfaceC7621lC)) {
                InterfaceC7618i interfaceC7618iJ = oVarJ.j(interfaceC7621lC);
                InterfaceC7621l interfaceC7621lU = oVarJ.U(capturedSubArguments, i10);
                oVarJ.v(interfaceC7621lU);
                ri.s sVar = ri.s.INV;
                InterfaceC7618i interfaceC7618iJ2 = oVarJ.j(interfaceC7621lU);
                C7351g c7351g = f58125a;
                ri.s sVarL = c7351g.l(oVarJ.E(oVarJ.a0(mVarD, i10)), oVarJ.v(interfaceC7621lC));
                if (sVarL == null) {
                    return u0Var.m();
                }
                if (sVarL != sVar || (!c7351g.z(oVarJ, interfaceC7618iJ2, interfaceC7618iJ, mVarD) && !c7351g.z(oVarJ, interfaceC7618iJ, interfaceC7618iJ2, mVarD))) {
                    if (u0Var.f58176g > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + interfaceC7618iJ2).toString());
                    }
                    u0Var.f58176g++;
                    int i11 = a.f58127a[sVarL.ordinal()];
                    if (i11 == 1) {
                        zM = c7351g.m(u0Var, interfaceC7618iJ2, interfaceC7618iJ);
                    } else if (i11 == 2) {
                        zM = v(c7351g, u0Var, interfaceC7618iJ2, interfaceC7618iJ, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zM = v(c7351g, u0Var, interfaceC7618iJ, interfaceC7618iJ2, false, 8, null);
                    }
                    u0Var.f58176g--;
                    if (!zM) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean t(u0 state, InterfaceC7618i subType, InterfaceC7618i superType) {
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(subType, "subType");
        AbstractC6492s.i(superType, "superType");
        return v(this, state, subType, superType, false, 8, null);
    }

    public final boolean u(u0 state, InterfaceC7618i subType, InterfaceC7618i superType, boolean z10) {
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(subType, "subType");
        AbstractC6492s.i(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.f(subType, superType)) {
            return k(state, subType, superType, z10);
        }
        return false;
    }
}
