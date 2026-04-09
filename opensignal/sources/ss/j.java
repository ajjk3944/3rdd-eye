package ss;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import ht.a1;
import ht.b0;
import ht.c1;
import ht.p0;
import ht.x;
import ir.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mq.y;
import rr.a0;
import rr.d0;
import rr.f0;
import rr.m0;
import rr.r0;
import rr.u0;
import rr.w;
import rr.z;
import ur.i0;
import ur.j0;
import ur.q0;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final j f22243c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f22244d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f22245e;

    /* renamed from: a, reason: collision with root package name */
    public final o f22246a;

    /* renamed from: b, reason: collision with root package name */
    public final lq.q f22247b = kc.f.F(new pp.c(6, this));

    static {
        o oVar = new o();
        oVar.j();
        oVar.f22250a = true;
        new j(oVar);
        o oVar2 = new o();
        oVar2.j();
        y yVar = y.f16947a;
        oVar2.d(yVar);
        oVar2.f22250a = true;
        new j(oVar2);
        o oVar3 = new o();
        oVar3.j();
        oVar3.d(yVar);
        oVar3.m();
        oVar3.f22250a = true;
        new j(oVar3);
        o oVar4 = new o();
        oVar4.d(yVar);
        b bVar = b.f22228c;
        oVar4.l(bVar);
        oVar4.e(s.ONLY_NON_SYNTHESIZED);
        oVar4.f22250a = true;
        new j(oVar4);
        o oVar5 = new o();
        oVar5.j();
        oVar5.d(yVar);
        oVar5.l(bVar);
        oVar5.g();
        oVar5.e(s.NONE);
        oVar5.a();
        oVar5.c();
        oVar5.m();
        oVar5.i();
        oVar5.f22250a = true;
        new j(oVar5);
        o oVar6 = new o();
        oVar6.d(l.ALL_EXCEPT_ANNOTATIONS);
        oVar6.f22250a = true;
        f22243c = new j(oVar6);
        o oVar7 = new o();
        oVar7.d(l.ALL);
        oVar7.f22250a = true;
        new j(oVar7);
        o oVar8 = new o();
        oVar8.l(bVar);
        oVar8.e(s.ONLY_NON_SYNTHESIZED);
        oVar8.f22250a = true;
        f22244d = new j(oVar8);
        o oVar9 = new o();
        oVar9.b();
        oVar9.l(b.f22227b);
        oVar9.d(l.ALL);
        oVar9.f22250a = true;
        f22245e = new j(oVar9);
        o oVar10 = new o();
        oVar10.h(u.HTML);
        oVar10.d(l.ALL);
        oVar10.f22250a = true;
        new j(oVar10);
    }

    public j(o oVar) {
        this.f22246a = oVar;
    }

    public static void X(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    public static boolean j0(x xVar) {
        if (!xu.d.M(xVar)) {
            return false;
        }
        List listL = xVar.L();
        if (listL != null && listL.isEmpty()) {
            return true;
        }
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            if (((p0) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void n(j jVar, m0 m0Var, StringBuilder sb2) throws IOException {
        boolean zR = jVar.r();
        o oVar = jVar.f22246a;
        if (!zR) {
            n nVar = oVar.f22256g;
            v[] vVarArr = o.W;
            if (!((Boolean) nVar.a(vVarArr[5], oVar)).booleanValue()) {
                if (jVar.q().contains(l.ANNOTATIONS)) {
                    jVar.y(sb2, m0Var, null);
                    ur.s sVarN0 = m0Var.n0();
                    if (sVarN0 != null) {
                        jVar.y(sb2, sVarN0, sr.d.FIELD);
                    }
                    ur.s sVarL0 = m0Var.l0();
                    if (sVarL0 != null) {
                        jVar.y(sb2, sVarL0, sr.d.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((t) oVar.G.a(vVarArr[31], oVar)) == t.NONE) {
                        i0 i0VarB = m0Var.b();
                        if (i0VarB != null) {
                            jVar.y(sb2, i0VarB, sr.d.PROPERTY_GETTER);
                        }
                        j0 j0VarD = m0Var.d();
                        if (j0VarD != null) {
                            jVar.y(sb2, j0VarD, sr.d.PROPERTY_SETTER);
                            List listY = j0VarD.Y();
                            br.l.d(listY, "setter.valueParameters");
                            q0 q0Var = (q0) mq.o.I0(listY);
                            br.l.d(q0Var, "it");
                            jVar.y(sb2, q0Var, sr.d.SETTER_PARAMETER);
                        }
                    }
                }
                List listO0 = m0Var.o0();
                br.l.d(listO0, "property.contextReceiverParameters");
                jVar.C(sb2, listO0);
                as.p pVarC = m0Var.c();
                br.l.d(pVarC, "property.visibility");
                jVar.h0(pVarC, sb2);
                jVar.N(sb2, jVar.q().contains(l.CONST) && m0Var.y(), "const");
                jVar.K(m0Var, sb2);
                jVar.M(sb2, m0Var);
                jVar.S(sb2, m0Var);
                jVar.N(sb2, jVar.q().contains(l.LATEINIT) && m0Var.s0(), "lateinit");
                jVar.J(sb2, m0Var);
            }
            jVar.e0(m0Var, sb2, false);
            List typeParameters = m0Var.getTypeParameters();
            br.l.d(typeParameters, "property.typeParameters");
            jVar.d0(sb2, typeParameters, true);
            jVar.V(sb2, m0Var);
        }
        jVar.P(m0Var, sb2, true);
        sb2.append(": ");
        x type = m0Var.getType();
        br.l.d(type, "property.type");
        sb2.append(jVar.Y(type));
        jVar.W(sb2, m0Var);
        jVar.H(m0Var, sb2);
        List typeParameters2 = m0Var.getTypeParameters();
        br.l.d(typeParameters2, "property.typeParameters");
        jVar.i0(sb2, typeParameters2);
    }

    public static z v(rr.x xVar) {
        if (xVar instanceof rr.f) {
            return ((rr.f) xVar).f() == rr.g.INTERFACE ? z.ABSTRACT : z.FINAL;
        }
        rr.l lVarO = xVar.o();
        rr.f fVar = lVarO instanceof rr.f ? (rr.f) lVarO : null;
        if (fVar == null) {
            return z.FINAL;
        }
        if (!(xVar instanceof rr.d)) {
            return z.FINAL;
        }
        rr.d dVar = (rr.d) xVar;
        Collection collectionP = dVar.p();
        br.l.d(collectionP, "this.overriddenDescriptors");
        if (!collectionP.isEmpty() && fVar.j() != z.FINAL) {
            return z.OPEN;
        }
        if (fVar.f() != rr.g.INTERFACE || br.l.a(dVar.c(), rr.p.f21697a)) {
            return z.FINAL;
        }
        z zVarJ = dVar.j();
        z zVar = z.ABSTRACT;
        return zVarJ == zVar ? zVar : z.OPEN;
    }

    public final void A(rr.j jVar, StringBuilder sb2) {
        List listS = jVar.s();
        br.l.d(listS, "classifier.declaredTypeParameters");
        List listO = jVar.v().o();
        br.l.d(listO, "classifier.typeConstructor.parameters");
        if (u() && jVar.m() && listO.size() > listS.size()) {
            sb2.append(" /*captured type parameters: ");
            c0(sb2, listO.subList(listS.size(), listO.size()));
            sb2.append("*/");
        }
    }

    public final String B(vs.g gVar) {
        if (gVar instanceof vs.b) {
            return mq.o.x0((Iterable) ((vs.b) gVar).f23957a, ", ", "{", "}", new h(this, 1), 24);
        }
        if (gVar instanceof vs.a) {
            return tt.l.J0(x((sr.b) ((vs.a) gVar).f23957a, null), "@");
        }
        if (!(gVar instanceof vs.u)) {
            return gVar.toString();
        }
        vs.t tVar = (vs.t) ((vs.u) gVar).f23957a;
        if (tVar instanceof vs.r) {
            return ((vs.r) tVar).f23965a + "::class";
        }
        if (!(tVar instanceof vs.s)) {
            throw new bf.n();
        }
        vs.f fVar = ((vs.s) tVar).f23966a;
        String strB = fVar.f23955a.b().b();
        int i10 = fVar.f23956b;
        for (int i11 = 0; i11 < i10; i11++) {
            strB = h0.b.g('>', "kotlin.Array<", strB);
        }
        return w.g.f(strB, "::class");
    }

    public final void C(StringBuilder sb2, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            ur.v vVar = (ur.v) it.next();
            y(sb2, vVar, sr.d.RECEIVER);
            x type = vVar.getType();
            br.l.d(type, "contextReceiver.type");
            sb2.append(G(type));
            if (i10 == e5.z(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    public final void D(StringBuilder sb2, b0 b0Var) {
        y(sb2, b0Var, null);
        if (ht.c.i(b0Var)) {
            boolean z10 = b0Var instanceof kt.h;
            o oVar = this.f22246a;
            if (z10 && ((kt.h) b0Var).f14514r.isUnresolved() && ((Boolean) oVar.T.a(o.W[45], oVar)).booleanValue()) {
                kt.k kVar = kt.k.f14520a;
                if (z10) {
                    ((kt.h) b0Var).f14514r.isUnresolved();
                }
                ht.m0 m0VarZ = b0Var.Z();
                br.l.c(m0VarZ, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(E(((kt.i) m0VarZ).f14518b[0]));
            } else {
                if (!z10 || ((Boolean) oVar.V.a(o.W[47], oVar)).booleanValue()) {
                    sb2.append(b0Var.Z().toString());
                } else {
                    sb2.append(((kt.h) b0Var).D);
                }
                sb2.append(Z(b0Var.L()));
            }
        } else {
            ht.m0 m0VarZ2 = b0Var.Z();
            rr.i iVarP = b0Var.Z().p();
            qm.c cVarA = w.a(b0Var, iVarP instanceof rr.j ? (rr.j) iVarP : null, 0);
            if (cVarA == null) {
                sb2.append(a0(m0VarZ2));
                sb2.append(Z(b0Var.L()));
            } else {
                U(sb2, cVarA);
            }
        }
        if (b0Var.c0()) {
            sb2.append("?");
        }
        if (b0Var instanceof ht.n) {
            sb2.append(" & Any");
        }
    }

    public final String E(String str) {
        int i10 = g.f22234a[s().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return h0.b.o("<font color=red><b>", str, "</b></font>");
        }
        throw new bf.n();
    }

    public final String F(String str, String str2, or.h hVar) {
        br.l.e(str, "lowerRendered");
        br.l.e(str2, "upperRendered");
        if (b4.g0(str, str2)) {
            return tt.s.n0(str2, "(", false) ? h0.b.o("(", str, ")!") : str.concat("!");
        }
        c cVarP = p();
        rr.f fVarI = hVar.i(or.n.B);
        if (fVarI == null) {
            or.h.a(34);
            throw null;
        }
        String strV0 = tt.l.V0(cVarP.a(fVarI, this), "Collection");
        String strC0 = b4.c0(str, strV0.concat("Mutable"), str2, strV0, strV0.concat("(Mutable)"));
        if (strC0 != null) {
            return strC0;
        }
        String strC02 = b4.c0(str, strV0.concat("MutableMap.MutableEntry"), str2, strV0.concat("Map.Entry"), strV0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strC02 != null) {
            return strC02;
        }
        String strV02 = tt.l.V0(p().a(hVar.j("Array"), this), "Array");
        StringBuilder sbT = c7.a.t(strV02);
        sbT.append(o("Array<"));
        String string = sbT.toString();
        StringBuilder sbT2 = c7.a.t(strV02);
        sbT2.append(o("Array<out "));
        String string2 = sbT2.toString();
        StringBuilder sbT3 = c7.a.t(strV02);
        sbT3.append(o("Array<(out) "));
        String strC03 = b4.c0(str, string, str2, string2, sbT3.toString());
        if (strC03 != null) {
            return strC03;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String G(x xVar) throws IOException {
        String strY = Y(xVar);
        return ((!j0(xVar) || a1.e(xVar)) && !(xVar instanceof ht.n)) ? strY : h0.b.g(')', "(", strY);
    }

    public final void H(u0 u0Var, StringBuilder sb2) {
        vs.g gVarU;
        o oVar = this.f22246a;
        if (!((Boolean) oVar.f22268u.a(o.W[19], oVar)).booleanValue() || (gVarU = u0Var.U()) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(o(B(gVarU)));
    }

    public final String I(String str) {
        int i10 = g.f22234a[s().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new bf.n();
            }
            o oVar = this.f22246a;
            if (!((Boolean) oVar.U.a(o.W[46], oVar)).booleanValue()) {
                return h0.b.o("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void J(StringBuilder sb2, rr.d dVar) {
        if (q().contains(l.MEMBER_KIND) && u() && dVar.f() != rr.c.DECLARATION) {
            sb2.append("/*");
            sb2.append(xu.l.b0(dVar.f().name()));
            sb2.append("*/ ");
        }
    }

    public final void K(rr.x xVar, StringBuilder sb2) {
        N(sb2, xVar.u(), "external");
        boolean z10 = false;
        N(sb2, q().contains(l.EXPECT) && xVar.M(), "expect");
        if (q().contains(l.ACTUAL) && xVar.I0()) {
            z10 = true;
        }
        N(sb2, z10, "actual");
    }

    public final void L(z zVar, StringBuilder sb2, z zVar2) {
        o oVar = this.f22246a;
        if (((Boolean) oVar.f22263p.a(o.W[14], oVar)).booleanValue() || zVar != zVar2) {
            N(sb2, q().contains(l.MODALITY), xu.l.b0(zVar.name()));
        }
    }

    public final void M(StringBuilder sb2, rr.d dVar) {
        if (ts.d.s(dVar) && dVar.j() == z.FINAL) {
            return;
        }
        o oVar = this.f22246a;
        if (((r) oVar.A.a(o.W[25], oVar)) == r.RENDER_OVERRIDE && dVar.j() == z.OPEN && !dVar.p().isEmpty()) {
            return;
        }
        z zVarJ = dVar.j();
        br.l.d(zVarJ, "callable.modality");
        L(zVarJ, sb2, v(dVar));
    }

    public final void N(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(I(str));
            sb2.append(" ");
        }
    }

    public final String O(qs.g gVar, boolean z10) {
        String strO = o(b4.a0(gVar));
        o oVar = this.f22246a;
        return (((Boolean) oVar.U.a(o.W[46], oVar)).booleanValue() && s() == u.HTML && z10) ? h0.b.o("<b>", strO, "</b>") : strO;
    }

    public final void P(rr.l lVar, StringBuilder sb2, boolean z10) {
        qs.g name = lVar.getName();
        br.l.d(name, "descriptor.name");
        sb2.append(O(name, z10));
    }

    public final void Q(StringBuilder sb2, x xVar) throws IOException {
        c1 c1VarK0 = xVar.k0();
        ht.a aVar = c1VarK0 instanceof ht.a ? (ht.a) c1VarK0 : null;
        if (aVar == null) {
            R(sb2, xVar);
            return;
        }
        b0 b0Var = aVar.f10879d;
        o oVar = this.f22246a;
        n nVar = oVar.Q;
        v[] vVarArr = o.W;
        if (((Boolean) nVar.a(vVarArr[41], oVar)).booleanValue()) {
            R(sb2, b0Var);
            return;
        }
        R(sb2, aVar.f10880g);
        if (((Boolean) oVar.P.a(vVarArr[40], oVar)).booleanValue()) {
            u uVarS = s();
            u uVar = u.HTML;
            if (uVarS == uVar) {
                sb2.append("<font color=\"808080\"><i>");
            }
            sb2.append(" /* = ");
            R(sb2, b0Var);
            sb2.append(" */");
            if (s() == uVar) {
                sb2.append("</i></font>");
            }
        }
    }

    public final void R(StringBuilder sb2, x xVar) throws IOException {
        qs.g gVarO;
        String strO;
        o oVar = this.f22246a;
        if ((xVar instanceof ht.z) && oVar.n()) {
            gt.i iVar = ((ht.z) xVar).f10960r;
            if (iVar.f9651g == gt.k.NOT_COMPUTED || iVar.f9651g == gt.k.COMPUTING) {
                sb2.append("<Not computed yet>");
                return;
            }
        }
        c1 c1VarK0 = xVar.k0();
        if (c1VarK0 instanceof ht.r) {
            sb2.append(((ht.r) c1VarK0).v0(this, this));
            return;
        }
        if (c1VarK0 instanceof b0) {
            b0 b0Var = (b0) c1VarK0;
            if (b0Var.equals(a1.f10883b) || b0Var.Z() == a1.f10882a.f14512d) {
                sb2.append("???");
                return;
            }
            ht.m0 m0VarZ = b0Var.Z();
            if ((m0VarZ instanceof kt.i) && ((kt.i) m0VarZ).f14517a == kt.j.UNINFERRED_TYPE_VARIABLE) {
                if (!((Boolean) oVar.f22267t.a(o.W[18], oVar)).booleanValue()) {
                    sb2.append("???");
                    return;
                }
                ht.m0 m0VarZ2 = b0Var.Z();
                br.l.c(m0VarZ2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(E(((kt.i) m0VarZ2).f14518b[0]));
                return;
            }
            if (ht.c.i(b0Var)) {
                D(sb2, b0Var);
                return;
            }
            if (!j0(b0Var)) {
                D(sb2, b0Var);
                return;
            }
            int length = sb2.length();
            ((j) this.f22247b.getValue()).y(sb2, b0Var, null);
            boolean z10 = sb2.length() != length;
            x xVarI = xu.d.I(b0Var);
            List listS = xu.d.s(b0Var);
            if (!listS.isEmpty()) {
                sb2.append("context(");
                Iterator it = listS.subList(0, e5.z(listS)).iterator();
                while (it.hasNext()) {
                    Q(sb2, (x) it.next());
                    sb2.append(", ");
                }
                Q(sb2, (x) mq.o.z0(listS));
                sb2.append(") ");
            }
            boolean zQ = xu.d.Q(b0Var);
            boolean zC0 = b0Var.c0();
            boolean z11 = zC0 || (z10 && xVarI != null);
            if (z11) {
                if (zQ) {
                    sb2.insert(length, '(');
                } else {
                    if (z10) {
                        b4.L(tt.l.E0(sb2));
                        if (sb2.charAt(tt.l.x0(sb2) - 1) != ')') {
                            sb2.insert(tt.l.x0(sb2), "()");
                        }
                    }
                    sb2.append("(");
                }
            }
            N(sb2, zQ, "suspend");
            if (xVarI != null) {
                boolean z12 = (j0(xVarI) && !xVarI.c0()) || xu.d.Q(xVarI) || !xVarI.getAnnotations().isEmpty() || (xVarI instanceof ht.n);
                if (z12) {
                    sb2.append("(");
                }
                Q(sb2, xVarI);
                if (z12) {
                    sb2.append(")");
                }
                sb2.append(".");
            }
            sb2.append("(");
            if (!xu.d.M(b0Var) || b0Var.getAnnotations().w(or.n.f19702p) == null || b0Var.L().size() > 1) {
                int i10 = 0;
                for (p0 p0Var : xu.d.L(b0Var)) {
                    int i11 = i10 + 1;
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    if (((Boolean) oVar.S.a(o.W[43], oVar)).booleanValue()) {
                        x xVarB = p0Var.b();
                        br.l.d(xVarB, "typeProjection.type");
                        gVarO = xu.d.o(xVarB);
                    } else {
                        gVarO = null;
                    }
                    if (gVarO != null) {
                        sb2.append(O(gVarO, false));
                        sb2.append(": ");
                    }
                    br.l.e(p0Var, "typeProjection");
                    StringBuilder sb3 = new StringBuilder();
                    mq.o.w0(e5.H(p0Var), sb3, ", ", null, null, new h(this, 0), 60);
                    String string = sb3.toString();
                    br.l.d(string, "StringBuilder().apply(builderAction).toString()");
                    sb2.append(string);
                    i10 = i11;
                }
            } else {
                sb2.append("???");
            }
            sb2.append(") ");
            int i12 = g.f22234a[s().ordinal()];
            if (i12 == 1) {
                strO = o("->");
            } else {
                if (i12 != 2) {
                    throw new bf.n();
                }
                strO = "&rarr;";
            }
            sb2.append(strO);
            sb2.append(" ");
            xu.d.M(b0Var);
            x xVarB2 = ((p0) mq.o.z0(b0Var.L())).b();
            br.l.d(xVarB2, "arguments.last().type");
            Q(sb2, xVarB2);
            if (z11) {
                sb2.append(")");
            }
            if (zC0) {
                sb2.append("?");
            }
        }
    }

    public final void S(StringBuilder sb2, rr.d dVar) {
        if (q().contains(l.OVERRIDE) && !dVar.p().isEmpty()) {
            o oVar = this.f22246a;
            if (((r) oVar.A.a(o.W[25], oVar)) != r.RENDER_OPEN) {
                N(sb2, true, "override");
                if (u()) {
                    sb2.append("/*");
                    sb2.append(dVar.p().size());
                    sb2.append("*/ ");
                }
            }
        }
    }

    public final void T(qs.c cVar, String str, StringBuilder sb2) {
        sb2.append(I(str));
        qs.e eVarI = cVar.i();
        br.l.d(eVarI, "fqName.toUnsafe()");
        String strO = o(b4.b0(eVarI.e()));
        if (strO.length() > 0) {
            sb2.append(" ");
            sb2.append(strO);
        }
    }

    public final void U(StringBuilder sb2, qm.c cVar) {
        qm.c cVar2 = (qm.c) cVar.f20920r;
        rr.j jVar = (rr.j) cVar.f20918d;
        if (cVar2 != null) {
            U(sb2, cVar2);
            sb2.append('.');
            qs.g name = jVar.getName();
            br.l.d(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(O(name, false));
        } else {
            ht.m0 m0VarV = jVar.v();
            br.l.d(m0VarV, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(a0(m0VarV));
        }
        sb2.append(Z((List) cVar.f20919g));
    }

    public final void V(StringBuilder sb2, rr.d dVar) {
        ur.v vVarJ0 = dVar.j0();
        if (vVarJ0 != null) {
            y(sb2, vVarJ0, sr.d.RECEIVER);
            x type = vVarJ0.getType();
            br.l.d(type, "receiver.type");
            sb2.append(G(type));
            sb2.append(".");
        }
    }

    public final void W(StringBuilder sb2, rr.d dVar) {
        ur.v vVarJ0;
        o oVar = this.f22246a;
        if (((Boolean) oVar.E.a(o.W[29], oVar)).booleanValue() && (vVarJ0 = dVar.j0()) != null) {
            sb2.append(" on ");
            x type = vVarJ0.getType();
            br.l.d(type, "receiver.type");
            sb2.append(Y(type));
        }
    }

    public final String Y(x xVar) throws IOException {
        br.l.e(xVar, "type");
        StringBuilder sb2 = new StringBuilder();
        o oVar = this.f22246a;
        Q(sb2, (x) ((ar.k) oVar.f22271x.a(o.W[22], oVar)).a(xVar));
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String Z(List list) throws IOException {
        br.l.e(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o("<"));
        mq.o.w0(list, sb2, ", ", null, null, new h(this, 0), 60);
        sb2.append(o(">"));
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // ss.m
    public final void a() {
        this.f22246a.a();
    }

    public final String a0(ht.m0 m0Var) {
        br.l.e(m0Var, "typeConstructor");
        rr.i iVarP = m0Var.p();
        if (iVarP instanceof r0 ? true : iVarP instanceof rr.f ? true : iVarP instanceof ft.u) {
            br.l.e(iVarP, "klass");
            return kt.k.f(iVarP) ? iVarP.v().toString() : p().a(iVarP, this);
        }
        if (iVarP == null) {
            return m0Var instanceof ht.w ? ((ht.w) m0Var).c(i.f22239r) : m0Var.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + iVarP.getClass()).toString());
    }

    @Override // ss.m
    public final void b() {
        this.f22246a.b();
    }

    public final void b0(r0 r0Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(o("<"));
        }
        if (u()) {
            sb2.append("/*");
            sb2.append(r0Var.getIndex());
            sb2.append("*/ ");
        }
        N(sb2, r0Var.F(), "reified");
        String label = r0Var.N().getLabel();
        boolean z11 = true;
        N(sb2, label.length() > 0, label);
        y(sb2, r0Var, null);
        P(r0Var, sb2, z10);
        int size = r0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            x xVar = (x) r0Var.getUpperBounds().iterator().next();
            if (xVar == null) {
                or.h.a(141);
                throw null;
            }
            if (!or.h.x(xVar) || !xVar.c0()) {
                sb2.append(" : ");
                sb2.append(Y(xVar));
            }
        } else if (z10) {
            for (x xVar2 : r0Var.getUpperBounds()) {
                if (xVar2 == null) {
                    or.h.a(141);
                    throw null;
                }
                if (!or.h.x(xVar2) || !xVar2.c0()) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    sb2.append(Y(xVar2));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(o(">"));
        }
    }

    @Override // ss.m
    public final void c() {
        this.f22246a.c();
    }

    public final void c0(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0((r0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    @Override // ss.m
    public final void d(Set set) {
        br.l.e(set, "<set-?>");
        this.f22246a.d(set);
    }

    public final void d0(StringBuilder sb2, List list, boolean z10) {
        o oVar = this.f22246a;
        if (((Boolean) oVar.f22269v.a(o.W[20], oVar)).booleanValue() || list.isEmpty()) {
            return;
        }
        sb2.append(o("<"));
        c0(sb2, list);
        sb2.append(o(">"));
        if (z10) {
            sb2.append(" ");
        }
    }

    @Override // ss.m
    public final void e(s sVar) {
        br.l.e(sVar, "<set-?>");
        this.f22246a.e(sVar);
    }

    public final void e0(u0 u0Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(u0Var instanceof q0)) {
            sb2.append(I(u0Var.i0() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    @Override // ss.m
    public final void f(LinkedHashSet linkedHashSet) {
        this.f22246a.f(linkedHashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(ur.q0 r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.j.f0(ur.q0, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // ss.m
    public final void g() {
        this.f22246a.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0(java.lang.StringBuilder r8, java.util.List r9, boolean r10) {
        /*
            r7 = this;
            ss.o r0 = r7.f22246a
            ss.n r1 = r0.D
            ir.v[] r2 = ss.o.W
            r3 = 28
            r2 = r2[r3]
            java.lang.Object r0 = r1.a(r2, r0)
            ss.s r0 = (ss.s) r0
            int[] r1 = ss.g.f22235b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L2c
            r3 = 2
            if (r0 == r3) goto L2a
            r10 = 3
            if (r0 != r10) goto L24
        L22:
            r10 = r1
            goto L2d
        L24:
            bf.n r8 = new bf.n
            r8.<init>()
            throw r8
        L2a:
            if (r10 != 0) goto L22
        L2c:
            r10 = r2
        L2d:
            int r0 = r9.size()
            ss.e r3 = r7.t()
            r3.getClass()
            java.lang.String r3 = "builder"
            br.l.e(r8, r3)
            java.lang.String r3 = "("
            r8.append(r3)
            java.util.Iterator r9 = r9.iterator()
            r3 = r1
        L47:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L76
            int r4 = r3 + 1
            java.lang.Object r5 = r9.next()
            ur.q0 r5 = (ur.q0) r5
            ss.e r6 = r7.t()
            r6.getClass()
            java.lang.String r6 = "parameter"
            br.l.e(r5, r6)
            r7.f0(r5, r10, r8, r1)
            ss.e r5 = r7.t()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L74
            java.lang.String r3 = ", "
            r8.append(r3)
        L74:
            r3 = r4
            goto L47
        L76:
            ss.e r9 = r7.t()
            r9.getClass()
            java.lang.String r9 = ")"
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.j.g0(java.lang.StringBuilder, java.util.List, boolean):void");
    }

    @Override // ss.m
    public final void h(u uVar) {
        br.l.e(uVar, "<set-?>");
        this.f22246a.h(uVar);
    }

    public final boolean h0(as.p pVar, StringBuilder sb2) {
        if (!q().contains(l.VISIBILITY)) {
            return false;
        }
        o oVar = this.f22246a;
        n nVar = oVar.f22261n;
        v[] vVarArr = o.W;
        if (((Boolean) nVar.a(vVarArr[12], oVar)).booleanValue()) {
            pVar = rr.p.f(pVar.f2239a.k());
        }
        if (!((Boolean) oVar.f22262o.a(vVarArr[13], oVar)).booleanValue() && br.l.a(pVar, rr.p.j)) {
            return false;
        }
        sb2.append(I(pVar.f2239a.d()));
        sb2.append(" ");
        return true;
    }

    @Override // ss.m
    public final void i() {
        this.f22246a.i();
    }

    public final void i0(StringBuilder sb2, List list) throws IOException {
        o oVar = this.f22246a;
        if (((Boolean) oVar.f22269v.a(o.W[20], oVar)).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            List upperBounds = r0Var.getUpperBounds();
            br.l.d(upperBounds, "typeParameter.upperBounds");
            for (x xVar : mq.o.m0(1, upperBounds)) {
                StringBuilder sb3 = new StringBuilder();
                qs.g name = r0Var.getName();
                br.l.d(name, "typeParameter.name");
                sb3.append(O(name, false));
                sb3.append(" : ");
                br.l.d(xVar, "it");
                sb3.append(Y(xVar));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(I("where"));
        sb2.append(" ");
        mq.o.w0(arrayList, sb2, ", ", null, null, null, 124);
    }

    @Override // ss.m
    public final void j() {
        this.f22246a.j();
    }

    @Override // ss.m
    public final Set k() {
        return this.f22246a.k();
    }

    @Override // ss.m
    public final void l(c cVar) {
        this.f22246a.l(cVar);
    }

    @Override // ss.m
    public final void m() {
        this.f22246a.m();
    }

    public final String o(String str) {
        return s().escape(str);
    }

    public final c p() {
        o oVar = this.f22246a;
        return (c) oVar.f22251b.a(o.W[0], oVar);
    }

    public final Set q() {
        o oVar = this.f22246a;
        return (Set) oVar.f22254e.a(o.W[3], oVar);
    }

    public final boolean r() {
        o oVar = this.f22246a;
        return ((Boolean) oVar.f22255f.a(o.W[4], oVar)).booleanValue();
    }

    public final u s() {
        o oVar = this.f22246a;
        return (u) oVar.C.a(o.W[27], oVar);
    }

    public final e t() {
        o oVar = this.f22246a;
        return (e) oVar.B.a(o.W[26], oVar);
    }

    public final boolean u() {
        o oVar = this.f22246a;
        return ((Boolean) oVar.j.a(o.W[8], oVar)).booleanValue();
    }

    public final String w(rr.l lVar) {
        rr.l lVarO;
        String str;
        br.l.e(lVar, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        lVar.w0(new o2.g(16, this), sb2);
        o oVar = this.f22246a;
        n nVar = oVar.f22252c;
        v[] vVarArr = o.W;
        if (((Boolean) nVar.a(vVarArr[1], oVar)).booleanValue() && !(lVar instanceof f0) && !(lVar instanceof rr.j0) && (lVarO = lVar.o()) != null && !(lVarO instanceof a0)) {
            sb2.append(" ");
            int i10 = g.f22234a[s().ordinal()];
            if (i10 == 1) {
                str = "defined in";
            } else {
                if (i10 != 2) {
                    throw new bf.n();
                }
                str = "<i>defined in</i>";
            }
            sb2.append(str);
            sb2.append(" ");
            qs.e eVarG = ts.d.g(lVarO);
            br.l.d(eVarG, "getFqName(containingDeclaration)");
            sb2.append(eVarG.f21030a.isEmpty() ? "root package" : o(b4.b0(eVarG.e())));
            if (((Boolean) oVar.f22253d.a(vVarArr[2], oVar)).booleanValue() && (lVarO instanceof f0) && (lVar instanceof rr.m)) {
                ((rr.m) lVar).h().getClass();
            }
        }
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String x(sr.b bVar, sr.d dVar) throws IOException {
        ur.j jVarR;
        List listY;
        o oVar = this.f22246a;
        n nVar = oVar.M;
        br.l.e(bVar, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (dVar != null) {
            sb2.append(dVar.getRenderName() + ':');
        }
        x type = bVar.getType();
        sb2.append(Y(type));
        v[] vVarArr = o.W;
        if (((a) nVar.a(vVarArr[37], oVar)).getIncludeAnnotationArguments()) {
            Map mapB = bVar.b();
            mq.w wVar = null;
            rr.f fVarD = ((Boolean) oVar.H.a(vVarArr[32], oVar)).booleanValue() ? xs.d.d(bVar) : null;
            if (fVarD != null && (jVarR = fVarD.R()) != null && (listY = jVarR.Y()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listY) {
                    if (((q0) obj).w1()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((q0) it.next()).getName());
                }
                wVar = arrayList2;
            }
            if (wVar == null) {
                wVar = mq.w.f16945a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : wVar) {
                qs.g gVar = (qs.g) obj2;
                br.l.d(gVar, "it");
                if (!mapB.containsKey(gVar)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(mq.p.a0(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((qs.g) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(mq.p.a0(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                qs.g gVar2 = (qs.g) entry.getKey();
                vs.g gVar3 = (vs.g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(gVar2.b());
                sb3.append(" = ");
                sb3.append(!wVar.contains(gVar2) ? B(gVar3) : "...");
                arrayList5.add(sb3.toString());
            }
            List listL0 = mq.o.L0(mq.o.E0(arrayList4, arrayList5));
            if (((a) nVar.a(o.W[37], oVar)).getIncludeEmptyAnnotationArguments() || !listL0.isEmpty()) {
                mq.o.w0(listL0, sb2, ", ", "(", ")", null, 112);
            }
        }
        if (u() && (ht.c.i(type) || (type.Z().p() instanceof d0))) {
            sb2.append(" /* annotation class not found */");
        }
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void y(StringBuilder sb2, sr.a aVar, sr.d dVar) {
        if (q().contains(l.ANNOTATIONS)) {
            boolean z10 = aVar instanceof x;
            o oVar = this.f22246a;
            Set setK = z10 ? oVar.k() : (Set) oVar.J.a(o.W[34], oVar);
            ar.k kVar = (ar.k) oVar.L.a(o.W[36], oVar);
            for (sr.b bVar : aVar.getAnnotations()) {
                if (!mq.o.k0(setK, bVar.a()) && !br.l.a(bVar.a(), or.n.f19704r) && (kVar == null || ((Boolean) kVar.a(bVar)).booleanValue())) {
                    sb2.append(x(bVar, dVar));
                    if (((Boolean) oVar.I.a(o.W[33], oVar)).booleanValue()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }
}
