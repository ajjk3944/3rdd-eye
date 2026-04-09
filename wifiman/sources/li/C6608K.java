package li;

import Bh.AbstractC2510u;
import Bh.EnumC2496f;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.b0;
import Bh.f0;
import Bh.g0;
import Bh.k0;
import Bh.s0;
import Wh.b;
import Zg.AbstractC3689v;
import di.AbstractC5398g;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;
import li.AbstractC6611N;
import ni.C6963N;
import ni.C6964O;
import ni.C6965P;
import ni.C6968T;
import ni.C6969a;
import ni.C6971c;
import ni.C6981m;

/* renamed from: li.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6608K {

    /* renamed from: a, reason: collision with root package name */
    private final C6638p f52646a;

    /* renamed from: b, reason: collision with root package name */
    private final C6629g f52647b;

    public C6608K(C6638p c10) {
        AbstractC6492s.i(c10, "c");
        this.f52646a = c10;
        this.f52647b = new C6629g(c10.c().q(), c10.c().r());
    }

    private final b0 A(Uh.q qVar, C6638p c6638p, InterfaceC2491a interfaceC2491a, int i10) {
        return bi.h.b(interfaceC2491a, c6638p.i().u(qVar), null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), i10);
    }

    private final List B(List list, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, EnumC6626d enumC6626d) {
        InterfaceC2503m interfaceC2503mE = this.f52646a.e();
        AbstractC6492s.g(interfaceC2503mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC2491a interfaceC2491a = (InterfaceC2491a) interfaceC2503mE;
        InterfaceC2503m interfaceC2503mB = interfaceC2491a.b();
        AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
        AbstractC6611N abstractC6611NI = i(interfaceC2503mB);
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            Uh.u uVar = (Uh.u) obj;
            int iU0 = uVar.a1() ? uVar.U0() : 0;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarB = (abstractC6611NI == null || !Wh.b.f23939c.d(iU0).booleanValue()) ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b() : new C6968T(this.f52646a.h(), new C6605H(this, abstractC6611NI, nVar, enumC6626d, i10, uVar));
            Zh.f fVarB = AbstractC6609L.b(this.f52646a.g(), uVar.V0());
            pi.S sU = this.f52646a.i().u(Wh.f.q(uVar, this.f52646a.j()));
            Boolean boolD = Wh.b.f23928H.d(iU0);
            AbstractC6492s.h(boolD, "get(...)");
            boolean zBooleanValue = boolD.booleanValue();
            Boolean boolD2 = Wh.b.f23929I.d(iU0);
            AbstractC6492s.h(boolD2, "get(...)");
            boolean zBooleanValue2 = boolD2.booleanValue();
            Boolean boolD3 = Wh.b.f23930J.d(iU0);
            AbstractC6492s.h(boolD3, "get(...)");
            boolean zBooleanValue3 = boolD3.booleanValue();
            Uh.q qVarT = Wh.f.t(uVar, this.f52646a.j());
            pi.S sU2 = qVarT != null ? this.f52646a.i().u(qVarT) : null;
            g0 NO_SOURCE = g0.f1784a;
            AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new Dh.V(interfaceC2491a, null, i10, hVarB, fVarB, sU, zBooleanValue, zBooleanValue2, zBooleanValue3, sU2, NO_SOURCE));
            arrayList = arrayList2;
            i10 = i11;
        }
        return AbstractC3689v.i1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List C(C6608K c6608k, AbstractC6611N abstractC6611N, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, EnumC6626d enumC6626d, int i10, Uh.u uVar) {
        return AbstractC3689v.i1(c6608k.f52646a.c().d().b(abstractC6611N, nVar, enumC6626d, i10, uVar));
    }

    private final AbstractC6611N i(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m instanceof Bh.M) {
            return new AbstractC6611N.b(((Bh.M) interfaceC2503m).e(), this.f52646a.g(), this.f52646a.j(), this.f52646a.d());
        }
        if (interfaceC2503m instanceof C6981m) {
            return ((C6981m) interfaceC2503m).i1();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h j(kotlin.reflect.jvm.internal.impl.protobuf.n nVar, int i10, EnumC6626d enumC6626d) {
        return !Wh.b.f23939c.d(i10).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b() : new C6968T(this.f52646a.h(), new C6602E(this, nVar, enumC6626d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(C6608K c6608k, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, EnumC6626d enumC6626d) {
        AbstractC6611N abstractC6611NI = c6608k.i(c6608k.f52646a.e());
        List listI1 = abstractC6611NI != null ? AbstractC3689v.i1(c6608k.f52646a.c().d().h(abstractC6611NI, nVar, enumC6626d)) : null;
        return listI1 == null ? AbstractC3689v.l() : listI1;
    }

    private final b0 l() {
        InterfaceC2503m interfaceC2503mE = this.f52646a.e();
        InterfaceC2495e interfaceC2495e = interfaceC2503mE instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mE : null;
        if (interfaceC2495e != null) {
            return interfaceC2495e.J0();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h m(Uh.n nVar, boolean z10) {
        return !Wh.b.f23939c.d(nVar.k1()).booleanValue() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b() : new C6968T(this.f52646a.h(), new C6603F(this, z10, nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(C6608K c6608k, boolean z10, Uh.n nVar) {
        AbstractC6611N abstractC6611NI = c6608k.i(c6608k.f52646a.e());
        List listI1 = abstractC6611NI != null ? z10 ? AbstractC3689v.i1(c6608k.f52646a.c().d().f(abstractC6611NI, nVar)) : AbstractC3689v.i1(c6608k.f52646a.c().d().g(abstractC6611NI, nVar)) : null;
        return listI1 == null ? AbstractC3689v.l() : listI1;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h o(kotlin.reflect.jvm.internal.impl.protobuf.n nVar, EnumC6626d enumC6626d) {
        return new C6969a(this.f52646a.h(), new C6604G(this, nVar, enumC6626d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(C6608K c6608k, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, EnumC6626d enumC6626d) {
        AbstractC6611N abstractC6611NI = c6608k.i(c6608k.f52646a.e());
        List listK = abstractC6611NI != null ? c6608k.f52646a.c().d().k(abstractC6611NI, nVar, enumC6626d) : null;
        return listK == null ? AbstractC3689v.l() : listK;
    }

    private final void q(C6964O c6964o, b0 b0Var, b0 b0Var2, List list, List list2, List list3, pi.S s10, Bh.D d10, AbstractC2510u abstractC2510u, Map map) {
        c6964o.o1(b0Var, b0Var2, list, list2, list3, s10, d10, abstractC2510u, map);
    }

    private final int t(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oi.j v(C6608K c6608k, Uh.n nVar, C6963N c6963n) {
        return c6608k.f52646a.h().b(new C6606I(c6608k, nVar, c6963n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5398g w(C6608K c6608k, Uh.n nVar, C6963N c6963n) {
        AbstractC6611N abstractC6611NI = c6608k.i(c6608k.f52646a.e());
        AbstractC6492s.f(abstractC6611NI);
        InterfaceC6627e interfaceC6627eD = c6608k.f52646a.c().d();
        pi.S returnType = c6963n.getReturnType();
        AbstractC6492s.h(returnType, "getReturnType(...)");
        return (AbstractC5398g) interfaceC6627eD.e(abstractC6611NI, nVar, returnType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oi.j x(C6608K c6608k, Uh.n nVar, C6963N c6963n) {
        return c6608k.f52646a.h().b(new C6607J(c6608k, nVar, c6963n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5398g y(C6608K c6608k, Uh.n nVar, C6963N c6963n) {
        AbstractC6611N abstractC6611NI = c6608k.i(c6608k.f52646a.e());
        AbstractC6492s.f(abstractC6611NI);
        InterfaceC6627e interfaceC6627eD = c6608k.f52646a.c().d();
        pi.S returnType = c6963n.getReturnType();
        AbstractC6492s.h(returnType, "getReturnType(...)");
        return (AbstractC5398g) interfaceC6627eD.c(abstractC6611NI, nVar, returnType);
    }

    public final InterfaceC2494d r(Uh.d proto, boolean z10) {
        AbstractC6492s.i(proto, "proto");
        InterfaceC2503m interfaceC2503mE = this.f52646a.e();
        AbstractC6492s.g(interfaceC2503mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC2495e interfaceC2495e = (InterfaceC2495e) interfaceC2503mE;
        int iT0 = proto.T0();
        EnumC6626d enumC6626d = EnumC6626d.FUNCTION;
        C6971c c6971c = new C6971c(interfaceC2495e, null, j(proto, iT0, enumC6626d), z10, InterfaceC2492b.a.DECLARATION, proto, this.f52646a.g(), this.f52646a.j(), this.f52646a.k(), this.f52646a.d(), null, 1024, null);
        C6608K c6608kF = C6638p.b(this.f52646a, c6971c, AbstractC3689v.l(), null, null, null, null, 60, null).f();
        List listW0 = proto.W0();
        AbstractC6492s.h(listW0, "getValueParameterList(...)");
        c6971c.q1(c6608kF.B(listW0, proto, enumC6626d), AbstractC6613P.a(C6612O.f52662a, (Uh.x) Wh.b.f23940d.d(proto.T0())));
        c6971c.g1(interfaceC2495e.u());
        c6971c.W0(interfaceC2495e.L());
        c6971c.Y0(!Wh.b.f23951o.d(proto.T0()).booleanValue());
        return c6971c;
    }

    public final f0 s(Uh.i proto) {
        pi.S sU;
        AbstractC6492s.i(proto, "proto");
        int iM1 = proto.C1() ? proto.m1() : t(proto.o1());
        EnumC6626d enumC6626d = EnumC6626d.FUNCTION;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarJ = j(proto, iM1, enumC6626d);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarO = Wh.f.g(proto) ? o(proto, enumC6626d) : kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b();
        C6964O c6964o = new C6964O(this.f52646a.e(), null, hVarJ, AbstractC6609L.b(this.f52646a.g(), proto.n1()), AbstractC6613P.b(C6612O.f52662a, (Uh.j) Wh.b.f23952p.d(iM1)), proto, this.f52646a.g(), this.f52646a.j(), AbstractC6492s.d(AbstractC5833e.o(this.f52646a.e()).c(AbstractC6609L.b(this.f52646a.g(), proto.n1())), AbstractC6614Q.f52674a) ? Wh.h.f23970b.b() : this.f52646a.k(), this.f52646a.d(), null, 1024, null);
        C6638p c6638p = this.f52646a;
        List listV1 = proto.v1();
        AbstractC6492s.h(listV1, "getTypeParameterList(...)");
        C6638p c6638pB = C6638p.b(c6638p, c6964o, listV1, null, null, null, null, 60, null);
        Uh.q qVarK = Wh.f.k(proto, this.f52646a.j());
        b0 b0VarI = (qVarK == null || (sU = c6638pB.i().u(qVarK)) == null) ? null : bi.h.i(c6964o, sU, hVarO);
        b0 b0VarL = l();
        List listC = Wh.f.c(proto, this.f52646a.j());
        List arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            b0 b0VarA = A((Uh.q) obj, c6638pB, c6964o, i10);
            if (b0VarA != null) {
                arrayList.add(b0VarA);
            }
            i10 = i11;
        }
        List listM = c6638pB.i().m();
        C6608K c6608kF = c6638pB.f();
        List listZ1 = proto.z1();
        AbstractC6492s.h(listZ1, "getValueParameterList(...)");
        List listB = c6608kF.B(listZ1, proto, EnumC6626d.FUNCTION);
        pi.S sU2 = c6638pB.i().u(Wh.f.m(proto, this.f52646a.j()));
        C6612O c6612o = C6612O.f52662a;
        q(c6964o, b0VarI, b0VarL, arrayList, listM, listB, sU2, c6612o.b((Uh.k) Wh.b.f23941e.d(iM1)), AbstractC6613P.a(c6612o, (Uh.x) Wh.b.f23940d.d(iM1)), Zg.U.h());
        c6964o.f1(Wh.b.f23953q.d(iM1).booleanValue());
        c6964o.c1(Wh.b.f23954r.d(iM1).booleanValue());
        c6964o.X0(Wh.b.f23957u.d(iM1).booleanValue());
        c6964o.e1(Wh.b.f23955s.d(iM1).booleanValue());
        c6964o.i1(Wh.b.f23956t.d(iM1).booleanValue());
        c6964o.h1(Wh.b.f23958v.d(iM1).booleanValue());
        c6964o.W0(Wh.b.f23959w.d(iM1).booleanValue());
        c6964o.Y0(!Wh.b.f23960x.d(iM1).booleanValue());
        Yg.s sVarA = this.f52646a.c().h().a(proto, c6964o, this.f52646a.j(), c6638pB.i());
        if (sVarA != null) {
            c6964o.U0((InterfaceC2491a.InterfaceC0071a) sVarA.h(), sVarA.j());
        }
        return c6964o;
    }

    public final Bh.Y u(Uh.n proto) {
        Uh.n nVar;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarB;
        C6963N c6963n;
        b0 b0VarI;
        C6638p c6638p;
        b.d dVar;
        b.d dVar2;
        C6963N c6963n2;
        Uh.n nVar2;
        Dh.L l10;
        Dh.L l11;
        Dh.M mE;
        Dh.L l12;
        pi.S sU;
        AbstractC6492s.i(proto, "proto");
        int iK1 = proto.y1() ? proto.k1() : t(proto.n1());
        InterfaceC2503m interfaceC2503mE = this.f52646a.e();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarJ = j(proto, iK1, EnumC6626d.PROPERTY);
        C6612O c6612o = C6612O.f52662a;
        Bh.D dB = c6612o.b((Uh.k) Wh.b.f23941e.d(iK1));
        AbstractC2510u abstractC2510uA = AbstractC6613P.a(c6612o, (Uh.x) Wh.b.f23940d.d(iK1));
        Boolean boolD = Wh.b.f23961y.d(iK1);
        AbstractC6492s.h(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        Zh.f fVarB = AbstractC6609L.b(this.f52646a.g(), proto.m1());
        InterfaceC2492b.a aVarB = AbstractC6613P.b(c6612o, (Uh.j) Wh.b.f23952p.d(iK1));
        Boolean boolD2 = Wh.b.f23923C.d(iK1);
        AbstractC6492s.h(boolD2, "get(...)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = Wh.b.f23922B.d(iK1);
        AbstractC6492s.h(boolD3, "get(...)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = Wh.b.f23925E.d(iK1);
        AbstractC6492s.h(boolD4, "get(...)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = Wh.b.f23926F.d(iK1);
        AbstractC6492s.h(boolD5, "get(...)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = Wh.b.f23927G.d(iK1);
        AbstractC6492s.h(boolD6, "get(...)");
        C6963N c6963n3 = new C6963N(interfaceC2503mE, null, hVarJ, dB, abstractC2510uA, zBooleanValue, fVarB, aVarB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), proto, this.f52646a.g(), this.f52646a.j(), this.f52646a.k(), this.f52646a.d());
        C6638p c6638p2 = this.f52646a;
        List listW1 = proto.w1();
        AbstractC6492s.h(listW1, "getTypeParameterList(...)");
        C6638p c6638pB = C6638p.b(c6638p2, c6963n3, listW1, null, null, null, null, 60, null);
        Boolean boolD7 = Wh.b.f23962z.d(iK1);
        AbstractC6492s.h(boolD7, "get(...)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        if (zBooleanValue6 && Wh.f.h(proto)) {
            nVar = proto;
            hVarB = o(nVar, EnumC6626d.PROPERTY_GETTER);
        } else {
            nVar = proto;
            hVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b();
        }
        pi.S sU2 = c6638pB.i().u(Wh.f.n(nVar, this.f52646a.j()));
        List listM = c6638pB.i().m();
        b0 b0VarL = l();
        Uh.q qVarL = Wh.f.l(nVar, this.f52646a.j());
        if (qVarL == null || (sU = c6638pB.i().u(qVarL)) == null) {
            c6963n = c6963n3;
            b0VarI = null;
        } else {
            c6963n = c6963n3;
            b0VarI = bi.h.i(c6963n, sU, hVarB);
        }
        List listD = Wh.f.d(nVar, this.f52646a.j());
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listD, 10));
        int i10 = 0;
        for (Object obj : listD) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            arrayList.add(A((Uh.q) obj, c6638pB, c6963n, i10));
            i10 = i11;
        }
        c6963n.b1(sU2, listM, b0VarL, b0VarI, arrayList);
        Boolean boolD8 = Wh.b.f23939c.d(iK1);
        AbstractC6492s.h(boolD8, "get(...)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        b.d dVar3 = Wh.b.f23940d;
        Uh.x xVar = (Uh.x) dVar3.d(iK1);
        b.d dVar4 = Wh.b.f23941e;
        int iB = Wh.b.b(zBooleanValue7, xVar, (Uh.k) dVar4.d(iK1), false, false, false);
        if (zBooleanValue6) {
            int iL1 = proto.z1() ? proto.l1() : iB;
            Boolean boolD9 = Wh.b.f23931K.d(iL1);
            AbstractC6492s.h(boolD9, "get(...)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = Wh.b.f23932L.d(iL1);
            AbstractC6492s.h(boolD10, "get(...)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = Wh.b.f23933M.d(iL1);
            AbstractC6492s.h(boolD11, "get(...)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarJ2 = j(nVar, iL1, EnumC6626d.PROPERTY_GETTER);
            if (zBooleanValue8) {
                C6612O c6612o2 = C6612O.f52662a;
                dVar = dVar4;
                c6638p = c6638pB;
                c6963n2 = c6963n;
                dVar2 = dVar3;
                nVar2 = nVar;
                l12 = new Dh.L(c6963n, hVarJ2, c6612o2.b((Uh.k) dVar4.d(iL1)), AbstractC6613P.a(c6612o2, (Uh.x) dVar3.d(iL1)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, c6963n.h(), null, g0.f1784a);
            } else {
                c6638p = c6638pB;
                dVar = dVar4;
                dVar2 = dVar3;
                c6963n2 = c6963n;
                nVar2 = nVar;
                Dh.L lD = bi.h.d(c6963n2, hVarJ2);
                AbstractC6492s.f(lD);
                l12 = lD;
            }
            l12.P0(c6963n2.getReturnType());
            l10 = l12;
        } else {
            c6638p = c6638pB;
            dVar = dVar4;
            dVar2 = dVar3;
            c6963n2 = c6963n;
            nVar2 = nVar;
            l10 = null;
        }
        if (Wh.b.f23921A.d(iK1).booleanValue()) {
            if (proto.G1()) {
                iB = proto.s1();
            }
            int i12 = iB;
            Boolean boolD12 = Wh.b.f23931K.d(i12);
            AbstractC6492s.h(boolD12, "get(...)");
            boolean zBooleanValue11 = boolD12.booleanValue();
            Boolean boolD13 = Wh.b.f23932L.d(i12);
            AbstractC6492s.h(boolD13, "get(...)");
            boolean zBooleanValue12 = boolD13.booleanValue();
            Boolean boolD14 = Wh.b.f23933M.d(i12);
            AbstractC6492s.h(boolD14, "get(...)");
            boolean zBooleanValue13 = boolD14.booleanValue();
            EnumC6626d enumC6626d = EnumC6626d.PROPERTY_SETTER;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarJ3 = j(nVar2, i12, enumC6626d);
            if (zBooleanValue11) {
                C6612O c6612o3 = C6612O.f52662a;
                l11 = l10;
                Dh.M m10 = new Dh.M(c6963n2, hVarJ3, c6612o3.b((Uh.k) dVar.d(i12)), AbstractC6613P.a(c6612o3, (Uh.x) dVar2.d(i12)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, c6963n2.h(), null, g0.f1784a);
                m10.Q0((s0) AbstractC3689v.R0(C6638p.b(c6638p, m10, AbstractC3689v.l(), null, null, null, null, 60, null).f().B(AbstractC3689v.e(proto.t1()), nVar2, enumC6626d)));
                mE = m10;
            } else {
                l11 = l10;
                mE = bi.h.e(c6963n2, hVarJ3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b());
                AbstractC6492s.f(mE);
            }
        } else {
            l11 = l10;
            mE = null;
        }
        if (Wh.b.f23924D.d(iK1).booleanValue()) {
            c6963n2.L0(new C6600C(this, nVar2, c6963n2));
        }
        InterfaceC2503m interfaceC2503mE2 = this.f52646a.e();
        InterfaceC2495e interfaceC2495e = interfaceC2503mE2 instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mE2 : null;
        if ((interfaceC2495e != null ? interfaceC2495e.h() : null) == EnumC2496f.ANNOTATION_CLASS) {
            c6963n2.L0(new C6601D(this, nVar2, c6963n2));
        }
        c6963n2.V0(l11, mE, new Dh.r(m(nVar2, false), c6963n2), new Dh.r(m(nVar2, true), c6963n2));
        return c6963n2;
    }

    public final k0 z(Uh.r proto) {
        AbstractC6492s.i(proto, "proto");
        h.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1;
        List listA1 = proto.a1();
        AbstractC6492s.h(listA1, "getAnnotationList(...)");
        List<Uh.b> list = listA1;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (Uh.b bVar : list) {
            C6629g c6629g = this.f52647b;
            AbstractC6492s.f(bVar);
            arrayList.add(c6629g.a(bVar, this.f52646a.g()));
        }
        C6965P c6965p = new C6965P(this.f52646a.h(), this.f52646a.e(), aVar.a(arrayList), AbstractC6609L.b(this.f52646a.g(), proto.g1()), AbstractC6613P.a(C6612O.f52662a, (Uh.x) Wh.b.f23940d.d(proto.f1())), proto, this.f52646a.g(), this.f52646a.j(), this.f52646a.k(), this.f52646a.d());
        C6638p c6638p = this.f52646a;
        List listJ1 = proto.j1();
        AbstractC6492s.h(listJ1, "getTypeParameterList(...)");
        C6638p c6638pB = C6638p.b(c6638p, c6965p, listJ1, null, null, null, null, 60, null);
        c6965p.W0(c6638pB.i().m(), c6638pB.i().o(Wh.f.r(proto, this.f52646a.j()), false), c6638pB.i().o(Wh.f.e(proto, this.f52646a.j()), false));
        return c6965p;
    }
}
